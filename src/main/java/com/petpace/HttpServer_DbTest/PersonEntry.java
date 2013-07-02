package com.petpace.HttpServer_DbTest;

public class PersonEntry {
	String _name;
	String _gender;
	boolean _verified = false;
	long _timestamp = 0;

	public PersonEntry() {
		_name = "";
		_gender = "";
		_verified = false;
		_timestamp = 0;
	}

	public void setName(String name) {
		_name = name;
	}

	public void setGender(String gender) {
		_gender = gender;
	}

	public void setVerified(boolean verified) {
		_verified = verified;
	}

	public void setTimestamp(long timestamp) {
		_timestamp = timestamp;
	}

	public String getName() {
		return _name;
	}

	public String getGender() {
		return _gender;
	}

	public boolean getVerified() {
		return _verified;
	}

	public long getTimestamp() {
		return _timestamp;
	}

	public String toString() {
		return "{Person: {Name: " + _name + ", Gender: " + _gender
				+ ", Verified: " + _verified + ", TimeStamp" + _timestamp
				+ "}};";
	}

}
