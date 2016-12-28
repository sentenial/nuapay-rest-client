package com.sentenial.rest.client.api.credittransfer;

import com.sentenial.rest.client.api.common.service.AbstractServiceDefault;
import com.sentenial.rest.client.api.common.service.ServiceConfiguration;
import com.sentenial.rest.client.api.credittransfer.dto.CreateCreditTransferRequest;
import com.sentenial.rest.client.api.credittransfer.dto.CreateCreditTransferResponse;
import com.sentenial.rest.client.api.credittransfer.dto.RetrieveCreditTransferResponse;
import com.sentenial.rest.client.utils.JsonUtils;

public class CreditTransferServiceDefault extends AbstractServiceDefault implements CreditTransferService{

	public static final String CREATE_CREDITTRANSFER = "/beneficiaries/%s/credittransfers";
	public static final String RETRIEVE_CREDITTRANSFER = "/beneficiaries/%s/credittransfers/%s";


	public CreditTransferServiceDefault(ServiceConfiguration serviceConfiguration) {
		super(serviceConfiguration);
	}


	@Override
	public CreateCreditTransferResponse createCreditTransfer(String beneficiaryId,
			CreateCreditTransferRequest createCreditTransferRequest) {

		String url = String.format(getApiUri() + CREATE_CREDITTRANSFER, beneficiaryId);
		String payload = JsonUtils.toJson(createCreditTransferRequest);

		return JsonUtils.fromJson(httpClient.post(url, headers(), payload), CreateCreditTransferResponse.class);
	}

	@Override
	public RetrieveCreditTransferResponse retrieveCreditTransfer(String beneficiaryId, String creditTransferId) {

		String url = String.format(getApiUri() + RETRIEVE_CREDITTRANSFER, beneficiaryId, creditTransferId);

		return JsonUtils.fromJson(httpClient.get(url, headers()), RetrieveCreditTransferResponse.class);
	}

}
