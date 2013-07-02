/**
 * This class is generated by jOOQ
 */
package com.petpace.db.jooq.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BusinessUnitVeterinarians extends org.jooq.impl.TableImpl<com.petpace.db.jooq.tables.records.BusinessUnitVeterinariansRecord> {

	private static final long serialVersionUID = -1538749835;

	/**
	 * The singleton instance of <code>sirius.business_unit_veterinarians</code>
	 */
	public static final com.petpace.db.jooq.tables.BusinessUnitVeterinarians BUSINESS_UNIT_VETERINARIANS = new com.petpace.db.jooq.tables.BusinessUnitVeterinarians();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.petpace.db.jooq.tables.records.BusinessUnitVeterinariansRecord> getRecordType() {
		return com.petpace.db.jooq.tables.records.BusinessUnitVeterinariansRecord.class;
	}

	/**
	 * The column <code>sirius.business_unit_veterinarians.business_unit_id</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.BusinessUnitVeterinariansRecord, java.lang.Integer> BUSINESS_UNIT_ID = createField("business_unit_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>sirius.business_unit_veterinarians.veterinarian_id</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.BusinessUnitVeterinariansRecord, java.lang.Integer> VETERINARIAN_ID = createField("veterinarian_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * Create a <code>sirius.business_unit_veterinarians</code> table reference
	 */
	public BusinessUnitVeterinarians() {
		super("business_unit_veterinarians", com.petpace.db.jooq.Sirius.SIRIUS);
	}

	/**
	 * Create an aliased <code>sirius.business_unit_veterinarians</code> table reference
	 */
	public BusinessUnitVeterinarians(java.lang.String alias) {
		super(alias, com.petpace.db.jooq.Sirius.SIRIUS, com.petpace.db.jooq.tables.BusinessUnitVeterinarians.BUSINESS_UNIT_VETERINARIANS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.petpace.db.jooq.tables.records.BusinessUnitVeterinariansRecord> getPrimaryKey() {
		return com.petpace.db.jooq.Keys.KEY_BUSINESS_UNIT_VETERINARIANS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.petpace.db.jooq.tables.records.BusinessUnitVeterinariansRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.petpace.db.jooq.tables.records.BusinessUnitVeterinariansRecord>>asList(com.petpace.db.jooq.Keys.KEY_BUSINESS_UNIT_VETERINARIANS_PRIMARY, com.petpace.db.jooq.Keys.KEY_BUSINESS_UNIT_VETERINARIANS_UNIQ_B7C6C9BF804C8213);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<com.petpace.db.jooq.tables.records.BusinessUnitVeterinariansRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<com.petpace.db.jooq.tables.records.BusinessUnitVeterinariansRecord, ?>>asList(com.petpace.db.jooq.Keys.FK_B7C6C9BFA58ECB40, com.petpace.db.jooq.Keys.FK_B7C6C9BF804C8213);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.petpace.db.jooq.tables.BusinessUnitVeterinarians as(java.lang.String alias) {
		return new com.petpace.db.jooq.tables.BusinessUnitVeterinarians(alias);
	}
}
