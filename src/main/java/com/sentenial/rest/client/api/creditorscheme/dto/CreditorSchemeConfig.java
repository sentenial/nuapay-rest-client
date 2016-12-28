package com.sentenial.rest.client.api.creditorscheme.dto;

public class CreditorSchemeConfig {

	private CreditorSchemeDspmConfig dspm;

	public CreditorSchemeDspmConfig getDspm() {
		return dspm;
	}

	public void setDspm(CreditorSchemeDspmConfig dspm) {
		this.dspm = dspm;
	}

	@Override
	public String toString() {
		return "CreditorSchemeConfig [dspm=" + dspm + "]";
	}
	
}
