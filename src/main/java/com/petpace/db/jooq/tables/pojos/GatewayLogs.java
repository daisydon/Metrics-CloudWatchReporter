/**
 * This class is generated by jOOQ
 */
package com.petpace.db.jooq.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GatewayLogs implements java.io.Serializable {

	private static final long serialVersionUID = -1275548262;

	private java.lang.Integer  logid;
	private java.lang.String   devicetype;
	private java.lang.String   deviceid;
	private java.lang.String   severity;
	private java.lang.String   message;
	private java.sql.Timestamp logtime;

	public java.lang.Integer getLogid() {
		return this.logid;
	}

	public void setLogid(java.lang.Integer logid) {
		this.logid = logid;
	}

	public java.lang.String getDevicetype() {
		return this.devicetype;
	}

	public void setDevicetype(java.lang.String devicetype) {
		this.devicetype = devicetype;
	}

	public java.lang.String getDeviceid() {
		return this.deviceid;
	}

	public void setDeviceid(java.lang.String deviceid) {
		this.deviceid = deviceid;
	}

	public java.lang.String getSeverity() {
		return this.severity;
	}

	public void setSeverity(java.lang.String severity) {
		this.severity = severity;
	}

	public java.lang.String getMessage() {
		return this.message;
	}

	public void setMessage(java.lang.String message) {
		this.message = message;
	}

	public java.sql.Timestamp getLogtime() {
		return this.logtime;
	}

	public void setLogtime(java.sql.Timestamp logtime) {
		this.logtime = logtime;
	}
}
