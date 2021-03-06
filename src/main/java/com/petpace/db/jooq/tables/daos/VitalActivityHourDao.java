/**
 * This class is generated by jOOQ
 */
package com.petpace.db.jooq.tables.daos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VitalActivityHourDao extends org.jooq.impl.DAOImpl<com.petpace.db.jooq.tables.records.VitalActivityHourRecord, com.petpace.db.jooq.tables.pojos.VitalActivityHour, java.lang.Integer> {

	/**
	 * Create a new VitalActivityHourDao without any configuration
	 */
	public VitalActivityHourDao() {
		super(com.petpace.db.jooq.tables.VitalActivityHour.VITAL_ACTIVITY_HOUR, com.petpace.db.jooq.tables.pojos.VitalActivityHour.class);
	}

	/**
	 * Create a new VitalActivityHourDao with an attached configuration
	 */
	public VitalActivityHourDao(org.jooq.Configuration configuration) {
		super(com.petpace.db.jooq.tables.VitalActivityHour.VITAL_ACTIVITY_HOUR, com.petpace.db.jooq.tables.pojos.VitalActivityHour.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Integer getId(com.petpace.db.jooq.tables.pojos.VitalActivityHour object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.VitalActivityHour> fetchById(java.lang.Integer... values) {
		return fetch(com.petpace.db.jooq.tables.VitalActivityHour.VITAL_ACTIVITY_HOUR.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>id = value</code>
	 */
	public com.petpace.db.jooq.tables.pojos.VitalActivityHour fetchOneById(java.lang.Integer value) {
		return fetchOne(com.petpace.db.jooq.tables.VitalActivityHour.VITAL_ACTIVITY_HOUR.ID, value);
	}

	/**
	 * Fetch records that have <code>collar_id IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.VitalActivityHour> fetchByCollarId(java.lang.String... values) {
		return fetch(com.petpace.db.jooq.tables.VitalActivityHour.VITAL_ACTIVITY_HOUR.COLLAR_ID, values);
	}

	/**
	 * Fetch records that have <code>pet_id IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.VitalActivityHour> fetchByPetId(java.lang.Integer... values) {
		return fetch(com.petpace.db.jooq.tables.VitalActivityHour.VITAL_ACTIVITY_HOUR.PET_ID, values);
	}

	/**
	 * Fetch records that have <code>value IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.VitalActivityHour> fetchByValue(java.lang.Long... values) {
		return fetch(com.petpace.db.jooq.tables.VitalActivityHour.VITAL_ACTIVITY_HOUR.VALUE, values);
	}

	/**
	 * Fetch records that have <code>smv10 IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.VitalActivityHour> fetchBySmv10(java.math.BigDecimal... values) {
		return fetch(com.petpace.db.jooq.tables.VitalActivityHour.VITAL_ACTIVITY_HOUR.SMV10, values);
	}

	/**
	 * Fetch records that have <code>smv30 IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.VitalActivityHour> fetchBySmv30(java.math.BigDecimal... values) {
		return fetch(com.petpace.db.jooq.tables.VitalActivityHour.VITAL_ACTIVITY_HOUR.SMV30, values);
	}

	/**
	 * Fetch records that have <code>time IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.VitalActivityHour> fetchByTime(java.sql.Timestamp... values) {
		return fetch(com.petpace.db.jooq.tables.VitalActivityHour.VITAL_ACTIVITY_HOUR.TIME, values);
	}
}
