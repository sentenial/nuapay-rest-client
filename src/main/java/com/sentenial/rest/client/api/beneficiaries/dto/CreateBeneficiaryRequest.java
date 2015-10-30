package com.sentenial.rest.client.api.beneficiaries.dto;

import com.fasterxml.jackson.annotation.JsonUnwrapped;

public class CreateBeneficiaryRequest {

	@JsonUnwrapped
	private Beneficiary beneficiary;

	
	public CreateBeneficiaryRequest withBeneficiary(Beneficiary beneficiary) {
		this.beneficiary = beneficiary;
		return this;
	}
	
	public Beneficiary getBeneficiary() {
		return beneficiary;
	}

	public void setBeneficiary(Beneficiary beneficiary) {
		this.beneficiary = beneficiary;
	}
	
}
