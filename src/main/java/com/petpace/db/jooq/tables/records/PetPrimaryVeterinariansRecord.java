/**
 * This class is generated by jOOQ
 */
package com.petpace.db.jooq.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PetPrimaryVeterinariansRecord extends org.jooq.impl.UpdatableRecordImpl<com.petpace.db.jooq.tables.records.PetPrimaryVeterinariansRecord> implements org.jooq.Record6<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.sql.Timestamp, java.sql.Timestamp, java.lang.String> {

	private static final long serialVersionUID = -1073752305;

	/**
	 * Setter for <code>rigel.pet_primary_veterinarians.vet_id</code>. 
	 */
	public void setVetId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>rigel.pet_primary_veterinarians.vet_id</code>. 
	 */
	public java.lang.Integer getVetId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>rigel.pet_primary_veterinarians.pet_id</code>. 
	 */
	public void setPetId(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>rigel.pet_primary_veterinarians.pet_id</code>. 
	 */
	public java.lang.Integer getPetId() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>rigel.pet_primary_veterinarians.status</code>. 
	 */
	public void setStatus(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>rigel.pet_primary_veterinarians.status</code>. 
	 */
	public java.lang.Integer getStatus() {
		return (java.lang.Integer) getValue(2);
	}

	/**
	 * Setter for <code>rigel.pet_primary_veterinarians.start</code>. 
	 */
	public void setStart(java.sql.Timestamp value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>rigel.pet_primary_veterinarians.start</code>. 
	 */
	public java.sql.Timestamp getStart() {
		return (java.sql.Timestamp) getValue(3);
	}

	/**
	 * Setter for <code>rigel.pet_primary_veterinarians.end</code>. 
	 */
	public void setEnd(java.sql.Timestamp value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>rigel.pet_primary_veterinarians.end</code>. 
	 */
	public java.sql.Timestamp getEnd() {
		return (java.sql.Timestamp) getValue(4);
	}

	/**
	 * Setter for <code>rigel.pet_primary_veterinarians.notes</code>. 
	 */
	public void setNotes(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>rigel.pet_primary_veterinarians.notes</code>. 
	 */
	public java.lang.String getNotes() {
		return (java.lang.String) getValue(5);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer> key() {
		return (org.jooq.Record3) super.key();
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.sql.Timestamp, java.sql.Timestamp, java.lang.String> fieldsRow() {
		return (org.jooq.Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.sql.Timestamp, java.sql.Timestamp, java.lang.String> valuesRow() {
		return (org.jooq.Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return com.petpace.db.jooq.tables.PetPrimaryVeterinarians.PET_PRIMARY_VETERINARIANS.VET_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return com.petpace.db.jooq.tables.PetPrimaryVeterinarians.PET_PRIMARY_VETERINARIANS.PET_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return com.petpace.db.jooq.tables.PetPrimaryVeterinarians.PET_PRIMARY_VETERINARIANS.STATUS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field4() {
		return com.petpace.db.jooq.tables.PetPrimaryVeterinarians.PET_PRIMARY_VETERINARIANS.START;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field5() {
		return com.petpace.db.jooq.tables.PetPrimaryVeterinarians.PET_PRIMARY_VETERINARIANS.END;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return com.petpace.db.jooq.tables.PetPrimaryVeterinarians.PET_PRIMARY_VETERINARIANS.NOTES;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getVetId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getPetId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getStatus();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value4() {
		return getStart();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value5() {
		return getEnd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getNotes();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached PetPrimaryVeterinariansRecord
	 */
	public PetPrimaryVeterinariansRecord() {
		super(com.petpace.db.jooq.tables.PetPrimaryVeterinarians.PET_PRIMARY_VETERINARIANS);
	}
}
