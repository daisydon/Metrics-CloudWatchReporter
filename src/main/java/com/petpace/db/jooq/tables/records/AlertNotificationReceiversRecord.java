/**
 * This class is generated by jOOQ
 */
package com.petpace.db.jooq.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AlertNotificationReceiversRecord extends org.jooq.impl.UpdatableRecordImpl<com.petpace.db.jooq.tables.records.AlertNotificationReceiversRecord> implements org.jooq.Record5<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> {

	private static final long serialVersionUID = 1620013594;

	/**
	 * Setter for <code>sirius.alert_notification_receivers.id</code>. 
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>sirius.alert_notification_receivers.id</code>. 
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>sirius.alert_notification_receivers.protocol</code>. 
	 */
	public void setProtocol(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>sirius.alert_notification_receivers.protocol</code>. 
	 */
	public java.lang.String getProtocol() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>sirius.alert_notification_receivers.address</code>. 
	 */
	public void setAddress(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>sirius.alert_notification_receivers.address</code>. 
	 */
	public java.lang.String getAddress() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>sirius.alert_notification_receivers.message</code>. 
	 */
	public void setMessage(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>sirius.alert_notification_receivers.message</code>. 
	 */
	public java.lang.String getMessage() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>sirius.alert_notification_receivers.confirmationRequired</code>. 
	 */
	public void setConfirmationrequired(java.lang.Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>sirius.alert_notification_receivers.confirmationRequired</code>. 
	 */
	public java.lang.Integer getConfirmationrequired() {
		return (java.lang.Integer) getValue(4);
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
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> valuesRow() {
		return (org.jooq.Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return com.petpace.db.jooq.tables.AlertNotificationReceivers.ALERT_NOTIFICATION_RECEIVERS.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return com.petpace.db.jooq.tables.AlertNotificationReceivers.ALERT_NOTIFICATION_RECEIVERS.PROTOCOL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return com.petpace.db.jooq.tables.AlertNotificationReceivers.ALERT_NOTIFICATION_RECEIVERS.ADDRESS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return com.petpace.db.jooq.tables.AlertNotificationReceivers.ALERT_NOTIFICATION_RECEIVERS.MESSAGE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field5() {
		return com.petpace.db.jooq.tables.AlertNotificationReceivers.ALERT_NOTIFICATION_RECEIVERS.CONFIRMATIONREQUIRED;
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
		return getProtocol();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getAddress();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getMessage();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value5() {
		return getConfirmationrequired();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached AlertNotificationReceiversRecord
	 */
	public AlertNotificationReceiversRecord() {
		super(com.petpace.db.jooq.tables.AlertNotificationReceivers.ALERT_NOTIFICATION_RECEIVERS);
	}
}
