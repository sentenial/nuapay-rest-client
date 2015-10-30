package com.sentenial.rest.client.api.account;

import com.sentenial.rest.client.api.account.dto.ValidateAccountRequest;
import com.sentenial.rest.client.api.account.dto.ValidateAccountResponse;
import com.sentenial.rest.client.api.common.service.AbstractServiceDefault;
import com.sentenial.rest.client.api.common.service.ServiceConfiguration;
import com.sentenial.rest.client.http.HttpClient;
import com.sentenial.rest.client.utils.JsonUtils;

public class AccountsServiceDefault extends AbstractServiceDefault implements AccountsService{

	public static final String VALIDATE_ACCOUNT = "/iban/validate";

	public AccountsServiceDefault(ServiceConfiguration serviceConfiguration) {
		super(serviceConfiguration);
	}

	public AccountsServiceDefault(ServiceConfiguration serviceConfiguration, HttpClient httpClient) {
		super(serviceConfiguration, httpClient);
	}

	@Override
	public ValidateAccountResponse validateAccount(ValidateAccountRequest validateAccountRequest) {
		String url = getApiUri() + VALIDATE_ACCOUNT;
		String payload = JsonUtils.toJson(validateAccountRequest);

		return JsonUtils.fromJson(httpClient.post(url, headers(), payload), ValidateAccountResponse.class);
	}

}
