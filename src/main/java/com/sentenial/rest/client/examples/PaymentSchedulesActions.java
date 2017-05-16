package com.sentenial.rest.client.examples;

import java.math.BigDecimal;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sentenial.rest.client.api.common.service.ServiceConfiguration;
import com.sentenial.rest.client.api.mandate.dto.Mandate;
import com.sentenial.rest.client.api.paymentschedule.PaymentScheduleService;
import com.sentenial.rest.client.api.paymentschedule.PaymentScheduleServiceDefault;
import com.sentenial.rest.client.api.paymentschedule.dto.CancelPaymentScheduleRequest;
import com.sentenial.rest.client.api.paymentschedule.dto.CancelPaymentScheduleResponse;
import com.sentenial.rest.client.api.paymentschedule.dto.CreatePaymentScheduleAndMandateRequest;
import com.sentenial.rest.client.api.paymentschedule.dto.CreatePaymentScheduleAndMandateResponse;
import com.sentenial.rest.client.api.paymentschedule.dto.CreatePaymentScheduleRequest;
import com.sentenial.rest.client.api.paymentschedule.dto.CreatePaymentScheduleResponse;
import com.sentenial.rest.client.api.paymentschedule.dto.ListPaymentScheduleRequestParameters;
import com.sentenial.rest.client.api.paymentschedule.dto.ListPaymentScheduleResponse;
import com.sentenial.rest.client.api.paymentschedule.dto.PaymentFrequency;
import com.sentenial.rest.client.api.paymentschedule.dto.PaymentSchedule;
import com.sentenial.rest.client.api.paymentschedule.dto.PaymentScheduleAndMandateResource;
import com.sentenial.rest.client.api.paymentschedule.dto.PaymentScheduleResource;
import com.sentenial.rest.client.api.paymentschedule.dto.PaymentScheduleStatus;
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
								.withStartDate(DateUtils.toDate("2017-06-23"))
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
	
	
	public PaymentScheduleAndMandateResource createPaymentScheduleAndMandate(String creditorSchemeId, Mandate mandate){

		CreatePaymentScheduleAndMandateRequest createPaymentScheduleAndMandateRequest = 
				new CreatePaymentScheduleAndMandateRequest().withMandate(mandate);
		createPaymentScheduleAndMandateRequest.withPaymentSchedule(
			new PaymentSchedule()
				.withPaymentFrequency(PaymentFrequency.DAILY)
				.withPaymentType(PaymentType.FIXED_LENGTH)
				.withStartDate(DateUtils.toDate("2017-06-23"))
				.withNumberOfPayments(2)
				.withPaymentAmount(new BigDecimal("9.90"))
				.withFirstPaymentAmount(new BigDecimal("1.10"))
				.withLastPaymentAmount(new BigDecimal("9.90"))
				.withRemittanceInformation("remittanceInformation")
				.withTwoPaymentsSamePeriod(true));
		
		CreatePaymentScheduleAndMandateResponse createPaymentScheduleAndMandateResponse = 
				paymentScheduleService.createPaymentScheduleAndMandate(creditorSchemeId, createPaymentScheduleAndMandateRequest);
		
		PaymentScheduleAndMandateResource paymentScheduleAndMandateResponse = createPaymentScheduleAndMandateResponse.getData();
		
		logger.info(paymentScheduleAndMandateResponse.toString());
		
		return createPaymentScheduleAndMandateResponse.getData();
	}
	
	public List<PaymentScheduleResource> listPaymentSchedules(String creditorSchemeId, String mandateId){

		ListPaymentScheduleRequestParameters listPaymentScheduleRequestParameters = 
				new ListPaymentScheduleRequestParameters().withPaymentStatus(PaymentScheduleStatus.ACTIVE);
		
		ListPaymentScheduleResponse listPaymentSchedulesResponse = 
				paymentScheduleService.listPaymentSchedules(creditorSchemeId, mandateId, listPaymentScheduleRequestParameters);
		
		List<PaymentScheduleResource> paymentScheduleResourcesList = listPaymentSchedulesResponse.getData();
		logger.info(paymentScheduleResourcesList.toString());
		
		return paymentScheduleResourcesList;
	}
	
	public List<PaymentScheduleResource> listPaymentSchedules(String creditorSchemeId){

		ListPaymentScheduleRequestParameters listPaymentScheduleRequestParameters = 
				new ListPaymentScheduleRequestParameters().withPaymentStatus(PaymentScheduleStatus.ACTIVE);
		
		ListPaymentScheduleResponse listPaymentSchedulesResponse = 
				paymentScheduleService.listPaymentSchedules(creditorSchemeId, listPaymentScheduleRequestParameters);
		
		List<PaymentScheduleResource> paymentScheduleResourcesList = listPaymentSchedulesResponse.getData();
		logger.info(paymentScheduleResourcesList.toString());
		
		return paymentScheduleResourcesList;
	}
	
	public List<PaymentScheduleResource> listPaymentSchedules(){

		ListPaymentScheduleRequestParameters listPaymentScheduleRequestParameters = 
				new ListPaymentScheduleRequestParameters().withPaymentStatus(PaymentScheduleStatus.ACTIVE);
		
		ListPaymentScheduleResponse listPaymentSchedulesResponse = 
				paymentScheduleService.listPaymentSchedules(listPaymentScheduleRequestParameters);
		
		List<PaymentScheduleResource> paymentScheduleResourcesList = listPaymentSchedulesResponse.getData();
		logger.info(paymentScheduleResourcesList.toString());
		
		return paymentScheduleResourcesList;
	}

	public PaymentScheduleResource cancelPaymentSchedule(String creditorSchemeId, String mandateId, String paymentScheduleId){

		CancelPaymentScheduleRequest cancelPaymentScheduleRequest = 
				new CancelPaymentScheduleRequest()
					.withOperationReason("Reason for cancel");
		
		CancelPaymentScheduleResponse cancelPaymentScheduleResponse = 
				paymentScheduleService
					.cancelPaymentSchedule(creditorSchemeId, mandateId, paymentScheduleId, cancelPaymentScheduleRequest);
		
		PaymentScheduleResource paymentScheduleResponse = cancelPaymentScheduleResponse.getData();
		
		logger.info(paymentScheduleResponse.toString());
		
		return cancelPaymentScheduleResponse.getData();
	}
	
}
