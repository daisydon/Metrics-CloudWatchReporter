/**
 * This class is generated by jOOQ
 */
package com.petpace.db.jooq.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BusinessUnitCollars extends org.jooq.impl.TableImpl<com.petpace.db.jooq.tables.records.BusinessUnitCollarsRecord> {

	private static final long serialVersionUID = 1220821072;

	/**
	 * The singleton instance of <code>rigel.business_unit_collars</code>
	 */
	public static final com.petpace.db.jooq.tables.BusinessUnitCollars BUSINESS_UNIT_COLLARS = new com.petpace.db.jooq.tables.BusinessUnitCollars();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.petpace.db.jooq.tables.records.BusinessUnitCollarsRecord> getRecordType() {
		return com.petpace.db.jooq.tables.records.BusinessUnitCollarsRecord.class;
	}

	/**
	 * The column <code>rigel.business_unit_collars.business_unit_id</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.BusinessUnitCollarsRecord, java.lang.Integer> BUSINESS_UNIT_ID = createField("business_unit_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>rigel.business_unit_collars.collar_id</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.BusinessUnitCollarsRecord, java.lang.String> COLLAR_ID = createField("collar_id", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * Create a <code>rigel.business_unit_collars</code> table reference
	 */
	public BusinessUnitCollars() {
		super("business_unit_collars", com.petpace.db.jooq.Rigel.RIGEL);
	}

	/**
	 * Create an aliased <code>rigel.business_unit_collars</code> table reference
	 */
	public BusinessUnitCollars(java.lang.String alias) {
		super(alias, com.petpace.db.jooq.Rigel.RIGEL, com.petpace.db.jooq.tables.BusinessUnitCollars.BUSINESS_UNIT_COLLARS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.petpace.db.jooq.tables.records.BusinessUnitCollarsRecord> getPrimaryKey() {
		return com.petpace.db.jooq.Keys.KEY_BUSINESS_UNIT_COLLARS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.petpace.db.jooq.tables.records.BusinessUnitCollarsRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.petpace.db.jooq.tables.records.BusinessUnitCollarsRecord>>asList(com.petpace.db.jooq.Keys.KEY_BUSINESS_UNIT_COLLARS_PRIMARY, com.petpace.db.jooq.Keys.KEY_BUSINESS_UNIT_COLLARS_UNIQ_79D35FEA4568D8A0);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<com.petpace.db.jooq.tables.records.BusinessUnitCollarsRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<com.petpace.db.jooq.tables.records.BusinessUnitCollarsRecord, ?>>asList(com.petpace.db.jooq.Keys.FK_79D35FEAA58ECB40, com.petpace.db.jooq.Keys.FK_79D35FEA4568D8A0);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.petpace.db.jooq.tables.BusinessUnitCollars as(java.lang.String alias) {
		return new com.petpace.db.jooq.tables.BusinessUnitCollars(alias);
	}
}
