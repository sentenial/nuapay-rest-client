package com.sentenial.rest.client.api.mandate.dto;


public class MandateIdentifier {
	
	private String id;
	
	private String uri;

	private String mandateId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public String getMandateId() {
		return mandateId;
	}

	public void setMandateId(String mandateId) {
		this.mandateId = mandateId;
	}

	@Override
	public String toString() {
		return "MandateIdentifier [id=" + id + ", uri=" + uri + ", mandateId=" + mandateId + "]";
	}


}
