/**
 * This class is generated by jOOQ
 */
package com.petpace.db.jooq.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BusinessUnits extends org.jooq.impl.TableImpl<com.petpace.db.jooq.tables.records.BusinessUnitsRecord> {

	private static final long serialVersionUID = 440231516;

	/**
	 * The singleton instance of <code>rigel.business_units</code>
	 */
	public static final com.petpace.db.jooq.tables.BusinessUnits BUSINESS_UNITS = new com.petpace.db.jooq.tables.BusinessUnits();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.petpace.db.jooq.tables.records.BusinessUnitsRecord> getRecordType() {
		return com.petpace.db.jooq.tables.records.BusinessUnitsRecord.class;
	}

	/**
	 * The column <code>rigel.business_units.id</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.BusinessUnitsRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>rigel.business_units.parent_id</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.BusinessUnitsRecord, java.lang.Integer> PARENT_ID = createField("parent_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>rigel.business_units.address_id</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.BusinessUnitsRecord, java.lang.Integer> ADDRESS_ID = createField("address_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>rigel.business_units.name</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.BusinessUnitsRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>rigel.business_units.url</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.BusinessUnitsRecord, java.lang.String> URL = createField("url", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>rigel.business_units.website</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.BusinessUnitsRecord, java.lang.String> WEBSITE = createField("website", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>rigel.business_units.phone</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.BusinessUnitsRecord, java.lang.String> PHONE = createField("phone", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>rigel.business_units.fax</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.BusinessUnitsRecord, java.lang.String> FAX = createField("fax", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>rigel.business_units.created</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.BusinessUnitsRecord, java.sql.Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>rigel.business_units.updated</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.BusinessUnitsRecord, java.sql.Timestamp> UPDATED = createField("updated", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>rigel.business_units.status</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.BusinessUnitsRecord, java.lang.Integer> STATUS = createField("status", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * Create a <code>rigel.business_units</code> table reference
	 */
	public BusinessUnits() {
		super("business_units", com.petpace.db.jooq.Rigel.RIGEL);
	}

	/**
	 * Create an aliased <code>rigel.business_units</code> table reference
	 */
	public BusinessUnits(java.lang.String alias) {
		super(alias, com.petpace.db.jooq.Rigel.RIGEL, com.petpace.db.jooq.tables.BusinessUnits.BUSINESS_UNITS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<com.petpace.db.jooq.tables.records.BusinessUnitsRecord, java.lang.Integer> getIdentity() {
		return com.petpace.db.jooq.Keys.IDENTITY_BUSINESS_UNITS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.petpace.db.jooq.tables.records.BusinessUnitsRecord> getPrimaryKey() {
		return com.petpace.db.jooq.Keys.KEY_BUSINESS_UNITS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.petpace.db.jooq.tables.records.BusinessUnitsRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.petpace.db.jooq.tables.records.BusinessUnitsRecord>>asList(com.petpace.db.jooq.Keys.KEY_BUSINESS_UNITS_PRIMARY, com.petpace.db.jooq.Keys.KEY_BUSINESS_UNITS_BUID_URL_UIDX, com.petpace.db.jooq.Keys.KEY_BUSINESS_UNITS_UNIQ_975193F6F5B7AF75, com.petpace.db.jooq.Keys.KEY_BUSINESS_UNITS_UNIQ_975193F6F47645AE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<com.petpace.db.jooq.tables.records.BusinessUnitsRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<com.petpace.db.jooq.tables.records.BusinessUnitsRecord, ?>>asList(com.petpace.db.jooq.Keys.FK_975193F6727ACA70, com.petpace.db.jooq.Keys.FK_975193F6F5B7AF75);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.petpace.db.jooq.tables.BusinessUnits as(java.lang.String alias) {
		return new com.petpace.db.jooq.tables.BusinessUnits(alias);
	}
}
