/**
 * This class is generated by jOOQ
 */
package com.petpace.db.jooq.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PetAttributeGroupsRecord extends org.jooq.impl.UpdatableRecordImpl<com.petpace.db.jooq.tables.records.PetAttributeGroupsRecord> implements org.jooq.Record7<java.lang.Integer, java.lang.String, java.lang.String, java.sql.Timestamp, java.sql.Timestamp, java.lang.Integer, java.lang.String> {

	private static final long serialVersionUID = -520581357;

	/**
	 * Setter for <code>rigel.pet_attribute_groups.id</code>. 
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>rigel.pet_attribute_groups.id</code>. 
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>rigel.pet_attribute_groups.entity_id</code>. 
	 */
	public void setEntityId(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>rigel.pet_attribute_groups.entity_id</code>. 
	 */
	public java.lang.String getEntityId() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>rigel.pet_attribute_groups.name</code>. 
	 */
	public void setName(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>rigel.pet_attribute_groups.name</code>. 
	 */
	public java.lang.String getName() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>rigel.pet_attribute_groups.dateCreated</code>. 
	 */
	public void setDatecreated(java.sql.Timestamp value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>rigel.pet_attribute_groups.dateCreated</code>. 
	 */
	public java.sql.Timestamp getDatecreated() {
		return (java.sql.Timestamp) getValue(3);
	}

	/**
	 * Setter for <code>rigel.pet_attribute_groups.dateUpdated</code>. 
	 */
	public void setDateupdated(java.sql.Timestamp value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>rigel.pet_attribute_groups.dateUpdated</code>. 
	 */
	public java.sql.Timestamp getDateupdated() {
		return (java.sql.Timestamp) getValue(4);
	}

	/**
	 * Setter for <code>rigel.pet_attribute_groups.status</code>. 
	 */
	public void setStatus(java.lang.Integer value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>rigel.pet_attribute_groups.status</code>. 
	 */
	public java.lang.Integer getStatus() {
		return (java.lang.Integer) getValue(5);
	}

	/**
	 * Setter for <code>rigel.pet_attribute_groups.note</code>. 
	 */
	public void setNote(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>rigel.pet_attribute_groups.note</code>. 
	 */
	public java.lang.String getNote() {
		return (java.lang.String) getValue(6);
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
	// Record7 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row7<java.lang.Integer, java.lang.String, java.lang.String, java.sql.Timestamp, java.sql.Timestamp, java.lang.Integer, java.lang.String> fieldsRow() {
		return (org.jooq.Row7) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row7<java.lang.Integer, java.lang.String, java.lang.String, java.sql.Timestamp, java.sql.Timestamp, java.lang.Integer, java.lang.String> valuesRow() {
		return (org.jooq.Row7) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return com.petpace.db.jooq.tables.PetAttributeGroups.PET_ATTRIBUTE_GROUPS.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return com.petpace.db.jooq.tables.PetAttributeGroups.PET_ATTRIBUTE_GROUPS.ENTITY_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return com.petpace.db.jooq.tables.PetAttributeGroups.PET_ATTRIBUTE_GROUPS.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field4() {
		return com.petpace.db.jooq.tables.PetAttributeGroups.PET_ATTRIBUTE_GROUPS.DATECREATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field5() {
		return com.petpace.db.jooq.tables.PetAttributeGroups.PET_ATTRIBUTE_GROUPS.DATEUPDATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field6() {
		return com.petpace.db.jooq.tables.PetAttributeGroups.PET_ATTRIBUTE_GROUPS.STATUS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return com.petpace.db.jooq.tables.PetAttributeGroups.PET_ATTRIBUTE_GROUPS.NOTE;
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
		return getEntityId();
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
	public java.sql.Timestamp value4() {
		return getDatecreated();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value5() {
		return getDateupdated();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value6() {
		return getStatus();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getNote();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached PetAttributeGroupsRecord
	 */
	public PetAttributeGroupsRecord() {
		super(com.petpace.db.jooq.tables.PetAttributeGroups.PET_ATTRIBUTE_GROUPS);
	}
}
