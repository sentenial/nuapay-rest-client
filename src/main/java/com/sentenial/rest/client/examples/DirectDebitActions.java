package com.sentenial.rest.client.examples;

import java.math.BigDecimal;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sentenial.rest.client.api.common.service.ServiceConfiguration;
import com.sentenial.rest.client.api.directdebit.DirectDebitService;
import com.sentenial.rest.client.api.directdebit.DirectDebitServiceDefault;
import com.sentenial.rest.client.api.directdebit.dto.CreateDirectDebitRequest;
import com.sentenial.rest.client.api.directdebit.dto.CreateDirectDebitResponse;
import com.sentenial.rest.client.api.directdebit.dto.DirectDebitResource;
import com.sentenial.rest.client.api.directdebit.dto.FailedDirectDebitResource;
import com.sentenial.rest.client.api.directdebit.dto.ListDirectDebitRequestParameters;
import com.sentenial.rest.client.api.directdebit.dto.ListDirectDebitResponse;
import com.sentenial.rest.client.api.directdebit.dto.ListFailedDirectDebitRequestParameters;
import com.sentenial.rest.client.api.directdebit.dto.ListFailedDirectDebitResponse;
import com.sentenial.rest.client.api.directdebit.dto.RepresentDirectDebitRequest;
import com.sentenial.rest.client.api.directdebit.dto.RepresentDirectDebitResponse;
import com.sentenial.rest.client.api.directdebit.dto.RetrieveDirectDebitResponse;
import com.sentenial.rest.client.api.directdebit.dto.RevokeAllDirectDebitsRequest;
import com.sentenial.rest.client.api.directdebit.dto.RevokeAllDirectDebitsResponse;
import com.sentenial.rest.client.api.directdebit.dto.RevokeAllDirectDebitsResponse.RevokeAllDirectDebitsSummary;
import com.sentenial.rest.client.api.directdebit.dto.RevokeDirectDebitRequest;
import com.sentenial.rest.client.api.directdebit.dto.RevokeDirectDebitResponse;
import com.sentenial.rest.client.utils.DateUtils;

public class DirectDebitActions {

	private static final Logger logger = LoggerFactory.getLogger(DirectDebitActions.class);

	private DirectDebitService directDebitService;
	
	public DirectDebitActions(ServiceConfiguration serviceConfiguration){
		this.directDebitService = new DirectDebitServiceDefault(serviceConfiguration);
	}
	
	public DirectDebitResource createDirectDebit(String creditorSchemeId, String mandateId){

		CreateDirectDebitRequest createDirectDebitRequest = 
				new CreateDirectDebitRequest()
					.withRequestedCollectionDate(DateUtils.toDate("2015-10-30"))
					.withPaymentAmount(new BigDecimal("5000.01"))
					.withEndToEndId("5234567876543234567")
					.withRemittanceInformation("Remittance Information");
		
		CreateDirectDebitResponse createDirectDebitResponse = 
				directDebitService.createDirectDebit(creditorSchemeId, mandateId, createDirectDebitRequest);
		
		DirectDebitResource directDebitResource = createDirectDebitResponse.getData();
		logger.info(directDebitResource.toString());

		return directDebitResource;
	}
	
	public DirectDebitResource retrieveDirectDebit(String creditorSchemeId, String mandateId, String directDebitId){

		RetrieveDirectDebitResponse retrieveDirectDebitResponse = 
				directDebitService.retrieveDirectDebit(creditorSchemeId, mandateId, directDebitId);
		
		DirectDebitResource directDebitResource = retrieveDirectDebitResponse.getData();		
		logger.info(directDebitResource.toString());

		return directDebitResource;
	}
	
	public List<DirectDebitResource> listDirectDebits(String creditorSchemeId, String mandateId){

		ListDirectDebitRequestParameters listDDRequestParameters = 
				new ListDirectDebitRequestParameters()
				.withActualCollectionDateFrom(DateUtils.toDate("2015-07-29"))
				.withActualCollectionDateTo(DateUtils.toDate("2015-10-01"));
		
		ListDirectDebitResponse listDirectDebitResponse = 
				directDebitService.listDirectDebits(creditorSchemeId, mandateId, listDDRequestParameters);
		
		List<DirectDebitResource> directDebitResourcesList = listDirectDebitResponse.getData();
		logger.info(directDebitResourcesList.toString());
		
		return directDebitResourcesList;
	}
	
	public List<DirectDebitResource> listDirectDebits(String creditorSchemeId){

		ListDirectDebitRequestParameters listDDRequestParameters = 
				new ListDirectDebitRequestParameters()
				.withActualCollectionDateFrom(DateUtils.toDate("2015-07-29"))
				.withActualCollectionDateTo(DateUtils.toDate("2015-10-01"));
		listDDRequestParameters.setPageNumber(1);
		listDDRequestParameters.setPageSize(10);
		
		ListDirectDebitResponse listDirectDebitResponse = 
				directDebitService.listDirectDebits(creditorSchemeId, listDDRequestParameters);
		
		List<DirectDebitResource> directDebitResourcesList = listDirectDebitResponse.getData();
		logger.info(directDebitResourcesList.toString());
		
		return directDebitResourcesList;
	}
	
	public List<DirectDebitResource> listDirectDebits(){

		ListDirectDebitRequestParameters listDirectDebitRequestParameters = new ListDirectDebitRequestParameters();

		ListDirectDebitResponse listDirectDebitResponse = 
				directDebitService.listDirectDebits(listDirectDebitRequestParameters);
		
		List<DirectDebitResource> directDebitResourcesList = listDirectDebitResponse.getData();
		logger.info(directDebitResourcesList.toString());
		
		return directDebitResourcesList;
	}

	public List<FailedDirectDebitResource> listFailedDirectDebits(String creditorSchemeId, String mandateId){

		ListFailedDirectDebitRequestParameters listFailedDDRequestParameters = 
				new ListFailedDirectDebitRequestParameters()
					.withRejectCreateFrom(DateUtils.toDate("2010-01-01"))
					.withRejectCreateTo(DateUtils.toDate("2020-01-01"))
					.withTechnicalRejects(false);
		
		ListFailedDirectDebitResponse listFailedDirectDebitResponse = 
				directDebitService.listFailedDirectDebits(listFailedDDRequestParameters);
		
		List<FailedDirectDebitResource> directDebitResourcesList = listFailedDirectDebitResponse.getData();
		logger.info(directDebitResourcesList.toString());
		
		return directDebitResourcesList;
	}
	
	public DirectDebitResource revokeDirectDebit(String creditorSchemeId, String mandateId, String directDebitId){
		
		RevokeDirectDebitRequest revokeDirectDebitRequest = 
				new RevokeDirectDebitRequest().withOperationReason("Reason for revoke");
		
		RevokeDirectDebitResponse revokeDirectDebitResponse = 
				directDebitService.revokeDirectDebit(creditorSchemeId, mandateId, directDebitId, revokeDirectDebitRequest);
		
		DirectDebitResource directDebitResource = revokeDirectDebitResponse.getData();
		logger.info(directDebitResource.toString());
		
		return directDebitResource;
	}
	
	public RevokeAllDirectDebitsSummary revokeAllDirectDebits(String creditorSchemeId, String mandateId){
		
		RevokeAllDirectDebitsRequest revokeDirectDebitRequest = 
				new RevokeAllDirectDebitsRequest().withOperationReason("Reason for revoke all");
		
		RevokeAllDirectDebitsResponse revokeAllDirectDebitsResponse = 
				directDebitService.revokeAllDirectDebits(creditorSchemeId, mandateId, revokeDirectDebitRequest);
		
		RevokeAllDirectDebitsSummary revokeAllDirectDebitsSummary = revokeAllDirectDebitsResponse.getData();
		logger.info(revokeAllDirectDebitsSummary.toString());
		
		return revokeAllDirectDebitsSummary;
	}
	
	public DirectDebitResource representDirectDebit(String creditorSchemeId, String mandateId, String directDebitId){
		
		RepresentDirectDebitRequest representDirectDebitRequest = 
				new RepresentDirectDebitRequest()
					//.withRepresentationDate(null)
					//.withRepresentationFee(null)
					.withEndToEndId("9234567876543234567");
		
		RepresentDirectDebitResponse representDirectDebitResponse = 
				directDebitService.representDirectDebit(creditorSchemeId, mandateId, directDebitId, representDirectDebitRequest);
		
		DirectDebitResource directDebitResource = representDirectDebitResponse.getData();
		logger.info(directDebitResource.toString());
		
		return directDebitResource;
	}
}
