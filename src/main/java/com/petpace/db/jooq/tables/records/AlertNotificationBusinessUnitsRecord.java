/**
 * This class is generated by jOOQ
 */
package com.petpace.db.jooq.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AlertNotificationBusinessUnitsRecord extends org.jooq.impl.UpdatableRecordImpl<com.petpace.db.jooq.tables.records.AlertNotificationBusinessUnitsRecord> implements org.jooq.Record2<java.lang.Integer, java.lang.Integer> {

	private static final long serialVersionUID = -442865728;

	/**
	 * Setter for <code>sirius.alert_notification_business_units.preference_id</code>. 
	 */
	public void setPreferenceId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>sirius.alert_notification_business_units.preference_id</code>. 
	 */
	public java.lang.Integer getPreferenceId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>sirius.alert_notification_business_units.businessUnit_id</code>. 
	 */
	public void setBusinessunitId(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>sirius.alert_notification_business_units.businessUnit_id</code>. 
	 */
	public java.lang.Integer getBusinessunitId() {
		return (java.lang.Integer) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record2<java.lang.Integer, java.lang.Integer> key() {
		return (org.jooq.Record2) super.key();
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.Integer> valuesRow() {
		return (org.jooq.Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return com.petpace.db.jooq.tables.AlertNotificationBusinessUnits.ALERT_NOTIFICATION_BUSINESS_UNITS.PREFERENCE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return com.petpace.db.jooq.tables.AlertNotificationBusinessUnits.ALERT_NOTIFICATION_BUSINESS_UNITS.BUSINESSUNIT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getPreferenceId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getBusinessunitId();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached AlertNotificationBusinessUnitsRecord
	 */
	public AlertNotificationBusinessUnitsRecord() {
		super(com.petpace.db.jooq.tables.AlertNotificationBusinessUnits.ALERT_NOTIFICATION_BUSINESS_UNITS);
	}
}
