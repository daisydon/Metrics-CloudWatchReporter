/**
 * This class is generated by jOOQ
 */
package com.petpace.db.jooq.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PlaceCities extends org.jooq.impl.TableImpl<com.petpace.db.jooq.tables.records.PlaceCitiesRecord> {

	private static final long serialVersionUID = -1643296978;

	/**
	 * The singleton instance of <code>rigel.place_cities</code>
	 */
	public static final com.petpace.db.jooq.tables.PlaceCities PLACE_CITIES = new com.petpace.db.jooq.tables.PlaceCities();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.petpace.db.jooq.tables.records.PlaceCitiesRecord> getRecordType() {
		return com.petpace.db.jooq.tables.records.PlaceCitiesRecord.class;
	}

	/**
	 * The column <code>rigel.place_cities.id</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.PlaceCitiesRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>rigel.place_cities.name</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.PlaceCitiesRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>rigel.place_cities.display</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.PlaceCitiesRecord, java.lang.String> DISPLAY = createField("display", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>rigel.place_cities.oldurl</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.PlaceCitiesRecord, java.lang.String> OLDURL = createField("oldurl", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>rigel.place_cities.url</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.PlaceCitiesRecord, java.lang.String> URL = createField("url", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>rigel.place_cities.locale</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.PlaceCitiesRecord, java.lang.String> LOCALE = createField("locale", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>rigel.place_cities.regionCode</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.PlaceCitiesRecord, java.lang.String> REGIONCODE = createField("regionCode", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>rigel.place_cities.regionFullname</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.PlaceCitiesRecord, java.lang.String> REGIONFULLNAME = createField("regionFullname", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>rigel.place_cities.postalCode</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.PlaceCitiesRecord, java.lang.String> POSTALCODE = createField("postalCode", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>rigel.place_cities.country</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.PlaceCitiesRecord, java.lang.String> COUNTRY = createField("country", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>rigel.place_cities.countryFullname</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.PlaceCitiesRecord, java.lang.String> COUNTRYFULLNAME = createField("countryFullname", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>rigel.place_cities.metroName</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.PlaceCitiesRecord, java.lang.String> METRONAME = createField("metroName", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>rigel.place_cities.metroCode</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.PlaceCitiesRecord, java.lang.String> METROCODE = createField("metroCode", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>rigel.place_cities.provinceCode</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.PlaceCitiesRecord, java.lang.String> PROVINCECODE = createField("provinceCode", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>rigel.place_cities.latitude</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.PlaceCitiesRecord, java.lang.Double> LATITUDE = createField("latitude", org.jooq.impl.SQLDataType.DOUBLE, this);

	/**
	 * The column <code>rigel.place_cities.longitude</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.PlaceCitiesRecord, java.lang.Double> LONGITUDE = createField("longitude", org.jooq.impl.SQLDataType.DOUBLE, this);

	/**
	 * The column <code>rigel.place_cities.created</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.PlaceCitiesRecord, java.sql.Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>rigel.place_cities.restaurant_count</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.PlaceCitiesRecord, java.lang.Integer> RESTAURANT_COUNT = createField("restaurant_count", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * Create a <code>rigel.place_cities</code> table reference
	 */
	public PlaceCities() {
		super("place_cities", com.petpace.db.jooq.Rigel.RIGEL);
	}

	/**
	 * Create an aliased <code>rigel.place_cities</code> table reference
	 */
	public PlaceCities(java.lang.String alias) {
		super(alias, com.petpace.db.jooq.Rigel.RIGEL, com.petpace.db.jooq.tables.PlaceCities.PLACE_CITIES);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<com.petpace.db.jooq.tables.records.PlaceCitiesRecord, java.lang.Integer> getIdentity() {
		return com.petpace.db.jooq.Keys.IDENTITY_PLACE_CITIES;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.petpace.db.jooq.tables.records.PlaceCitiesRecord> getPrimaryKey() {
		return com.petpace.db.jooq.Keys.KEY_PLACE_CITIES_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.petpace.db.jooq.tables.records.PlaceCitiesRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.petpace.db.jooq.tables.records.PlaceCitiesRecord>>asList(com.petpace.db.jooq.Keys.KEY_PLACE_CITIES_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.petpace.db.jooq.tables.PlaceCities as(java.lang.String alias) {
		return new com.petpace.db.jooq.tables.PlaceCities(alias);
	}
}
