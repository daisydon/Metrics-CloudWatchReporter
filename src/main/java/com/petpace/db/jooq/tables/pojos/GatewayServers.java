/**
 * This class is generated by jOOQ
 */
package com.petpace.db.jooq.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GatewayServers implements java.io.Serializable {

	private static final long serialVersionUID = 1107108342;

	private java.lang.Integer  serverid;
	private java.lang.String   name;
	private java.lang.String   hostaddr;
	private java.lang.String   version;
	private java.sql.Timestamp updated;

	public java.lang.Integer getServerid() {
		return this.serverid;
	}

	public void setServerid(java.lang.Integer serverid) {
		this.serverid = serverid;
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.String getHostaddr() {
		return this.hostaddr;
	}

	public void setHostaddr(java.lang.String hostaddr) {
		this.hostaddr = hostaddr;
	}

	public java.lang.String getVersion() {
		return this.version;
	}

	public void setVersion(java.lang.String version) {
		this.version = version;
	}

	public java.sql.Timestamp getUpdated() {
		return this.updated;
	}

	public void setUpdated(java.sql.Timestamp updated) {
		this.updated = updated;
	}
}
