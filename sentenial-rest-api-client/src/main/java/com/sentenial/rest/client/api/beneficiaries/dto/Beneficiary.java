package com.sentenial.rest.client.api.beneficiaries.dto;

import com.sentenial.rest.client.api.common.dto.BasicAccount;

public class Beneficiary {

	
	private BeneficiaryDetails beneficiary;
	
	private BasicAccount beneficiaryAccount;

	
	public Beneficiary withBeneficiary(BeneficiaryDetails beneficiary) {
		this.beneficiary = beneficiary;
		return this;
	}

	public Beneficiary withBeneficiaryAccount(BasicAccount beneficiaryAccount) {
		this.beneficiaryAccount = beneficiaryAccount;
		return this;
	}

	public BeneficiaryDetails getBeneficiary() {
		return beneficiary;
	}

	public void setBeneficiary(BeneficiaryDetails beneficiary) {
		this.beneficiary = beneficiary;
	}

	public BasicAccount getBeneficiaryAccount() {
		return beneficiaryAccount;
	}

	public void setBeneficiaryAccount(BasicAccount beneficiaryAccount) {
		this.beneficiaryAccount = beneficiaryAccount;
	}

	@Override
	public String toString() {
		return "Beneficiary [beneficiary=" + beneficiary + ", beneficiaryAccount=" + beneficiaryAccount + "]";
	}

}
