package com.sentenial.rest.client.api.beneficiaries.dto;

import com.sentenial.rest.client.api.common.dto.Address;

public class BeneficiaryDetails {

	
	private String name;

	private Address address;

	private String language;

	private String email;

	private String mobileNumber;

	private String phoneNumber;

	private String descriptionOfPurpose;

	
	public BeneficiaryDetails withName(String name) {
		this.name = name;
		return this;
	}
	
	public BeneficiaryDetails withAddress(Address address) {
		this.address = address;
		return this;
	}
	
	public BeneficiaryDetails withLanguage(String language) {
		this.language = language;
		return this;
	}
	
	public BeneficiaryDetails withEmail(String email) {
		this.email = email;
		return this;
	}
	
	public BeneficiaryDetails withMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
		return this;
	}
	
	public BeneficiaryDetails withPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		return this;
	}
	
	public BeneficiaryDetails withDescriptionOfPurpose(String descriptionOfPurpose) {
		this.descriptionOfPurpose = descriptionOfPurpose;
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

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getDescriptionOfPurpose() {
		return descriptionOfPurpose;
	}

	public void setDescriptionOfPurpose(String descriptionOfPurpose) {
		this.descriptionOfPurpose = descriptionOfPurpose;
	}

	@Override
	public String toString() {
		return "Beneficiary [name=" + name + ", address=" + address + ", language=" + language + ", email=" + email
				+ ", mobileNumber=" + mobileNumber + ", phoneNumber=" + phoneNumber + ", descriptionOfPurpose="
				+ descriptionOfPurpose + "]";
	}

}
