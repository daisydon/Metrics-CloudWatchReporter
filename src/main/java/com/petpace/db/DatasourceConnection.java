package com.petpace.db;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Logger;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.apache.tomcat.jdbc.pool.PoolProperties;

public class DatasourceConnection {
	private static final Logger logger = Logger
			.getLogger(DatasourceConnection.class.getName());
	private static DataSource datasource = null;

	DatasourceConnection() {
	}

	/**
	 * 
	 * @return
	 * @throws SQLException
	 */
	public static DataSource getDatasource() throws SQLException {
		return datasource;
	}

	public synchronized static void initDatasource(String jdbcUrl, String user,
			String password) throws SQLException {

		if (null == datasource) {
			PoolProperties p = new PoolProperties();

			p.setUrl(jdbcUrl);
			p.setDriverClassName("com.mysql.jdbc.Driver");
			p.setUsername(user);
			p.setPassword(password);

			p.setJmxEnabled(true);
			p.setTestWhileIdle(false);
			p.setTestOnBorrow(true);
			p.setValidationQuery("SELECT 1 from dual");
			p.setTestOnReturn(false);
			p.setValidationInterval(30000);
			p.setTimeBetweenEvictionRunsMillis(30000);

			p.setMaxActive(75);
			p.setMaxIdle(75);
			p.setInitialSize(10);
			p.setMaxWait(10000);
			p.setRemoveAbandonedTimeout(60);
			p.setMinEvictableIdleTimeMillis(30000);
			p.setMinIdle(10);

			p.setLogAbandoned(true);
			p.setRemoveAbandoned(true);

			p.setJdbcInterceptors("org.apache.tomcat.jdbc.pool.interceptor.ConnectionState;"
					+ "org.apache.tomcat.jdbc.pool.interceptor.StatementFinalizer");

			datasource = new DataSource();
			datasource.setPoolProperties(p);

			Connection con = datasource.getConnection();
			con.close();
			logger.info("Database Connection Pooling initialize. Active connections: " + datasource.getActive());
			logger.info(datasource.getPoolProperties().toString());
		}
	}

	public static void closeDatasource() {
		datasource.close();
	}

}
