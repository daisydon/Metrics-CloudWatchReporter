/**
 * This class is generated by jOOQ
 */
package com.petpace.db.jooq.tables.daos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PlaceCitiesDao extends org.jooq.impl.DAOImpl<com.petpace.db.jooq.tables.records.PlaceCitiesRecord, com.petpace.db.jooq.tables.pojos.PlaceCities, java.lang.Integer> {

	/**
	 * Create a new PlaceCitiesDao without any configuration
	 */
	public PlaceCitiesDao() {
		super(com.petpace.db.jooq.tables.PlaceCities.PLACE_CITIES, com.petpace.db.jooq.tables.pojos.PlaceCities.class);
	}

	/**
	 * Create a new PlaceCitiesDao with an attached configuration
	 */
	public PlaceCitiesDao(org.jooq.Configuration configuration) {
		super(com.petpace.db.jooq.tables.PlaceCities.PLACE_CITIES, com.petpace.db.jooq.tables.pojos.PlaceCities.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Integer getId(com.petpace.db.jooq.tables.pojos.PlaceCities object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.PlaceCities> fetchById(java.lang.Integer... values) {
		return fetch(com.petpace.db.jooq.tables.PlaceCities.PLACE_CITIES.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>id = value</code>
	 */
	public com.petpace.db.jooq.tables.pojos.PlaceCities fetchOneById(java.lang.Integer value) {
		return fetchOne(com.petpace.db.jooq.tables.PlaceCities.PLACE_CITIES.ID, value);
	}

	/**
	 * Fetch records that have <code>name IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.PlaceCities> fetchByName(java.lang.String... values) {
		return fetch(com.petpace.db.jooq.tables.PlaceCities.PLACE_CITIES.NAME, values);
	}

	/**
	 * Fetch records that have <code>display IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.PlaceCities> fetchByDisplay(java.lang.String... values) {
		return fetch(com.petpace.db.jooq.tables.PlaceCities.PLACE_CITIES.DISPLAY, values);
	}

	/**
	 * Fetch records that have <code>oldurl IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.PlaceCities> fetchByOldurl(java.lang.String... values) {
		return fetch(com.petpace.db.jooq.tables.PlaceCities.PLACE_CITIES.OLDURL, values);
	}

	/**
	 * Fetch records that have <code>url IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.PlaceCities> fetchByUrl(java.lang.String... values) {
		return fetch(com.petpace.db.jooq.tables.PlaceCities.PLACE_CITIES.URL, values);
	}

	/**
	 * Fetch records that have <code>locale IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.PlaceCities> fetchByLocale(java.lang.String... values) {
		return fetch(com.petpace.db.jooq.tables.PlaceCities.PLACE_CITIES.LOCALE, values);
	}

	/**
	 * Fetch records that have <code>regionCode IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.PlaceCities> fetchByRegioncode(java.lang.String... values) {
		return fetch(com.petpace.db.jooq.tables.PlaceCities.PLACE_CITIES.REGIONCODE, values);
	}

	/**
	 * Fetch records that have <code>regionFullname IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.PlaceCities> fetchByRegionfullname(java.lang.String... values) {
		return fetch(com.petpace.db.jooq.tables.PlaceCities.PLACE_CITIES.REGIONFULLNAME, values);
	}

	/**
	 * Fetch records that have <code>postalCode IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.PlaceCities> fetchByPostalcode(java.lang.String... values) {
		return fetch(com.petpace.db.jooq.tables.PlaceCities.PLACE_CITIES.POSTALCODE, values);
	}

	/**
	 * Fetch records that have <code>country IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.PlaceCities> fetchByCountry(java.lang.String... values) {
		return fetch(com.petpace.db.jooq.tables.PlaceCities.PLACE_CITIES.COUNTRY, values);
	}

	/**
	 * Fetch records that have <code>countryFullname IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.PlaceCities> fetchByCountryfullname(java.lang.String... values) {
		return fetch(com.petpace.db.jooq.tables.PlaceCities.PLACE_CITIES.COUNTRYFULLNAME, values);
	}

	/**
	 * Fetch records that have <code>metroName IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.PlaceCities> fetchByMetroname(java.lang.String... values) {
		return fetch(com.petpace.db.jooq.tables.PlaceCities.PLACE_CITIES.METRONAME, values);
	}

	/**
	 * Fetch records that have <code>metroCode IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.PlaceCities> fetchByMetrocode(java.lang.String... values) {
		return fetch(com.petpace.db.jooq.tables.PlaceCities.PLACE_CITIES.METROCODE, values);
	}

	/**
	 * Fetch records that have <code>provinceCode IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.PlaceCities> fetchByProvincecode(java.lang.String... values) {
		return fetch(com.petpace.db.jooq.tables.PlaceCities.PLACE_CITIES.PROVINCECODE, values);
	}

	/**
	 * Fetch records that have <code>latitude IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.PlaceCities> fetchByLatitude(java.lang.Double... values) {
		return fetch(com.petpace.db.jooq.tables.PlaceCities.PLACE_CITIES.LATITUDE, values);
	}

	/**
	 * Fetch records that have <code>longitude IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.PlaceCities> fetchByLongitude(java.lang.Double... values) {
		return fetch(com.petpace.db.jooq.tables.PlaceCities.PLACE_CITIES.LONGITUDE, values);
	}

	/**
	 * Fetch records that have <code>created IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.PlaceCities> fetchByCreated(java.sql.Timestamp... values) {
		return fetch(com.petpace.db.jooq.tables.PlaceCities.PLACE_CITIES.CREATED, values);
	}

	/**
	 * Fetch records that have <code>restaurant_count IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.PlaceCities> fetchByRestaurantCount(java.lang.Integer... values) {
		return fetch(com.petpace.db.jooq.tables.PlaceCities.PLACE_CITIES.RESTAURANT_COUNT, values);
	}
}
