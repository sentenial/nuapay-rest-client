package com.sentenial.rest.client.api.beneficiaries.dto;

public class BeneficiaryAccount {

	private String iban;
	private String bic;

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

	public BeneficiaryAccount withIban(String iban) {
		this.iban = iban;
		return this;
	}

	public BeneficiaryAccount withBic(String bic) {
		this.bic = bic;
		return this;
	}

	@Override
	public String toString() {
		return "BeneficiaryAccount [iban=" + iban + ", bic=" + bic + "]";
	}

}
