package com.petpace.HttpServer_DbTest;

import java.net.InetSocketAddress;
import java.util.Properties;
import java.util.concurrent.Executors;

import org.jboss.netty.bootstrap.ServerBootstrap;
import org.jboss.netty.channel.socket.nio.NioServerSocketChannelFactory;

import com.petpace.db.DatasourceConnection;

public class HttpServer {
	private final int port;
	

					

	public HttpServer(int port) {
		this.port = port;
	}

	public void run() throws Exception{
		
		// Read Property file
		Properties prop = new Properties();
		prop.load(this.getClass().getClassLoader().getResourceAsStream("META-INF/application.properties"));
		
		// Initialize data pool
				DatasourceConnection.initDatasource(prop.getProperty("database.url"),
						prop.getProperty("database.username"),
						prop.getProperty("database.password"));
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
