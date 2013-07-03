/**
 * This class is generated by jOOQ
 */
package com.petpace.db.jooq.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VitalsRecord extends org.jooq.impl.UpdatableRecordImpl<com.petpace.db.jooq.tables.records.VitalsRecord> implements org.jooq.Record11<java.lang.Integer, java.lang.String, java.lang.Integer, java.math.BigDecimal, java.math.BigDecimal, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.sql.Timestamp, java.sql.Timestamp> {

	private static final long serialVersionUID = -1685049734;

	/**
	 * Setter for <code>rigel.vitals.id</code>. 
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>rigel.vitals.id</code>. 
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>rigel.vitals.collar_id</code>. 
	 */
	public void setCollarId(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>rigel.vitals.collar_id</code>. 
	 */
	public java.lang.String getCollarId() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>rigel.vitals.pet_id</code>. 
	 */
	public void setPetId(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>rigel.vitals.pet_id</code>. 
	 */
	public java.lang.Integer getPetId() {
		return (java.lang.Integer) getValue(2);
	}

	/**
	 * Setter for <code>rigel.vitals.ambientTemp</code>. 
	 */
	public void setAmbienttemp(java.math.BigDecimal value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>rigel.vitals.ambientTemp</code>. 
	 */
	public java.math.BigDecimal getAmbienttemp() {
		return (java.math.BigDecimal) getValue(3);
	}

	/**
	 * Setter for <code>rigel.vitals.bodyTemp</code>. 
	 */
	public void setBodytemp(java.math.BigDecimal value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>rigel.vitals.bodyTemp</code>. 
	 */
	public java.math.BigDecimal getBodytemp() {
		return (java.math.BigDecimal) getValue(4);
	}

	/**
	 * Setter for <code>rigel.vitals.pulse</code>. 
	 */
	public void setPulse(java.lang.Long value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>rigel.vitals.pulse</code>. 
	 */
	public java.lang.Long getPulse() {
		return (java.lang.Long) getValue(5);
	}

	/**
	 * Setter for <code>rigel.vitals.respiratory</code>. 
	 */
	public void setRespiratory(java.lang.Long value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>rigel.vitals.respiratory</code>. 
	 */
	public java.lang.Long getRespiratory() {
		return (java.lang.Long) getValue(6);
	}

	/**
	 * Setter for <code>rigel.vitals.activity</code>. 
	 */
	public void setActivity(java.lang.Long value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>rigel.vitals.activity</code>. 
	 */
	public java.lang.Long getActivity() {
		return (java.lang.Long) getValue(7);
	}

	/**
	 * Setter for <code>rigel.vitals.position</code>. 
	 */
	public void setPosition(java.lang.Long value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>rigel.vitals.position</code>. 
	 */
	public java.lang.Long getPosition() {
		return (java.lang.Long) getValue(8);
	}

	/**
	 * Setter for <code>rigel.vitals.time</code>. 
	 */
	public void setTime(java.sql.Timestamp value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>rigel.vitals.time</code>. 
	 */
	public java.sql.Timestamp getTime() {
		return (java.sql.Timestamp) getValue(9);
	}

	/**
	 * Setter for <code>rigel.vitals.created</code>. 
	 */
	public void setCreated(java.sql.Timestamp value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>rigel.vitals.created</code>. 
	 */
	public java.sql.Timestamp getCreated() {
		return (java.sql.Timestamp) getValue(10);
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
	public org.jooq.Row11<java.lang.Integer, java.lang.String, java.lang.Integer, java.math.BigDecimal, java.math.BigDecimal, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.sql.Timestamp, java.sql.Timestamp> fieldsRow() {
		return (org.jooq.Row11) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row11<java.lang.Integer, java.lang.String, java.lang.Integer, java.math.BigDecimal, java.math.BigDecimal, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.sql.Timestamp, java.sql.Timestamp> valuesRow() {
		return (org.jooq.Row11) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return com.petpace.db.jooq.tables.Vitals.VITALS.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return com.petpace.db.jooq.tables.Vitals.VITALS.COLLAR_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return com.petpace.db.jooq.tables.Vitals.VITALS.PET_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field4() {
		return com.petpace.db.jooq.tables.Vitals.VITALS.AMBIENTTEMP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field5() {
		return com.petpace.db.jooq.tables.Vitals.VITALS.BODYTEMP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field6() {
		return com.petpace.db.jooq.tables.Vitals.VITALS.PULSE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field7() {
		return com.petpace.db.jooq.tables.Vitals.VITALS.RESPIRATORY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field8() {
		return com.petpace.db.jooq.tables.Vitals.VITALS.ACTIVITY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field9() {
		return com.petpace.db.jooq.tables.Vitals.VITALS.POSITION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field10() {
		return com.petpace.db.jooq.tables.Vitals.VITALS.TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field11() {
		return com.petpace.db.jooq.tables.Vitals.VITALS.CREATED;
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
		return getPetId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value4() {
		return getAmbienttemp();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value5() {
		return getBodytemp();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value6() {
		return getPulse();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value7() {
		return getRespiratory();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value8() {
		return getActivity();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value9() {
		return getPosition();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value10() {
		return getTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value11() {
		return getCreated();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached VitalsRecord
	 */
	public VitalsRecord() {
		super(com.petpace.db.jooq.tables.Vitals.VITALS);
	}
}
