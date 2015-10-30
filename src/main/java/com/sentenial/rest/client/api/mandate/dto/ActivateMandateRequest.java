package com.sentenial.rest.client.api.mandate.dto;

import java.util.Date;

public class ActivateMandateRequest {

	
	private Date signatureDate;
	
	private String signatureLocation;
	
	private ElectronicSignatureDetails electronicSignatureDetails;

	
	public ActivateMandateRequest withSignatureDate(Date signatureDate) {
		this.signatureDate = signatureDate;
		return this;
	}
	
	public ActivateMandateRequest withSignatureLocation(String signatureLocation) {
		this.signatureLocation = signatureLocation;
		return this;
	}
	
	public ActivateMandateRequest withElectronicSignatureDetails(ElectronicSignatureDetails electronicSignatureDetails) {
		this.electronicSignatureDetails = electronicSignatureDetails;
		return this;
	}
	
	public Date getSignatureDate() {
		return signatureDate;
	}

	public void setSignatureDate(Date signatureDate) {
		this.signatureDate = signatureDate;
	}

	public String getSignatureLocation() {
		return signatureLocation;
	}

	public void setSignatureLocation(String signatureLocation) {
		this.signatureLocation = signatureLocation;
	}

	public ElectronicSignatureDetails getElectronicSignatureDetails() {
		return electronicSignatureDetails;
	}

	public void setElectronicSignatureDetails(ElectronicSignatureDetails electronicSignatureDetails) {
		this.electronicSignatureDetails = electronicSignatureDetails;
	}

	@Override
	public String toString() {
		return "ActivateMandateRequest [signatureDate=" + signatureDate + ", signatureLocation=" + signatureLocation
				+ ", electronicSignatureDetails=" + electronicSignatureDetails + "]";
	}

}
