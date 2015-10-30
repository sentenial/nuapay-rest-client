package com.sentenial.rest.client.examples;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sentenial.rest.client.api.common.dto.Address;
import com.sentenial.rest.client.api.common.dto.BasicAccount;
import com.sentenial.rest.client.api.common.service.ServiceConfiguration;
import com.sentenial.rest.client.api.mandate.MandateService;
import com.sentenial.rest.client.api.mandate.MandateServiceDefault;
import com.sentenial.rest.client.api.mandate.dto.ActivateMandateRequest;
import com.sentenial.rest.client.api.mandate.dto.ActivateMandateResponse;
import com.sentenial.rest.client.api.mandate.dto.CancelMandateRequest;
import com.sentenial.rest.client.api.mandate.dto.CancelMandateResponse;
import com.sentenial.rest.client.api.mandate.dto.CreateMandateRequest;
import com.sentenial.rest.client.api.mandate.dto.CreateMandateResponse;
import com.sentenial.rest.client.api.mandate.dto.Debtor;
import com.sentenial.rest.client.api.mandate.dto.ElectronicSignatureDetails;
import com.sentenial.rest.client.api.mandate.dto.ListMandatesRequestParameters;
import com.sentenial.rest.client.api.mandate.dto.ListMandatesResponse;
import com.sentenial.rest.client.api.mandate.dto.Mandate;
import com.sentenial.rest.client.api.mandate.dto.MandateInfo;
import com.sentenial.rest.client.api.mandate.dto.MandateResource;
import com.sentenial.rest.client.api.mandate.dto.MandateSummaryResource;
import com.sentenial.rest.client.api.mandate.dto.MandateType;
import com.sentenial.rest.client.api.mandate.dto.ResendMandateForSignature;
import com.sentenial.rest.client.api.mandate.dto.RetrieveMandateResponse;
import com.sentenial.rest.client.api.mandate.dto.UpdateMandateRequest;
import com.sentenial.rest.client.api.mandate.dto.UpdateMandateResponse;
import com.sentenial.rest.client.utils.DateUtils;

public class MandateActions {

	private static final Logger logger = LoggerFactory.getLogger(MandateActions.class);

	private MandateService mandateService;

	public MandateActions(ServiceConfiguration serviceConfiguration){
		this.mandateService = new MandateServiceDefault(serviceConfiguration);
	}

	public MandateResource createMandate(String creditorSchemeId){

		CreateMandateRequest createMandateRequest = 
				new CreateMandateRequest()
				.withMandate(
						new Mandate()
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
								.withLanguage("fr_BE")
								.withEmail("debtor@email.com")
								.withPhoneNumber("0360123123123")
								.withMobileNumber("0360321312312")
								)
						.withMandateInfo(
								new MandateInfo()
								.withMandateId("1234567899")
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
								)
						);

		CreateMandateResponse createMandateResponse = mandateService.createMandate(creditorSchemeId, createMandateRequest);

		MandateResource mandateResource = createMandateResponse.getData();
		logger.info(mandateResource.toString());

		return mandateResource;
	}

	public List<MandateSummaryResource> listMandates(String creditorSchemeId){

		ListMandatesRequestParameters listMandatesRequestParameters = new ListMandatesRequestParameters();
		listMandatesRequestParameters.setPageSize(10);
		listMandatesRequestParameters.setPageNumber(1);

		ListMandatesResponse listMandatesResponse = mandateService.listMandates(creditorSchemeId, listMandatesRequestParameters);
		List<MandateSummaryResource> mandateSummaryList = listMandatesResponse.getData();
		logger.info(mandateSummaryList.toString());

		return mandateSummaryList;
	}

	public MandateResource retrieveMandate(String creditorSchemeId, String mandateId){

		RetrieveMandateResponse retrieveMandateResponse = mandateService.retrieveMandate(creditorSchemeId, mandateId);

		MandateResource mandateResource = retrieveMandateResponse.getData();
		logger.info(mandateResource.toString());

		return mandateResource;
	}

	public byte[] retrieveMandateDocument(String creditorSchemeId, String mandateId){

		byte[] image = mandateService.retrieveMandateDocument(creditorSchemeId, mandateId);

		logger.info("" + image.length);

		return image;
	}

	public MandateResource updateMandate(String creditorSchemeId, String mandateId){

		UpdateMandateRequest updateMandateRequest = 
				new UpdateMandateRequest()
				.withMandate(
						new Mandate()
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
								.withLanguage("fr_BE")
								.withEmail("debtor@email.com")
								.withPhoneNumber("0360123123123")
								.withMobileNumber("0360321312312")
								)
						.withMandateInfo(
								new MandateInfo()
								.withMandateId("1234567899")
								.withContractReference("Contract Reference")
								.withSignatureLocation("Signature Location")
								.withSignatureDate(DateUtils.toDate("2015-07-21"))
								.withMandateType(MandateType.RCUR)
								)
						.withDebtorAccount(
								new BasicAccount()
								.withIban("GB94SELN00999976543215")
								.withBic("SELNGB21")
								)
						.withCreditorAccount(
								new BasicAccount()
								.withIban("GB47SELN00999912345678")
								.withBic("SELNGB21")
								)
						)
				.withResendMandateForSignature(ResendMandateForSignature.DEFAULT);

		UpdateMandateResponse updateMandateResponse = mandateService.updateMandate(creditorSchemeId, mandateId, updateMandateRequest);

		MandateResource mandateResource = updateMandateResponse.getData();
		logger.info(mandateResource.toString());

		return mandateResource;
	}

	public MandateResource cancelMandate(String creditorSchemeId, String mandateId){

		CancelMandateRequest cancelMandateRequest = 
				new CancelMandateRequest().withOperationReason("Reason for cancellation");

		CancelMandateResponse cancelMandateResponse = mandateService.cancelMandate(creditorSchemeId, mandateId, cancelMandateRequest);

		MandateResource mandateResource = cancelMandateResponse.getData();
		logger.info(mandateResource.toString());

		return mandateResource;
	}

	public MandateResource activateMandate(String creditorSchemeId, String mandateId){

		ActivateMandateRequest activateMandateRequest = 
				new ActivateMandateRequest()
				.withSignatureDate(DateUtils.toDate("2015-07-21"))
				.withSignatureLocation("Signature Location")
				.withElectronicSignatureDetails(
						new ElectronicSignatureDetails()
						.withAuthorizationMethod("SMS_PASSWORD")
						.withAuthorizationToken("1234")
						.withAuthorizationEmail("debtor@email.com")
						.withAuthorizationMobileNumber("0360321312312")
						.withIpAddress("192.168.8.1")
						.withGeographicLocation("Geo Location")
						);

		ActivateMandateResponse activateMandateResponse = mandateService.activateMandate(creditorSchemeId, mandateId, activateMandateRequest);

		MandateResource mandateResource = activateMandateResponse.getData();
		logger.info(mandateResource.toString());

		return mandateResource;
	}

}
