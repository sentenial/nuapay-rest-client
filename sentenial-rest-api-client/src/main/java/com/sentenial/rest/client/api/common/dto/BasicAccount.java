package com.sentenial.rest.client.api.common.dto;

public class BasicAccount {

	
	private String iban;
	
	private String bic;

	
	public BasicAccount withIban(String iban) {
		this.iban = iban;
		return this;
	}
	
	public BasicAccount withBic(String bic) {
		this.bic = bic;
		return this;
	}
	
	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public String getBic() {
		return bic;
	}

	public void setBic(String bic) {
		this.bic = bic;
	}

	@Override
	public String toString() {
		return "DebtorAccount [iban=" + iban + ", bic=" + bic + "]";
	}

}
