package com.sentenial.rest.client.examples;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sentenial.rest.client.api.common.service.ServiceConfiguration;
import com.sentenial.rest.client.api.paymentschedule.PaymentScheduleService;
import com.sentenial.rest.client.api.paymentschedule.PaymentScheduleServiceDefault;
import com.sentenial.rest.client.api.paymentschedule.dto.CreatePaymentScheduleRequest;
import com.sentenial.rest.client.api.paymentschedule.dto.CreatePaymentScheduleResponse;
import com.sentenial.rest.client.api.paymentschedule.dto.PaymentFrequency;
import com.sentenial.rest.client.api.paymentschedule.dto.PaymentSchedule;
import com.sentenial.rest.client.api.paymentschedule.dto.PaymentScheduleResource;
import com.sentenial.rest.client.api.paymentschedule.dto.PaymentType;
import com.sentenial.rest.client.utils.DateUtils;

public class PaymentSchedulesActions {

	private static final Logger logger = LoggerFactory.getLogger(PaymentSchedulesActions.class);

	private PaymentScheduleService paymentScheduleService;
	
	public PaymentSchedulesActions(ServiceConfiguration serviceConfiguration){
		this.paymentScheduleService = new PaymentScheduleServiceDefault(serviceConfiguration);
	}
	
	public PaymentScheduleResource createPaymentSchedule(String creditorSchemeId, String mandateId){

		CreatePaymentScheduleRequest createPaymentScheduleRequest = 
				new CreatePaymentScheduleRequest()
					.withPaymentSchedule(
							new PaymentSchedule()
								.withPaymentFrequency(PaymentFrequency.DAILY)
								.withPaymentType(PaymentType.FIXED_LENGTH)
								.withStartDate(DateUtils.toDate("2015-11-21"))
								.withNumberOfPayments(2)
								.withPaymentAmount(new BigDecimal("9.90"))
								.withFirstPaymentAmount(new BigDecimal("1.10"))
								.withLastPaymentAmount(new BigDecimal("9.90"))
								.withRemittanceInformation("remittanceInformation")
								.withTwoPaymentsSamePeriod(true));
		
		CreatePaymentScheduleResponse createPaymentScheduleResponse = 
				paymentScheduleService.createPaymentSchedule(creditorSchemeId, mandateId, createPaymentScheduleRequest);
		
		PaymentScheduleResource paymentScheduleResponse = createPaymentScheduleResponse.getData();
		
		logger.info(paymentScheduleResponse.toString());
		
		return createPaymentScheduleResponse.getData();
	}
	
}
