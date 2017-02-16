package com.sentenial.rest.client.api.beneficiaries.dto;


public class Beneficiary {

	
	private BeneficiaryDetails beneficiary;
	
	private BeneficiaryAccount beneficiaryAccount;

	
	public Beneficiary withBeneficiary(BeneficiaryDetails beneficiary) {
		this.beneficiary = beneficiary;
		return this;
	}

	public Beneficiary withBeneficiaryAccount(BeneficiaryAccount beneficiaryAccount) {
		this.beneficiaryAccount = beneficiaryAccount;
		return this;
	}

	public BeneficiaryDetails getBeneficiary() {
		return beneficiary;
	}

	public void setBeneficiary(BeneficiaryDetails beneficiary) {
		this.beneficiary = beneficiary;
	}

	public BeneficiaryAccount getBeneficiaryAccount() {
		return beneficiaryAccount;
	}

	public void setBeneficiaryAccount(BeneficiaryAccount beneficiaryAccount) {
		this.beneficiaryAccount = beneficiaryAccount;
	}

	@Override
	public String toString() {
		return "Beneficiary [beneficiary=" + beneficiary + ", beneficiaryAccount=" + beneficiaryAccount + "]";
	}

}
