/**
 * This class is generated by jOOQ
 */
package com.petpace.db.jooq.tables.daos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AddressDao extends org.jooq.impl.DAOImpl<com.petpace.db.jooq.tables.records.AddressRecord, com.petpace.db.jooq.tables.pojos.Address, java.lang.Integer> {

	/**
	 * Create a new AddressDao without any configuration
	 */
	public AddressDao() {
		super(com.petpace.db.jooq.tables.Address.ADDRESS, com.petpace.db.jooq.tables.pojos.Address.class);
	}

	/**
	 * Create a new AddressDao with an attached configuration
	 */
	public AddressDao(org.jooq.Configuration configuration) {
		super(com.petpace.db.jooq.tables.Address.ADDRESS, com.petpace.db.jooq.tables.pojos.Address.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Integer getId(com.petpace.db.jooq.tables.pojos.Address object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.Address> fetchById(java.lang.Integer... values) {
		return fetch(com.petpace.db.jooq.tables.Address.ADDRESS.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>id = value</code>
	 */
	public com.petpace.db.jooq.tables.pojos.Address fetchOneById(java.lang.Integer value) {
		return fetchOne(com.petpace.db.jooq.tables.Address.ADDRESS.ID, value);
	}

	/**
	 * Fetch records that have <code>street IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.Address> fetchByStreet(java.lang.String... values) {
		return fetch(com.petpace.db.jooq.tables.Address.ADDRESS.STREET, values);
	}

	/**
	 * Fetch records that have <code>street2 IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.Address> fetchByStreet2(java.lang.String... values) {
		return fetch(com.petpace.db.jooq.tables.Address.ADDRESS.STREET2, values);
	}

	/**
	 * Fetch records that have <code>city IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.Address> fetchByCity(java.lang.String... values) {
		return fetch(com.petpace.db.jooq.tables.Address.ADDRESS.CITY, values);
	}

	/**
	 * Fetch records that have <code>region IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.Address> fetchByRegion(java.lang.String... values) {
		return fetch(com.petpace.db.jooq.tables.Address.ADDRESS.REGION, values);
	}

	/**
	 * Fetch records that have <code>country IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.Address> fetchByCountry(java.lang.String... values) {
		return fetch(com.petpace.db.jooq.tables.Address.ADDRESS.COUNTRY, values);
	}

	/**
	 * Fetch records that have <code>zipcode IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.Address> fetchByZipcode(java.lang.String... values) {
		return fetch(com.petpace.db.jooq.tables.Address.ADDRESS.ZIPCODE, values);
	}

	/**
	 * Fetch records that have <code>dateCreated IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.Address> fetchByDatecreated(java.sql.Timestamp... values) {
		return fetch(com.petpace.db.jooq.tables.Address.ADDRESS.DATECREATED, values);
	}

	/**
	 * Fetch records that have <code>dateUpdated IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.Address> fetchByDateupdated(java.sql.Timestamp... values) {
		return fetch(com.petpace.db.jooq.tables.Address.ADDRESS.DATEUPDATED, values);
	}

	/**
	 * Fetch records that have <code>status IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.Address> fetchByStatus(java.lang.Integer... values) {
		return fetch(com.petpace.db.jooq.tables.Address.ADDRESS.STATUS, values);
	}
}
