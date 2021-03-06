/**
 * This class is generated by jOOQ
 */
package com.petpace.db.jooq.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BusinessesRecord extends org.jooq.impl.UpdatableRecordImpl<com.petpace.db.jooq.tables.records.BusinessesRecord> implements org.jooq.Record12<java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.sql.Timestamp, java.lang.Integer, java.lang.Integer> {

	private static final long serialVersionUID = 1236585935;

	/**
	 * Setter for <code>rigel.businesses.id</code>. 
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>rigel.businesses.id</code>. 
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>rigel.businesses.address_id</code>. 
	 */
	public void setAddressId(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>rigel.businesses.address_id</code>. 
	 */
	public java.lang.Integer getAddressId() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>rigel.businesses.name</code>. 
	 */
	public void setName(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>rigel.businesses.name</code>. 
	 */
	public java.lang.String getName() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>rigel.businesses.url</code>. 
	 */
	public void setUrl(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>rigel.businesses.url</code>. 
	 */
	public java.lang.String getUrl() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>rigel.businesses.btype</code>. 
	 */
	public void setBtype(java.lang.Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>rigel.businesses.btype</code>. 
	 */
	public java.lang.Integer getBtype() {
		return (java.lang.Integer) getValue(4);
	}

	/**
	 * Setter for <code>rigel.businesses.website</code>. 
	 */
	public void setWebsite(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>rigel.businesses.website</code>. 
	 */
	public java.lang.String getWebsite() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>rigel.businesses.phone</code>. 
	 */
	public void setPhone(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>rigel.businesses.phone</code>. 
	 */
	public java.lang.String getPhone() {
		return (java.lang.String) getValue(6);
	}

	/**
	 * Setter for <code>rigel.businesses.fax</code>. 
	 */
	public void setFax(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>rigel.businesses.fax</code>. 
	 */
	public java.lang.String getFax() {
		return (java.lang.String) getValue(7);
	}

	/**
	 * Setter for <code>rigel.businesses.created</code>. 
	 */
	public void setCreated(java.sql.Timestamp value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>rigel.businesses.created</code>. 
	 */
	public java.sql.Timestamp getCreated() {
		return (java.sql.Timestamp) getValue(8);
	}

	/**
	 * Setter for <code>rigel.businesses.updated</code>. 
	 */
	public void setUpdated(java.sql.Timestamp value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>rigel.businesses.updated</code>. 
	 */
	public java.sql.Timestamp getUpdated() {
		return (java.sql.Timestamp) getValue(9);
	}

	/**
	 * Setter for <code>rigel.businesses.status</code>. 
	 */
	public void setStatus(java.lang.Integer value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>rigel.businesses.status</code>. 
	 */
	public java.lang.Integer getStatus() {
		return (java.lang.Integer) getValue(10);
	}

	/**
	 * Setter for <code>rigel.businesses.parent_id</code>. 
	 */
	public void setParentId(java.lang.Integer value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>rigel.businesses.parent_id</code>. 
	 */
	public java.lang.Integer getParentId() {
		return (java.lang.Integer) getValue(11);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record12 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row12<java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.sql.Timestamp, java.lang.Integer, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row12) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row12<java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.sql.Timestamp, java.lang.Integer, java.lang.Integer> valuesRow() {
		return (org.jooq.Row12) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return com.petpace.db.jooq.tables.Businesses.BUSINESSES.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return com.petpace.db.jooq.tables.Businesses.BUSINESSES.ADDRESS_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return com.petpace.db.jooq.tables.Businesses.BUSINESSES.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return com.petpace.db.jooq.tables.Businesses.BUSINESSES.URL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field5() {
		return com.petpace.db.jooq.tables.Businesses.BUSINESSES.BTYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return com.petpace.db.jooq.tables.Businesses.BUSINESSES.WEBSITE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return com.petpace.db.jooq.tables.Businesses.BUSINESSES.PHONE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return com.petpace.db.jooq.tables.Businesses.BUSINESSES.FAX;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field9() {
		return com.petpace.db.jooq.tables.Businesses.BUSINESSES.CREATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field10() {
		return com.petpace.db.jooq.tables.Businesses.BUSINESSES.UPDATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field11() {
		return com.petpace.db.jooq.tables.Businesses.BUSINESSES.STATUS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field12() {
		return com.petpace.db.jooq.tables.Businesses.BUSINESSES.PARENT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getAddressId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getUrl();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value5() {
		return getBtype();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getWebsite();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getPhone();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getFax();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value9() {
		return getCreated();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value10() {
		return getUpdated();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value11() {
		return getStatus();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value12() {
		return getParentId();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached BusinessesRecord
	 */
	public BusinessesRecord() {
		super(com.petpace.db.jooq.tables.Businesses.BUSINESSES);
	}
}
