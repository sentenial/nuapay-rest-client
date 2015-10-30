package com.sentenial.rest.client.examples;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sentenial.rest.client.api.account.dto.Account;
import com.sentenial.rest.client.api.beneficiaries.dto.BeneficiarySummaryResource;
import com.sentenial.rest.client.api.common.service.ServiceConfiguration;
import com.sentenial.rest.client.api.creditorscheme.dto.CreditorSchemeResource;
import com.sentenial.rest.client.api.directdebit.dto.RevokeAllDirectDebitsResponse.RevokeAllDirectDebitsSummary;
import com.sentenial.rest.client.api.mandate.dto.MandateResource;
import com.sentenial.rest.client.api.mandate.dto.MandateSummaryResource;
import com.sentenial.rest.client.api.paymentschedule.dto.PaymentScheduleResource;

public class RestClientSampleApp {

	private static final Logger logger = LoggerFactory.getLogger(RestClientSampleApp.class);
	

	public final static String DEV_ENVIRONMENT_URL = "http://localhost:8080/origix-rest/api/v1";

	public static void main(String[] args) {
		
		ServiceConfiguration serviceConfiguration = new ServiceConfiguration(DEV_ENVIRONMENT_URL);
		serviceConfiguration.setApiKey("fd9d24268a21dce68cbddb99b96fdc5ec97c1e940b5c2415fe8231e69baec16b");

		//mandateActions(creditorSchemeId, serviceConfiguration);
		
		//filesActions(serviceConfiguration);
		
		//beneficiaryActions(serviceConfiguration);
		
		//accountActions(serviceConfiguration);
		
		//paymentSchedulesActions(serviceConfiguration);
		
		//directDebitActions(serviceConfiguration);
	}
	
	private static String creditorSchemeActions(ServiceConfiguration serviceConfiguration){

		CreditorSchemeActions creditorSchemeActions = new CreditorSchemeActions(serviceConfiguration);
		
		
		List<CreditorSchemeResource> creditorSchemeCollection = creditorSchemeActions.listCreditorSchemes();
		
		String creditorSchemeId = creditorSchemeCollection.get(0).getId();
		
		return creditorSchemeId;
	}
	
	private static void mandateActions(String creditorSchemeId, ServiceConfiguration serviceConfiguration){
		
		MandateActions mandateActions = new MandateActions(serviceConfiguration);

		//MandateResource mandateCreatedResource = mandateActions.createMandate(creditorSchemeId);
		
		List<MandateSummaryResource> mandateSummaryResources = mandateActions.listMandates(creditorSchemeId);
		
		logger.info("mandateSummaryResources: {}", mandateSummaryResources);
		
		if (mandateSummaryResources.size() == 0){
			return;
		}
		
		String mandateId = mandateSummaryResources.get(0).getId();
		
		MandateResource mandateRetrievedResource = mandateActions.retrieveMandate(creditorSchemeId, mandateId);
		logger.info("mandateRetrievedResource: {}", mandateRetrievedResource);
		
		
		byte[] mandateDocument = mandateActions.retrieveMandateDocument(creditorSchemeId, mandateId);
		logger.info("mandateDocument length: {}", mandateDocument.length);
		
		/*
		MandateResource mandateActivatedResource = mandateActions.activateMandate(creditorSchemeId, mandateId);
		logger.info("mandateActivatedResource: {}", mandateActivatedResource);
		
		
		MandateResource mandateCancelledResource = mandateActions.cancelMandate(creditorSchemeId, mandateId);
		logger.info("mandateCancelledResource: {}", mandateCancelledResource);
		*/
	}
	
	private static void beneficiaryActions(ServiceConfiguration serviceConfiguration){
		
		BeneficiariesActions beneficiariesActions = new BeneficiariesActions(serviceConfiguration);
		/*
		BeneficiaryResource beneficiaryResource = beneficiariesActions.createBeneficiary();
		logger.info("beneficiaryResource: {}", beneficiaryResource);
		*/
		//ybo8lg392q
		/*
		BeneficiaryResource retrievedBeneficiaryResource = beneficiariesActions.retrieveBeneficiary("ybo8lg392q");
		logger.info("retrievedBeneficiaryResource: {}", retrievedBeneficiaryResource);
		*/
		List<BeneficiarySummaryResource> beneficiaries = beneficiariesActions.listBeneficiaries();
		logger.info("beneficiaries: {}", beneficiaries);
	}
	
	private static void filesActions(ServiceConfiguration serviceConfiguration){
		
		FilesActions filesActions = new FilesActions(serviceConfiguration);
		
		filesActions.uploadFile();
	}
	
	private static void accountActions(ServiceConfiguration serviceConfiguration){
		
		AccountsActions accountsActions = new AccountsActions(serviceConfiguration);
		
		Account ibanAccountValidation = accountsActions.validateIBAN();
		logger.info("ibanAccountValidation: {}", ibanAccountValidation);
		
		Account domesticAccountValidation = accountsActions.validateDomesticAccount();
		logger.info("domesticAccountValidation: {}", domesticAccountValidation);
	}
	
	private static void paymentSchedulesActions(ServiceConfiguration serviceConfiguration){
		
		PaymentSchedulesActions paymentSchedulesActions = new PaymentSchedulesActions(serviceConfiguration);
		
		PaymentScheduleResource paymentScheduleResource = paymentSchedulesActions.createPaymentSchedule("w24y3daq2p", "ybo8le8j2q");
		logger.info("paymentScheduleResource: {}", paymentScheduleResource);
	}
	
	private static void directDebitActions(ServiceConfiguration serviceConfiguration){
		
		DirectDebitActions directDebitActions = new DirectDebitActions(serviceConfiguration);
/*
		DirectDebitResource createdDirectDebitResource = directDebitActions.createDirectDebit("w24y3daq2p", "ybo8le8j2q");
		logger.info("directDebitResource: {}", createdDirectDebitResource);


		List<DirectDebitResource> directDebits = directDebitActions.listDirectDebits("w24y3daq2p", "ybo8le8j2q");
		logger.info("directDebits: {}", directDebits);

		DirectDebitResource retrievedDirectDebitResource = directDebitActions.retrieveDirectDebit("w24y3daq2p", "ybo8le8j2q", "wmj5xrpj2g");
		logger.info("directDebitResource: {}", retrievedDirectDebitResource);
*/		
		RevokeAllDirectDebitsSummary revokeAllDirectDebitsSummary = directDebitActions.revokeAllDirectDebits("w24y3daq2p", "ybo8le8j2q");
		logger.info("directDebitResource: {}", revokeAllDirectDebitsSummary);
		
		/*
		DirectDebitResource revokedDirectDebitResource = directDebitActions.revokeDirectDebit("w24y3daq2p", "ybo8le8j2q", "wmj5xrpj2g");
		logger.info("directDebitResource: {}", revokedDirectDebitResource);


		DirectDebitResource representedDirectDebitResource = directDebitActions.representDirectDebit("w24y3daq2p", "ybo8le8j2q", "wmj5xrpj2g");
		logger.info("directDebitResource: {}", representedDirectDebitResource);
		*/
	}
}
