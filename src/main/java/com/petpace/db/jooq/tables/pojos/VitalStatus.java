/**
 * This class is generated by jOOQ
 */
package com.petpace.db.jooq.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VitalStatus implements java.io.Serializable {

	private static final long serialVersionUID = -1463861642;

	private java.lang.Integer  id;
	private java.lang.String   collarId;
	private java.lang.Integer  battery;
	private java.lang.String   buckle;
	private java.lang.String   charging;
	private java.lang.String   version;
	private java.sql.Timestamp time;
	private java.sql.Timestamp created;
	private java.lang.String   cookie;
	private java.lang.String   inputref;
	private java.lang.Integer  gatewayid;

	public java.lang.Integer getId() {
		return this.id;
	}

	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	public java.lang.String getCollarId() {
		return this.collarId;
	}

	public void setCollarId(java.lang.String collarId) {
		this.collarId = collarId;
	}

	public java.lang.Integer getBattery() {
		return this.battery;
	}

	public void setBattery(java.lang.Integer battery) {
		this.battery = battery;
	}

	public java.lang.String getBuckle() {
		return this.buckle;
	}

	public void setBuckle(java.lang.String buckle) {
		this.buckle = buckle;
	}

	public java.lang.String getCharging() {
		return this.charging;
	}

	public void setCharging(java.lang.String charging) {
		this.charging = charging;
	}

	public java.lang.String getVersion() {
		return this.version;
	}

	public void setVersion(java.lang.String version) {
		this.version = version;
	}

	public java.sql.Timestamp getTime() {
		return this.time;
	}

	public void setTime(java.sql.Timestamp time) {
		this.time = time;
	}

	public java.sql.Timestamp getCreated() {
		return this.created;
	}

	public void setCreated(java.sql.Timestamp created) {
		this.created = created;
	}

	public java.lang.String getCookie() {
		return this.cookie;
	}

	public void setCookie(java.lang.String cookie) {
		this.cookie = cookie;
	}

	public java.lang.String getInputref() {
		return this.inputref;
	}

	public void setInputref(java.lang.String inputref) {
		this.inputref = inputref;
	}

	public java.lang.Integer getGatewayid() {
		return this.gatewayid;
	}

	public void setGatewayid(java.lang.Integer gatewayid) {
		this.gatewayid = gatewayid;
	}
}
