/**
 * This class is generated by jOOQ
 */
package com.petpace.db.jooq.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VitalActivityMinute implements java.io.Serializable {

	private static final long serialVersionUID = 1336144673;

	private java.lang.Integer    id;
	private java.lang.String     collarId;
	private java.lang.Integer    petId;
	private java.lang.Long       value;
	private java.math.BigDecimal smv10;
	private java.math.BigDecimal smv30;
	private java.sql.Timestamp   time;

	public java.lang.Integer getId() {
		return this.id;
	}

	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	public java.lang.String getCollarId() {
		return this.collarId;
	}

	public void setCollarId(java.lang.String collarId) {
		this.collarId = collarId;
	}

	public java.lang.Integer getPetId() {
		return this.petId;
	}

	public void setPetId(java.lang.Integer petId) {
		this.petId = petId;
	}

	public java.lang.Long getValue() {
		return this.value;
	}

	public void setValue(java.lang.Long value) {
		this.value = value;
	}

	public java.math.BigDecimal getSmv10() {
		return this.smv10;
	}

	public void setSmv10(java.math.BigDecimal smv10) {
		this.smv10 = smv10;
	}

	public java.math.BigDecimal getSmv30() {
		return this.smv30;
	}

	public void setSmv30(java.math.BigDecimal smv30) {
		this.smv30 = smv30;
	}

	public java.sql.Timestamp getTime() {
		return this.time;
	}

	public void setTime(java.sql.Timestamp time) {
		this.time = time;
	}
}
