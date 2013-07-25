package com.petpace.HttpServer_DbTest;

import java.io.PrintStream;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.SortedMap;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.amazonaws.services.cloudwatch.AmazonCloudWatchClient;
import com.amazonaws.services.cloudwatch.model.MetricDatum;
import com.amazonaws.services.cloudwatch.model.PutMetricDataRequest;
import com.codahale.metrics.Clock;
import com.codahale.metrics.Counter;
import com.codahale.metrics.Gauge;
import com.codahale.metrics.Histogram;
import com.codahale.metrics.Meter;
import com.codahale.metrics.MetricFilter;
import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.ScheduledReporter;
import com.codahale.metrics.Timer;

public class CloudReporter extends ScheduledReporter {

	private static final Logger LOG = LoggerFactory
			.getLogger(CloudReporter.class);

	public static class Builder {
		private final MetricRegistry registry;
		private final String namespace;
		private PrintStream output;
		private Locale locale;
		private Clock clock;
		private TimeZone timeZone;
		private TimeUnit rateUnit;
		private TimeUnit durationUnit;
		private MetricFilter filter;
		private AmazonCloudWatchClient client;

		public Builder(MetricRegistry registry, String namespace,
				AmazonCloudWatchClient client) {
			this.registry = registry;
			this.output = System.out;
			this.locale = Locale.getDefault();
			this.clock = Clock.defaultClock();
			this.timeZone = TimeZone.getDefault();
			this.rateUnit = TimeUnit.SECONDS;
			this.durationUnit = TimeUnit.MILLISECONDS;
			this.filter = MetricFilter.ALL;
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
			return new CloudReporter(registry, namespace, client, output,
					locale, clock, timeZone, rateUnit, durationUnit, filter);
		}
	}

	private final PrintStream output;
	private final Locale locale;
	private final Clock clock;
	private final DateFormat dateFormat;
	private PutMetricDataRequest putReq;
	private AmazonCloudWatchClient client;
	private final String namespace;

	public static Builder forRegistry(MetricRegistry registry,
			String namespace, AmazonCloudWatchClient client) {
		return new Builder(registry, namespace, client);
	}

	private CloudReporter(MetricRegistry registry, String namespace,
			AmazonCloudWatchClient client, PrintStream output, Locale locale,
			Clock clock, TimeZone timeZone, TimeUnit rateUnit,
			TimeUnit durationUnit, MetricFilter filter) {
		super(registry, "Cloud Reporter", filter, rateUnit, durationUnit);
		this.output = output;
		this.locale = locale;
		this.clock = clock;
		this.namespace = namespace;
		this.dateFormat = DateFormat.getDateTimeInstance(DateFormat.SHORT,
				DateFormat.MEDIUM, locale);
	}

	/**
	 * Send data every MIN not very second 1) how does namespace in Amazon Cloud
	 * works 2) PutMetricDataRequest format - @See
	 * https://github.com/plausiblelabs
	 * /metrics-cloudwatch/blob/master/src/main/java
	 * /com/plausiblelabs/metrics/reporting/CloudWatchReporter.java and @See
	 * PutMetricDataRequest
	 */
	public void sendToCloudwatch() {
		try {
			if (!putReq.getMetricData().isEmpty()) {
				client.putMetricData(putReq);
				LOG.info("Send to Cloud");

			}
		} catch (RuntimeException re) {
			LOG.warn("Failed writing to CloudWatch: {}", putReq);
			throw re;
		} finally {
			// Be sure the putReq cleared; a failure indicates bad data, so we
			// don't want to try again
			putReq = new PutMetricDataRequest().withNamespace(namespace);
		}
	}

	/**
	 * 
	 * @param timestamp
	 * @param name
	 * @param value
	 */
	public void sendValue(Date timestamp, String name, double value) {
		MetricDatum datum = new MetricDatum().withTimestamp(timestamp)
				.withValue(value).withMetricName(name);

		putReq.withMetricData(datum);

		if (putReq.getMetricData().size() == 20) {
			sendToCloudwatch();
		}
	}

	@Override
	public void report(SortedMap<String, Gauge> gauges,
			SortedMap<String, Counter> counters,
			SortedMap<String, Histogram> histograms,
			SortedMap<String, Meter> meters, SortedMap<String, Timer> timers) {
		putReq = new PutMetricDataRequest().withNamespace(namespace);
		for (Map.Entry<String, Counter> entry : counters.entrySet()) {
			long counter = entry.getValue().getCount();
			double value = Double.longBitsToDouble(counter);
			Date timestamp = new Date();
			sendValue(timestamp, "Counter", value);

		}

		// populate putReq
		// send it to cloud
	}

}
