/**
 * This class is generated by jOOQ
 */
package com.petpace.db.jooq.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Owners implements java.io.Serializable {

	private static final long serialVersionUID = 279236792;

	private java.lang.Integer  id;
	private java.lang.Integer  accountId;
	private java.lang.Integer  addressId;
	private java.lang.String   fullname;
	private java.lang.String   email;
	private java.lang.String   phone;
	private java.sql.Timestamp datecreated;
	private java.sql.Timestamp dateupdated;
	private java.lang.Integer  status;

	public java.lang.Integer getId() {
		return this.id;
	}

	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	public java.lang.Integer getAccountId() {
		return this.accountId;
	}

	public void setAccountId(java.lang.Integer accountId) {
		this.accountId = accountId;
	}

	public java.lang.Integer getAddressId() {
		return this.addressId;
	}

	public void setAddressId(java.lang.Integer addressId) {
		this.addressId = addressId;
	}

	public java.lang.String getFullname() {
		return this.fullname;
	}

	public void setFullname(java.lang.String fullname) {
		this.fullname = fullname;
	}

	public java.lang.String getEmail() {
		return this.email;
	}

	public void setEmail(java.lang.String email) {
		this.email = email;
	}

	public java.lang.String getPhone() {
		return this.phone;
	}

	public void setPhone(java.lang.String phone) {
		this.phone = phone;
	}

	public java.sql.Timestamp getDatecreated() {
		return this.datecreated;
	}

	public void setDatecreated(java.sql.Timestamp datecreated) {
		this.datecreated = datecreated;
	}

	public java.sql.Timestamp getDateupdated() {
		return this.dateupdated;
	}

	public void setDateupdated(java.sql.Timestamp dateupdated) {
		this.dateupdated = dateupdated;
	}

	public java.lang.Integer getStatus() {
		return this.status;
	}

	public void setStatus(java.lang.Integer status) {
		this.status = status;
	}
}
