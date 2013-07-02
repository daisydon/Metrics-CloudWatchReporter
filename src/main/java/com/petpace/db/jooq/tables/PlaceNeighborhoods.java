/**
 * This class is generated by jOOQ
 */
package com.petpace.db.jooq.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PlaceNeighborhoods extends org.jooq.impl.TableImpl<com.petpace.db.jooq.tables.records.PlaceNeighborhoodsRecord> {

	private static final long serialVersionUID = 1189690414;

	/**
	 * The singleton instance of <code>sirius.place_neighborhoods</code>
	 */
	public static final com.petpace.db.jooq.tables.PlaceNeighborhoods PLACE_NEIGHBORHOODS = new com.petpace.db.jooq.tables.PlaceNeighborhoods();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.petpace.db.jooq.tables.records.PlaceNeighborhoodsRecord> getRecordType() {
		return com.petpace.db.jooq.tables.records.PlaceNeighborhoodsRecord.class;
	}

	/**
	 * The column <code>sirius.place_neighborhoods.id</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.PlaceNeighborhoodsRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>sirius.place_neighborhoods.name</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.PlaceNeighborhoodsRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>sirius.place_neighborhoods.sub</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.PlaceNeighborhoodsRecord, java.lang.String> SUB = createField("sub", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>sirius.place_neighborhoods.display</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.PlaceNeighborhoodsRecord, java.lang.String> DISPLAY = createField("display", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>sirius.place_neighborhoods.url</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.PlaceNeighborhoodsRecord, java.lang.String> URL = createField("url", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>sirius.place_neighborhoods.city</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.PlaceNeighborhoodsRecord, java.lang.String> CITY = createField("city", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>sirius.place_neighborhoods.region</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.PlaceNeighborhoodsRecord, java.lang.String> REGION = createField("region", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>sirius.place_neighborhoods.country</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.PlaceNeighborhoodsRecord, java.lang.String> COUNTRY = createField("country", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>sirius.place_neighborhoods.latitude</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.PlaceNeighborhoodsRecord, java.lang.Double> LATITUDE = createField("latitude", org.jooq.impl.SQLDataType.DOUBLE, this);

	/**
	 * The column <code>sirius.place_neighborhoods.longitude</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.PlaceNeighborhoodsRecord, java.lang.Double> LONGITUDE = createField("longitude", org.jooq.impl.SQLDataType.DOUBLE, this);

	/**
	 * The column <code>sirius.place_neighborhoods.created</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.PlaceNeighborhoodsRecord, java.sql.Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>sirius.place_neighborhoods.status</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.PlaceNeighborhoodsRecord, java.lang.Integer> STATUS = createField("status", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * Create a <code>sirius.place_neighborhoods</code> table reference
	 */
	public PlaceNeighborhoods() {
		super("place_neighborhoods", com.petpace.db.jooq.Sirius.SIRIUS);
	}

	/**
	 * Create an aliased <code>sirius.place_neighborhoods</code> table reference
	 */
	public PlaceNeighborhoods(java.lang.String alias) {
		super(alias, com.petpace.db.jooq.Sirius.SIRIUS, com.petpace.db.jooq.tables.PlaceNeighborhoods.PLACE_NEIGHBORHOODS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<com.petpace.db.jooq.tables.records.PlaceNeighborhoodsRecord, java.lang.Integer> getIdentity() {
		return com.petpace.db.jooq.Keys.IDENTITY_PLACE_NEIGHBORHOODS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.petpace.db.jooq.tables.records.PlaceNeighborhoodsRecord> getPrimaryKey() {
		return com.petpace.db.jooq.Keys.KEY_PLACE_NEIGHBORHOODS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.petpace.db.jooq.tables.records.PlaceNeighborhoodsRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.petpace.db.jooq.tables.records.PlaceNeighborhoodsRecord>>asList(com.petpace.db.jooq.Keys.KEY_PLACE_NEIGHBORHOODS_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.petpace.db.jooq.tables.PlaceNeighborhoods as(java.lang.String alias) {
		return new com.petpace.db.jooq.tables.PlaceNeighborhoods(alias);
	}
}
