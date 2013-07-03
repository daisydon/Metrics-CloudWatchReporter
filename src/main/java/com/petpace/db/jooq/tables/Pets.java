/**
 * This class is generated by jOOQ
 */
package com.petpace.db.jooq.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Pets extends org.jooq.impl.TableImpl<com.petpace.db.jooq.tables.records.PetsRecord> {

	private static final long serialVersionUID = 2122829809;

	/**
	 * The singleton instance of <code>rigel.pets</code>
	 */
	public static final com.petpace.db.jooq.tables.Pets PETS = new com.petpace.db.jooq.tables.Pets();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.petpace.db.jooq.tables.records.PetsRecord> getRecordType() {
		return com.petpace.db.jooq.tables.records.PetsRecord.class;
	}

	/**
	 * The column <code>rigel.pets.id</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.PetsRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>rigel.pets.owner_id</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.PetsRecord, java.lang.Integer> OWNER_ID = createField("owner_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>rigel.pets.name</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.PetsRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>rigel.pets.pet_type</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.PetsRecord, java.lang.String> PET_TYPE = createField("pet_type", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>rigel.pets.breed</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.PetsRecord, java.lang.String> BREED = createField("breed", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>rigel.pets.imageUrl</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.PetsRecord, java.lang.String> IMAGEURL = createField("imageUrl", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>rigel.pets.dob</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.PetsRecord, java.sql.Timestamp> DOB = createField("dob", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>rigel.pets.gender</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.PetsRecord, java.lang.Integer> GENDER = createField("gender", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>rigel.pets.dateCreated</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.PetsRecord, java.sql.Timestamp> DATECREATED = createField("dateCreated", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>rigel.pets.dateUpdated</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.PetsRecord, java.sql.Timestamp> DATEUPDATED = createField("dateUpdated", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>rigel.pets.status</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.PetsRecord, java.lang.Integer> STATUS = createField("status", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>rigel.pets.petType_id</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.PetsRecord, java.lang.String> PETTYPE_ID = createField("petType_id", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * Create a <code>rigel.pets</code> table reference
	 */
	public Pets() {
		super("pets", com.petpace.db.jooq.Rigel.RIGEL);
	}

	/**
	 * Create an aliased <code>rigel.pets</code> table reference
	 */
	public Pets(java.lang.String alias) {
		super(alias, com.petpace.db.jooq.Rigel.RIGEL, com.petpace.db.jooq.tables.Pets.PETS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<com.petpace.db.jooq.tables.records.PetsRecord, java.lang.Integer> getIdentity() {
		return com.petpace.db.jooq.Keys.IDENTITY_PETS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.petpace.db.jooq.tables.records.PetsRecord> getPrimaryKey() {
		return com.petpace.db.jooq.Keys.KEY_PETS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.petpace.db.jooq.tables.records.PetsRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.petpace.db.jooq.tables.records.PetsRecord>>asList(com.petpace.db.jooq.Keys.KEY_PETS_PRIMARY, com.petpace.db.jooq.Keys.KEY_PETS_UNIQ_8638EA3FBCB0DC1E);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<com.petpace.db.jooq.tables.records.PetsRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<com.petpace.db.jooq.tables.records.PetsRecord, ?>>asList(com.petpace.db.jooq.Keys.FK_8638EA3F7E3C61F9, com.petpace.db.jooq.Keys.FK_8638EA3FBCB0DC1E);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.petpace.db.jooq.tables.Pets as(java.lang.String alias) {
		return new com.petpace.db.jooq.tables.Pets(alias);
	}
}
