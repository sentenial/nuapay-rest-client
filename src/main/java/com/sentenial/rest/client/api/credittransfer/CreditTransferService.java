package com.sentenial.rest.client.api.credittransfer;

import com.sentenial.rest.client.api.credittransfer.dto.CreateCreditTransferRequest;
import com.sentenial.rest.client.api.credittransfer.dto.CreateCreditTransferResponse;
import com.sentenial.rest.client.api.credittransfer.dto.RetrieveCreditTransferResponse;

public interface CreditTransferService {

	CreateCreditTransferResponse createCreditTransfer(
			String beneficiaryId, CreateCreditTransferRequest createDirectDebitRequest);
	
	RetrieveCreditTransferResponse retrieveCreditTransfer(
			String beneficiaryId, String creditTransferId);
	
}
