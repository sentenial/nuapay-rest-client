package com.sentenial.rest.client.api.common.dto;

public class Address {

	
	private String line1;
	
	private String line2;
	
	private String town;
	
	private String postCode;
	
	private String state;
	
	private String country;

	
	public Address withLine1(String line1) {
		this.line1 = line1;
		return this;
	}
	
	public Address withLine2(String line2) {
		this.line2 = line2;
		return this;
	}
	
	public Address withTown(String town) {
		this.town = town;
		return this;
	}
	
	public Address withPostCode(String postCode) {
		this.postCode = postCode;
		return this;
	}
	
	public Address withState(String state) {
		this.state = state;
		return this;
	}
	
	public Address withCountry(String country) {
		this.country = country;
		return this;
	}

	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public String getLine2() {
		return line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [line1=" + line1 + ", line2=" + line2 + ", town=" + town + ", postCode=" + postCode + ", state="
				+ state + ", country=" + country + "]";
	}

}
