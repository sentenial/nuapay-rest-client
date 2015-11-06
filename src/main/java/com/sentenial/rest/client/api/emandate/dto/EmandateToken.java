package com.sentenial.rest.client.api.emandate.dto;

public class EmandateToken {

	private String token;
	
	@Override
	public String toString() {
		return "EmandateToken [token=" + token + "]";
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}	
}