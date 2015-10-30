package com.sentenial.rest.client.api.account;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Matchers;
import org.mockito.Mock;

import com.sentenial.rest.client.api.account.AccountsServiceDefault;
import com.sentenial.rest.client.api.account.dto.Account;
import com.sentenial.rest.client.api.account.dto.ValidateAccountRequest;
import com.sentenial.rest.client.api.account.dto.ValidateAccountResponse;
import com.sentenial.rest.client.api.common.service.ServiceConfiguration;
import com.sentenial.rest.client.api.utils.TestUtils;
import com.sentenial.rest.client.http.HttpClient;
import com.sentenial.rest.client.utils.JsonUtils;

public class AccountsTest {

	private static final String MOCK_URL = "http://mock.url";

	private AccountsService accountsService;

	@Mock 
	private HttpClient mockHttpClient;

	@Before
	public void setUp() {
		initMocks(this);
		accountsService = new AccountsServiceDefault(new ServiceConfiguration(MOCK_URL), mockHttpClient);
	}

	@Test
	public void validateAccountResponse(){

		String url = MOCK_URL + AccountsServiceDefault.VALIDATE_ACCOUNT;

		ValidateAccountRequest validateAccountRequest = 
				new ValidateAccountRequest()
					.withAccount(new Account().withIban("BE87723540479194"));
		String payload = JsonUtils.toJson(validateAccountRequest);

		when(mockHttpClient.post(Matchers.eq(url), Matchers.anyMapOf(String.class, String.class), Matchers.eq(payload))).thenReturn(TestUtils.readFromRawResourceFile("/validate_iban.json"));

		ValidateAccountResponse validateAccountResponse = accountsService.validateAccount(validateAccountRequest);

		Account baseAccount = new Account();
		baseAccount.setIban("BE87723540479194");
		baseAccount.setDomesticAccountNumber("5404791");
		baseAccount.setAccountCountry("BE");
		baseAccount.setDomesticBankCode("723");
		baseAccount.setDomesticBranchCode("");
		baseAccount.setDomesticCheckSum("94");
		baseAccount.setBic("ABNABEBR");

		Account receivedAccount = validateAccountResponse.getData().getWrapped();

		assertEquals(receivedAccount, baseAccount);
	}

}
