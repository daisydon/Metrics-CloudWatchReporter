/**
 * This class is generated by jOOQ
 */
package com.petpace.db.jooq.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Address extends org.jooq.impl.TableImpl<com.petpace.db.jooq.tables.records.AddressRecord> {

	private static final long serialVersionUID = 2117066606;

	/**
	 * The singleton instance of <code>sirius.address</code>
	 */
	public static final com.petpace.db.jooq.tables.Address ADDRESS = new com.petpace.db.jooq.tables.Address();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.petpace.db.jooq.tables.records.AddressRecord> getRecordType() {
		return com.petpace.db.jooq.tables.records.AddressRecord.class;
	}

	/**
	 * The column <code>sirius.address.id</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.AddressRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>sirius.address.street</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.AddressRecord, java.lang.String> STREET = createField("street", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>sirius.address.street2</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.AddressRecord, java.lang.String> STREET2 = createField("street2", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>sirius.address.city</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.AddressRecord, java.lang.String> CITY = createField("city", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>sirius.address.region</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.AddressRecord, java.lang.String> REGION = createField("region", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>sirius.address.country</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.AddressRecord, java.lang.String> COUNTRY = createField("country", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>sirius.address.zipcode</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.AddressRecord, java.lang.String> ZIPCODE = createField("zipcode", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>sirius.address.dateCreated</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.AddressRecord, java.sql.Timestamp> DATECREATED = createField("dateCreated", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>sirius.address.dateUpdated</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.AddressRecord, java.sql.Timestamp> DATEUPDATED = createField("dateUpdated", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>sirius.address.status</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.AddressRecord, java.lang.Integer> STATUS = createField("status", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * Create a <code>sirius.address</code> table reference
	 */
	public Address() {
		super("address", com.petpace.db.jooq.Sirius.SIRIUS);
	}

	/**
	 * Create an aliased <code>sirius.address</code> table reference
	 */
	public Address(java.lang.String alias) {
		super(alias, com.petpace.db.jooq.Sirius.SIRIUS, com.petpace.db.jooq.tables.Address.ADDRESS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<com.petpace.db.jooq.tables.records.AddressRecord, java.lang.Integer> getIdentity() {
		return com.petpace.db.jooq.Keys.IDENTITY_ADDRESS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.petpace.db.jooq.tables.records.AddressRecord> getPrimaryKey() {
		return com.petpace.db.jooq.Keys.KEY_ADDRESS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.petpace.db.jooq.tables.records.AddressRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.petpace.db.jooq.tables.records.AddressRecord>>asList(com.petpace.db.jooq.Keys.KEY_ADDRESS_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.petpace.db.jooq.tables.Address as(java.lang.String alias) {
		return new com.petpace.db.jooq.tables.Address(alias);
	}
}
