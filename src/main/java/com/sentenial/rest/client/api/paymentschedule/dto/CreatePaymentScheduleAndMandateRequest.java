package com.sentenial.rest.client.api.paymentschedule.dto;

import com.sentenial.rest.client.api.mandate.dto.Mandate;

public class CreatePaymentScheduleAndMandateRequest extends CreatePaymentScheduleRequest {

    private Mandate mandate;


	public Mandate getMandate() {
		return mandate;
	}
	
	public CreatePaymentScheduleAndMandateRequest withMandate(Mandate mandate) {
		this.mandate = mandate;
		return this;
	}

	public void setMandate(Mandate mandate) {
		this.mandate = mandate;
	}


}
