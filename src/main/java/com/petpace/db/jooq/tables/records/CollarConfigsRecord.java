/**
 * This class is generated by jOOQ
 */
package com.petpace.db.jooq.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CollarConfigsRecord extends org.jooq.impl.UpdatableRecordImpl<com.petpace.db.jooq.tables.records.CollarConfigsRecord> implements org.jooq.Record5<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp> {

	private static final long serialVersionUID = -1103555500;

	/**
	 * Setter for <code>sirius.collar_configs.ConfigID</code>. 
	 */
	public void setConfigid(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>sirius.collar_configs.ConfigID</code>. 
	 */
	public java.lang.Integer getConfigid() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>sirius.collar_configs.version</code>. 
	 */
	public void setVersion(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>sirius.collar_configs.version</code>. 
	 */
	public java.lang.String getVersion() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>sirius.collar_configs.Comment</code>. 
	 */
	public void setComment(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>sirius.collar_configs.Comment</code>. 
	 */
	public java.lang.String getComment() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>sirius.collar_configs.s3</code>. 
	 */
	public void setS3(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>sirius.collar_configs.s3</code>. 
	 */
	public java.lang.String getS3() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>sirius.collar_configs.uploadDate</code>. 
	 */
	public void setUploaddate(java.sql.Timestamp value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>sirius.collar_configs.uploadDate</code>. 
	 */
	public java.sql.Timestamp getUploaddate() {
		return (java.sql.Timestamp) getValue(4);
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
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp> fieldsRow() {
		return (org.jooq.Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp> valuesRow() {
		return (org.jooq.Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return com.petpace.db.jooq.tables.CollarConfigs.COLLAR_CONFIGS.CONFIGID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return com.petpace.db.jooq.tables.CollarConfigs.COLLAR_CONFIGS.VERSION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return com.petpace.db.jooq.tables.CollarConfigs.COLLAR_CONFIGS.COMMENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return com.petpace.db.jooq.tables.CollarConfigs.COLLAR_CONFIGS.S3;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field5() {
		return com.petpace.db.jooq.tables.CollarConfigs.COLLAR_CONFIGS.UPLOADDATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getConfigid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getVersion();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getComment();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getS3();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value5() {
		return getUploaddate();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached CollarConfigsRecord
	 */
	public CollarConfigsRecord() {
		super(com.petpace.db.jooq.tables.CollarConfigs.COLLAR_CONFIGS);
	}
}
