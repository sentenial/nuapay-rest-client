package com.sentenial.rest.client.api.creditorscheme.dto;

public class CreditorSchemeConfig {

	private CreditorSchemeDspmConfig dspm;
	
	private CustomerContact customerContact;

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

	public CustomerContact getCustomerContact() {
		return customerContact;
	}

	public void setCustomerContact(CustomerContact customerContact) {
		this.customerContact = customerContact;
	}
	
}
