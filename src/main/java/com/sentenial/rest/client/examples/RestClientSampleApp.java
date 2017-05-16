package com.sentenial.rest.client.examples;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sentenial.rest.client.api.account.dto.Account;
import com.sentenial.rest.client.api.beneficiaries.dto.BeneficiaryResource;
import com.sentenial.rest.client.api.common.dto.Address;
import com.sentenial.rest.client.api.common.dto.BasicAccount;
import com.sentenial.rest.client.api.common.dto.CommunicationLanguage;
import com.sentenial.rest.client.api.common.service.ServiceConfiguration;
import com.sentenial.rest.client.api.creditorscheme.dto.CreditorSchemeConfigResource;
import com.sentenial.rest.client.api.creditorscheme.dto.CreditorSchemeResource;
import com.sentenial.rest.client.api.credittransfer.dto.CreditTransferResource;
import com.sentenial.rest.client.api.directdebit.dto.RevokeAllDirectDebitsResponse.RevokeAllDirectDebitsSummary;
import com.sentenial.rest.client.api.mandate.dto.Debtor;
import com.sentenial.rest.client.api.mandate.dto.Mandate;
import com.sentenial.rest.client.api.mandate.dto.MandateInfo;
import com.sentenial.rest.client.api.mandate.dto.MandateResource;
import com.sentenial.rest.client.api.mandate.dto.MandateSummaryResource;
import com.sentenial.rest.client.api.mandate.dto.MandateType;
import com.sentenial.rest.client.api.paymentschedule.dto.PaymentScheduleResource;
import com.sentenial.rest.client.utils.DateUtils;

public class RestClientSampleApp {

	private static final Logger logger = LoggerFactory.getLogger(RestClientSampleApp.class);
	
	public static void main(String[] args) {
		
		ServiceConfiguration serviceConfiguration = new ServiceConfiguration(false);
		//serviceConfiguration.setApiKey("fd9d24268a21dce68cbddb99b96fdc5ec97c1e940b5c2415fe8231e69baec16b");
		serviceConfiguration.setApiKey("fa8ec107b7588cd3bf79c55017021d16d8c6ebede7ffd3a414024527c552bf5f");

		//creditorSchemeActions(serviceConfiguration);
		
		//mandateActions(creditorSchemeId, serviceConfiguration);
		
		//filesActions(serviceConfiguration);
		
		//beneficiaryActions(serviceConfiguration);
		
		//accountActions(serviceConfiguration);
		
		//paymentSchedulesActions(serviceConfiguration);
		
		//directDebitActions(serviceConfiguration);
		
		//creditTransferActions(serviceConfiguration);
	}
	
	private static String creditorSchemeActions(ServiceConfiguration serviceConfiguration){

		CreditorSchemeActions creditorSchemeActions = new CreditorSchemeActions(serviceConfiguration);
		
		
		List<CreditorSchemeResource> creditorSchemeCollection = creditorSchemeActions.listCreditorSchemes();
		
		String creditorSchemeId = creditorSchemeCollection.get(0).getId();
		
		CreditorSchemeConfigResource creditorSchemeConfigResource = creditorSchemeActions.retrieveCreditorSchemeConfig(creditorSchemeId);
		
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
		
		BeneficiaryResource createdBeneficiaryResource = beneficiariesActions.createBeneficiary();
		logger.info("createdBeneficiaryResource: {}", createdBeneficiaryResource);
		
		BeneficiaryResource retrievedBeneficiaryResource = beneficiariesActions.retrieveBeneficiary(createdBeneficiaryResource.getId());
		logger.info("retrievedBeneficiaryResource: {}", retrievedBeneficiaryResource);
		
		List<BeneficiaryResource> beneficiaries = beneficiariesActions.listBeneficiaries();
		logger.info("listed beneficiaries: {}", beneficiaries);
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
		
		String creditorSchemeId = "abxq98zk2l";
		String mandateId = "8b5g5nly2r";
		
		PaymentSchedulesActions paymentSchedulesActions = new PaymentSchedulesActions(serviceConfiguration);
	
		PaymentScheduleResource createdPaymentScheduleResource = paymentSchedulesActions.createPaymentSchedule(creditorSchemeId, mandateId);
		logger.info("Created paymentScheduleResource: {}", createdPaymentScheduleResource);
		
		//Mandate mandate = generateMandate();
		//PaymentScheduleAndMandateResource createdPaymentScheduleAndMandateResource = paymentSchedulesActions.createPaymentScheduleAndMandate(creditorSchemeId, mandate);
		//logger.info("Created paymentScheduleAndMandateResource: {}", createdPaymentScheduleAndMandateResource);

		List<PaymentScheduleResource> paymentSchedules = paymentSchedulesActions.listPaymentSchedules();
		logger.info("Listed paymentSchedules: {}", paymentSchedules);
		
		PaymentScheduleResource canceledPaymentScheduleResource = 
				paymentSchedulesActions.cancelPaymentSchedule(creditorSchemeId, mandateId, createdPaymentScheduleResource.getId());
		logger.info("Canceled paymentScheduleResource: {}", createdPaymentScheduleResource);
	}
	
	private static void directDebitActions(ServiceConfiguration serviceConfiguration){
		
		DirectDebitActions directDebitActions = new DirectDebitActions(serviceConfiguration);
/*
		DirectDebitResource createdDirectDebitResource = directDebitActions.createDirectDebit("w24y3daq2p", "ybo8le8j2q");
		logger.info("directDebitResource: {}", createdDirectDebitResource);

		//Mandate mandate = generateMandate();
		//DirectDebitAndMandateResource createdDirectDebitAndMandateResource = directDebitActions.createDirectDebitAndMandate("abxq98zk2l", mandate);
		//logger.info("directDebitAndMandateResource: {}", createdDirectDebitAndMandateResource);

		List<DirectDebitResource> directDebits = directDebitActions.listDirectDebits("abxq98zk2l");//, "e27kjpw4bd");
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
	
	private static void creditTransferActions(ServiceConfiguration serviceConfiguration){

		String beneficiaryId = "abxq93552l";
		
		CreditTransferActions creditTransferActions = new CreditTransferActions(serviceConfiguration);

		CreditTransferResource createdCreditTransferResource = 
				creditTransferActions.createCreditTransfer(beneficiaryId);
		logger.info("createdCreditTransferResource: {}", createdCreditTransferResource);
		
		CreditTransferResource retrievedCreditTransferResource = 
				creditTransferActions.retrieveCreditTransfer(beneficiaryId, createdCreditTransferResource.getId());
		logger.info("retrievedCreditTransferResource: {}", retrievedCreditTransferResource);
	}


	private static Mandate generateMandate() {
		
		String mandateId = Long.toString(System.currentTimeMillis());

		Mandate mandate = new Mandate()
				.withDebtor(
					new Debtor()
					.withName("Debtor Name")
					.withAddress(
							new Address()
							.withLine1("Debtor Address Line1")
							.withLine2("Debtor Address Line2")
							.withTown("Debtor Town")
							.withPostCode("123123")
							.withState("Debtor State")
							.withCountry("IE")
							)
					.withLanguage(CommunicationLanguage.fr_BE)
					.withEmail("debtor@email.com")
					.withPhoneNumber("0360123123123")
					.withMobileNumber("0360321312312")
					)
				.withMandateInfo(
					new MandateInfo()
					.withMandateId(mandateId)
					.withContractReference("Contract Reference")
					.withSignatureLocation("Signature Location")
					.withSignatureDate(DateUtils.toDate("2015-07-21"))
					.withMandateType(MandateType.RCUR)
					)
				.withDebtorAccount(
					new BasicAccount()
					.withIban("GB94SELN00999976543215")
					)
				.withCreditorAccount(
					new BasicAccount()
					.withIban("GB47SELN00999912345678")
					);
		
		return mandate;

	}
	
}
