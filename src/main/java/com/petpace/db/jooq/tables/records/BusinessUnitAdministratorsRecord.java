/**
 * This class is generated by jOOQ
 */
package com.petpace.db.jooq.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BusinessUnitAdministratorsRecord extends org.jooq.impl.UpdatableRecordImpl<com.petpace.db.jooq.tables.records.BusinessUnitAdministratorsRecord> implements org.jooq.Record2<java.lang.Integer, java.lang.Integer> {

	private static final long serialVersionUID = 6033292;

	/**
	 * Setter for <code>rigel.business_unit_administrators.business_unit_id</code>. 
	 */
	public void setBusinessUnitId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>rigel.business_unit_administrators.business_unit_id</code>. 
	 */
	public java.lang.Integer getBusinessUnitId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>rigel.business_unit_administrators.account_id</code>. 
	 */
	public void setAccountId(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>rigel.business_unit_administrators.account_id</code>. 
	 */
	public java.lang.Integer getAccountId() {
		return (java.lang.Integer) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record2<java.lang.Integer, java.lang.Integer> key() {
		return (org.jooq.Record2) super.key();
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.Integer> valuesRow() {
		return (org.jooq.Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return com.petpace.db.jooq.tables.BusinessUnitAdministrators.BUSINESS_UNIT_ADMINISTRATORS.BUSINESS_UNIT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return com.petpace.db.jooq.tables.BusinessUnitAdministrators.BUSINESS_UNIT_ADMINISTRATORS.ACCOUNT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getBusinessUnitId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getAccountId();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached BusinessUnitAdministratorsRecord
	 */
	public BusinessUnitAdministratorsRecord() {
		super(com.petpace.db.jooq.tables.BusinessUnitAdministrators.BUSINESS_UNIT_ADMINISTRATORS);
	}
}
