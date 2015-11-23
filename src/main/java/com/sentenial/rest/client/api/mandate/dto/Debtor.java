package com.sentenial.rest.client.api.mandate.dto;

import com.sentenial.rest.client.api.common.dto.Address;
import com.sentenial.rest.client.api.common.dto.CommunicationLanguage;

public class Debtor {

	
	private String name;
	
	private Address address;
	
	private CommunicationLanguage language;
	
	private String email;
	
	private String phoneNumber;
	
	private String mobileNumber;
	
	
	public Debtor withName(String name) {
		this.name = name;
		return this;
	}
	
	public Debtor withAddress(Address address) {
		this.address = address;
		return this;
	}
	
	public Debtor withLanguage(CommunicationLanguage language) {
		this.language = language;
		return this;
	}
	
	public Debtor withEmail(String email) {
		this.email = email;
		return this;
	}
	
	public Debtor withPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		return this;
	}
	
	public Debtor withMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
		return this;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address adress) {
		this.address = adress;
	}

	public CommunicationLanguage getLanguage() {
		return language;
	}

	public void setLanguage(CommunicationLanguage language) {
		this.language = language;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "Debtor [name=" + name + ", address=" + address + ", language=" + language + ", email=" + email
				+ ", phoneNumber=" + phoneNumber + ", mobileNumber=" + mobileNumber + "]";
	}

}
