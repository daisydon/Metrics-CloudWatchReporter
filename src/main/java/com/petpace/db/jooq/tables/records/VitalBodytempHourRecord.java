/**
 * This class is generated by jOOQ
 */
package com.petpace.db.jooq.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VitalBodytempHourRecord extends org.jooq.impl.UpdatableRecordImpl<com.petpace.db.jooq.tables.records.VitalBodytempHourRecord> implements org.jooq.Record10<java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Long, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.sql.Timestamp> {

	private static final long serialVersionUID = -535730237;

	/**
	 * Setter for <code>rigel.vital_bodytemp_hour.id</code>. 
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>rigel.vital_bodytemp_hour.id</code>. 
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>rigel.vital_bodytemp_hour.collar_id</code>. 
	 */
	public void setCollarId(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>rigel.vital_bodytemp_hour.collar_id</code>. 
	 */
	public java.lang.String getCollarId() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>rigel.vital_bodytemp_hour.pet_id</code>. 
	 */
	public void setPetId(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>rigel.vital_bodytemp_hour.pet_id</code>. 
	 */
	public java.lang.Integer getPetId() {
		return (java.lang.Integer) getValue(2);
	}

	/**
	 * Setter for <code>rigel.vital_bodytemp_hour.value</code>. 
	 */
	public void setValue(java.lang.Long value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>rigel.vital_bodytemp_hour.value</code>. 
	 */
	public java.lang.Long getValue() {
		return (java.lang.Long) getValue(3);
	}

	/**
	 * Setter for <code>rigel.vital_bodytemp_hour.ambient</code>. 
	 */
	public void setAmbient(java.math.BigDecimal value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>rigel.vital_bodytemp_hour.ambient</code>. 
	 */
	public java.math.BigDecimal getAmbient() {
		return (java.math.BigDecimal) getValue(4);
	}

	/**
	 * Setter for <code>rigel.vital_bodytemp_hour.hiLimit</code>. 
	 */
	public void setHilimit(java.math.BigDecimal value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>rigel.vital_bodytemp_hour.hiLimit</code>. 
	 */
	public java.math.BigDecimal getHilimit() {
		return (java.math.BigDecimal) getValue(5);
	}

	/**
	 * Setter for <code>rigel.vital_bodytemp_hour.lowLimit</code>. 
	 */
	public void setLowlimit(java.math.BigDecimal value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>rigel.vital_bodytemp_hour.lowLimit</code>. 
	 */
	public java.math.BigDecimal getLowlimit() {
		return (java.math.BigDecimal) getValue(6);
	}

	/**
	 * Setter for <code>rigel.vital_bodytemp_hour.smv10</code>. 
	 */
	public void setSmv10(java.math.BigDecimal value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>rigel.vital_bodytemp_hour.smv10</code>. 
	 */
	public java.math.BigDecimal getSmv10() {
		return (java.math.BigDecimal) getValue(7);
	}

	/**
	 * Setter for <code>rigel.vital_bodytemp_hour.smv30</code>. 
	 */
	public void setSmv30(java.math.BigDecimal value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>rigel.vital_bodytemp_hour.smv30</code>. 
	 */
	public java.math.BigDecimal getSmv30() {
		return (java.math.BigDecimal) getValue(8);
	}

	/**
	 * Setter for <code>rigel.vital_bodytemp_hour.time</code>. 
	 */
	public void setTime(java.sql.Timestamp value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>rigel.vital_bodytemp_hour.time</code>. 
	 */
	public java.sql.Timestamp getTime() {
		return (java.sql.Timestamp) getValue(9);
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
	// Record10 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row10<java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Long, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.sql.Timestamp> fieldsRow() {
		return (org.jooq.Row10) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row10<java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Long, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.sql.Timestamp> valuesRow() {
		return (org.jooq.Row10) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return com.petpace.db.jooq.tables.VitalBodytempHour.VITAL_BODYTEMP_HOUR.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return com.petpace.db.jooq.tables.VitalBodytempHour.VITAL_BODYTEMP_HOUR.COLLAR_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return com.petpace.db.jooq.tables.VitalBodytempHour.VITAL_BODYTEMP_HOUR.PET_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field4() {
		return com.petpace.db.jooq.tables.VitalBodytempHour.VITAL_BODYTEMP_HOUR.VALUE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field5() {
		return com.petpace.db.jooq.tables.VitalBodytempHour.VITAL_BODYTEMP_HOUR.AMBIENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field6() {
		return com.petpace.db.jooq.tables.VitalBodytempHour.VITAL_BODYTEMP_HOUR.HILIMIT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field7() {
		return com.petpace.db.jooq.tables.VitalBodytempHour.VITAL_BODYTEMP_HOUR.LOWLIMIT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field8() {
		return com.petpace.db.jooq.tables.VitalBodytempHour.VITAL_BODYTEMP_HOUR.SMV10;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field9() {
		return com.petpace.db.jooq.tables.VitalBodytempHour.VITAL_BODYTEMP_HOUR.SMV30;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field10() {
		return com.petpace.db.jooq.tables.VitalBodytempHour.VITAL_BODYTEMP_HOUR.TIME;
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
	public java.lang.Long value4() {
		return getValue();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value5() {
		return getAmbient();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value6() {
		return getHilimit();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value7() {
		return getLowlimit();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value8() {
		return getSmv10();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value9() {
		return getSmv30();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value10() {
		return getTime();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached VitalBodytempHourRecord
	 */
	public VitalBodytempHourRecord() {
		super(com.petpace.db.jooq.tables.VitalBodytempHour.VITAL_BODYTEMP_HOUR);
	}
}
