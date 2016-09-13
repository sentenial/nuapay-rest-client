package com.sentenial.rest.client.api.common.dto;

public class BasicAccount {

	
	private String iban;
	
	private String bic;
	
	private String domesticAccountNumber;
	
	private String domesticBranchCode;
	
	private String accountCountry;

	
	public BasicAccount withIban(String iban) {
		this.iban = iban;
		return this;
	}
	
	public BasicAccount withBic(String bic) {
		this.bic = bic;
		return this;
	}
	
	public BasicAccount withDomesticAccountNumber(String domesticAccountNumber) {
		this.domesticAccountNumber = domesticAccountNumber;
		return this;
	}

	public BasicAccount withDomesticBranchCode(String domesticBranchCode) {
		this.domesticBranchCode = domesticBranchCode;
		return this;
	}

	public BasicAccount withAccountCountry(String accountCountry) {
		this.accountCountry = accountCountry;
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

	public String getDomesticAccountNumber() {
		return domesticAccountNumber;
	}

	public void setDomesticAccountNumber(String domesticAccountNumber) {
		this.domesticAccountNumber = domesticAccountNumber;
	}

	public String getDomesticBranchCode() {
		return domesticBranchCode;
	}

	public void setDomesticBranchCode(String domesticBranchCode) {
		this.domesticBranchCode = domesticBranchCode;
	}

	public String getAccountCountry() {
		return accountCountry;
	}

	public void setAccountCountry(String accountCountry) {
		this.accountCountry = accountCountry;
	}

	@Override
	public String toString() {
		return "BasicAccount [iban=" + iban + ", bic=" + bic + ", domesticAccountNumber=" + domesticAccountNumber
				+ ", domesticBranchCode=" + domesticBranchCode + ", accountCountry=" + accountCountry + "]";
	}

}
