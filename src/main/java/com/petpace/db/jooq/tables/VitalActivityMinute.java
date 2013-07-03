/**
 * This class is generated by jOOQ
 */
package com.petpace.db.jooq.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VitalActivityMinute extends org.jooq.impl.TableImpl<com.petpace.db.jooq.tables.records.VitalActivityMinuteRecord> {

	private static final long serialVersionUID = -1562655694;

	/**
	 * The singleton instance of <code>rigel.vital_activity_minute</code>
	 */
	public static final com.petpace.db.jooq.tables.VitalActivityMinute VITAL_ACTIVITY_MINUTE = new com.petpace.db.jooq.tables.VitalActivityMinute();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.petpace.db.jooq.tables.records.VitalActivityMinuteRecord> getRecordType() {
		return com.petpace.db.jooq.tables.records.VitalActivityMinuteRecord.class;
	}

	/**
	 * The column <code>rigel.vital_activity_minute.id</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.VitalActivityMinuteRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>rigel.vital_activity_minute.collar_id</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.VitalActivityMinuteRecord, java.lang.String> COLLAR_ID = createField("collar_id", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>rigel.vital_activity_minute.pet_id</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.VitalActivityMinuteRecord, java.lang.Integer> PET_ID = createField("pet_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>rigel.vital_activity_minute.value</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.VitalActivityMinuteRecord, java.lang.Long> VALUE = createField("value", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>rigel.vital_activity_minute.smv10</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.VitalActivityMinuteRecord, java.math.BigDecimal> SMV10 = createField("smv10", org.jooq.impl.SQLDataType.DECIMAL.precision(10, 2), this);

	/**
	 * The column <code>rigel.vital_activity_minute.smv30</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.VitalActivityMinuteRecord, java.math.BigDecimal> SMV30 = createField("smv30", org.jooq.impl.SQLDataType.DECIMAL.precision(10, 2), this);

	/**
	 * The column <code>rigel.vital_activity_minute.time</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.VitalActivityMinuteRecord, java.sql.Timestamp> TIME = createField("time", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * Create a <code>rigel.vital_activity_minute</code> table reference
	 */
	public VitalActivityMinute() {
		super("vital_activity_minute", com.petpace.db.jooq.Rigel.RIGEL);
	}

	/**
	 * Create an aliased <code>rigel.vital_activity_minute</code> table reference
	 */
	public VitalActivityMinute(java.lang.String alias) {
		super(alias, com.petpace.db.jooq.Rigel.RIGEL, com.petpace.db.jooq.tables.VitalActivityMinute.VITAL_ACTIVITY_MINUTE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<com.petpace.db.jooq.tables.records.VitalActivityMinuteRecord, java.lang.Integer> getIdentity() {
		return com.petpace.db.jooq.Keys.IDENTITY_VITAL_ACTIVITY_MINUTE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.petpace.db.jooq.tables.records.VitalActivityMinuteRecord> getPrimaryKey() {
		return com.petpace.db.jooq.Keys.KEY_VITAL_ACTIVITY_MINUTE_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.petpace.db.jooq.tables.records.VitalActivityMinuteRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.petpace.db.jooq.tables.records.VitalActivityMinuteRecord>>asList(com.petpace.db.jooq.Keys.KEY_VITAL_ACTIVITY_MINUTE_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<com.petpace.db.jooq.tables.records.VitalActivityMinuteRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<com.petpace.db.jooq.tables.records.VitalActivityMinuteRecord, ?>>asList(com.petpace.db.jooq.Keys.FK_9A5AAD574568D8A0, com.petpace.db.jooq.Keys.FK_9A5AAD57966F7FB6);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.petpace.db.jooq.tables.VitalActivityMinute as(java.lang.String alias) {
		return new com.petpace.db.jooq.tables.VitalActivityMinute(alias);
	}
}
