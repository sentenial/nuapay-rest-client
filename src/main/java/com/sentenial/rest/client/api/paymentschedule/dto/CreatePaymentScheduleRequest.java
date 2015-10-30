package com.sentenial.rest.client.api.paymentschedule.dto;

import com.fasterxml.jackson.annotation.JsonUnwrapped;

public class CreatePaymentScheduleRequest {

	@JsonUnwrapped
	private PaymentSchedule paymentSchedule;

	
	public CreatePaymentScheduleRequest withPaymentSchedule(PaymentSchedule paymentSchedule) {
		this.paymentSchedule = paymentSchedule;
		return this;
	}
	
	public PaymentSchedule getPaymentSchedule() {
		return paymentSchedule;
	}

	public void setPaymentSchedule(PaymentSchedule paymentSchedule) {
		this.paymentSchedule = paymentSchedule;
	}

}
