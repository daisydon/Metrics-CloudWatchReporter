/**
 * This class is generated by jOOQ
 */
package com.petpace.db.jooq.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VitalActivityRecord extends org.jooq.impl.UpdatableRecordImpl<com.petpace.db.jooq.tables.records.VitalActivityRecord> implements org.jooq.Record22<java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, java.math.BigDecimal, java.lang.Integer, java.lang.Long, java.math.BigDecimal, java.math.BigDecimal, java.lang.String, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.sql.Timestamp, java.sql.Timestamp, java.lang.String> {

	private static final long serialVersionUID = 1691947568;

	/**
	 * Setter for <code>rigel.vital_activity.id</code>. 
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>rigel.vital_activity.id</code>. 
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>rigel.vital_activity.collar_id</code>. 
	 */
	public void setCollarId(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>rigel.vital_activity.collar_id</code>. 
	 */
	public java.lang.String getCollarId() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>rigel.vital_activity.pet_id</code>. 
	 */
	public void setPetId(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>rigel.vital_activity.pet_id</code>. 
	 */
	public java.lang.Integer getPetId() {
		return (java.lang.Integer) getValue(2);
	}

	/**
	 * Setter for <code>rigel.vital_activity.name</code>. 
	 */
	public void setName(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>rigel.vital_activity.name</code>. 
	 */
	public java.lang.String getName() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>rigel.vital_activity.quality</code>. 
	 */
	public void setQuality(java.lang.Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>rigel.vital_activity.quality</code>. 
	 */
	public java.lang.Integer getQuality() {
		return (java.lang.Integer) getValue(4);
	}

	/**
	 * Setter for <code>rigel.vital_activity.deviation</code>. 
	 */
	public void setDeviation(java.math.BigDecimal value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>rigel.vital_activity.deviation</code>. 
	 */
	public java.math.BigDecimal getDeviation() {
		return (java.math.BigDecimal) getValue(5);
	}

	/**
	 * Setter for <code>rigel.vital_activity.duration</code>. 
	 */
	public void setDuration(java.lang.Integer value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>rigel.vital_activity.duration</code>. 
	 */
	public java.lang.Integer getDuration() {
		return (java.lang.Integer) getValue(6);
	}

	/**
	 * Setter for <code>rigel.vital_activity.value</code>. 
	 */
	public void setValue(java.lang.Long value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>rigel.vital_activity.value</code>. 
	 */
	public java.lang.Long getValue() {
		return (java.lang.Long) getValue(7);
	}

	/**
	 * Setter for <code>rigel.vital_activity.smv10</code>. 
	 */
	public void setSmv10(java.math.BigDecimal value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>rigel.vital_activity.smv10</code>. 
	 */
	public java.math.BigDecimal getSmv10() {
		return (java.math.BigDecimal) getValue(8);
	}

	/**
	 * Setter for <code>rigel.vital_activity.smv30</code>. 
	 */
	public void setSmv30(java.math.BigDecimal value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>rigel.vital_activity.smv30</code>. 
	 */
	public java.math.BigDecimal getSmv30() {
		return (java.math.BigDecimal) getValue(9);
	}

	/**
	 * Setter for <code>rigel.vital_activity.debug</code>. 
	 */
	public void setDebug(java.lang.String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>rigel.vital_activity.debug</code>. 
	 */
	public java.lang.String getDebug() {
		return (java.lang.String) getValue(10);
	}

	/**
	 * Setter for <code>rigel.vital_activity.exhale</code>. 
	 */
	public void setExhale(java.math.BigDecimal value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>rigel.vital_activity.exhale</code>. 
	 */
	public java.math.BigDecimal getExhale() {
		return (java.math.BigDecimal) getValue(11);
	}

	/**
	 * Setter for <code>rigel.vital_activity.exhale_std</code>. 
	 */
	public void setExhaleStd(java.math.BigDecimal value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>rigel.vital_activity.exhale_std</code>. 
	 */
	public java.math.BigDecimal getExhaleStd() {
		return (java.math.BigDecimal) getValue(12);
	}

	/**
	 * Setter for <code>rigel.vital_activity.inhale</code>. 
	 */
	public void setInhale(java.math.BigDecimal value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>rigel.vital_activity.inhale</code>. 
	 */
	public java.math.BigDecimal getInhale() {
		return (java.math.BigDecimal) getValue(13);
	}

	/**
	 * Setter for <code>rigel.vital_activity.inhale_std</code>. 
	 */
	public void setInhaleStd(java.math.BigDecimal value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>rigel.vital_activity.inhale_std</code>. 
	 */
	public java.math.BigDecimal getInhaleStd() {
		return (java.math.BigDecimal) getValue(14);
	}

	/**
	 * Setter for <code>rigel.vital_activity.nn</code>. 
	 */
	public void setNn(java.math.BigDecimal value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>rigel.vital_activity.nn</code>. 
	 */
	public java.math.BigDecimal getNn() {
		return (java.math.BigDecimal) getValue(15);
	}

	/**
	 * Setter for <code>rigel.vital_activity.nn_std</code>. 
	 */
	public void setNnStd(java.math.BigDecimal value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>rigel.vital_activity.nn_std</code>. 
	 */
	public java.math.BigDecimal getNnStd() {
		return (java.math.BigDecimal) getValue(16);
	}

	/**
	 * Setter for <code>rigel.vital_activity.ipr</code>. 
	 */
	public void setIpr(java.math.BigDecimal value) {
		setValue(17, value);
	}

	/**
	 * Getter for <code>rigel.vital_activity.ipr</code>. 
	 */
	public java.math.BigDecimal getIpr() {
		return (java.math.BigDecimal) getValue(17);
	}

	/**
	 * Setter for <code>rigel.vital_activity.ipr_std</code>. 
	 */
	public void setIprStd(java.math.BigDecimal value) {
		setValue(18, value);
	}

	/**
	 * Getter for <code>rigel.vital_activity.ipr_std</code>. 
	 */
	public java.math.BigDecimal getIprStd() {
		return (java.math.BigDecimal) getValue(18);
	}

	/**
	 * Setter for <code>rigel.vital_activity.time</code>. 
	 */
	public void setTime(java.sql.Timestamp value) {
		setValue(19, value);
	}

	/**
	 * Getter for <code>rigel.vital_activity.time</code>. 
	 */
	public java.sql.Timestamp getTime() {
		return (java.sql.Timestamp) getValue(19);
	}

	/**
	 * Setter for <code>rigel.vital_activity.created</code>. 
	 */
	public void setCreated(java.sql.Timestamp value) {
		setValue(20, value);
	}

	/**
	 * Getter for <code>rigel.vital_activity.created</code>. 
	 */
	public java.sql.Timestamp getCreated() {
		return (java.sql.Timestamp) getValue(20);
	}

	/**
	 * Setter for <code>rigel.vital_activity.notes</code>. 
	 */
	public void setNotes(java.lang.String value) {
		setValue(21, value);
	}

	/**
	 * Getter for <code>rigel.vital_activity.notes</code>. 
	 */
	public java.lang.String getNotes() {
		return (java.lang.String) getValue(21);
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
	// Record22 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row22<java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, java.math.BigDecimal, java.lang.Integer, java.lang.Long, java.math.BigDecimal, java.math.BigDecimal, java.lang.String, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.sql.Timestamp, java.sql.Timestamp, java.lang.String> fieldsRow() {
		return (org.jooq.Row22) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row22<java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, java.math.BigDecimal, java.lang.Integer, java.lang.Long, java.math.BigDecimal, java.math.BigDecimal, java.lang.String, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.sql.Timestamp, java.sql.Timestamp, java.lang.String> valuesRow() {
		return (org.jooq.Row22) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return com.petpace.db.jooq.tables.VitalActivity.VITAL_ACTIVITY.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return com.petpace.db.jooq.tables.VitalActivity.VITAL_ACTIVITY.COLLAR_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return com.petpace.db.jooq.tables.VitalActivity.VITAL_ACTIVITY.PET_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return com.petpace.db.jooq.tables.VitalActivity.VITAL_ACTIVITY.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field5() {
		return com.petpace.db.jooq.tables.VitalActivity.VITAL_ACTIVITY.QUALITY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field6() {
		return com.petpace.db.jooq.tables.VitalActivity.VITAL_ACTIVITY.DEVIATION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field7() {
		return com.petpace.db.jooq.tables.VitalActivity.VITAL_ACTIVITY.DURATION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field8() {
		return com.petpace.db.jooq.tables.VitalActivity.VITAL_ACTIVITY.VALUE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field9() {
		return com.petpace.db.jooq.tables.VitalActivity.VITAL_ACTIVITY.SMV10;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field10() {
		return com.petpace.db.jooq.tables.VitalActivity.VITAL_ACTIVITY.SMV30;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field11() {
		return com.petpace.db.jooq.tables.VitalActivity.VITAL_ACTIVITY.DEBUG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field12() {
		return com.petpace.db.jooq.tables.VitalActivity.VITAL_ACTIVITY.EXHALE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field13() {
		return com.petpace.db.jooq.tables.VitalActivity.VITAL_ACTIVITY.EXHALE_STD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field14() {
		return com.petpace.db.jooq.tables.VitalActivity.VITAL_ACTIVITY.INHALE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field15() {
		return com.petpace.db.jooq.tables.VitalActivity.VITAL_ACTIVITY.INHALE_STD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field16() {
		return com.petpace.db.jooq.tables.VitalActivity.VITAL_ACTIVITY.NN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field17() {
		return com.petpace.db.jooq.tables.VitalActivity.VITAL_ACTIVITY.NN_STD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field18() {
		return com.petpace.db.jooq.tables.VitalActivity.VITAL_ACTIVITY.IPR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field19() {
		return com.petpace.db.jooq.tables.VitalActivity.VITAL_ACTIVITY.IPR_STD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field20() {
		return com.petpace.db.jooq.tables.VitalActivity.VITAL_ACTIVITY.TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field21() {
		return com.petpace.db.jooq.tables.VitalActivity.VITAL_ACTIVITY.CREATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field22() {
		return com.petpace.db.jooq.tables.VitalActivity.VITAL_ACTIVITY.NOTES;
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
	public java.lang.String value4() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value5() {
		return getQuality();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value6() {
		return getDeviation();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value7() {
		return getDuration();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value8() {
		return getValue();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value9() {
		return getSmv10();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value10() {
		return getSmv30();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value11() {
		return getDebug();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value12() {
		return getExhale();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value13() {
		return getExhaleStd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value14() {
		return getInhale();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value15() {
		return getInhaleStd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value16() {
		return getNn();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value17() {
		return getNnStd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value18() {
		return getIpr();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value19() {
		return getIprStd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value20() {
		return getTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value21() {
		return getCreated();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value22() {
		return getNotes();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached VitalActivityRecord
	 */
	public VitalActivityRecord() {
		super(com.petpace.db.jooq.tables.VitalActivity.VITAL_ACTIVITY);
	}
}
