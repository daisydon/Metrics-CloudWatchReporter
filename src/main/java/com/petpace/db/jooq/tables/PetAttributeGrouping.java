/**
 * This class is generated by jOOQ
 */
package com.petpace.db.jooq.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PetAttributeGrouping extends org.jooq.impl.TableImpl<com.petpace.db.jooq.tables.records.PetAttributeGroupingRecord> {

	private static final long serialVersionUID = 277735801;

	/**
	 * The singleton instance of <code>rigel.pet_attribute_grouping</code>
	 */
	public static final com.petpace.db.jooq.tables.PetAttributeGrouping PET_ATTRIBUTE_GROUPING = new com.petpace.db.jooq.tables.PetAttributeGrouping();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.petpace.db.jooq.tables.records.PetAttributeGroupingRecord> getRecordType() {
		return com.petpace.db.jooq.tables.records.PetAttributeGroupingRecord.class;
	}

	/**
	 * The column <code>rigel.pet_attribute_grouping.group_id</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.PetAttributeGroupingRecord, java.lang.Integer> GROUP_ID = createField("group_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>rigel.pet_attribute_grouping.attribute_id</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.PetAttributeGroupingRecord, java.lang.Integer> ATTRIBUTE_ID = createField("attribute_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>rigel.pet_attribute_grouping.sort</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.PetAttributeGroupingRecord, java.lang.Integer> SORT = createField("sort", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * Create a <code>rigel.pet_attribute_grouping</code> table reference
	 */
	public PetAttributeGrouping() {
		super("pet_attribute_grouping", com.petpace.db.jooq.Rigel.RIGEL);
	}

	/**
	 * Create an aliased <code>rigel.pet_attribute_grouping</code> table reference
	 */
	public PetAttributeGrouping(java.lang.String alias) {
		super(alias, com.petpace.db.jooq.Rigel.RIGEL, com.petpace.db.jooq.tables.PetAttributeGrouping.PET_ATTRIBUTE_GROUPING);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.petpace.db.jooq.tables.records.PetAttributeGroupingRecord> getPrimaryKey() {
		return com.petpace.db.jooq.Keys.KEY_PET_ATTRIBUTE_GROUPING_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.petpace.db.jooq.tables.records.PetAttributeGroupingRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.petpace.db.jooq.tables.records.PetAttributeGroupingRecord>>asList(com.petpace.db.jooq.Keys.KEY_PET_ATTRIBUTE_GROUPING_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<com.petpace.db.jooq.tables.records.PetAttributeGroupingRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<com.petpace.db.jooq.tables.records.PetAttributeGroupingRecord, ?>>asList(com.petpace.db.jooq.Keys.FK_C29C8681FE54D947, com.petpace.db.jooq.Keys.FK_C29C8681B6E62EFA);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.petpace.db.jooq.tables.PetAttributeGrouping as(java.lang.String alias) {
		return new com.petpace.db.jooq.tables.PetAttributeGrouping(alias);
	}
}
