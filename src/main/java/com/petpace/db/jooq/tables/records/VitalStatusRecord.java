/**
 * This class is generated by jOOQ
 */
package com.petpace.db.jooq.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VitalStatusRecord extends org.jooq.impl.UpdatableRecordImpl<com.petpace.db.jooq.tables.records.VitalStatusRecord> implements org.jooq.Record11<java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.sql.Timestamp, java.lang.String, java.lang.String, java.lang.Integer> {

	private static final long serialVersionUID = 992347411;

	/**
	 * Setter for <code>sirius.vital_status.id</code>. 
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>sirius.vital_status.id</code>. 
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>sirius.vital_status.collar_id</code>. 
	 */
	public void setCollarId(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>sirius.vital_status.collar_id</code>. 
	 */
	public java.lang.String getCollarId() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>sirius.vital_status.battery</code>. 
	 */
	public void setBattery(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>sirius.vital_status.battery</code>. 
	 */
	public java.lang.Integer getBattery() {
		return (java.lang.Integer) getValue(2);
	}

	/**
	 * Setter for <code>sirius.vital_status.buckle</code>. 
	 */
	public void setBuckle(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>sirius.vital_status.buckle</code>. 
	 */
	public java.lang.String getBuckle() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>sirius.vital_status.charging</code>. 
	 */
	public void setCharging(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>sirius.vital_status.charging</code>. 
	 */
	public java.lang.String getCharging() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>sirius.vital_status.version</code>. 
	 */
	public void setVersion(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>sirius.vital_status.version</code>. 
	 */
	public java.lang.String getVersion() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>sirius.vital_status.time</code>. 
	 */
	public void setTime(java.sql.Timestamp value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>sirius.vital_status.time</code>. 
	 */
	public java.sql.Timestamp getTime() {
		return (java.sql.Timestamp) getValue(6);
	}

	/**
	 * Setter for <code>sirius.vital_status.created</code>. 
	 */
	public void setCreated(java.sql.Timestamp value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>sirius.vital_status.created</code>. 
	 */
	public java.sql.Timestamp getCreated() {
		return (java.sql.Timestamp) getValue(7);
	}

	/**
	 * Setter for <code>sirius.vital_status.Cookie</code>. 
	 */
	public void setCookie(java.lang.String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>sirius.vital_status.Cookie</code>. 
	 */
	public java.lang.String getCookie() {
		return (java.lang.String) getValue(8);
	}

	/**
	 * Setter for <code>sirius.vital_status.InputRef</code>. 
	 */
	public void setInputref(java.lang.String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>sirius.vital_status.InputRef</code>. 
	 */
	public java.lang.String getInputref() {
		return (java.lang.String) getValue(9);
	}

	/**
	 * Setter for <code>sirius.vital_status.GatewayID</code>. 
	 */
	public void setGatewayid(java.lang.Integer value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>sirius.vital_status.GatewayID</code>. 
	 */
	public java.lang.Integer getGatewayid() {
		return (java.lang.Integer) getValue(10);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record11 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row11<java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.sql.Timestamp, java.lang.String, java.lang.String, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row11) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row11<java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.sql.Timestamp, java.lang.String, java.lang.String, java.lang.Integer> valuesRow() {
		return (org.jooq.Row11) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return com.petpace.db.jooq.tables.VitalStatus.VITAL_STATUS.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return com.petpace.db.jooq.tables.VitalStatus.VITAL_STATUS.COLLAR_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return com.petpace.db.jooq.tables.VitalStatus.VITAL_STATUS.BATTERY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return com.petpace.db.jooq.tables.VitalStatus.VITAL_STATUS.BUCKLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return com.petpace.db.jooq.tables.VitalStatus.VITAL_STATUS.CHARGING;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return com.petpace.db.jooq.tables.VitalStatus.VITAL_STATUS.VERSION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field7() {
		return com.petpace.db.jooq.tables.VitalStatus.VITAL_STATUS.TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field8() {
		return com.petpace.db.jooq.tables.VitalStatus.VITAL_STATUS.CREATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field9() {
		return com.petpace.db.jooq.tables.VitalStatus.VITAL_STATUS.COOKIE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field10() {
		return com.petpace.db.jooq.tables.VitalStatus.VITAL_STATUS.INPUTREF;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field11() {
		return com.petpace.db.jooq.tables.VitalStatus.VITAL_STATUS.GATEWAYID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getCollarId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getBattery();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getBuckle();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getCharging();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getVersion();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value7() {
		return getTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value8() {
		return getCreated();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value9() {
		return getCookie();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value10() {
		return getInputref();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value11() {
		return getGatewayid();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached VitalStatusRecord
	 */
	public VitalStatusRecord() {
		super(com.petpace.db.jooq.tables.VitalStatus.VITAL_STATUS);
	}
}
