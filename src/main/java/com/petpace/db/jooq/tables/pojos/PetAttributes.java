/**
 * This class is generated by jOOQ
 */
package com.petpace.db.jooq.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PetAttributes implements java.io.Serializable {

	private static final long serialVersionUID = -1633418181;

	private java.lang.Integer  id;
	private java.lang.String   name;
	private java.lang.String   datatype;
	private java.lang.String   defaultvalue;
	private java.lang.Integer  isrequired;
	private java.sql.Timestamp datecreated;
	private java.sql.Timestamp dateupdated;
	private java.lang.Integer  status;

	public java.lang.Integer getId() {
		return this.id;
	}

	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.String getDatatype() {
		return this.datatype;
	}

	public void setDatatype(java.lang.String datatype) {
		this.datatype = datatype;
	}

	public java.lang.String getDefaultvalue() {
		return this.defaultvalue;
	}

	public void setDefaultvalue(java.lang.String defaultvalue) {
		this.defaultvalue = defaultvalue;
	}

	public java.lang.Integer getIsrequired() {
		return this.isrequired;
	}

	public void setIsrequired(java.lang.Integer isrequired) {
		this.isrequired = isrequired;
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
