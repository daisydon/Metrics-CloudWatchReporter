/**
 * This class is generated by jOOQ
 */
package com.petpace.db.jooq.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GatewayServerConnections implements java.io.Serializable {

	private static final long serialVersionUID = 1529479416;

	private java.lang.Short    isactive;
	private java.sql.Timestamp connecttime;
	private java.lang.Integer  gatewayid;
	private java.lang.Integer  serverid;

	public java.lang.Short getIsactive() {
		return this.isactive;
	}

	public void setIsactive(java.lang.Short isactive) {
		this.isactive = isactive;
	}

	public java.sql.Timestamp getConnecttime() {
		return this.connecttime;
	}

	public void setConnecttime(java.sql.Timestamp connecttime) {
		this.connecttime = connecttime;
	}

	public java.lang.Integer getGatewayid() {
		return this.gatewayid;
	}

	public void setGatewayid(java.lang.Integer gatewayid) {
		this.gatewayid = gatewayid;
	}

	public java.lang.Integer getServerid() {
		return this.serverid;
	}

	public void setServerid(java.lang.Integer serverid) {
		this.serverid = serverid;
	}
}
