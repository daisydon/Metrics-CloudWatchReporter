/**
 * This class is generated by jOOQ
 */
package com.petpace.db.jooq.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PetEntities implements java.io.Serializable {

	private static final long serialVersionUID = -827505593;

	private java.lang.String   id;
	private java.sql.Timestamp datecreated;
	private java.sql.Timestamp dateupdated;
	private java.lang.Integer  status;

	public java.lang.String getId() {
		return this.id;
	}

	public void setId(java.lang.String id) {
		this.id = id;
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
