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
import com.codahale.metrics.Timer;
import com.petpace.HttpServer_DbTest.RateGauge;

public class CloudReporter extends ScheduledReporter {

	private static final Logger LOG = Logger
			.getLogger(CloudReporter.class.getName());

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
			return new CloudReporter(registry,reportername,namespace, client, rateUnit,
					durationUnit, filter);
		}

		public void enable() {
			build().start(10, TimeUnit.SECONDS);
            LOG.info("Start the report");
		}
		
	}

	private PutMetricDataRequest putReq;
	private AmazonCloudWatchClient client;
	private String namespace;

	public Builder withRegistry(MetricRegistry registry,String namespace,
			AmazonCloudWatchClient client) {
		return new Builder(registry, namespace,client);	
	}

	private CloudReporter(MetricRegistry registry, String reportername, String namespace,
			AmazonCloudWatchClient client, TimeUnit rateUnit,
			TimeUnit durationUnit, MetricFilter filter) {
		super(registry, "HttpSeverHandler_Counter", filter, rateUnit, durationUnit);
		this.namespace = namespace;
		this.client = client;
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
			LOG.info("Check if putMetricData is empty! " + putReq.getMetricData().isEmpty());
			
			client.putMetricData(putReq);
			LOG.info("Send to Cloud");

			}
		 catch (RuntimeException re) {
			LOG.log(Level.SEVERE,"Failed writing to CloudWatch!",re);
			throw re;
		} finally {
		  putReq = new PutMetricDataRequest().withNamespace(namespace);
		}
	}

	/**
	 * 
	 * @param timestamp
	 * @param name
	 * @param value
	 */
	
	public void sendValue(Date timestamp, String name, double value, List<Dimension> dimensions) {
		MetricDatum datum = new MetricDatum().withTimestamp(timestamp)
				.withValue(value).withMetricName(name).withUnit(StandardUnit.Seconds).withDimensions(dimensions);

		putReq.withMetricData(datum);

		LOG.info("The size of putReq is " + putReq.getMetricData().size());
		
		// TODO: PLEASE TEST THIS:  AWS Error Message: The collection MetricData must not have a size greater than 20.
		if (putReq.getMetricData().size() == 20) {
		LOG.info("Send To Cloud Watch");
		sendToCloudwatch();
		}
	}

	@Override
	public void report(SortedMap<String, Gauge> gauges,
			SortedMap<String, Counter> counters,
			SortedMap<String, Histogram> histograms,
			SortedMap<String, Meter> meters, SortedMap<String, Timer> timers) {
		List<Dimension> dimensions = new ArrayList<Dimension>();
		dimensions.add((new Dimension()).withName("ServerID").withValue("Netty3.0"));
		
		
		for (Map.Entry<String, Timer> entry: timers.entrySet()){
			double one =entry.getValue().getOneMinuteRate();
			double mean = entry.getValue().getMeanRate();
			double five = entry.getValue().getFiveMinuteRate();
			double ten = entry.getValue().getFifteenMinuteRate();
			double counter = entry.getValue().getCount();
			
			Date timestamp = new Date();		
			sendValue(timestamp,entry.getKey(),mean,dimensions);		
			sendValue(timestamp,entry.getKey(),one,dimensions);
			sendValue(timestamp,entry.getKey(),five,dimensions);
			sendValue(timestamp,entry.getKey(),ten,dimensions);	
			sendValue(timestamp,entry.getKey(),counter,dimensions);
		}
		
		
		//LOG.info("Start to parse the counter");
		for (Map.Entry<String, Counter> entry : counters.entrySet()) {
			Counter cntr = entry.getValue();	
			long counter = cntr.getCount();
			double value = (double)counter;
			
			Date timestamp = new Date();
			LOG.info("Counter "+ value + "");
			sendValue(timestamp, entry.getKey(),value,dimensions); // TODO: Make sure, we get the name correctly													
		}
	}
	
	//Start send report to cloud watch
	public void run(){
		putReq = new PutMetricDataRequest().withNamespace(namespace);
		try{
			this.start(20, TimeUnit.MINUTES);
		}catch (Exception e) {
			
		}
	}
}
