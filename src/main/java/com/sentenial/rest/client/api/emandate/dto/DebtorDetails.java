package com.sentenial.rest.client.api.emandate.dto;

import com.sentenial.rest.client.api.common.dto.Address;

public class DebtorDetails {
	
	private String name;
	
	private String mobileNumber;
	
	private String email;

	private String iban;
	
	private Address address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getIban() {
		return iban;
	}
	public void setIban(String iban) {
		this.iban = iban;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "DebtorDetails [name=" + name + ", mobileNumber=" + mobileNumber + ", email=" + email + ", iban=" + iban
				+ ", address=" + address + "]";
	}
}