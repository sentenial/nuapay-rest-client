package com.sentenial.rest.client.api.mandate.dto;

public class ElectronicSignatureDetails {

	
	private String authorizationMethod;
	
	private String authorizationToken;
	
	private String authorizationEmail;
	
	private String authorizationMobileNumber;
	
	private String ipAddress;
	
	private String geographicLocation;


	public ElectronicSignatureDetails withAuthorizationMethod(String authorizationMethod) {
		this.authorizationMethod = authorizationMethod;
		return this;
	}
	
	public ElectronicSignatureDetails withAuthorizationToken(String authorizationToken) {
		this.authorizationToken = authorizationToken;
		return this;
	}
	
	public ElectronicSignatureDetails withAuthorizationEmail(String authorizationEmail) {
		this.authorizationEmail = authorizationEmail;
		return this;
	}
	
	public ElectronicSignatureDetails withAuthorizationMobileNumber(String authorizationMobileNumber) {
		this.authorizationMobileNumber = authorizationMobileNumber;
		return this;
	}
	
	public ElectronicSignatureDetails withIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
		return this;
	}
	
	public ElectronicSignatureDetails withGeographicLocation(String geographicLocation) {
		this.geographicLocation = geographicLocation;
		return this;
	}
	
	public String getAuthorizationMethod() {
		return authorizationMethod;
	}

	public void setAuthorizationMethod(String authorizationMethod) {
		this.authorizationMethod = authorizationMethod;
	}

	public String getAuthorizationToken() {
		return authorizationToken;
	}

	public void setAuthorizationToken(String authorizationToken) {
		this.authorizationToken = authorizationToken;
	}

	public String getAuthorizationEmail() {
		return authorizationEmail;
	}

	public void setAuthorizationEmail(String authorizationEmail) {
		this.authorizationEmail = authorizationEmail;
	}

	public String getAuthorizationMobileNumber() {
		return authorizationMobileNumber;
	}

	public void setAuthorizationMobileNumber(String authorizationMobileNumber) {
		this.authorizationMobileNumber = authorizationMobileNumber;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getGeographicLocation() {
		return geographicLocation;
	}

	public void setGeographicLocation(String geographicLocation) {
		this.geographicLocation = geographicLocation;
	}

	@Override
	public String toString() {
		return "ElectronicSignatureDetails [authorizationMethod=" + authorizationMethod + ", authorizationToken="
				+ authorizationToken + ", authorizationEmail=" + authorizationEmail + ", authorizationMobileNumber="
				+ authorizationMobileNumber + ", ipAddress=" + ipAddress + ", geographicLocation=" + geographicLocation
				+ "]";
	}
	
}
