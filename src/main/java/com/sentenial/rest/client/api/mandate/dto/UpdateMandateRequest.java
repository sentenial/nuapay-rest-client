package com.sentenial.rest.client.api.mandate.dto;

import com.fasterxml.jackson.annotation.JsonUnwrapped;

public class UpdateMandateRequest{

	@JsonUnwrapped
	private Mandate mandate;
	
	private ResendMandateForSignature resendMandateForSignature;

	
	public UpdateMandateRequest withMandate(Mandate mandate) {
		this.mandate = mandate;
		return this;
	}
	
	public UpdateMandateRequest withResendMandateForSignature(ResendMandateForSignature resendMandateForSignature) {
		this.resendMandateForSignature = resendMandateForSignature;
		return this;
	}

	public Mandate getMandate() {
		return mandate;
	}

	public void setMandate(Mandate mandate) {
		this.mandate = mandate;
	}

	public ResendMandateForSignature getResendMandateForSignature() {
		return resendMandateForSignature;
	}

	public void setResendMandateForSignature(ResendMandateForSignature resendMandateForSignature) {
		this.resendMandateForSignature = resendMandateForSignature;
	}

}
