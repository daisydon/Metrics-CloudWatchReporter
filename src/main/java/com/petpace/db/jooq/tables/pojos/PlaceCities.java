/**
 * This class is generated by jOOQ
 */
package com.petpace.db.jooq.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PlaceCities implements java.io.Serializable {

	private static final long serialVersionUID = 2086493831;

	private java.lang.Integer  id;
	private java.lang.String   name;
	private java.lang.String   display;
	private java.lang.String   oldurl;
	private java.lang.String   url;
	private java.lang.String   locale;
	private java.lang.String   regioncode;
	private java.lang.String   regionfullname;
	private java.lang.String   postalcode;
	private java.lang.String   country;
	private java.lang.String   countryfullname;
	private java.lang.String   metroname;
	private java.lang.String   metrocode;
	private java.lang.String   provincecode;
	private java.lang.Double   latitude;
	private java.lang.Double   longitude;
	private java.sql.Timestamp created;
	private java.lang.Integer  restaurantCount;

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

	public java.lang.String getDisplay() {
		return this.display;
	}

	public void setDisplay(java.lang.String display) {
		this.display = display;
	}

	public java.lang.String getOldurl() {
		return this.oldurl;
	}

	public void setOldurl(java.lang.String oldurl) {
		this.oldurl = oldurl;
	}

	public java.lang.String getUrl() {
		return this.url;
	}

	public void setUrl(java.lang.String url) {
		this.url = url;
	}

	public java.lang.String getLocale() {
		return this.locale;
	}

	public void setLocale(java.lang.String locale) {
		this.locale = locale;
	}

	public java.lang.String getRegioncode() {
		return this.regioncode;
	}

	public void setRegioncode(java.lang.String regioncode) {
		this.regioncode = regioncode;
	}

	public java.lang.String getRegionfullname() {
		return this.regionfullname;
	}

	public void setRegionfullname(java.lang.String regionfullname) {
		this.regionfullname = regionfullname;
	}

	public java.lang.String getPostalcode() {
		return this.postalcode;
	}

	public void setPostalcode(java.lang.String postalcode) {
		this.postalcode = postalcode;
	}

	public java.lang.String getCountry() {
		return this.country;
	}

	public void setCountry(java.lang.String country) {
		this.country = country;
	}

	public java.lang.String getCountryfullname() {
		return this.countryfullname;
	}

	public void setCountryfullname(java.lang.String countryfullname) {
		this.countryfullname = countryfullname;
	}

	public java.lang.String getMetroname() {
		return this.metroname;
	}

	public void setMetroname(java.lang.String metroname) {
		this.metroname = metroname;
	}

	public java.lang.String getMetrocode() {
		return this.metrocode;
	}

	public void setMetrocode(java.lang.String metrocode) {
		this.metrocode = metrocode;
	}

	public java.lang.String getProvincecode() {
		return this.provincecode;
	}

	public void setProvincecode(java.lang.String provincecode) {
		this.provincecode = provincecode;
	}

	public java.lang.Double getLatitude() {
		return this.latitude;
	}

	public void setLatitude(java.lang.Double latitude) {
		this.latitude = latitude;
	}

	public java.lang.Double getLongitude() {
		return this.longitude;
	}

	public void setLongitude(java.lang.Double longitude) {
		this.longitude = longitude;
	}

	public java.sql.Timestamp getCreated() {
		return this.created;
	}

	public void setCreated(java.sql.Timestamp created) {
		this.created = created;
	}

	public java.lang.Integer getRestaurantCount() {
		return this.restaurantCount;
	}

	public void setRestaurantCount(java.lang.Integer restaurantCount) {
		this.restaurantCount = restaurantCount;
	}
}
