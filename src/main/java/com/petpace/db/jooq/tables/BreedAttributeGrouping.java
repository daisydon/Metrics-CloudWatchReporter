/**
 * This class is generated by jOOQ
 */
package com.petpace.db.jooq.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BreedAttributeGrouping extends org.jooq.impl.TableImpl<com.petpace.db.jooq.tables.records.BreedAttributeGroupingRecord> {

	private static final long serialVersionUID = -1512243743;

	/**
	 * The singleton instance of <code>rigel.breed_attribute_grouping</code>
	 */
	public static final com.petpace.db.jooq.tables.BreedAttributeGrouping BREED_ATTRIBUTE_GROUPING = new com.petpace.db.jooq.tables.BreedAttributeGrouping();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.petpace.db.jooq.tables.records.BreedAttributeGroupingRecord> getRecordType() {
		return com.petpace.db.jooq.tables.records.BreedAttributeGroupingRecord.class;
	}

	/**
	 * The column <code>rigel.breed_attribute_grouping.attribute_id</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.BreedAttributeGroupingRecord, java.lang.String> ATTRIBUTE_ID = createField("attribute_id", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>rigel.breed_attribute_grouping.group_id</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.BreedAttributeGroupingRecord, java.lang.Integer> GROUP_ID = createField("group_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * Create a <code>rigel.breed_attribute_grouping</code> table reference
	 */
	public BreedAttributeGrouping() {
		super("breed_attribute_grouping", com.petpace.db.jooq.Rigel.RIGEL);
	}

	/**
	 * Create an aliased <code>rigel.breed_attribute_grouping</code> table reference
	 */
	public BreedAttributeGrouping(java.lang.String alias) {
		super(alias, com.petpace.db.jooq.Rigel.RIGEL, com.petpace.db.jooq.tables.BreedAttributeGrouping.BREED_ATTRIBUTE_GROUPING);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.petpace.db.jooq.tables.records.BreedAttributeGroupingRecord> getPrimaryKey() {
		return com.petpace.db.jooq.Keys.KEY_BREED_ATTRIBUTE_GROUPING_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.petpace.db.jooq.tables.records.BreedAttributeGroupingRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.petpace.db.jooq.tables.records.BreedAttributeGroupingRecord>>asList(com.petpace.db.jooq.Keys.KEY_BREED_ATTRIBUTE_GROUPING_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<com.petpace.db.jooq.tables.records.BreedAttributeGroupingRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<com.petpace.db.jooq.tables.records.BreedAttributeGroupingRecord, ?>>asList(com.petpace.db.jooq.Keys.FK_21366328B6E62EFA, com.petpace.db.jooq.Keys.FK_21366328FE54D947);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.petpace.db.jooq.tables.BreedAttributeGrouping as(java.lang.String alias) {
		return new com.petpace.db.jooq.tables.BreedAttributeGrouping(alias);
	}
}
