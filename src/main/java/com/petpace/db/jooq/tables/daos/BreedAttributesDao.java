/**
 * This class is generated by jOOQ
 */
package com.petpace.db.jooq.tables.daos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BreedAttributesDao extends org.jooq.impl.DAOImpl<com.petpace.db.jooq.tables.records.BreedAttributesRecord, com.petpace.db.jooq.tables.pojos.BreedAttributes, java.lang.String> {

	/**
	 * Create a new BreedAttributesDao without any configuration
	 */
	public BreedAttributesDao() {
		super(com.petpace.db.jooq.tables.BreedAttributes.BREED_ATTRIBUTES, com.petpace.db.jooq.tables.pojos.BreedAttributes.class);
	}

	/**
	 * Create a new BreedAttributesDao with an attached configuration
	 */
	public BreedAttributesDao(org.jooq.Configuration configuration) {
		super(com.petpace.db.jooq.tables.BreedAttributes.BREED_ATTRIBUTES, com.petpace.db.jooq.tables.pojos.BreedAttributes.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.String getId(com.petpace.db.jooq.tables.pojos.BreedAttributes object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.BreedAttributes> fetchById(java.lang.String... values) {
		return fetch(com.petpace.db.jooq.tables.BreedAttributes.BREED_ATTRIBUTES.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>id = value</code>
	 */
	public com.petpace.db.jooq.tables.pojos.BreedAttributes fetchOneById(java.lang.String value) {
		return fetchOne(com.petpace.db.jooq.tables.BreedAttributes.BREED_ATTRIBUTES.ID, value);
	}

	/**
	 * Fetch records that have <code>dataType IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.BreedAttributes> fetchByDatatype(java.lang.String... values) {
		return fetch(com.petpace.db.jooq.tables.BreedAttributes.BREED_ATTRIBUTES.DATATYPE, values);
	}
}
