/**
 * This class is generated by jOOQ
 */
package com.petpace.db.jooq.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PetAttributeGroups extends org.jooq.impl.TableImpl<com.petpace.db.jooq.tables.records.PetAttributeGroupsRecord> {

	private static final long serialVersionUID = 1540411419;

	/**
	 * The singleton instance of <code>rigel.pet_attribute_groups</code>
	 */
	public static final com.petpace.db.jooq.tables.PetAttributeGroups PET_ATTRIBUTE_GROUPS = new com.petpace.db.jooq.tables.PetAttributeGroups();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.petpace.db.jooq.tables.records.PetAttributeGroupsRecord> getRecordType() {
		return com.petpace.db.jooq.tables.records.PetAttributeGroupsRecord.class;
	}

	/**
	 * The column <code>rigel.pet_attribute_groups.id</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.PetAttributeGroupsRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>rigel.pet_attribute_groups.entity_id</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.PetAttributeGroupsRecord, java.lang.String> ENTITY_ID = createField("entity_id", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>rigel.pet_attribute_groups.name</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.PetAttributeGroupsRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>rigel.pet_attribute_groups.dateCreated</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.PetAttributeGroupsRecord, java.sql.Timestamp> DATECREATED = createField("dateCreated", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>rigel.pet_attribute_groups.dateUpdated</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.PetAttributeGroupsRecord, java.sql.Timestamp> DATEUPDATED = createField("dateUpdated", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>rigel.pet_attribute_groups.status</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.PetAttributeGroupsRecord, java.lang.Integer> STATUS = createField("status", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>rigel.pet_attribute_groups.note</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.PetAttributeGroupsRecord, java.lang.String> NOTE = createField("note", org.jooq.impl.SQLDataType.CLOB, this);

	/**
	 * Create a <code>rigel.pet_attribute_groups</code> table reference
	 */
	public PetAttributeGroups() {
		super("pet_attribute_groups", com.petpace.db.jooq.Rigel.RIGEL);
	}

	/**
	 * Create an aliased <code>rigel.pet_attribute_groups</code> table reference
	 */
	public PetAttributeGroups(java.lang.String alias) {
		super(alias, com.petpace.db.jooq.Rigel.RIGEL, com.petpace.db.jooq.tables.PetAttributeGroups.PET_ATTRIBUTE_GROUPS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<com.petpace.db.jooq.tables.records.PetAttributeGroupsRecord, java.lang.Integer> getIdentity() {
		return com.petpace.db.jooq.Keys.IDENTITY_PET_ATTRIBUTE_GROUPS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.petpace.db.jooq.tables.records.PetAttributeGroupsRecord> getPrimaryKey() {
		return com.petpace.db.jooq.Keys.KEY_PET_ATTRIBUTE_GROUPS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.petpace.db.jooq.tables.records.PetAttributeGroupsRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.petpace.db.jooq.tables.records.PetAttributeGroupsRecord>>asList(com.petpace.db.jooq.Keys.KEY_PET_ATTRIBUTE_GROUPS_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<com.petpace.db.jooq.tables.records.PetAttributeGroupsRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<com.petpace.db.jooq.tables.records.PetAttributeGroupsRecord, ?>>asList(com.petpace.db.jooq.Keys.FK_E573075E81257D5D);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.petpace.db.jooq.tables.PetAttributeGroups as(java.lang.String alias) {
		return new com.petpace.db.jooq.tables.PetAttributeGroups(alias);
	}
}
