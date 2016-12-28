package com.sentenial.rest.client.examples;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sentenial.rest.client.api.common.service.ServiceConfiguration;
import com.sentenial.rest.client.api.credittransfer.CreditTransferService;
import com.sentenial.rest.client.api.credittransfer.CreditTransferServiceDefault;
import com.sentenial.rest.client.api.credittransfer.dto.CreateCreditTransferRequest;
import com.sentenial.rest.client.api.credittransfer.dto.CreateCreditTransferResponse;
import com.sentenial.rest.client.api.credittransfer.dto.CreditTransferResource;
import com.sentenial.rest.client.api.credittransfer.dto.RetrieveCreditTransferResponse;
import com.sentenial.rest.client.utils.DateUtils;

public class CreditTransferActions {

	private static final Logger logger = LoggerFactory.getLogger(CreditTransferActions.class);

	private CreditTransferService creditTransferService;
	
	public CreditTransferActions(ServiceConfiguration serviceConfiguration){
		this.creditTransferService = new CreditTransferServiceDefault(serviceConfiguration);
	}
	

	public CreditTransferResource createCreditTransfer(String beneficiaryId){

		CreateCreditTransferRequest createCreditTransferRequest = 
				new CreateCreditTransferRequest()
					.withOriginatorIban("GB51RCWB00999901159383")
					.withRequestedExecutionDate(DateUtils.toDate("2017-01-04"))
					.withPaymentAmount(new BigDecimal("5000.01"))
					.withPaymentCurrency("EUR")
					.withEndToEndId("5234567876543234567")
					.withRemittanceInformation("Remittance Information");
		
		CreateCreditTransferResponse createCreditTransferResponse = 
				creditTransferService.createCreditTransfer(beneficiaryId, createCreditTransferRequest);
		
		CreditTransferResource creditTransferResource = createCreditTransferResponse.getData();
		logger.info(creditTransferResource.toString());

		return creditTransferResource;
	}
	
	public CreditTransferResource retrieveCreditTransfer(String beneficiaryId, String creditTransferId){

		RetrieveCreditTransferResponse retrieveCreditTransferResponse = 
				creditTransferService.retrieveCreditTransfer(beneficiaryId, creditTransferId);
		
		CreditTransferResource creditTransferResource = retrieveCreditTransferResponse.getData();		
		logger.info(creditTransferResource.toString());

		return creditTransferResource;
	}
	
}
