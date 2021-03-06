/**
 * This class is generated by jOOQ
 */
package com.petpace.db.jooq.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GatewayServerConnectionsRecord extends org.jooq.impl.UpdatableRecordImpl<com.petpace.db.jooq.tables.records.GatewayServerConnectionsRecord> implements org.jooq.Record4<java.lang.Short, java.sql.Timestamp, java.lang.Integer, java.lang.Integer> {

	private static final long serialVersionUID = 1471023019;

	/**
	 * Setter for <code>rigel.gateway_server_connections.isActive</code>. 
	 */
	public void setIsactive(java.lang.Short value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>rigel.gateway_server_connections.isActive</code>. 
	 */
	public java.lang.Short getIsactive() {
		return (java.lang.Short) getValue(0);
	}

	/**
	 * Setter for <code>rigel.gateway_server_connections.connectTime</code>. 
	 */
	public void setConnecttime(java.sql.Timestamp value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>rigel.gateway_server_connections.connectTime</code>. 
	 */
	public java.sql.Timestamp getConnecttime() {
		return (java.sql.Timestamp) getValue(1);
	}

	/**
	 * Setter for <code>rigel.gateway_server_connections.GatewayID</code>. 
	 */
	public void setGatewayid(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>rigel.gateway_server_connections.GatewayID</code>. 
	 */
	public java.lang.Integer getGatewayid() {
		return (java.lang.Integer) getValue(2);
	}

	/**
	 * Setter for <code>rigel.gateway_server_connections.ServerID</code>. 
	 */
	public void setServerid(java.lang.Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>rigel.gateway_server_connections.ServerID</code>. 
	 */
	public java.lang.Integer getServerid() {
		return (java.lang.Integer) getValue(3);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Short> key() {
		return (org.jooq.Record3) super.key();
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Short, java.sql.Timestamp, java.lang.Integer, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Short, java.sql.Timestamp, java.lang.Integer, java.lang.Integer> valuesRow() {
		return (org.jooq.Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Short> field1() {
		return com.petpace.db.jooq.tables.GatewayServerConnections.GATEWAY_SERVER_CONNECTIONS.ISACTIVE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field2() {
		return com.petpace.db.jooq.tables.GatewayServerConnections.GATEWAY_SERVER_CONNECTIONS.CONNECTTIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return com.petpace.db.jooq.tables.GatewayServerConnections.GATEWAY_SERVER_CONNECTIONS.GATEWAYID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field4() {
		return com.petpace.db.jooq.tables.GatewayServerConnections.GATEWAY_SERVER_CONNECTIONS.SERVERID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Short value1() {
		return getIsactive();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value2() {
		return getConnecttime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getGatewayid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value4() {
		return getServerid();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached GatewayServerConnectionsRecord
	 */
	public GatewayServerConnectionsRecord() {
		super(com.petpace.db.jooq.tables.GatewayServerConnections.GATEWAY_SERVER_CONNECTIONS);
	}
}
