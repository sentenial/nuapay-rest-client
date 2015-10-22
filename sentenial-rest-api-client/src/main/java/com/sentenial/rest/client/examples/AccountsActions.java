package com.sentenial.rest.client.examples;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sentenial.rest.client.api.account.AccountsService;
import com.sentenial.rest.client.api.account.AccountsServiceDefault;
import com.sentenial.rest.client.api.account.dto.Account;
import com.sentenial.rest.client.api.account.dto.ValidateAccountRequest;
import com.sentenial.rest.client.api.account.dto.ValidateAccountResponse;
import com.sentenial.rest.client.api.common.service.ServiceConfiguration;

public class AccountsActions {
	
	private static final Logger logger = LoggerFactory.getLogger(AccountsActions.class);

	private AccountsService accountsService;
	
	public AccountsActions(ServiceConfiguration serviceConfiguration){
		this.accountsService = new AccountsServiceDefault(serviceConfiguration);
	}
	
	public Account validateDomesticAccount(){
		
		ValidateAccountRequest validateAccountRequest = 
				new ValidateAccountRequest()
					.withAccount(
							new Account()
								.withAccountCountry("BE")
								.withDomesticBankCode("734")
								.withDomesticAccountNumber("1360843")
								.withDomesticCheckSum("39"));
		
		ValidateAccountResponse validateAccountResponse = accountsService.validateAccount(validateAccountRequest);

		logger.info(validateAccountResponse.toString());
		
		return validateAccountResponse.getData().getWrapped();
	}
	
	public Account validateIBAN(){
		
		ValidateAccountRequest validateAccountRequest = 
				new ValidateAccountRequest()
					.withAccount(new Account().withIban("BE87723540479194"));
		
		ValidateAccountResponse validateAccountResponse = 
				accountsService.validateAccount(validateAccountRequest);

		logger.info(validateAccountResponse.toString());
		
		return validateAccountResponse.getData().getWrapped();
	}
	
}
