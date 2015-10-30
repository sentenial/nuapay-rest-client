package com.sentenial.rest.client.api.paymentschedule;

import com.sentenial.rest.client.api.paymentschedule.dto.CreatePaymentScheduleRequest;
import com.sentenial.rest.client.api.paymentschedule.dto.CreatePaymentScheduleResponse;

public interface PaymentScheduleService {

	public CreatePaymentScheduleResponse createPaymentSchedule(
			String creditorSchemeId, String mandateId, CreatePaymentScheduleRequest createPaymentScheduleRequest);
	
}
