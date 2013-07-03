/**
 * This class is generated by jOOQ
 */
package com.petpace.db.jooq.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PetAttributeValueHistory extends org.jooq.impl.TableImpl<com.petpace.db.jooq.tables.records.PetAttributeValueHistoryRecord> {

	private static final long serialVersionUID = 634714706;

	/**
	 * The singleton instance of <code>rigel.pet_attribute_value_history</code>
	 */
	public static final com.petpace.db.jooq.tables.PetAttributeValueHistory PET_ATTRIBUTE_VALUE_HISTORY = new com.petpace.db.jooq.tables.PetAttributeValueHistory();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.petpace.db.jooq.tables.records.PetAttributeValueHistoryRecord> getRecordType() {
		return com.petpace.db.jooq.tables.records.PetAttributeValueHistoryRecord.class;
	}

	/**
	 * The column <code>rigel.pet_attribute_value_history.id</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.PetAttributeValueHistoryRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>rigel.pet_attribute_value_history.pet_id</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.PetAttributeValueHistoryRecord, java.lang.Integer> PET_ID = createField("pet_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>rigel.pet_attribute_value_history.val</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.PetAttributeValueHistoryRecord, java.sql.Timestamp> VAL = createField("val", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>rigel.pet_attribute_value_history.dateCreated</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.PetAttributeValueHistoryRecord, java.sql.Timestamp> DATECREATED = createField("dateCreated", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>rigel.pet_attribute_value_history.dateUpdated</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.PetAttributeValueHistoryRecord, java.sql.Timestamp> DATEUPDATED = createField("dateUpdated", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>rigel.pet_attribute_value_history.status</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.PetAttributeValueHistoryRecord, java.lang.Integer> STATUS = createField("status", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>rigel.pet_attribute_value_history.petAttribute_id</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.PetAttributeValueHistoryRecord, java.lang.Integer> PETATTRIBUTE_ID = createField("petAttribute_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * Create a <code>rigel.pet_attribute_value_history</code> table reference
	 */
	public PetAttributeValueHistory() {
		super("pet_attribute_value_history", com.petpace.db.jooq.Rigel.RIGEL);
	}

	/**
	 * Create an aliased <code>rigel.pet_attribute_value_history</code> table reference
	 */
	public PetAttributeValueHistory(java.lang.String alias) {
		super(alias, com.petpace.db.jooq.Rigel.RIGEL, com.petpace.db.jooq.tables.PetAttributeValueHistory.PET_ATTRIBUTE_VALUE_HISTORY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<com.petpace.db.jooq.tables.records.PetAttributeValueHistoryRecord, java.lang.Integer> getIdentity() {
		return com.petpace.db.jooq.Keys.IDENTITY_PET_ATTRIBUTE_VALUE_HISTORY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.petpace.db.jooq.tables.records.PetAttributeValueHistoryRecord> getPrimaryKey() {
		return com.petpace.db.jooq.Keys.KEY_PET_ATTRIBUTE_VALUE_HISTORY_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.petpace.db.jooq.tables.records.PetAttributeValueHistoryRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.petpace.db.jooq.tables.records.PetAttributeValueHistoryRecord>>asList(com.petpace.db.jooq.Keys.KEY_PET_ATTRIBUTE_VALUE_HISTORY_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<com.petpace.db.jooq.tables.records.PetAttributeValueHistoryRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<com.petpace.db.jooq.tables.records.PetAttributeValueHistoryRecord, ?>>asList(com.petpace.db.jooq.Keys.FK_D5FDAF79966F7FB6, com.petpace.db.jooq.Keys.FK_D5FDAF7976BE1D70);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.petpace.db.jooq.tables.PetAttributeValueHistory as(java.lang.String alias) {
		return new com.petpace.db.jooq.tables.PetAttributeValueHistory(alias);
	}
}
