package com.sentenial.rest.client.api.creditorscheme.dto;

public class CreditorScheme{

	
	private String creditorSchemeId;
	
	private String schemeType;
	
	
	public CreditorScheme withCreditorSchemeId(String creditorSchemeId){
		this.creditorSchemeId = creditorSchemeId;
		return this;
	}
	
	public CreditorScheme withSchemeType(String schemeType){
		this.schemeType = schemeType;
		return this;
	}
	
	public String getCreditorSchemeId() {
		return creditorSchemeId;
	}

	public void setCreditorSchemeId(String creditorSchemeId) {
		this.creditorSchemeId = creditorSchemeId;
	}

	public String getSchemeType() {
		return schemeType;
	}

	public void setSchemeType(String schemeType) {
		this.schemeType = schemeType;
	}

	
	@Override
	public String toString() {
		return "CreditorScheme [creditorSchemeId=" + creditorSchemeId + ", schemeType=" + schemeType + "]";
	}

}
