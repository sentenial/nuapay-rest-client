package com.sentenial.rest.client.api.beneficiaries;

import com.sentenial.rest.client.api.beneficiaries.dto.CreateBeneficiaryRequest;
import com.sentenial.rest.client.api.beneficiaries.dto.CreateBeneficiaryResponse;
import com.sentenial.rest.client.api.beneficiaries.dto.ListBeneficiariesRequestParameters;
import com.sentenial.rest.client.api.beneficiaries.dto.ListBeneficiariesResponse;
import com.sentenial.rest.client.api.beneficiaries.dto.RetrieveBeneficiaryResponse;
import com.sentenial.rest.client.api.common.service.AbstractServiceDefault;
import com.sentenial.rest.client.api.common.service.ServiceConfiguration;
import com.sentenial.rest.client.utils.JsonUtils;

public class BeneficiariesServiceDefault extends AbstractServiceDefault implements BeneficiariesService {


	public static final String CREATE_BENEFICIARY = "/beneficiaries";
	public static final String RETRIEVE_BENEFICIARY = "/beneficiaries/%s";
	public static final String LIST_BENEFICIARIES = "/beneficiaries";


	public BeneficiariesServiceDefault(ServiceConfiguration serviceConfiguration) {
		super(serviceConfiguration);
	}

	@Override
	public CreateBeneficiaryResponse createBeneficiary(CreateBeneficiaryRequest createBeneficiaryRequest) {

		String url = getApiUri() + CREATE_BENEFICIARY;
		String payload = JsonUtils.toJson(createBeneficiaryRequest);

		return JsonUtils.fromJson(httpClient.post(url, headers(), payload), CreateBeneficiaryResponse.class);
	}

	@Override
	public RetrieveBeneficiaryResponse retrieveBeneficiary(String beneficiaryId) {

		String url = String.format(getApiUri() + RETRIEVE_BENEFICIARY, beneficiaryId);

		return JsonUtils.fromJson(httpClient.get(url, headers()), RetrieveBeneficiaryResponse.class);
	}

	@Override
	public ListBeneficiariesResponse listBeneficiaries(ListBeneficiariesRequestParameters listBeneficiariesRequestParameters) {

		String url = getApiUri() + LIST_BENEFICIARIES + listBeneficiariesRequestParameters.generateRequestParamsString();

		return JsonUtils.fromJson(httpClient.get(url, headers()), ListBeneficiariesResponse.class);
	}

}
