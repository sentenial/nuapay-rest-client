package com.sentenial.rest.client.api.paymentschedule;

import com.sentenial.rest.client.api.paymentschedule.dto.CancelPaymentScheduleRequest;
import com.sentenial.rest.client.api.paymentschedule.dto.CancelPaymentScheduleResponse;
import com.sentenial.rest.client.api.paymentschedule.dto.CreatePaymentScheduleAndMandateRequest;
import com.sentenial.rest.client.api.paymentschedule.dto.CreatePaymentScheduleAndMandateResponse;
import com.sentenial.rest.client.api.paymentschedule.dto.CreatePaymentScheduleRequest;
import com.sentenial.rest.client.api.paymentschedule.dto.CreatePaymentScheduleResponse;
import com.sentenial.rest.client.api.paymentschedule.dto.ListPaymentScheduleRequestParameters;
import com.sentenial.rest.client.api.paymentschedule.dto.ListPaymentScheduleResponse;
import com.sentenial.rest.client.api.paymentschedule.dto.RetrievePaymentScheduleResponse;

public interface PaymentScheduleService {

	CreatePaymentScheduleResponse createPaymentSchedule(
			String creditorSchemeId, String mandateId, CreatePaymentScheduleRequest createPaymentScheduleRequest);

	CreatePaymentScheduleAndMandateResponse createPaymentScheduleAndMandate(
			String creditorSchemeId, CreatePaymentScheduleAndMandateRequest createPaymentScheduleAndMandateRequest);
	
	RetrievePaymentScheduleResponse retrievePaymentSchedule(String creditorSchemeId, String mandateId, String paymentScheduleId);
	
	ListPaymentScheduleResponse listPaymentSchedules(
			ListPaymentScheduleRequestParameters listPaymentScheduleRequestParameters);
	
	ListPaymentScheduleResponse listPaymentSchedules(String creditorSchemeId,
			ListPaymentScheduleRequestParameters listPaymentScheduleRequestParameters);
	
	ListPaymentScheduleResponse listPaymentSchedules(String creditorSchemeId, String mandateId,
			ListPaymentScheduleRequestParameters listPaymentScheduleRequestParameters);
	
	CancelPaymentScheduleResponse cancelPaymentSchedule(
			String creditorSchemeId, String mandateId, String paymentScheduleId, CancelPaymentScheduleRequest cancelPaymentScheduleRequest);
	
}
