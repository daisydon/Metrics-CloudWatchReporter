/**
 * This class is generated by jOOQ
 */
package com.petpace.db.jooq.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VitalAmbienttemp extends org.jooq.impl.TableImpl<com.petpace.db.jooq.tables.records.VitalAmbienttempRecord> {

	private static final long serialVersionUID = -414726630;

	/**
	 * The singleton instance of <code>rigel.vital_ambientTemp</code>
	 */
	public static final com.petpace.db.jooq.tables.VitalAmbienttemp VITAL_AMBIENTTEMP = new com.petpace.db.jooq.tables.VitalAmbienttemp();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.petpace.db.jooq.tables.records.VitalAmbienttempRecord> getRecordType() {
		return com.petpace.db.jooq.tables.records.VitalAmbienttempRecord.class;
	}

	/**
	 * The column <code>rigel.vital_ambientTemp.id</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.VitalAmbienttempRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>rigel.vital_ambientTemp.collar_id</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.VitalAmbienttempRecord, java.lang.String> COLLAR_ID = createField("collar_id", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>rigel.vital_ambientTemp.pet_id</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.VitalAmbienttempRecord, java.lang.Integer> PET_ID = createField("pet_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>rigel.vital_ambientTemp.name</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.VitalAmbienttempRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>rigel.vital_ambientTemp.quality</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.VitalAmbienttempRecord, java.lang.Integer> QUALITY = createField("quality", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>rigel.vital_ambientTemp.deviation</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.VitalAmbienttempRecord, java.math.BigDecimal> DEVIATION = createField("deviation", org.jooq.impl.SQLDataType.DECIMAL.precision(10, 5), this);

	/**
	 * The column <code>rigel.vital_ambientTemp.duration</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.VitalAmbienttempRecord, java.lang.Integer> DURATION = createField("duration", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>rigel.vital_ambientTemp.value</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.VitalAmbienttempRecord, java.math.BigDecimal> VALUE = createField("value", org.jooq.impl.SQLDataType.DECIMAL.precision(10, 2), this);

	/**
	 * The column <code>rigel.vital_ambientTemp.debug</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.VitalAmbienttempRecord, java.lang.String> DEBUG = createField("debug", org.jooq.impl.SQLDataType.CLOB, this);

	/**
	 * The column <code>rigel.vital_ambientTemp.exhale</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.VitalAmbienttempRecord, java.math.BigDecimal> EXHALE = createField("exhale", org.jooq.impl.SQLDataType.DECIMAL.precision(10, 5), this);

	/**
	 * The column <code>rigel.vital_ambientTemp.exhale_std</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.VitalAmbienttempRecord, java.math.BigDecimal> EXHALE_STD = createField("exhale_std", org.jooq.impl.SQLDataType.DECIMAL.precision(10, 5), this);

	/**
	 * The column <code>rigel.vital_ambientTemp.inhale</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.VitalAmbienttempRecord, java.math.BigDecimal> INHALE = createField("inhale", org.jooq.impl.SQLDataType.DECIMAL.precision(10, 5), this);

	/**
	 * The column <code>rigel.vital_ambientTemp.inhale_std</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.VitalAmbienttempRecord, java.math.BigDecimal> INHALE_STD = createField("inhale_std", org.jooq.impl.SQLDataType.DECIMAL.precision(10, 5), this);

	/**
	 * The column <code>rigel.vital_ambientTemp.nn</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.VitalAmbienttempRecord, java.math.BigDecimal> NN = createField("nn", org.jooq.impl.SQLDataType.DECIMAL.precision(10, 5), this);

	/**
	 * The column <code>rigel.vital_ambientTemp.nn_std</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.VitalAmbienttempRecord, java.math.BigDecimal> NN_STD = createField("nn_std", org.jooq.impl.SQLDataType.DECIMAL.precision(10, 5), this);

	/**
	 * The column <code>rigel.vital_ambientTemp.ipr</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.VitalAmbienttempRecord, java.math.BigDecimal> IPR = createField("ipr", org.jooq.impl.SQLDataType.DECIMAL.precision(10, 5), this);

	/**
	 * The column <code>rigel.vital_ambientTemp.ipr_std</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.VitalAmbienttempRecord, java.math.BigDecimal> IPR_STD = createField("ipr_std", org.jooq.impl.SQLDataType.DECIMAL.precision(10, 5), this);

	/**
	 * The column <code>rigel.vital_ambientTemp.time</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.VitalAmbienttempRecord, java.sql.Timestamp> TIME = createField("time", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>rigel.vital_ambientTemp.created</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.VitalAmbienttempRecord, java.sql.Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>rigel.vital_ambientTemp.notes</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.VitalAmbienttempRecord, java.lang.String> NOTES = createField("notes", org.jooq.impl.SQLDataType.CLOB, this);

	/**
	 * Create a <code>rigel.vital_ambientTemp</code> table reference
	 */
	public VitalAmbienttemp() {
		super("vital_ambientTemp", com.petpace.db.jooq.Rigel.RIGEL);
	}

	/**
	 * Create an aliased <code>rigel.vital_ambientTemp</code> table reference
	 */
	public VitalAmbienttemp(java.lang.String alias) {
		super(alias, com.petpace.db.jooq.Rigel.RIGEL, com.petpace.db.jooq.tables.VitalAmbienttemp.VITAL_AMBIENTTEMP);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<com.petpace.db.jooq.tables.records.VitalAmbienttempRecord, java.lang.Integer> getIdentity() {
		return com.petpace.db.jooq.Keys.IDENTITY_VITAL_AMBIENTTEMP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.petpace.db.jooq.tables.records.VitalAmbienttempRecord> getPrimaryKey() {
		return com.petpace.db.jooq.Keys.KEY_VITAL_AMBIENTTEMP_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.petpace.db.jooq.tables.records.VitalAmbienttempRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.petpace.db.jooq.tables.records.VitalAmbienttempRecord>>asList(com.petpace.db.jooq.Keys.KEY_VITAL_AMBIENTTEMP_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<com.petpace.db.jooq.tables.records.VitalAmbienttempRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<com.petpace.db.jooq.tables.records.VitalAmbienttempRecord, ?>>asList(com.petpace.db.jooq.Keys.FK_CC7416D24568D8A0, com.petpace.db.jooq.Keys.FK_CC7416D2966F7FB6);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.petpace.db.jooq.tables.VitalAmbienttemp as(java.lang.String alias) {
		return new com.petpace.db.jooq.tables.VitalAmbienttemp(alias);
	}
}
