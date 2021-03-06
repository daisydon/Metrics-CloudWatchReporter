/**
 * This class is generated by jOOQ
 */
package com.petpace.db.jooq.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BreedAttributeValuesVarcharRecord extends org.jooq.impl.UpdatableRecordImpl<com.petpace.db.jooq.tables.records.BreedAttributeValuesVarcharRecord> implements org.jooq.Record4<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String> {

	private static final long serialVersionUID = 205504608;

	/**
	 * Setter for <code>rigel.breed_attribute_values_varchar.id</code>. 
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>rigel.breed_attribute_values_varchar.id</code>. 
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>rigel.breed_attribute_values_varchar.breed_id</code>. 
	 */
	public void setBreedId(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>rigel.breed_attribute_values_varchar.breed_id</code>. 
	 */
	public java.lang.String getBreedId() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>rigel.breed_attribute_values_varchar.val</code>. 
	 */
	public void setVal(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>rigel.breed_attribute_values_varchar.val</code>. 
	 */
	public java.lang.String getVal() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>rigel.breed_attribute_values_varchar.breedAttribute_id</code>. 
	 */
	public void setBreedattributeId(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>rigel.breed_attribute_values_varchar.breedAttribute_id</code>. 
	 */
	public java.lang.String getBreedattributeId() {
		return (java.lang.String) getValue(3);
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
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return com.petpace.db.jooq.tables.BreedAttributeValuesVarchar.BREED_ATTRIBUTE_VALUES_VARCHAR.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return com.petpace.db.jooq.tables.BreedAttributeValuesVarchar.BREED_ATTRIBUTE_VALUES_VARCHAR.BREED_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return com.petpace.db.jooq.tables.BreedAttributeValuesVarchar.BREED_ATTRIBUTE_VALUES_VARCHAR.VAL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return com.petpace.db.jooq.tables.BreedAttributeValuesVarchar.BREED_ATTRIBUTE_VALUES_VARCHAR.BREEDATTRIBUTE_ID;
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
		return getBreedId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getVal();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getBreedattributeId();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached BreedAttributeValuesVarcharRecord
	 */
	public BreedAttributeValuesVarcharRecord() {
		super(com.petpace.db.jooq.tables.BreedAttributeValuesVarchar.BREED_ATTRIBUTE_VALUES_VARCHAR);
	}
}
