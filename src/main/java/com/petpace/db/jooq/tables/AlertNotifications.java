/**
 * This class is generated by jOOQ
 */
package com.petpace.db.jooq.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AlertNotifications extends org.jooq.impl.TableImpl<com.petpace.db.jooq.tables.records.AlertNotificationsRecord> {

	private static final long serialVersionUID = 510689176;

	/**
	 * The singleton instance of <code>rigel.alert_notifications</code>
	 */
	public static final com.petpace.db.jooq.tables.AlertNotifications ALERT_NOTIFICATIONS = new com.petpace.db.jooq.tables.AlertNotifications();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.petpace.db.jooq.tables.records.AlertNotificationsRecord> getRecordType() {
		return com.petpace.db.jooq.tables.records.AlertNotificationsRecord.class;
	}

	/**
	 * The column <code>rigel.alert_notifications.id</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.AlertNotificationsRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>rigel.alert_notifications.alert_id</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.AlertNotificationsRecord, java.lang.Integer> ALERT_ID = createField("alert_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>rigel.alert_notifications.confirmationRequired</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.AlertNotificationsRecord, java.lang.Integer> CONFIRMATIONREQUIRED = createField("confirmationRequired", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>rigel.alert_notifications.created</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.AlertNotificationsRecord, java.sql.Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>rigel.alert_notifications.status</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.AlertNotificationsRecord, java.lang.Integer> STATUS = createField("status", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * Create a <code>rigel.alert_notifications</code> table reference
	 */
	public AlertNotifications() {
		super("alert_notifications", com.petpace.db.jooq.Rigel.RIGEL);
	}

	/**
	 * Create an aliased <code>rigel.alert_notifications</code> table reference
	 */
	public AlertNotifications(java.lang.String alias) {
		super(alias, com.petpace.db.jooq.Rigel.RIGEL, com.petpace.db.jooq.tables.AlertNotifications.ALERT_NOTIFICATIONS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<com.petpace.db.jooq.tables.records.AlertNotificationsRecord, java.lang.Integer> getIdentity() {
		return com.petpace.db.jooq.Keys.IDENTITY_ALERT_NOTIFICATIONS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.petpace.db.jooq.tables.records.AlertNotificationsRecord> getPrimaryKey() {
		return com.petpace.db.jooq.Keys.KEY_ALERT_NOTIFICATIONS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.petpace.db.jooq.tables.records.AlertNotificationsRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.petpace.db.jooq.tables.records.AlertNotificationsRecord>>asList(com.petpace.db.jooq.Keys.KEY_ALERT_NOTIFICATIONS_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<com.petpace.db.jooq.tables.records.AlertNotificationsRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<com.petpace.db.jooq.tables.records.AlertNotificationsRecord, ?>>asList(com.petpace.db.jooq.Keys.FK_D012795C93035F72);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.petpace.db.jooq.tables.AlertNotifications as(java.lang.String alias) {
		return new com.petpace.db.jooq.tables.AlertNotifications(alias);
	}
}
