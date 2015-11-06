package com.sentenial.rest.client.api.emandate.dto;

public class MerchantDetails {
		
	private String apiKey;
	
	private String creditorSchemeId;
	
	private String schemeType;
	
	private String iban;
	
	private String mandateId;
	
	private String mandateType;
	
	private String contractReference;	
	
	private String domain;
	
	public String getApiKey() {
		return apiKey;
	}
	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}
	public String getSchemeType() {
		return schemeType;
	}
	public void setSchemeType(String schemeType) {
		this.schemeType = schemeType;
	}
	public String getIban() {
		return iban;
	}
	public void setIban(String iban) {
		this.iban = iban;
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
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getCreditorSchemeId() {
		return creditorSchemeId;
	}
	public void setCreditorSchemeId(String creditorSchemeId) {
		this.creditorSchemeId = creditorSchemeId;
	}
	public String getMandateType() {
		return mandateType;
	}
	public void setMandateType(String mandateType) {
		this.mandateType = mandateType;
	}
	@Override
	public String toString() {
		return "MerchantDetails [apiKey=" + apiKey + ", creditorSchemeId=" + creditorSchemeId + ", schemeType="
				+ schemeType + ", iban=" + iban + ", mandateId=" + mandateId + ", mandateType=" + mandateType
				+ ", contractReference=" + contractReference + ", domain=" + domain + "]";
	}
}