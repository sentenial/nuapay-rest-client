package com.sentenial.rest.client.api.directdebit.dto;

public class DirectDebitMandateInfo {

	private String mandateId;

	private String domesticMandateId;

	public DirectDebitMandateInfo withMandateId(String mandateId) {
		this.mandateId = mandateId;
		return this;
	}

	public DirectDebitMandateInfo withDomesticMandateId(String domesticMandateId) {
		this.domesticMandateId = domesticMandateId;
		return this;
	}

	public String getMandateId() {
		return mandateId;
	}

	public void setMandateId(String mandateId) {
		this.mandateId = mandateId;
	}

	public String getDomesticMandateId() {
		return domesticMandateId;
	}

	public void setDomesticMandateId(String domesticMandateId) {
		this.domesticMandateId = domesticMandateId;
	}

}
