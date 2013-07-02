/**
 * This class is generated by jOOQ
 */
package com.petpace.db.jooq.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VitalStatus extends org.jooq.impl.TableImpl<com.petpace.db.jooq.tables.records.VitalStatusRecord> {

	private static final long serialVersionUID = 1596510222;

	/**
	 * The singleton instance of <code>sirius.vital_status</code>
	 */
	public static final com.petpace.db.jooq.tables.VitalStatus VITAL_STATUS = new com.petpace.db.jooq.tables.VitalStatus();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.petpace.db.jooq.tables.records.VitalStatusRecord> getRecordType() {
		return com.petpace.db.jooq.tables.records.VitalStatusRecord.class;
	}

	/**
	 * The column <code>sirius.vital_status.id</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.VitalStatusRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>sirius.vital_status.collar_id</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.VitalStatusRecord, java.lang.String> COLLAR_ID = createField("collar_id", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>sirius.vital_status.battery</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.VitalStatusRecord, java.lang.Integer> BATTERY = createField("battery", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>sirius.vital_status.buckle</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.VitalStatusRecord, java.lang.String> BUCKLE = createField("buckle", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>sirius.vital_status.charging</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.VitalStatusRecord, java.lang.String> CHARGING = createField("charging", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>sirius.vital_status.version</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.VitalStatusRecord, java.lang.String> VERSION = createField("version", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>sirius.vital_status.time</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.VitalStatusRecord, java.sql.Timestamp> TIME = createField("time", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>sirius.vital_status.created</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.VitalStatusRecord, java.sql.Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>sirius.vital_status.Cookie</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.VitalStatusRecord, java.lang.String> COOKIE = createField("Cookie", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>sirius.vital_status.InputRef</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.VitalStatusRecord, java.lang.String> INPUTREF = createField("InputRef", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>sirius.vital_status.GatewayID</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.VitalStatusRecord, java.lang.Integer> GATEWAYID = createField("GatewayID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * Create a <code>sirius.vital_status</code> table reference
	 */
	public VitalStatus() {
		super("vital_status", com.petpace.db.jooq.Sirius.SIRIUS);
	}

	/**
	 * Create an aliased <code>sirius.vital_status</code> table reference
	 */
	public VitalStatus(java.lang.String alias) {
		super(alias, com.petpace.db.jooq.Sirius.SIRIUS, com.petpace.db.jooq.tables.VitalStatus.VITAL_STATUS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<com.petpace.db.jooq.tables.records.VitalStatusRecord, java.lang.Integer> getIdentity() {
		return com.petpace.db.jooq.Keys.IDENTITY_VITAL_STATUS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.petpace.db.jooq.tables.records.VitalStatusRecord> getPrimaryKey() {
		return com.petpace.db.jooq.Keys.KEY_VITAL_STATUS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.petpace.db.jooq.tables.records.VitalStatusRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.petpace.db.jooq.tables.records.VitalStatusRecord>>asList(com.petpace.db.jooq.Keys.KEY_VITAL_STATUS_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<com.petpace.db.jooq.tables.records.VitalStatusRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<com.petpace.db.jooq.tables.records.VitalStatusRecord, ?>>asList(com.petpace.db.jooq.Keys.FK_B79A12D64568D8A0, com.petpace.db.jooq.Keys.FK_B79A12D6C3E73E37);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.petpace.db.jooq.tables.VitalStatus as(java.lang.String alias) {
		return new com.petpace.db.jooq.tables.VitalStatus(alias);
	}
}
