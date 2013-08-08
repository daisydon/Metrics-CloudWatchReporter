package com.petpace.HttpServer_DbTest;

import java.net.InetSocketAddress;
import java.util.Properties;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.jboss.netty.bootstrap.ServerBootstrap;
import org.jboss.netty.channel.socket.nio.NioServerSocketChannelFactory;
import java.util.logging.Logger;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.cloudwatch.AmazonCloudWatchClient;
import com.codahale.metrics.ConsoleReporter;
import com.codahale.metrics.MetricRegistry;
import com.petpace.db.DatasourceConnection;

public class HttpServer {
	private final int port;
	public static final MetricRegistry registry = new MetricRegistry();
	private static final Logger log = Logger.getLogger(HttpServer.class
			.getName());

	public HttpServer(int port) {
		this.port = port;
	}

	public void run() throws Exception {

		// Read Property file
		Properties prop = new Properties();
		prop.load(this.getClass().getClassLoader()
				.getResourceAsStream("META-INF/application.properties"));

		// Initialize data pool
		DatasourceConnection.initDatasource(prop.getProperty("database.url"),
				prop.getProperty("database.username"),
				prop.getProperty("database.password"));

		// Check aws credentials, create a new cloudwatch client
		AWSCredentials creds = new BasicAWSCredentials("AKIAJA5GAIEPJ52UC4QA",
				"OTyTcE0tY3ENSD4/u2e94FcKlqZ2A6kFzK9EHOKz");
		AmazonCloudWatchClient client = new AmazonCloudWatchClient(creds);
		
		// Create a new Console reporter
		ConsoleReporter reporter = ConsoleReporter.forRegistry(registry)
				.convertRatesTo(TimeUnit.SECONDS)
				.convertDurationsTo(TimeUnit.MILLISECONDS).build();
		
		// Create a new AWS CloudWatch reporter
		CloudReporter cloudreporter = new CloudReporter.Builder(registry,
				"Petpace", client).convertDurationsTo(TimeUnit.MILLISECONDS).convertRatesTo(TimeUnit.SECONDS).build();
		
		// Start console reporter, send reporter every 5 minutes
		reporter.start(5, TimeUnit.MINUTES);
		// Start AWS CloudWatch reporter
		cloudreporter.start(5, TimeUnit.MINUTES);

		// Configure the server.
		ServerBootstrap bootstrap = new ServerBootstrap(
				new NioServerSocketChannelFactory(
						Executors.newCachedThreadPool(),
						Executors.newCachedThreadPool()));

		// Enable TCP_NODELAY to handle pipelined requests without latency.
		bootstrap.setOption("child.tcpNoDelay", true);

		// Set up the event pipeline factory.
		bootstrap.setPipelineFactory(new HttpServerPipelineFactory());

		// Bind and start to accept incoming connections.
		bootstrap.bind(new InetSocketAddress(port));

	}

	public static void main(String[] args) throws Exception {
		int port;
		if (args.length > 0) {
			port = Integer.parseInt(args[0]);
		} else {
			port = 8080;
		}
		new HttpServer(port).run();
	}
}
