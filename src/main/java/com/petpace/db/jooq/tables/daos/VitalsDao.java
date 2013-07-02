/**
 * This class is generated by jOOQ
 */
package com.petpace.db.jooq.tables.daos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VitalsDao extends org.jooq.impl.DAOImpl<com.petpace.db.jooq.tables.records.VitalsRecord, com.petpace.db.jooq.tables.pojos.Vitals, java.lang.Integer> {

	/**
	 * Create a new VitalsDao without any configuration
	 */
	public VitalsDao() {
		super(com.petpace.db.jooq.tables.Vitals.VITALS, com.petpace.db.jooq.tables.pojos.Vitals.class);
	}

	/**
	 * Create a new VitalsDao with an attached configuration
	 */
	public VitalsDao(org.jooq.Configuration configuration) {
		super(com.petpace.db.jooq.tables.Vitals.VITALS, com.petpace.db.jooq.tables.pojos.Vitals.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Integer getId(com.petpace.db.jooq.tables.pojos.Vitals object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.Vitals> fetchById(java.lang.Integer... values) {
		return fetch(com.petpace.db.jooq.tables.Vitals.VITALS.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>id = value</code>
	 */
	public com.petpace.db.jooq.tables.pojos.Vitals fetchOneById(java.lang.Integer value) {
		return fetchOne(com.petpace.db.jooq.tables.Vitals.VITALS.ID, value);
	}

	/**
	 * Fetch records that have <code>collar_id IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.Vitals> fetchByCollarId(java.lang.String... values) {
		return fetch(com.petpace.db.jooq.tables.Vitals.VITALS.COLLAR_ID, values);
	}

	/**
	 * Fetch records that have <code>pet_id IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.Vitals> fetchByPetId(java.lang.Integer... values) {
		return fetch(com.petpace.db.jooq.tables.Vitals.VITALS.PET_ID, values);
	}

	/**
	 * Fetch records that have <code>ambientTemp IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.Vitals> fetchByAmbienttemp(java.math.BigDecimal... values) {
		return fetch(com.petpace.db.jooq.tables.Vitals.VITALS.AMBIENTTEMP, values);
	}

	/**
	 * Fetch records that have <code>bodyTemp IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.Vitals> fetchByBodytemp(java.math.BigDecimal... values) {
		return fetch(com.petpace.db.jooq.tables.Vitals.VITALS.BODYTEMP, values);
	}

	/**
	 * Fetch records that have <code>pulse IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.Vitals> fetchByPulse(java.lang.Long... values) {
		return fetch(com.petpace.db.jooq.tables.Vitals.VITALS.PULSE, values);
	}

	/**
	 * Fetch records that have <code>respiratory IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.Vitals> fetchByRespiratory(java.lang.Long... values) {
		return fetch(com.petpace.db.jooq.tables.Vitals.VITALS.RESPIRATORY, values);
	}

	/**
	 * Fetch records that have <code>activity IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.Vitals> fetchByActivity(java.lang.Long... values) {
		return fetch(com.petpace.db.jooq.tables.Vitals.VITALS.ACTIVITY, values);
	}

	/**
	 * Fetch records that have <code>position IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.Vitals> fetchByPosition(java.lang.Long... values) {
		return fetch(com.petpace.db.jooq.tables.Vitals.VITALS.POSITION, values);
	}

	/**
	 * Fetch records that have <code>time IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.Vitals> fetchByTime(java.sql.Timestamp... values) {
		return fetch(com.petpace.db.jooq.tables.Vitals.VITALS.TIME, values);
	}

	/**
	 * Fetch records that have <code>created IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.Vitals> fetchByCreated(java.sql.Timestamp... values) {
		return fetch(com.petpace.db.jooq.tables.Vitals.VITALS.CREATED, values);
	}
}
