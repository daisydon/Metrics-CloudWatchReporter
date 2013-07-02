/**
 * This class is generated by jOOQ
 */
package com.petpace.db.jooq.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VitalPetAttributes implements java.io.Serializable {

	private static final long serialVersionUID = -1253148429;

	private java.lang.Integer    petId;
	private java.lang.String     collarId;
	private java.lang.String     samplingfrequency;
	private java.lang.Integer    battery;
	private java.lang.String     buckle;
	private java.lang.String     charging;
	private java.math.BigDecimal ambienttemp;
	private java.math.BigDecimal bodytemp;
	private java.lang.Long       pulse;
	private java.lang.Long       respiratory;
	private java.lang.Long       activity;
	private java.lang.Long       position;
	private java.sql.Timestamp   time;
	private java.sql.Timestamp   lastcommunication;
	private java.lang.Integer    sendnotification;
	private java.lang.Integer    clinicaltrial;

	public java.lang.Integer getPetId() {
		return this.petId;
	}

	public void setPetId(java.lang.Integer petId) {
		this.petId = petId;
	}

	public java.lang.String getCollarId() {
		return this.collarId;
	}

	public void setCollarId(java.lang.String collarId) {
		this.collarId = collarId;
	}

	public java.lang.String getSamplingfrequency() {
		return this.samplingfrequency;
	}

	public void setSamplingfrequency(java.lang.String samplingfrequency) {
		this.samplingfrequency = samplingfrequency;
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

	public java.math.BigDecimal getAmbienttemp() {
		return this.ambienttemp;
	}

	public void setAmbienttemp(java.math.BigDecimal ambienttemp) {
		this.ambienttemp = ambienttemp;
	}

	public java.math.BigDecimal getBodytemp() {
		return this.bodytemp;
	}

	public void setBodytemp(java.math.BigDecimal bodytemp) {
		this.bodytemp = bodytemp;
	}

	public java.lang.Long getPulse() {
		return this.pulse;
	}

	public void setPulse(java.lang.Long pulse) {
		this.pulse = pulse;
	}

	public java.lang.Long getRespiratory() {
		return this.respiratory;
	}

	public void setRespiratory(java.lang.Long respiratory) {
		this.respiratory = respiratory;
	}

	public java.lang.Long getActivity() {
		return this.activity;
	}

	public void setActivity(java.lang.Long activity) {
		this.activity = activity;
	}

	public java.lang.Long getPosition() {
		return this.position;
	}

	public void setPosition(java.lang.Long position) {
		this.position = position;
	}

	public java.sql.Timestamp getTime() {
		return this.time;
	}

	public void setTime(java.sql.Timestamp time) {
		this.time = time;
	}

	public java.sql.Timestamp getLastcommunication() {
		return this.lastcommunication;
	}

	public void setLastcommunication(java.sql.Timestamp lastcommunication) {
		this.lastcommunication = lastcommunication;
	}

	public java.lang.Integer getSendnotification() {
		return this.sendnotification;
	}

	public void setSendnotification(java.lang.Integer sendnotification) {
		this.sendnotification = sendnotification;
	}

	public java.lang.Integer getClinicaltrial() {
		return this.clinicaltrial;
	}

	public void setClinicaltrial(java.lang.Integer clinicaltrial) {
		this.clinicaltrial = clinicaltrial;
	}
}
