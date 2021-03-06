/**
 * This class is generated by jOOQ
 */
package com.petpace.db.jooq.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AccountsRecord extends org.jooq.impl.UpdatableRecordImpl<com.petpace.db.jooq.tables.records.AccountsRecord> implements org.jooq.Record11<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.sql.Timestamp, java.sql.Timestamp, java.lang.Integer> {

	private static final long serialVersionUID = 606609756;

	/**
	 * Setter for <code>rigel.accounts.id</code>. 
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>rigel.accounts.id</code>. 
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>rigel.accounts.fullname</code>. 
	 */
	public void setFullname(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>rigel.accounts.fullname</code>. 
	 */
	public java.lang.String getFullname() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>rigel.accounts.email</code>. 
	 */
	public void setEmail(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>rigel.accounts.email</code>. 
	 */
	public java.lang.String getEmail() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>rigel.accounts.imageUrl</code>. 
	 */
	public void setImageurl(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>rigel.accounts.imageUrl</code>. 
	 */
	public java.lang.String getImageurl() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>rigel.accounts.passToken</code>. 
	 */
	public void setPasstoken(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>rigel.accounts.passToken</code>. 
	 */
	public java.lang.String getPasstoken() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>rigel.accounts.password</code>. 
	 */
	public void setPassword(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>rigel.accounts.password</code>. 
	 */
	public java.lang.String getPassword() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>rigel.accounts.salt</code>. 
	 */
	public void setSalt(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>rigel.accounts.salt</code>. 
	 */
	public java.lang.String getSalt() {
		return (java.lang.String) getValue(6);
	}

	/**
	 * Setter for <code>rigel.accounts.lastLogin</code>. 
	 */
	public void setLastlogin(java.sql.Timestamp value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>rigel.accounts.lastLogin</code>. 
	 */
	public java.sql.Timestamp getLastlogin() {
		return (java.sql.Timestamp) getValue(7);
	}

	/**
	 * Setter for <code>rigel.accounts.dateCreated</code>. 
	 */
	public void setDatecreated(java.sql.Timestamp value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>rigel.accounts.dateCreated</code>. 
	 */
	public java.sql.Timestamp getDatecreated() {
		return (java.sql.Timestamp) getValue(8);
	}

	/**
	 * Setter for <code>rigel.accounts.dateUpdated</code>. 
	 */
	public void setDateupdated(java.sql.Timestamp value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>rigel.accounts.dateUpdated</code>. 
	 */
	public java.sql.Timestamp getDateupdated() {
		return (java.sql.Timestamp) getValue(9);
	}

	/**
	 * Setter for <code>rigel.accounts.status</code>. 
	 */
	public void setStatus(java.lang.Integer value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>rigel.accounts.status</code>. 
	 */
	public java.lang.Integer getStatus() {
		return (java.lang.Integer) getValue(10);
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
	// Record11 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row11<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.sql.Timestamp, java.sql.Timestamp, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row11) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row11<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.sql.Timestamp, java.sql.Timestamp, java.lang.Integer> valuesRow() {
		return (org.jooq.Row11) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return com.petpace.db.jooq.tables.Accounts.ACCOUNTS.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return com.petpace.db.jooq.tables.Accounts.ACCOUNTS.FULLNAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return com.petpace.db.jooq.tables.Accounts.ACCOUNTS.EMAIL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return com.petpace.db.jooq.tables.Accounts.ACCOUNTS.IMAGEURL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return com.petpace.db.jooq.tables.Accounts.ACCOUNTS.PASSTOKEN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return com.petpace.db.jooq.tables.Accounts.ACCOUNTS.PASSWORD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return com.petpace.db.jooq.tables.Accounts.ACCOUNTS.SALT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field8() {
		return com.petpace.db.jooq.tables.Accounts.ACCOUNTS.LASTLOGIN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field9() {
		return com.petpace.db.jooq.tables.Accounts.ACCOUNTS.DATECREATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field10() {
		return com.petpace.db.jooq.tables.Accounts.ACCOUNTS.DATEUPDATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field11() {
		return com.petpace.db.jooq.tables.Accounts.ACCOUNTS.STATUS;
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
	public java.lang.String value2() {
		return getFullname();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getEmail();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getImageurl();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getPasstoken();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getPassword();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getSalt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value8() {
		return getLastlogin();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value9() {
		return getDatecreated();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value10() {
		return getDateupdated();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value11() {
		return getStatus();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached AccountsRecord
	 */
	public AccountsRecord() {
		super(com.petpace.db.jooq.tables.Accounts.ACCOUNTS);
	}
}
