package com.sentenial.rest.client.api.creditorscheme.dto;


public class CustomerContact {

	private String title;

	private String firstName;
	private String lastName;
	
	private String position;

	private String telephone;
	private String mobile;
	private String fax;
	
	private String email1;
	private String email2;
	
	private boolean primaryContact;
	private boolean emailNotification;
	private boolean customerContact;


	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getEmail1() {
		return email1;
	}
	public void setEmail1(String email1) {
		this.email1 = email1;
	}
	public String getEmail2() {
		return email2;
	}
	public void setEmail2(String email2) {
		this.email2 = email2;
	}
	public boolean isPrimaryContact() {
		return primaryContact;
	}
	public void setPrimaryContact(boolean primaryContact) {
		this.primaryContact = primaryContact;
	}
	public boolean isEmailNotification() {
		return emailNotification;
	}
	public void setEmailNotification(boolean emailNotification) {
		this.emailNotification = emailNotification;
	}
	public boolean isCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(boolean customerContact) {
		this.customerContact = customerContact;
	}

	
}
