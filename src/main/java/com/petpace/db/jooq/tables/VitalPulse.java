/**
 * This class is generated by jOOQ
 */
package com.petpace.db.jooq.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VitalPulse extends org.jooq.impl.TableImpl<com.petpace.db.jooq.tables.records.VitalPulseRecord> {

	private static final long serialVersionUID = 1449156327;

	/**
	 * The singleton instance of <code>rigel.vital_pulse</code>
	 */
	public static final com.petpace.db.jooq.tables.VitalPulse VITAL_PULSE = new com.petpace.db.jooq.tables.VitalPulse();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.petpace.db.jooq.tables.records.VitalPulseRecord> getRecordType() {
		return com.petpace.db.jooq.tables.records.VitalPulseRecord.class;
	}

	/**
	 * The column <code>rigel.vital_pulse.id</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.VitalPulseRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>rigel.vital_pulse.collar_id</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.VitalPulseRecord, java.lang.String> COLLAR_ID = createField("collar_id", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>rigel.vital_pulse.pet_id</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.VitalPulseRecord, java.lang.Integer> PET_ID = createField("pet_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>rigel.vital_pulse.name</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.VitalPulseRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>rigel.vital_pulse.quality</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.VitalPulseRecord, java.lang.Integer> QUALITY = createField("quality", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>rigel.vital_pulse.deviation</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.VitalPulseRecord, java.math.BigDecimal> DEVIATION = createField("deviation", org.jooq.impl.SQLDataType.DECIMAL.precision(10, 5), this);

	/**
	 * The column <code>rigel.vital_pulse.duration</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.VitalPulseRecord, java.lang.Integer> DURATION = createField("duration", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>rigel.vital_pulse.value</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.VitalPulseRecord, java.lang.Long> VALUE = createField("value", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>rigel.vital_pulse.smv10</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.VitalPulseRecord, java.math.BigDecimal> SMV10 = createField("smv10", org.jooq.impl.SQLDataType.DECIMAL.precision(10, 2), this);

	/**
	 * The column <code>rigel.vital_pulse.smv30</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.VitalPulseRecord, java.math.BigDecimal> SMV30 = createField("smv30", org.jooq.impl.SQLDataType.DECIMAL.precision(10, 2), this);

	/**
	 * The column <code>rigel.vital_pulse.debug</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.VitalPulseRecord, java.lang.String> DEBUG = createField("debug", org.jooq.impl.SQLDataType.CLOB, this);

	/**
	 * The column <code>rigel.vital_pulse.exhale</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.VitalPulseRecord, java.math.BigDecimal> EXHALE = createField("exhale", org.jooq.impl.SQLDataType.DECIMAL.precision(10, 5), this);

	/**
	 * The column <code>rigel.vital_pulse.exhale_std</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.VitalPulseRecord, java.math.BigDecimal> EXHALE_STD = createField("exhale_std", org.jooq.impl.SQLDataType.DECIMAL.precision(10, 5), this);

	/**
	 * The column <code>rigel.vital_pulse.inhale</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.VitalPulseRecord, java.math.BigDecimal> INHALE = createField("inhale", org.jooq.impl.SQLDataType.DECIMAL.precision(10, 5), this);

	/**
	 * The column <code>rigel.vital_pulse.inhale_std</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.VitalPulseRecord, java.math.BigDecimal> INHALE_STD = createField("inhale_std", org.jooq.impl.SQLDataType.DECIMAL.precision(10, 5), this);

	/**
	 * The column <code>rigel.vital_pulse.nn</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.VitalPulseRecord, java.math.BigDecimal> NN = createField("nn", org.jooq.impl.SQLDataType.DECIMAL.precision(10, 5), this);

	/**
	 * The column <code>rigel.vital_pulse.nn_std</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.VitalPulseRecord, java.math.BigDecimal> NN_STD = createField("nn_std", org.jooq.impl.SQLDataType.DECIMAL.precision(10, 5), this);

	/**
	 * The column <code>rigel.vital_pulse.ipr</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.VitalPulseRecord, java.math.BigDecimal> IPR = createField("ipr", org.jooq.impl.SQLDataType.DECIMAL.precision(10, 5), this);

	/**
	 * The column <code>rigel.vital_pulse.ipr_std</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.VitalPulseRecord, java.math.BigDecimal> IPR_STD = createField("ipr_std", org.jooq.impl.SQLDataType.DECIMAL.precision(10, 5), this);

	/**
	 * The column <code>rigel.vital_pulse.time</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.VitalPulseRecord, java.sql.Timestamp> TIME = createField("time", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>rigel.vital_pulse.created</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.VitalPulseRecord, java.sql.Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>rigel.vital_pulse.notes</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.VitalPulseRecord, java.lang.String> NOTES = createField("notes", org.jooq.impl.SQLDataType.CLOB, this);

	/**
	 * Create a <code>rigel.vital_pulse</code> table reference
	 */
	public VitalPulse() {
		super("vital_pulse", com.petpace.db.jooq.Rigel.RIGEL);
	}

	/**
	 * Create an aliased <code>rigel.vital_pulse</code> table reference
	 */
	public VitalPulse(java.lang.String alias) {
		super(alias, com.petpace.db.jooq.Rigel.RIGEL, com.petpace.db.jooq.tables.VitalPulse.VITAL_PULSE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<com.petpace.db.jooq.tables.records.VitalPulseRecord, java.lang.Integer> getIdentity() {
		return com.petpace.db.jooq.Keys.IDENTITY_VITAL_PULSE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.petpace.db.jooq.tables.records.VitalPulseRecord> getPrimaryKey() {
		return com.petpace.db.jooq.Keys.KEY_VITAL_PULSE_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.petpace.db.jooq.tables.records.VitalPulseRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.petpace.db.jooq.tables.records.VitalPulseRecord>>asList(com.petpace.db.jooq.Keys.KEY_VITAL_PULSE_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<com.petpace.db.jooq.tables.records.VitalPulseRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<com.petpace.db.jooq.tables.records.VitalPulseRecord, ?>>asList(com.petpace.db.jooq.Keys.FK_8D16956E4568D8A0, com.petpace.db.jooq.Keys.FK_8D16956E966F7FB6);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.petpace.db.jooq.tables.VitalPulse as(java.lang.String alias) {
		return new com.petpace.db.jooq.tables.VitalPulse(alias);
	}
}
