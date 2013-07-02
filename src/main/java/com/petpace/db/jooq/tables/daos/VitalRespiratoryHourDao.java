/**
 * This class is generated by jOOQ
 */
package com.petpace.db.jooq.tables.daos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VitalRespiratoryHourDao extends org.jooq.impl.DAOImpl<com.petpace.db.jooq.tables.records.VitalRespiratoryHourRecord, com.petpace.db.jooq.tables.pojos.VitalRespiratoryHour, java.lang.Integer> {

	/**
	 * Create a new VitalRespiratoryHourDao without any configuration
	 */
	public VitalRespiratoryHourDao() {
		super(com.petpace.db.jooq.tables.VitalRespiratoryHour.VITAL_RESPIRATORY_HOUR, com.petpace.db.jooq.tables.pojos.VitalRespiratoryHour.class);
	}

	/**
	 * Create a new VitalRespiratoryHourDao with an attached configuration
	 */
	public VitalRespiratoryHourDao(org.jooq.Configuration configuration) {
		super(com.petpace.db.jooq.tables.VitalRespiratoryHour.VITAL_RESPIRATORY_HOUR, com.petpace.db.jooq.tables.pojos.VitalRespiratoryHour.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Integer getId(com.petpace.db.jooq.tables.pojos.VitalRespiratoryHour object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.VitalRespiratoryHour> fetchById(java.lang.Integer... values) {
		return fetch(com.petpace.db.jooq.tables.VitalRespiratoryHour.VITAL_RESPIRATORY_HOUR.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>id = value</code>
	 */
	public com.petpace.db.jooq.tables.pojos.VitalRespiratoryHour fetchOneById(java.lang.Integer value) {
		return fetchOne(com.petpace.db.jooq.tables.VitalRespiratoryHour.VITAL_RESPIRATORY_HOUR.ID, value);
	}

	/**
	 * Fetch records that have <code>collar_id IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.VitalRespiratoryHour> fetchByCollarId(java.lang.String... values) {
		return fetch(com.petpace.db.jooq.tables.VitalRespiratoryHour.VITAL_RESPIRATORY_HOUR.COLLAR_ID, values);
	}

	/**
	 * Fetch records that have <code>pet_id IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.VitalRespiratoryHour> fetchByPetId(java.lang.Integer... values) {
		return fetch(com.petpace.db.jooq.tables.VitalRespiratoryHour.VITAL_RESPIRATORY_HOUR.PET_ID, values);
	}

	/**
	 * Fetch records that have <code>value IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.VitalRespiratoryHour> fetchByValue(java.lang.Long... values) {
		return fetch(com.petpace.db.jooq.tables.VitalRespiratoryHour.VITAL_RESPIRATORY_HOUR.VALUE, values);
	}

	/**
	 * Fetch records that have <code>smv10 IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.VitalRespiratoryHour> fetchBySmv10(java.math.BigDecimal... values) {
		return fetch(com.petpace.db.jooq.tables.VitalRespiratoryHour.VITAL_RESPIRATORY_HOUR.SMV10, values);
	}

	/**
	 * Fetch records that have <code>smv30 IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.VitalRespiratoryHour> fetchBySmv30(java.math.BigDecimal... values) {
		return fetch(com.petpace.db.jooq.tables.VitalRespiratoryHour.VITAL_RESPIRATORY_HOUR.SMV30, values);
	}

	/**
	 * Fetch records that have <code>time IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.VitalRespiratoryHour> fetchByTime(java.sql.Timestamp... values) {
		return fetch(com.petpace.db.jooq.tables.VitalRespiratoryHour.VITAL_RESPIRATORY_HOUR.TIME, values);
	}
}
