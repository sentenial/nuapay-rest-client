package com.sentenial.rest.client.examples;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sentenial.rest.client.api.beneficiaries.BeneficiariesService;
import com.sentenial.rest.client.api.beneficiaries.BeneficiariesServiceDefault;
import com.sentenial.rest.client.api.beneficiaries.dto.Beneficiary;
import com.sentenial.rest.client.api.beneficiaries.dto.BeneficiaryDetails;
import com.sentenial.rest.client.api.beneficiaries.dto.BeneficiaryResource;
import com.sentenial.rest.client.api.beneficiaries.dto.BeneficiarySummaryResource;
import com.sentenial.rest.client.api.beneficiaries.dto.CreateBeneficiaryRequest;
import com.sentenial.rest.client.api.beneficiaries.dto.CreateBeneficiaryResponse;
import com.sentenial.rest.client.api.beneficiaries.dto.ListBeneficiariesRequestParameters;
import com.sentenial.rest.client.api.beneficiaries.dto.ListBeneficiariesResponse;
import com.sentenial.rest.client.api.beneficiaries.dto.RetrieveBeneficiaryResponse;
import com.sentenial.rest.client.api.common.dto.Address;
import com.sentenial.rest.client.api.common.dto.BasicAccount;
import com.sentenial.rest.client.api.common.dto.CommunicationLanguage;
import com.sentenial.rest.client.api.common.service.ServiceConfiguration;

public class BeneficiariesActions {

	private static final Logger logger = LoggerFactory.getLogger(BeneficiariesActions.class);

	private BeneficiariesService beneficiariesService;
	
	public BeneficiariesActions(ServiceConfiguration serviceConfiguration){
		this.beneficiariesService = new BeneficiariesServiceDefault(serviceConfiguration);
	}
	
	public BeneficiaryResource createBeneficiary(){

		CreateBeneficiaryRequest createBeneficiaryRequest = 
				new CreateBeneficiaryRequest()
					.withBeneficiary(
							new Beneficiary()
								.withBeneficiary(
										new BeneficiaryDetails()
											.withName("Beneficiary Name")
											.withAddress(new Address()
													.withLine1("Beneficiary Address Line1")
													.withLine2("Beneficiary Address Line2")
													.withTown("Beneficiary Town")
													.withPostCode("123123")
													.withState("Beneficiary State")
													.withCountry("IE"))
											.withLanguage(CommunicationLanguage.en)
											.withEmail("beneficiary@mail.com")
											.withPhoneNumber("0360123123123")
											.withMobileNumber("0360321321321")
											.withDescriptionOfPurpose("Description of Purpose"))
								.withBeneficiaryAccount(
										new BasicAccount()
											.withIban("BE03123123456784")
											.withBic("SELNGB21"))
								);

		CreateBeneficiaryResponse createBeneficiaryResponse = beneficiariesService.createBeneficiary(createBeneficiaryRequest);
		
		BeneficiaryResource beneficiaryResource = createBeneficiaryResponse.getData();
		logger.info(beneficiaryResource.toString());
		
		return beneficiaryResource;
	}
	
	public List<BeneficiarySummaryResource> listBeneficiaries(){
		
		ListBeneficiariesRequestParameters listBeneficiariesRequestParameters = 
				new ListBeneficiariesRequestParameters();
		listBeneficiariesRequestParameters.setBeneficiaryIban("BE13734136084339");
		
		ListBeneficiariesResponse listBeneficiariesResponse = 
				beneficiariesService.listBeneficiaries(listBeneficiariesRequestParameters);
		List<BeneficiarySummaryResource> beneficiaryList = listBeneficiariesResponse.getData();
		logger.info(beneficiaryList.toString());
		
		return beneficiaryList;
	}
	
	public BeneficiaryResource retrieveBeneficiary(String beneficiaryId){

		RetrieveBeneficiaryResponse retrieveBeneficiaryResponse = beneficiariesService.retrieveBeneficiary(beneficiaryId);
		
		BeneficiaryResource beneficiaryResource = retrieveBeneficiaryResponse.getData();
		logger.info(beneficiaryResource.toString());
		
		return beneficiaryResource;
	}
	
}
