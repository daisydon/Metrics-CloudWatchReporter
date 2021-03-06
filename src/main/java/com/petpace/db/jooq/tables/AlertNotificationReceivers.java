/**
 * This class is generated by jOOQ
 */
package com.petpace.db.jooq.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AlertNotificationReceivers extends org.jooq.impl.TableImpl<com.petpace.db.jooq.tables.records.AlertNotificationReceiversRecord> {

	private static final long serialVersionUID = -1978076829;

	/**
	 * The singleton instance of <code>rigel.alert_notification_receivers</code>
	 */
	public static final com.petpace.db.jooq.tables.AlertNotificationReceivers ALERT_NOTIFICATION_RECEIVERS = new com.petpace.db.jooq.tables.AlertNotificationReceivers();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.petpace.db.jooq.tables.records.AlertNotificationReceiversRecord> getRecordType() {
		return com.petpace.db.jooq.tables.records.AlertNotificationReceiversRecord.class;
	}

	/**
	 * The column <code>rigel.alert_notification_receivers.id</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.AlertNotificationReceiversRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>rigel.alert_notification_receivers.protocol</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.AlertNotificationReceiversRecord, java.lang.String> PROTOCOL = createField("protocol", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>rigel.alert_notification_receivers.address</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.AlertNotificationReceiversRecord, java.lang.String> ADDRESS = createField("address", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>rigel.alert_notification_receivers.message</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.AlertNotificationReceiversRecord, java.lang.String> MESSAGE = createField("message", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>rigel.alert_notification_receivers.confirmationRequired</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.AlertNotificationReceiversRecord, java.lang.Integer> CONFIRMATIONREQUIRED = createField("confirmationRequired", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * Create a <code>rigel.alert_notification_receivers</code> table reference
	 */
	public AlertNotificationReceivers() {
		super("alert_notification_receivers", com.petpace.db.jooq.Rigel.RIGEL);
	}

	/**
	 * Create an aliased <code>rigel.alert_notification_receivers</code> table reference
	 */
	public AlertNotificationReceivers(java.lang.String alias) {
		super(alias, com.petpace.db.jooq.Rigel.RIGEL, com.petpace.db.jooq.tables.AlertNotificationReceivers.ALERT_NOTIFICATION_RECEIVERS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<com.petpace.db.jooq.tables.records.AlertNotificationReceiversRecord, java.lang.Integer> getIdentity() {
		return com.petpace.db.jooq.Keys.IDENTITY_ALERT_NOTIFICATION_RECEIVERS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.petpace.db.jooq.tables.records.AlertNotificationReceiversRecord> getPrimaryKey() {
		return com.petpace.db.jooq.Keys.KEY_ALERT_NOTIFICATION_RECEIVERS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.petpace.db.jooq.tables.records.AlertNotificationReceiversRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.petpace.db.jooq.tables.records.AlertNotificationReceiversRecord>>asList(com.petpace.db.jooq.Keys.KEY_ALERT_NOTIFICATION_RECEIVERS_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.petpace.db.jooq.tables.AlertNotificationReceivers as(java.lang.String alias) {
		return new com.petpace.db.jooq.tables.AlertNotificationReceivers(alias);
	}
}
