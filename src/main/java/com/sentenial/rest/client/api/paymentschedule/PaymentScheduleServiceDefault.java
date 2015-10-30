package com.sentenial.rest.client.api.paymentschedule;

import com.sentenial.rest.client.api.common.service.AbstractServiceDefault;
import com.sentenial.rest.client.api.common.service.ServiceConfiguration;
import com.sentenial.rest.client.api.paymentschedule.dto.CreatePaymentScheduleRequest;
import com.sentenial.rest.client.api.paymentschedule.dto.CreatePaymentScheduleResponse;
import com.sentenial.rest.client.utils.JsonUtils;

public class PaymentScheduleServiceDefault extends AbstractServiceDefault implements PaymentScheduleService{


	public static final String CREATE_PAYMENT_SCHEDULE = "/schemes/%s/mandates/%s/paymentschedules";


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

}
