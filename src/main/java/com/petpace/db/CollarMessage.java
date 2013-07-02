package com.petpace.db;


public class CollarMessage {
	
	private int collarId;
	private long messageTimeInMillis;
	private short itemType;
	private short sequenceNumber;
//	private CollarDb.Status status;
	private String gatewayId;
	
	
	private short shortData;
	private int intData;
	private long longData;
	private String stringData;
	
	
	public String getGatewayId() {
		return gatewayId;
	}
	public void setGatewayId(String gatewayId) {
		this.gatewayId = gatewayId;
	}
//	public CollarDb.Status getStatus() {
//		return status;
//	}
//	public void setStatus(CollarDb.Status status) {
//		this.status = status;
//	}
	
	public int getCollarId() {
		return collarId;
	}
	public void setCollarId(int collarId) {
		this.collarId = collarId;
	}
	public long getMessageTimeInMillis() {
		return messageTimeInMillis;
	}
	public void setMessageTimeInMillis(long messageTimeInMillis) {
		this.messageTimeInMillis = messageTimeInMillis;
	}
	public short getItemType() {
		return itemType;
	}
	public void setItemType(short itemType) {
		this.itemType = itemType;
	}
	public short getSequenceNumber() {
		return sequenceNumber;
	}
	public void setSequenceNumber(short sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}
	public short getShortData() {
		return shortData;
	}
	public void setShortData(short shortData) {
		this.shortData = shortData;
	}
	public int getIntData() {
		return intData;
	}
	public void setIntData(int intData) {
		this.intData = intData;
	}
	public long getLongData() {
		return longData;
	}
	public void setLongData(long longData) {
		this.longData = longData;
	}
	public String getStringData() {
		return stringData;
	}
	public void setStringData(String stringData) {
		this.stringData = stringData;
	}

}
