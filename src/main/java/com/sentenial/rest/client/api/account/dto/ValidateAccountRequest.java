package com.sentenial.rest.client.api.account.dto;

import com.fasterxml.jackson.annotation.JsonUnwrapped;

public class ValidateAccountRequest {

	
	@JsonUnwrapped
	private Account account;
	
	
	public ValidateAccountRequest withAccount(Account account) {
		this.account = account;
		return this;
	}
	
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

}
