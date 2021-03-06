/**
 * This class is generated by jOOQ
 */
package com.petpace.db.jooq.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Accounts extends org.jooq.impl.TableImpl<com.petpace.db.jooq.tables.records.AccountsRecord> {

	private static final long serialVersionUID = 1902713472;

	/**
	 * The singleton instance of <code>rigel.accounts</code>
	 */
	public static final com.petpace.db.jooq.tables.Accounts ACCOUNTS = new com.petpace.db.jooq.tables.Accounts();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.petpace.db.jooq.tables.records.AccountsRecord> getRecordType() {
		return com.petpace.db.jooq.tables.records.AccountsRecord.class;
	}

	/**
	 * The column <code>rigel.accounts.id</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.AccountsRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>rigel.accounts.fullname</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.AccountsRecord, java.lang.String> FULLNAME = createField("fullname", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>rigel.accounts.email</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.AccountsRecord, java.lang.String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>rigel.accounts.imageUrl</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.AccountsRecord, java.lang.String> IMAGEURL = createField("imageUrl", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>rigel.accounts.passToken</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.AccountsRecord, java.lang.String> PASSTOKEN = createField("passToken", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>rigel.accounts.password</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.AccountsRecord, java.lang.String> PASSWORD = createField("password", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>rigel.accounts.salt</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.AccountsRecord, java.lang.String> SALT = createField("salt", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>rigel.accounts.lastLogin</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.AccountsRecord, java.sql.Timestamp> LASTLOGIN = createField("lastLogin", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>rigel.accounts.dateCreated</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.AccountsRecord, java.sql.Timestamp> DATECREATED = createField("dateCreated", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>rigel.accounts.dateUpdated</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.AccountsRecord, java.sql.Timestamp> DATEUPDATED = createField("dateUpdated", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>rigel.accounts.status</code>. 
	 */
	public final org.jooq.TableField<com.petpace.db.jooq.tables.records.AccountsRecord, java.lang.Integer> STATUS = createField("status", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * Create a <code>rigel.accounts</code> table reference
	 */
	public Accounts() {
		super("accounts", com.petpace.db.jooq.Rigel.RIGEL);
	}

	/**
	 * Create an aliased <code>rigel.accounts</code> table reference
	 */
	public Accounts(java.lang.String alias) {
		super(alias, com.petpace.db.jooq.Rigel.RIGEL, com.petpace.db.jooq.tables.Accounts.ACCOUNTS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<com.petpace.db.jooq.tables.records.AccountsRecord, java.lang.Integer> getIdentity() {
		return com.petpace.db.jooq.Keys.IDENTITY_ACCOUNTS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.petpace.db.jooq.tables.records.AccountsRecord> getPrimaryKey() {
		return com.petpace.db.jooq.Keys.KEY_ACCOUNTS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.petpace.db.jooq.tables.records.AccountsRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.petpace.db.jooq.tables.records.AccountsRecord>>asList(com.petpace.db.jooq.Keys.KEY_ACCOUNTS_PRIMARY, com.petpace.db.jooq.Keys.KEY_ACCOUNTS_UNIQ_CAC89EACE7927C74);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.petpace.db.jooq.tables.Accounts as(java.lang.String alias) {
		return new com.petpace.db.jooq.tables.Accounts(alias);
	}
}
