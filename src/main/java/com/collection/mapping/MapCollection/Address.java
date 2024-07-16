package com.collection.mapping.MapCollection;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

	private int addessId;

	private String pincode;

	private String location;

	public int getAddessId() {
		return addessId;
	}

	public void setAddessId(int addessId) {
		this.addessId = addessId;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Address(int addessId, String pincode, String location) {
		this.addessId = addessId;
		this.pincode = pincode;
		this.location = location;
	}

	public Address() {
	}

	@Override
	public String toString() {
		return "Address [addessId=" + addessId + ", pincode=" + pincode + ", location=" + location + "]";
	}

}
