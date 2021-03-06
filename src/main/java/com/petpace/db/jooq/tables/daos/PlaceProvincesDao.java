/**
 * This class is generated by jOOQ
 */
package com.petpace.db.jooq.tables.daos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PlaceProvincesDao extends org.jooq.impl.DAOImpl<com.petpace.db.jooq.tables.records.PlaceProvincesRecord, com.petpace.db.jooq.tables.pojos.PlaceProvinces, java.lang.String> {

	/**
	 * Create a new PlaceProvincesDao without any configuration
	 */
	public PlaceProvincesDao() {
		super(com.petpace.db.jooq.tables.PlaceProvinces.PLACE_PROVINCES, com.petpace.db.jooq.tables.pojos.PlaceProvinces.class);
	}

	/**
	 * Create a new PlaceProvincesDao with an attached configuration
	 */
	public PlaceProvincesDao(org.jooq.Configuration configuration) {
		super(com.petpace.db.jooq.tables.PlaceProvinces.PLACE_PROVINCES, com.petpace.db.jooq.tables.pojos.PlaceProvinces.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.String getId(com.petpace.db.jooq.tables.pojos.PlaceProvinces object) {
		return object.getProvincecode();
	}

	/**
	 * Fetch records that have <code>provinceCode IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.PlaceProvinces> fetchByProvincecode(java.lang.String... values) {
		return fetch(com.petpace.db.jooq.tables.PlaceProvinces.PLACE_PROVINCES.PROVINCECODE, values);
	}

	/**
	 * Fetch a unique record that has <code>provinceCode = value</code>
	 */
	public com.petpace.db.jooq.tables.pojos.PlaceProvinces fetchOneByProvincecode(java.lang.String value) {
		return fetchOne(com.petpace.db.jooq.tables.PlaceProvinces.PLACE_PROVINCES.PROVINCECODE, value);
	}

	/**
	 * Fetch records that have <code>province IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.PlaceProvinces> fetchByProvince(java.lang.String... values) {
		return fetch(com.petpace.db.jooq.tables.PlaceProvinces.PLACE_PROVINCES.PROVINCE, values);
	}

	/**
	 * Fetch records that have <code>country IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.PlaceProvinces> fetchByCountry(java.lang.String... values) {
		return fetch(com.petpace.db.jooq.tables.PlaceProvinces.PLACE_PROVINCES.COUNTRY, values);
	}

	/**
	 * Fetch records that have <code>countryCode IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.PlaceProvinces> fetchByCountrycode(java.lang.String... values) {
		return fetch(com.petpace.db.jooq.tables.PlaceProvinces.PLACE_PROVINCES.COUNTRYCODE, values);
	}
}
