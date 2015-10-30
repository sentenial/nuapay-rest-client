package com.sentenial.rest.client.api.account;

import com.sentenial.rest.client.api.account.dto.ValidateAccountRequest;
import com.sentenial.rest.client.api.account.dto.ValidateAccountResponse;

public interface AccountsService {

	ValidateAccountResponse validateAccount(ValidateAccountRequest validateAccountRequest);
	
}
