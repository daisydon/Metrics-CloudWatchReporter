/**
 * This class is generated by jOOQ
 */
package com.petpace.db.jooq.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VitalAmbienttemp implements java.io.Serializable {

	private static final long serialVersionUID = -567035642;

	private java.lang.Integer    id;
	private java.lang.String     collarId;
	private java.lang.Integer    petId;
	private java.lang.String     name;
	private java.lang.Integer    quality;
	private java.math.BigDecimal deviation;
	private java.lang.Integer    duration;
	private java.math.BigDecimal value;
	private java.lang.String     debug;
	private java.math.BigDecimal exhale;
	private java.math.BigDecimal exhaleStd;
	private java.math.BigDecimal inhale;
	private java.math.BigDecimal inhaleStd;
	private java.math.BigDecimal nn;
	private java.math.BigDecimal nnStd;
	private java.math.BigDecimal ipr;
	private java.math.BigDecimal iprStd;
	private java.sql.Timestamp   time;
	private java.sql.Timestamp   created;
	private java.lang.String     notes;

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

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.Integer getQuality() {
		return this.quality;
	}

	public void setQuality(java.lang.Integer quality) {
		this.quality = quality;
	}

	public java.math.BigDecimal getDeviation() {
		return this.deviation;
	}

	public void setDeviation(java.math.BigDecimal deviation) {
		this.deviation = deviation;
	}

	public java.lang.Integer getDuration() {
		return this.duration;
	}

	public void setDuration(java.lang.Integer duration) {
		this.duration = duration;
	}

	public java.math.BigDecimal getValue() {
		return this.value;
	}

	public void setValue(java.math.BigDecimal value) {
		this.value = value;
	}

	public java.lang.String getDebug() {
		return this.debug;
	}

	public void setDebug(java.lang.String debug) {
		this.debug = debug;
	}

	public java.math.BigDecimal getExhale() {
		return this.exhale;
	}

	public void setExhale(java.math.BigDecimal exhale) {
		this.exhale = exhale;
	}

	public java.math.BigDecimal getExhaleStd() {
		return this.exhaleStd;
	}

	public void setExhaleStd(java.math.BigDecimal exhaleStd) {
		this.exhaleStd = exhaleStd;
	}

	public java.math.BigDecimal getInhale() {
		return this.inhale;
	}

	public void setInhale(java.math.BigDecimal inhale) {
		this.inhale = inhale;
	}

	public java.math.BigDecimal getInhaleStd() {
		return this.inhaleStd;
	}

	public void setInhaleStd(java.math.BigDecimal inhaleStd) {
		this.inhaleStd = inhaleStd;
	}

	public java.math.BigDecimal getNn() {
		return this.nn;
	}

	public void setNn(java.math.BigDecimal nn) {
		this.nn = nn;
	}

	public java.math.BigDecimal getNnStd() {
		return this.nnStd;
	}

	public void setNnStd(java.math.BigDecimal nnStd) {
		this.nnStd = nnStd;
	}

	public java.math.BigDecimal getIpr() {
		return this.ipr;
	}

	public void setIpr(java.math.BigDecimal ipr) {
		this.ipr = ipr;
	}

	public java.math.BigDecimal getIprStd() {
		return this.iprStd;
	}

	public void setIprStd(java.math.BigDecimal iprStd) {
		this.iprStd = iprStd;
	}

	public java.sql.Timestamp getTime() {
		return this.time;
	}

	public void setTime(java.sql.Timestamp time) {
		this.time = time;
	}

	public java.sql.Timestamp getCreated() {
		return this.created;
	}

	public void setCreated(java.sql.Timestamp created) {
		this.created = created;
	}

	public java.lang.String getNotes() {
		return this.notes;
	}

	public void setNotes(java.lang.String notes) {
		this.notes = notes;
	}
}
