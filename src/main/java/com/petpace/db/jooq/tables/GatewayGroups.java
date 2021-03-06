/**
 * This class is generated by jOOQ
 */
package com.petpace.db.jooq.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GatewayGroups extends org.jooq.impl.TableImpl<com.petpace.db.jooq.tables.records.GatewayGroupsRecord> {

	private static final long serialVersionUID = -122815783;

	/**
	 * The singleton instance of <code>rigel.gateway_groups</code>
	 */
	public static final com.petpace.db.jooq.tables.GatewayGroups GATEWAY_GROUPS = new com.petpace.db.jooq.tables.GatewayGroups();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.petpace.db.jooq.tables.records.GatewayGroupsRecord> getRecordType() {
		return com.petpace.db.jooq.tables.records.GatewayGroupsRecord.class;
	}

	/**
	 * The column <code>rigel.gateway_groups.GroupID</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.GatewayGroupsRecord, java.lang.Integer> GROUPID = createField("GroupID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>rigel.gateway_groups.Name</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.GatewayGroupsRecord, java.lang.String> NAME = createField("Name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>rigel.gateway_groups.Comment</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.GatewayGroupsRecord, java.lang.String> COMMENT = createField("Comment", org.jooq.impl.SQLDataType.CLOB.length(65535), this);

	/**
	 * The column <code>rigel.gateway_groups.FirmwareID</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.GatewayGroupsRecord, java.lang.Integer> FIRMWAREID = createField("FirmwareID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>rigel.gateway_groups.ConfigID</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.GatewayGroupsRecord, java.lang.Integer> CONFIGID = createField("ConfigID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * Create a <code>rigel.gateway_groups</code> table reference
	 */
	public GatewayGroups() {
		super("gateway_groups", com.petpace.db.jooq.Rigel.RIGEL);
	}

	/**
	 * Create an aliased <code>rigel.gateway_groups</code> table reference
	 */
	public GatewayGroups(java.lang.String alias) {
		super(alias, com.petpace.db.jooq.Rigel.RIGEL, com.petpace.db.jooq.tables.GatewayGroups.GATEWAY_GROUPS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<com.petpace.db.jooq.tables.records.GatewayGroupsRecord, java.lang.Integer> getIdentity() {
		return com.petpace.db.jooq.Keys.IDENTITY_GATEWAY_GROUPS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.petpace.db.jooq.tables.records.GatewayGroupsRecord> getPrimaryKey() {
		return com.petpace.db.jooq.Keys.KEY_GATEWAY_GROUPS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.petpace.db.jooq.tables.records.GatewayGroupsRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.petpace.db.jooq.tables.records.GatewayGroupsRecord>>asList(com.petpace.db.jooq.Keys.KEY_GATEWAY_GROUPS_PRIMARY, com.petpace.db.jooq.Keys.KEY_GATEWAY_GROUPS_UNIQ_95A15F34FE11D138);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<com.petpace.db.jooq.tables.records.GatewayGroupsRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<com.petpace.db.jooq.tables.records.GatewayGroupsRecord, ?>>asList(com.petpace.db.jooq.Keys.FK_95A15F34E9AFE03B, com.petpace.db.jooq.Keys.FK_95A15F34C0FEDE45);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.petpace.db.jooq.tables.GatewayGroups as(java.lang.String alias) {
		return new com.petpace.db.jooq.tables.GatewayGroups(alias);
	}
}
