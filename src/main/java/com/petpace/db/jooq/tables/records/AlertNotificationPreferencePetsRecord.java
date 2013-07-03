/**
 * This class is generated by jOOQ
 */
package com.petpace.db.jooq.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AlertNotificationPreferencePetsRecord extends org.jooq.impl.UpdatableRecordImpl<com.petpace.db.jooq.tables.records.AlertNotificationPreferencePetsRecord> implements org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer> {

	private static final long serialVersionUID = -1858824021;

	/**
	 * Setter for <code>rigel.alert_notification_preference_pets.pet_id</code>. 
	 */
	public void setPetId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>rigel.alert_notification_preference_pets.pet_id</code>. 
	 */
	public java.lang.Integer getPetId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>rigel.alert_notification_preference_pets.preference_id</code>. 
	 */
	public void setPreferenceId(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>rigel.alert_notification_preference_pets.preference_id</code>. 
	 */
	public java.lang.Integer getPreferenceId() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>rigel.alert_notification_preference_pets.businessUnit_id</code>. 
	 */
	public void setBusinessunitId(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>rigel.alert_notification_preference_pets.businessUnit_id</code>. 
	 */
	public java.lang.Integer getBusinessunitId() {
		return (java.lang.Integer) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer> key() {
		return (org.jooq.Record3) super.key();
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> valuesRow() {
		return (org.jooq.Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return com.petpace.db.jooq.tables.AlertNotificationPreferencePets.ALERT_NOTIFICATION_PREFERENCE_PETS.PET_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return com.petpace.db.jooq.tables.AlertNotificationPreferencePets.ALERT_NOTIFICATION_PREFERENCE_PETS.PREFERENCE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return com.petpace.db.jooq.tables.AlertNotificationPreferencePets.ALERT_NOTIFICATION_PREFERENCE_PETS.BUSINESSUNIT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getPetId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getPreferenceId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getBusinessunitId();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached AlertNotificationPreferencePetsRecord
	 */
	public AlertNotificationPreferencePetsRecord() {
		super(com.petpace.db.jooq.tables.AlertNotificationPreferencePets.ALERT_NOTIFICATION_PREFERENCE_PETS);
	}
}
