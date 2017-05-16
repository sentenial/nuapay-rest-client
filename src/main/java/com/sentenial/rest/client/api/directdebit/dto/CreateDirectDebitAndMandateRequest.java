package com.sentenial.rest.client.api.directdebit.dto;

import com.sentenial.rest.client.api.mandate.dto.Mandate;

public class CreateDirectDebitAndMandateRequest extends CreateDirectDebitRequest {

    private Mandate mandate;


	public Mandate getMandate() {
		return mandate;
	}
	
	public CreateDirectDebitAndMandateRequest withMandate(Mandate mandate) {
		this.mandate = mandate;
		return this;
	}

	public void setMandate(Mandate mandate) {
		this.mandate = mandate;
	}

}
