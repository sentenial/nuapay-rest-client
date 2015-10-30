package com.sentenial.rest.client.api.mandate.dto;

import com.fasterxml.jackson.annotation.JsonUnwrapped;

public class CreateMandateRequest{

	@JsonUnwrapped
	private Mandate mandate;
	

	public CreateMandateRequest withMandate(Mandate mandate) {
		this.mandate = mandate;
		return this;
	}

	public Mandate getMandate() {
		return mandate;
	}

	public void setMandate(Mandate mandate) {
		this.mandate = mandate;
	}

}
