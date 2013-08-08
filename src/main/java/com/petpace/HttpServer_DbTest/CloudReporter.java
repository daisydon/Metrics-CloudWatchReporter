package com.petpace.HttpServer_DbTest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.amazonaws.services.cloudwatch.AmazonCloudWatchClient;
import com.amazonaws.services.cloudwatch.model.Dimension;
import com.amazonaws.services.cloudwatch.model.MetricDatum;
import com.amazonaws.services.cloudwatch.model.PutMetricDataRequest;
import com.amazonaws.services.cloudwatch.model.StandardUnit;
import com.codahale.metrics.Counter;
import com.codahale.metrics.Gauge;
import com.codahale.metrics.Histogram;
import com.codahale.metrics.Meter;
import com.codahale.metrics.MetricFilter;
import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.ScheduledReporter;
import com.codahale.metrics.Snapshot;
import com.codahale.metrics.Timer;

public class CloudReporter extends ScheduledReporter {

	private static final Logger LOG = Logger.getLogger(CloudReporter.class
			.getName());

	public static class Builder {
		private MetricRegistry registry;
		private String namespace;
		private String reportername;
		private TimeUnit rateUnit;
		private TimeUnit durationUnit;
		private MetricFilter filter = MetricFilter.ALL;
		private AmazonCloudWatchClient client;

		public Builder(MetricRegistry registry, String namespace,
				AmazonCloudWatchClient client) {
			this.registry = registry;
			this.rateUnit = TimeUnit.SECONDS;
			this.durationUnit = TimeUnit.MILLISECONDS;
			this.client = client;
			this.namespace = namespace;
		}

		public Builder convertRatesTo(TimeUnit rateUnit) {
			this.rateUnit = rateUnit;
			return this;
		}

		public Builder convertDurationsTo(TimeUnit durationUnit) {
			this.durationUnit = durationUnit;
			return this;
		}

		public CloudReporter build() {
			return new CloudReporter(registry, reportername, namespace, client,
					rateUnit, durationUnit, filter);
		}

	}

	private AmazonCloudWatchClient client;
	private String namespace;
	private PutMetricDataRequest putReq;

	public Builder withRegistry(MetricRegistry registry, String namespace,
			AmazonCloudWatchClient client) {
		return new Builder(registry, namespace, client);
	}

	private CloudReporter(MetricRegistry registry, String reportername,
			String namespace, AmazonCloudWatchClient client, TimeUnit rateUnit,
			TimeUnit durationUnit, MetricFilter filter) {
		super(registry, "HttpSeverHandler_Counter", filter, rateUnit,
				durationUnit);
		this.namespace = namespace;
		this.client = client;
	    putReq = new PutMetricDataRequest()
		.withNamespace(namespace);
	}

	public void sendToCloudwatch() {
		try {
			client.putMetricData(putReq);
			LOG.info("Sent to Cloud");

		} catch (RuntimeException re) {
			LOG.log(Level.SEVERE, "Failed writing to CloudWatch!", re);
			throw re;
		}
	}
/**
 * Put Metric data into MetricDatum (AWS CloudWatch Data Unit) 
 * @param timestamp
 * @param name
 * @param value
 * @param unit
 * @param dimensions
 */
	public void sendValue(Date timestamp, String name, double value,
			StandardUnit unit, List<Dimension> dimensions) {
		MetricDatum datum = new MetricDatum().withTimestamp(timestamp)
				.withValue(value).withMetricName(name).withUnit(unit)
				.withDimensions(dimensions);
		putReq.withMetricData(datum);
		LOG.info("The size of putReq is " + putReq.getMetricData().size());
		if (putReq.getMetricData().size() == 20) {
			sendToCloudwatch();
			putReq = new PutMetricDataRequest().withNamespace(namespace);
		} else {
			sendToCloudwatch();
		}
	}

	@Override
	public void report(SortedMap<String, Gauge> gauges,
			SortedMap<String, Counter> counters,
			SortedMap<String, Histogram> histograms,
			SortedMap<String, Meter> meters, SortedMap<String, Timer> timers) {
		List<Dimension> dimensions = new ArrayList<Dimension>();
		dimensions.add((new Dimension()).withName("ServerID").withValue(
				"Netty3.0"));
		Date reportTimestamp = new Date();

		// Parse the Gauge
		for (Map.Entry<String, Gauge> entry : gauges.entrySet()) {
			double value = (Double) entry.getValue().getValue();
			LOG.info("The value is " + value);
			sendValue(reportTimestamp, entry.getKey(), value,
					StandardUnit.CountSecond, dimensions);
		}
		// Parse the Timer
		for (Map.Entry<String, Timer> entry : timers.entrySet()) {
			final Snapshot snapshot = entry.getValue().getSnapshot();
			sendValue(reportTimestamp, entry.getKey(), snapshot.getMin(),
					StandardUnit.Milliseconds, dimensions);

		}

		// Parse the Couner
		for (Map.Entry<String, Counter> entry : counters.entrySet()) {
			Counter cntr = entry.getValue();
			long counter = cntr.getCount();
			double value = (double) counter;

			StandardUnit unit = StandardUnit.Count;
			sendValue(reportTimestamp, entry.getKey(), value, unit, dimensions);

		}
	}
}