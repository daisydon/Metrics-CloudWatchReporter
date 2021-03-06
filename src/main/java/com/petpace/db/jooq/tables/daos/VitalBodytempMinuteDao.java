/**
 * This class is generated by jOOQ
 */
package com.petpace.db.jooq.tables.daos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VitalBodytempMinuteDao extends org.jooq.impl.DAOImpl<com.petpace.db.jooq.tables.records.VitalBodytempMinuteRecord, com.petpace.db.jooq.tables.pojos.VitalBodytempMinute, java.lang.Integer> {

	/**
	 * Create a new VitalBodytempMinuteDao without any configuration
	 */
	public VitalBodytempMinuteDao() {
		super(com.petpace.db.jooq.tables.VitalBodytempMinute.VITAL_BODYTEMP_MINUTE, com.petpace.db.jooq.tables.pojos.VitalBodytempMinute.class);
	}

	/**
	 * Create a new VitalBodytempMinuteDao with an attached configuration
	 */
	public VitalBodytempMinuteDao(org.jooq.Configuration configuration) {
		super(com.petpace.db.jooq.tables.VitalBodytempMinute.VITAL_BODYTEMP_MINUTE, com.petpace.db.jooq.tables.pojos.VitalBodytempMinute.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Integer getId(com.petpace.db.jooq.tables.pojos.VitalBodytempMinute object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.VitalBodytempMinute> fetchById(java.lang.Integer... values) {
		return fetch(com.petpace.db.jooq.tables.VitalBodytempMinute.VITAL_BODYTEMP_MINUTE.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>id = value</code>
	 */
	public com.petpace.db.jooq.tables.pojos.VitalBodytempMinute fetchOneById(java.lang.Integer value) {
		return fetchOne(com.petpace.db.jooq.tables.VitalBodytempMinute.VITAL_BODYTEMP_MINUTE.ID, value);
	}

	/**
	 * Fetch records that have <code>collar_id IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.VitalBodytempMinute> fetchByCollarId(java.lang.String... values) {
		return fetch(com.petpace.db.jooq.tables.VitalBodytempMinute.VITAL_BODYTEMP_MINUTE.COLLAR_ID, values);
	}

	/**
	 * Fetch records that have <code>pet_id IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.VitalBodytempMinute> fetchByPetId(java.lang.Integer... values) {
		return fetch(com.petpace.db.jooq.tables.VitalBodytempMinute.VITAL_BODYTEMP_MINUTE.PET_ID, values);
	}

	/**
	 * Fetch records that have <code>value IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.VitalBodytempMinute> fetchByValue(java.lang.Long... values) {
		return fetch(com.petpace.db.jooq.tables.VitalBodytempMinute.VITAL_BODYTEMP_MINUTE.VALUE, values);
	}

	/**
	 * Fetch records that have <code>ambient IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.VitalBodytempMinute> fetchByAmbient(java.math.BigDecimal... values) {
		return fetch(com.petpace.db.jooq.tables.VitalBodytempMinute.VITAL_BODYTEMP_MINUTE.AMBIENT, values);
	}

	/**
	 * Fetch records that have <code>hiLimit IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.VitalBodytempMinute> fetchByHilimit(java.math.BigDecimal... values) {
		return fetch(com.petpace.db.jooq.tables.VitalBodytempMinute.VITAL_BODYTEMP_MINUTE.HILIMIT, values);
	}

	/**
	 * Fetch records that have <code>lowLimit IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.VitalBodytempMinute> fetchByLowlimit(java.math.BigDecimal... values) {
		return fetch(com.petpace.db.jooq.tables.VitalBodytempMinute.VITAL_BODYTEMP_MINUTE.LOWLIMIT, values);
	}

	/**
	 * Fetch records that have <code>smv10 IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.VitalBodytempMinute> fetchBySmv10(java.math.BigDecimal... values) {
		return fetch(com.petpace.db.jooq.tables.VitalBodytempMinute.VITAL_BODYTEMP_MINUTE.SMV10, values);
	}

	/**
	 * Fetch records that have <code>smv30 IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.VitalBodytempMinute> fetchBySmv30(java.math.BigDecimal... values) {
		return fetch(com.petpace.db.jooq.tables.VitalBodytempMinute.VITAL_BODYTEMP_MINUTE.SMV30, values);
	}

	/**
	 * Fetch records that have <code>time IN (values)</code>
	 */
	public java.util.List<com.petpace.db.jooq.tables.pojos.VitalBodytempMinute> fetchByTime(java.sql.Timestamp... values) {
		return fetch(com.petpace.db.jooq.tables.VitalBodytempMinute.VITAL_BODYTEMP_MINUTE.TIME, values);
	}
}
