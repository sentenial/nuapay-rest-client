package com.sentenial.rest.client.api.mandate.dto;

import java.util.Date;

public class MandateInfo {

	
	private String mandateId;
	
	private String contractReference;
	
	private String signatureLocation;
	
	private Date signatureDate;
	
	private MandateType mandateType;
	
	private String status;
	
	private Date creationDate;

	
	public MandateInfo withMandateId(String mandateId) {
		this.mandateId = mandateId;
		return this;
	}
	
	public MandateInfo withContractReference(String contractReference) {
		this.contractReference = contractReference;
		return this;
	}
	
	public MandateInfo withSignatureLocation(String signatureLocation) {
		this.signatureLocation = signatureLocation;
		return this;
	}
	
	public MandateInfo withSignatureDate(Date signatureDate) {
		this.signatureDate = signatureDate;
		return this;
	}
	
	public MandateInfo withMandateType(MandateType mandateType) {
		this.mandateType = mandateType;
		return this;
	}
	
	public String getMandateId() {
		return mandateId;
	}

	public void setMandateId(String mandateId) {
		this.mandateId = mandateId;
	}

	public String getContractReference() {
		return contractReference;
	}

	public void setContractReference(String contractReference) {
		this.contractReference = contractReference;
	}

	public String getSignatureLocation() {
		return signatureLocation;
	}

	public void setSignatureLocation(String signatureLocation) {
		this.signatureLocation = signatureLocation;
	}

	public Date getSignatureDate() {
		return signatureDate;
	}

	public void setSignatureDate(Date signatureDate) {
		this.signatureDate = signatureDate;
	}

	public MandateType getMandateType() {
		return mandateType;
	}

	public void setMandateType(MandateType mandateType) {
		this.mandateType = mandateType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	@Override
	public String toString() {
		return "MandateInfo [mandateId=" + mandateId + ", contractReference=" + contractReference
				+ ", signatureLocation=" + signatureLocation + ", signatureDate=" + signatureDate + ", mandateType="
				+ mandateType + "]";
	}

}
