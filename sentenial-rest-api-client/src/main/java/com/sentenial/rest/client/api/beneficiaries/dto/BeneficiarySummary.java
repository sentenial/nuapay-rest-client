package com.sentenial.rest.client.api.beneficiaries.dto;

public class BeneficiarySummary {

	
	private String beneficiaryName;
	
	private String beneficiaryIban;
	
	private String beneficiaryMobileNumber;

	
	public String getBeneficiaryName() {
		return beneficiaryName;
	}

	public void setBeneficiaryName(String beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
	}

	public String getBeneficiaryIban() {
		return beneficiaryIban;
	}

	public void setBeneficiaryIban(String beneficiaryIban) {
		this.beneficiaryIban = beneficiaryIban;
	}

	public String getBeneficiaryMobileNumber() {
		return beneficiaryMobileNumber;
	}

	public void setBeneficiaryMobileNumber(String beneficiaryMobileNumber) {
		this.beneficiaryMobileNumber = beneficiaryMobileNumber;
	}

	@Override
	public String toString() {
		return "BeneficiarySummary [beneficiaryName=" + beneficiaryName + ", beneficiaryIban=" + beneficiaryIban
				+ ", beneficiaryMobileNumber=" + beneficiaryMobileNumber + "]";
	}

}
