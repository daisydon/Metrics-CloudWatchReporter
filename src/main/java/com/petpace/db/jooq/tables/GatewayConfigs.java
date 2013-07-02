/**
 * This class is generated by jOOQ
 */
package com.petpace.db.jooq.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GatewayConfigs extends org.jooq.impl.TableImpl<com.petpace.db.jooq.tables.records.GatewayConfigsRecord> {

	private static final long serialVersionUID = -2009206419;

	/**
	 * The singleton instance of <code>sirius.gateway_configs</code>
	 */
	public static final com.petpace.db.jooq.tables.GatewayConfigs GATEWAY_CONFIGS = new com.petpace.db.jooq.tables.GatewayConfigs();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.petpace.db.jooq.tables.records.GatewayConfigsRecord> getRecordType() {
		return com.petpace.db.jooq.tables.records.GatewayConfigsRecord.class;
	}

	/**
	 * The column <code>sirius.gateway_configs.ConfigID</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.GatewayConfigsRecord, java.lang.Integer> CONFIGID = createField("ConfigID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>sirius.gateway_configs.Version</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.GatewayConfigsRecord, java.lang.String> VERSION = createField("Version", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>sirius.gateway_configs.Comment</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.GatewayConfigsRecord, java.lang.String> COMMENT = createField("Comment", org.jooq.impl.SQLDataType.CLOB.length(65535), this);

	/**
	 * The column <code>sirius.gateway_configs.S3</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.GatewayConfigsRecord, java.lang.String> S3 = createField("S3", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>sirius.gateway_configs.UploadDate</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.GatewayConfigsRecord, java.sql.Timestamp> UPLOADDATE = createField("UploadDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * Create a <code>sirius.gateway_configs</code> table reference
	 */
	public GatewayConfigs() {
		super("gateway_configs", com.petpace.db.jooq.Sirius.SIRIUS);
	}

	/**
	 * Create an aliased <code>sirius.gateway_configs</code> table reference
	 */
	public GatewayConfigs(java.lang.String alias) {
		super(alias, com.petpace.db.jooq.Sirius.SIRIUS, com.petpace.db.jooq.tables.GatewayConfigs.GATEWAY_CONFIGS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<com.petpace.db.jooq.tables.records.GatewayConfigsRecord, java.lang.Integer> getIdentity() {
		return com.petpace.db.jooq.Keys.IDENTITY_GATEWAY_CONFIGS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.petpace.db.jooq.tables.records.GatewayConfigsRecord> getPrimaryKey() {
		return com.petpace.db.jooq.Keys.KEY_GATEWAY_CONFIGS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.petpace.db.jooq.tables.records.GatewayConfigsRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.petpace.db.jooq.tables.records.GatewayConfigsRecord>>asList(com.petpace.db.jooq.Keys.KEY_GATEWAY_CONFIGS_PRIMARY, com.petpace.db.jooq.Keys.KEY_GATEWAY_CONFIGS_UNIQ_33BD31DC70A1EA5F);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.petpace.db.jooq.tables.GatewayConfigs as(java.lang.String alias) {
		return new com.petpace.db.jooq.tables.GatewayConfigs(alias);
	}
}
