/**
 * This class is generated by jOOQ
 */
package com.petpace.db.jooq.tables.daos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PetEntitiesDao extends org.jooq.impl.DAOImpl<com.petpace.db.jooq.tables.records.PetEntitiesRecord, com.petpace.db.jooq.tables.pojos.PetEntities, java.lang.String> {

	/**
	 * Create a new PetEntitiesDao without any configuration
	 */
	public PetEntitiesDao() {
		super(com.petpace.db.jooq.tables.PetEntities.PET_ENTITIES, com.petpace.db.jooq.tables.pojos.PetEntities.class);
	}

	/**
	 * Create a new PetEntitiesDao with an attached configuration
	 */
	public PetEntitiesDao(org.jooq.Configuration configuration) {
		super(com.petpace.db.jooq.tables.PetEntities.PET_ENTITIES, com.petpace.db.jooq.tables.pojos.PetEntities.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.String getId(com.petpace.db.jooq.tables.pojos.PetEntities object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.PetEntities> fetchById(java.lang.String... values) {
		return fetch(com.petpace.db.jooq.tables.PetEntities.PET_ENTITIES.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>id = value</code>
	 */
	public com.petpace.db.jooq.tables.pojos.PetEntities fetchOneById(java.lang.String value) {
		return fetchOne(com.petpace.db.jooq.tables.PetEntities.PET_ENTITIES.ID, value);
	}

	/**
	 * Fetch records that have <code>dateCreated IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.PetEntities> fetchByDatecreated(java.sql.Timestamp... values) {
		return fetch(com.petpace.db.jooq.tables.PetEntities.PET_ENTITIES.DATECREATED, values);
	}

	/**
	 * Fetch records that have <code>dateUpdated IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.PetEntities> fetchByDateupdated(java.sql.Timestamp... values) {
		return fetch(com.petpace.db.jooq.tables.PetEntities.PET_ENTITIES.DATEUPDATED, values);
	}

	/**
	 * Fetch records that have <code>status IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.PetEntities> fetchByStatus(java.lang.Integer... values) {
		return fetch(com.petpace.db.jooq.tables.PetEntities.PET_ENTITIES.STATUS, values);
	}
}
