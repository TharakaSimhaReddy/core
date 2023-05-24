package com.ass.core.dto;

import java.io.Serializable;

public class UserDto implements Serializable {

	private long altKey;

	private String name;

	private String city;

	private String country;

	private String pinCode;

	public long getAltKey() {
		return altKey;
	}

	public void setAltKey(long altKey) {
		this.altKey = altKey;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public void setName(String name) {
		this.name = name;
	}

}
