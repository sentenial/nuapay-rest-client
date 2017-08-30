package com.sentenial.rest.client.api.paymentschedule;

import com.sentenial.rest.client.api.common.service.AbstractServiceDefault;
import com.sentenial.rest.client.api.common.service.ServiceConfiguration;
import com.sentenial.rest.client.api.paymentschedule.dto.CancelPaymentScheduleRequest;
import com.sentenial.rest.client.api.paymentschedule.dto.CancelPaymentScheduleResponse;
import com.sentenial.rest.client.api.paymentschedule.dto.CreatePaymentScheduleAndMandateRequest;
import com.sentenial.rest.client.api.paymentschedule.dto.CreatePaymentScheduleAndMandateResponse;
import com.sentenial.rest.client.api.paymentschedule.dto.CreatePaymentScheduleRequest;
import com.sentenial.rest.client.api.paymentschedule.dto.CreatePaymentScheduleResponse;
import com.sentenial.rest.client.api.paymentschedule.dto.ListPaymentScheduleRequestParameters;
import com.sentenial.rest.client.api.paymentschedule.dto.ListPaymentScheduleResponse;
import com.sentenial.rest.client.api.paymentschedule.dto.RetrievePaymentScheduleResponse;
import com.sentenial.rest.client.utils.JsonUtils;

public class PaymentScheduleServiceDefault extends AbstractServiceDefault implements PaymentScheduleService{

	public static final String LIST_PAYMENT_SCHEDULES = "/paymentschedules";
	public static final String LIST_PAYMENT_SCHEDULES_BY_CREDITORSCHEME = "/schemes/%s/paymentschedules";
	public static final String LIST_PAYMENT_SCHEDULES_BY_MANDATE = "/schemes/%s/mandates/%s/paymentschedules";
	public static final String CREATE_PAYMENT_SCHEDULE = "/schemes/%s/mandates/%s/paymentschedules";
	public static final String CREATE_PAYMENT_SCHEDULES_AND_MANDATE = "/schemes/%s/paymentschedules";
	public static final String CANCEL_PAYMENT_SCHEDULE = "/schemes/%s/mandates/%s/paymentschedules/%s/cancel";
	public static final String RETRIEVE_PAYMENT_SCHEDULE = "/schemes/%s/mandates/%s/paymentschedules/%s";
	
	public PaymentScheduleServiceDefault(ServiceConfiguration serviceConfiguration) {
		super(serviceConfiguration);
	}

	@Override
	public CreatePaymentScheduleResponse createPaymentSchedule(
			String creditorSchemeId, String mandateId, CreatePaymentScheduleRequest createPaymentScheduleRequest){

		String url = String.format(getApiUri() + CREATE_PAYMENT_SCHEDULE, creditorSchemeId, mandateId);
		String payload = JsonUtils.toJson(createPaymentScheduleRequest);

		return JsonUtils.fromJson(httpClient.post(url, headers(), payload), CreatePaymentScheduleResponse.class);
	}


	@Override
	public CreatePaymentScheduleAndMandateResponse createPaymentScheduleAndMandate(
			String creditorSchemeId, CreatePaymentScheduleAndMandateRequest createPaymentScheduleAndMandateRequest) {

		String url = String.format(getApiUri() + CREATE_PAYMENT_SCHEDULES_AND_MANDATE, creditorSchemeId);
		String payload = JsonUtils.toJson(createPaymentScheduleAndMandateRequest);

		return JsonUtils.fromJson(httpClient.post(url, headers(), payload), CreatePaymentScheduleAndMandateResponse.class);
		
	}
	
	@Override
	public RetrievePaymentScheduleResponse retrievePaymentSchedule(String creditorSchemeId, String mandateId, String paymentScheduleId) {
		String url = String.format(getApiUri() + RETRIEVE_PAYMENT_SCHEDULE, creditorSchemeId, mandateId, paymentScheduleId);
		return JsonUtils.fromJson(httpClient.get(url, headers()), RetrievePaymentScheduleResponse.class);
	}
	
	@Override
	public ListPaymentScheduleResponse listPaymentSchedules(
			ListPaymentScheduleRequestParameters listPaymentScheduleRequestParameters) {

		listPaymentScheduleRequestParameters = 
				(listPaymentScheduleRequestParameters != null)? listPaymentScheduleRequestParameters: new ListPaymentScheduleRequestParameters();

		String url = getApiUri() + LIST_PAYMENT_SCHEDULES + listPaymentScheduleRequestParameters.generateRequestParamsString();

		return JsonUtils.fromJson(httpClient.get(url, headers()), ListPaymentScheduleResponse.class);
	}

	@Override
	public ListPaymentScheduleResponse listPaymentSchedules(
			String creditorSchemeId, ListPaymentScheduleRequestParameters listPaymentScheduleRequestParameters) {

		listPaymentScheduleRequestParameters = 
				(listPaymentScheduleRequestParameters != null)? listPaymentScheduleRequestParameters: new ListPaymentScheduleRequestParameters();

		String url = String.format(getApiUri() + LIST_PAYMENT_SCHEDULES_BY_CREDITORSCHEME, creditorSchemeId) 
				+ listPaymentScheduleRequestParameters.generateRequestParamsString();

		return JsonUtils.fromJson(httpClient.get(url, headers()), ListPaymentScheduleResponse.class);
	}

	@Override
	public ListPaymentScheduleResponse listPaymentSchedules(
			String creditorSchemeId, String mandateId, ListPaymentScheduleRequestParameters listPaymentScheduleRequestParameters) {

		listPaymentScheduleRequestParameters = 
				(listPaymentScheduleRequestParameters != null)? listPaymentScheduleRequestParameters: new ListPaymentScheduleRequestParameters();

		String url = String.format(getApiUri() + LIST_PAYMENT_SCHEDULES_BY_MANDATE, creditorSchemeId, mandateId) 
				+ listPaymentScheduleRequestParameters.generateRequestParamsString();

		return JsonUtils.fromJson(httpClient.get(url, headers()), ListPaymentScheduleResponse.class);
	}

	@Override
	public CancelPaymentScheduleResponse cancelPaymentSchedule(
			String creditorSchemeId, String mandateId, String paymentScheduleId, CancelPaymentScheduleRequest cancelPaymentScheduleRequest) {

		String url = String.format(getApiUri() + CANCEL_PAYMENT_SCHEDULE, creditorSchemeId, mandateId, paymentScheduleId);
		String payload = JsonUtils.toJson(cancelPaymentScheduleRequest);

		return JsonUtils.fromJson(httpClient.post(url, headers(), payload), CancelPaymentScheduleResponse.class);
	}

}
