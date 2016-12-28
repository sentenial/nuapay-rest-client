package com.sentenial.rest.client.api.creditorscheme.dto;

public class CreditorSchemeDspmConfig {

	private boolean allowed;

	public boolean isAllowed() {
		return allowed;
	}

	public void setAllowed(boolean allowed) {
		this.allowed = allowed;
	}

	@Override
	public String toString() {
		return "CreditorSchemeDspmConfig [allowed=" + allowed + "]";
	}
	
}
