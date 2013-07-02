/**
 * This class is generated by jOOQ
 */
package com.petpace.db.jooq.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Businesses extends org.jooq.impl.TableImpl<com.petpace.db.jooq.tables.records.BusinessesRecord> {

	private static final long serialVersionUID = -1144447487;

	/**
	 * The singleton instance of <code>sirius.businesses</code>
	 */
	public static final com.petpace.db.jooq.tables.Businesses BUSINESSES = new com.petpace.db.jooq.tables.Businesses();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.petpace.db.jooq.tables.records.BusinessesRecord> getRecordType() {
		return com.petpace.db.jooq.tables.records.BusinessesRecord.class;
	}

	/**
	 * The column <code>sirius.businesses.id</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.BusinessesRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>sirius.businesses.address_id</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.BusinessesRecord, java.lang.Integer> ADDRESS_ID = createField("address_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>sirius.businesses.name</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.BusinessesRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>sirius.businesses.url</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.BusinessesRecord, java.lang.String> URL = createField("url", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>sirius.businesses.btype</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.BusinessesRecord, java.lang.Integer> BTYPE = createField("btype", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>sirius.businesses.website</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.BusinessesRecord, java.lang.String> WEBSITE = createField("website", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>sirius.businesses.phone</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.BusinessesRecord, java.lang.String> PHONE = createField("phone", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>sirius.businesses.fax</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.BusinessesRecord, java.lang.String> FAX = createField("fax", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>sirius.businesses.created</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.BusinessesRecord, java.sql.Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>sirius.businesses.updated</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.BusinessesRecord, java.sql.Timestamp> UPDATED = createField("updated", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>sirius.businesses.status</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.BusinessesRecord, java.lang.Integer> STATUS = createField("status", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>sirius.businesses.parent_id</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.BusinessesRecord, java.lang.Integer> PARENT_ID = createField("parent_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * Create a <code>sirius.businesses</code> table reference
	 */
	public Businesses() {
		super("businesses", com.petpace.db.jooq.Sirius.SIRIUS);
	}

	/**
	 * Create an aliased <code>sirius.businesses</code> table reference
	 */
	public Businesses(java.lang.String alias) {
		super(alias, com.petpace.db.jooq.Sirius.SIRIUS, com.petpace.db.jooq.tables.Businesses.BUSINESSES);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<com.petpace.db.jooq.tables.records.BusinessesRecord, java.lang.Integer> getIdentity() {
		return com.petpace.db.jooq.Keys.IDENTITY_BUSINESSES;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.petpace.db.jooq.tables.records.BusinessesRecord> getPrimaryKey() {
		return com.petpace.db.jooq.Keys.KEY_BUSINESSES_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.petpace.db.jooq.tables.records.BusinessesRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.petpace.db.jooq.tables.records.BusinessesRecord>>asList(com.petpace.db.jooq.Keys.KEY_BUSINESSES_PRIMARY, com.petpace.db.jooq.Keys.KEY_BUSINESSES_UNIQ_2DCA55ECF5B7AF75, com.petpace.db.jooq.Keys.KEY_BUSINESSES_UNIQ_2DCA55EC5E237E06, com.petpace.db.jooq.Keys.KEY_BUSINESSES_UNIQ_2DCA55ECF47645AE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<com.petpace.db.jooq.tables.records.BusinessesRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<com.petpace.db.jooq.tables.records.BusinessesRecord, ?>>asList(com.petpace.db.jooq.Keys.FK_2DCA55ECF5B7AF75, com.petpace.db.jooq.Keys.FK_2DCA55EC727ACA70);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.petpace.db.jooq.tables.Businesses as(java.lang.String alias) {
		return new com.petpace.db.jooq.tables.Businesses(alias);
	}
}
