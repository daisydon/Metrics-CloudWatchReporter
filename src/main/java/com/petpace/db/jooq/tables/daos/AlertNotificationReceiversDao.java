/**
 * This class is generated by jOOQ
 */
package com.petpace.db.jooq.tables.daos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AlertNotificationReceiversDao extends org.jooq.impl.DAOImpl<com.petpace.db.jooq.tables.records.AlertNotificationReceiversRecord, com.petpace.db.jooq.tables.pojos.AlertNotificationReceivers, java.lang.Integer> {

	/**
	 * Create a new AlertNotificationReceiversDao without any configuration
	 */
	public AlertNotificationReceiversDao() {
		super(com.petpace.db.jooq.tables.AlertNotificationReceivers.ALERT_NOTIFICATION_RECEIVERS, com.petpace.db.jooq.tables.pojos.AlertNotificationReceivers.class);
	}

	/**
	 * Create a new AlertNotificationReceiversDao with an attached configuration
	 */
	public AlertNotificationReceiversDao(org.jooq.Configuration configuration) {
		super(com.petpace.db.jooq.tables.AlertNotificationReceivers.ALERT_NOTIFICATION_RECEIVERS, com.petpace.db.jooq.tables.pojos.AlertNotificationReceivers.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Integer getId(com.petpace.db.jooq.tables.pojos.AlertNotificationReceivers object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.AlertNotificationReceivers> fetchById(java.lang.Integer... values) {
		return fetch(com.petpace.db.jooq.tables.AlertNotificationReceivers.ALERT_NOTIFICATION_RECEIVERS.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>id = value</code>
	 */
	public com.petpace.db.jooq.tables.pojos.AlertNotificationReceivers fetchOneById(java.lang.Integer value) {
		return fetchOne(com.petpace.db.jooq.tables.AlertNotificationReceivers.ALERT_NOTIFICATION_RECEIVERS.ID, value);
	}

	/**
	 * Fetch records that have <code>protocol IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.AlertNotificationReceivers> fetchByProtocol(java.lang.String... values) {
		return fetch(com.petpace.db.jooq.tables.AlertNotificationReceivers.ALERT_NOTIFICATION_RECEIVERS.PROTOCOL, values);
	}

	/**
	 * Fetch records that have <code>address IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.AlertNotificationReceivers> fetchByAddress(java.lang.String... values) {
		return fetch(com.petpace.db.jooq.tables.AlertNotificationReceivers.ALERT_NOTIFICATION_RECEIVERS.ADDRESS, values);
	}

	/**
	 * Fetch records that have <code>message IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.AlertNotificationReceivers> fetchByMessage(java.lang.String... values) {
		return fetch(com.petpace.db.jooq.tables.AlertNotificationReceivers.ALERT_NOTIFICATION_RECEIVERS.MESSAGE, values);
	}

	/**
	 * Fetch records that have <code>confirmationRequired IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.AlertNotificationReceivers> fetchByConfirmationrequired(java.lang.Integer... values) {
		return fetch(com.petpace.db.jooq.tables.AlertNotificationReceivers.ALERT_NOTIFICATION_RECEIVERS.CONFIRMATIONREQUIRED, values);
	}
}
