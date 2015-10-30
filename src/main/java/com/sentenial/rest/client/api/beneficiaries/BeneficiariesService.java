package com.sentenial.rest.client.api.beneficiaries;

import com.sentenial.rest.client.api.beneficiaries.dto.CreateBeneficiaryRequest;
import com.sentenial.rest.client.api.beneficiaries.dto.CreateBeneficiaryResponse;
import com.sentenial.rest.client.api.beneficiaries.dto.ListBeneficiariesRequestParameters;
import com.sentenial.rest.client.api.beneficiaries.dto.ListBeneficiariesResponse;
import com.sentenial.rest.client.api.beneficiaries.dto.RetrieveBeneficiaryResponse;

public interface BeneficiariesService {

	CreateBeneficiaryResponse createBeneficiary(CreateBeneficiaryRequest createBeneficiaryRequest);
	
	RetrieveBeneficiaryResponse retrieveBeneficiary(String beneficiaryId);
	
	ListBeneficiariesResponse listBeneficiaries(ListBeneficiariesRequestParameters listBeneficiariesRequestParameters);
	
}
