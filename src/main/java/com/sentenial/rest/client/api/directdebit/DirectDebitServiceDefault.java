package com.sentenial.rest.client.api.directdebit;

import com.sentenial.rest.client.api.common.service.AbstractServiceDefault;
import com.sentenial.rest.client.api.common.service.ServiceConfiguration;
import com.sentenial.rest.client.api.directdebit.dto.CreateDirectDebitAndMandateRequest;
import com.sentenial.rest.client.api.directdebit.dto.CreateDirectDebitAndMandateResponse;
import com.sentenial.rest.client.api.directdebit.dto.CreateDirectDebitRequest;
import com.sentenial.rest.client.api.directdebit.dto.CreateDirectDebitResponse;
import com.sentenial.rest.client.api.directdebit.dto.ListDirectDebitRequestParameters;
import com.sentenial.rest.client.api.directdebit.dto.ListDirectDebitResponse;
import com.sentenial.rest.client.api.directdebit.dto.ListFailedDirectDebitRequestParameters;
import com.sentenial.rest.client.api.directdebit.dto.ListFailedDirectDebitResponse;
import com.sentenial.rest.client.api.directdebit.dto.RepresentDirectDebitRequest;
import com.sentenial.rest.client.api.directdebit.dto.RepresentDirectDebitResponse;
import com.sentenial.rest.client.api.directdebit.dto.RetrieveDirectDebitResponse;
import com.sentenial.rest.client.api.directdebit.dto.RevokeAllDirectDebitsRequest;
import com.sentenial.rest.client.api.directdebit.dto.RevokeAllDirectDebitsResponse;
import com.sentenial.rest.client.api.directdebit.dto.RevokeDirectDebitRequest;
import com.sentenial.rest.client.api.directdebit.dto.RevokeDirectDebitResponse;
import com.sentenial.rest.client.utils.JsonUtils;

public class DirectDebitServiceDefault extends AbstractServiceDefault implements DirectDebitService{


	public static final String LIST_DIRECTDEBITS = "/directdebits";
	public static final String LIST_DIRECTDEBITS_BY_CREDITORSCHEME = "/schemes/%s/directdebits";
	public static final String LIST_DIRECTDEBITS_BY_MANDATE = "/schemes/%s/mandates/%s/directdebits";
	public static final String CREATE_DIRECTDEBIT = "/schemes/%s/mandates/%s/directdebits";
	public static final String CREATE_DIRECTDEBIT_AND_MANDATE = "/schemes/%s/directdebits";
	public static final String RETRIEVE_DIRECTDEBIT = "/schemes/%s/mandates/%s/directdebits/%s";
	public static final String LIST_FAILED_DIRECTDEBITS = "/faileddirectdebits";
	public static final String REVOKE_DIRECTDEBIT = "/schemes/%s/mandates/%s/directdebits/%s/revoke";
	public static final String REVOKEALL_DIRECTDEBITS = "/schemes/%s/mandates/%s/revokealldirectdebits";
	public static final String REPRESENT_FAILED_DIRECTDEBIT = "/schemes/%s/mandates/%s/directdebits/%s/represent";


	public DirectDebitServiceDefault(ServiceConfiguration serviceConfiguration) {
		super(serviceConfiguration);
	}


	@Override
	public CreateDirectDebitResponse createDirectDebit(
			String creditorSchemeId, String mandateId, CreateDirectDebitRequest createDirectDebitRequest) {

		String url = String.format(getApiUri() + CREATE_DIRECTDEBIT, creditorSchemeId, mandateId);
		String payload = JsonUtils.toJson(createDirectDebitRequest);

		return JsonUtils.fromJson(httpClient.post(url, headers(), payload), CreateDirectDebitResponse.class);
	}

	@Override
	public CreateDirectDebitAndMandateResponse createDirectDebitAndMandate(
			String creditorSchemeId, CreateDirectDebitAndMandateRequest createDirectDebitAndMandateRequest) {

		String url = String.format(getApiUri() + CREATE_DIRECTDEBIT_AND_MANDATE, creditorSchemeId);
		String payload = JsonUtils.toJson(createDirectDebitAndMandateRequest);

		return JsonUtils.fromJson(httpClient.post(url, headers(), payload), CreateDirectDebitAndMandateResponse.class);
	}

	@Override
	public RetrieveDirectDebitResponse retrieveDirectDebit(
			String creditorSchemeId, String mandateId, String directDebitId) {

		String url = String.format(getApiUri() + RETRIEVE_DIRECTDEBIT, creditorSchemeId, mandateId, directDebitId);

		return JsonUtils.fromJson(httpClient.get(url, headers()), RetrieveDirectDebitResponse.class);
	}

	@Override
	public ListDirectDebitResponse listDirectDebits(ListDirectDebitRequestParameters listDirectDebitRequestParameters) {
		
		listDirectDebitRequestParameters = 
				(listDirectDebitRequestParameters != null)? listDirectDebitRequestParameters: new ListDirectDebitRequestParameters();

		String url = getApiUri() + LIST_DIRECTDEBITS + listDirectDebitRequestParameters.generateRequestParamsString();

		return JsonUtils.fromJson(httpClient.get(url, headers()), ListDirectDebitResponse.class);
	}

	@Override
	public ListDirectDebitResponse listDirectDebits(
			String creditorSchemeId, ListDirectDebitRequestParameters listDirectDebitRequestParameters) {
		
		listDirectDebitRequestParameters = 
				(listDirectDebitRequestParameters != null)? listDirectDebitRequestParameters: new ListDirectDebitRequestParameters();

		String url = String.format(getApiUri() + LIST_DIRECTDEBITS_BY_CREDITORSCHEME, creditorSchemeId) 
				+ listDirectDebitRequestParameters.generateRequestParamsString();

		return JsonUtils.fromJson(httpClient.get(url, headers()), ListDirectDebitResponse.class);
	}

	@Override
	public ListDirectDebitResponse listDirectDebits(
			String creditorSchemeId, String mandateId, ListDirectDebitRequestParameters listDirectDebitRequestParameters) {
		
		listDirectDebitRequestParameters = 
				(listDirectDebitRequestParameters != null)? listDirectDebitRequestParameters: new ListDirectDebitRequestParameters();

		String url = String.format(getApiUri() + LIST_DIRECTDEBITS_BY_MANDATE, creditorSchemeId, mandateId) 
				+ listDirectDebitRequestParameters.generateRequestParamsString();

		return JsonUtils.fromJson(httpClient.get(url, headers()), ListDirectDebitResponse.class);
	}

	@Override
	public ListFailedDirectDebitResponse listFailedDirectDebits(
			ListFailedDirectDebitRequestParameters listFailedDirectDebitRequestParameters) {

		listFailedDirectDebitRequestParameters = 
				(listFailedDirectDebitRequestParameters != null)? listFailedDirectDebitRequestParameters: new ListFailedDirectDebitRequestParameters();
		
		String url = getApiUri() + LIST_FAILED_DIRECTDEBITS 
				+ listFailedDirectDebitRequestParameters.generateRequestParamsString();

		return JsonUtils.fromJson(httpClient.get(url, headers()), ListFailedDirectDebitResponse.class);
	}

	@Override
	public RevokeDirectDebitResponse revokeDirectDebit(
			String creditorSchemeId, String mandateId, String directDebitId, RevokeDirectDebitRequest revokeDirectDebitRequest) {

		String url = String.format(getApiUri() + REVOKE_DIRECTDEBIT, creditorSchemeId, mandateId, directDebitId);
		String payload = JsonUtils.toJson(revokeDirectDebitRequest);

		return JsonUtils.fromJson(httpClient.put(url, headers(), payload), RevokeDirectDebitResponse.class);
	}

	@Override
	public RevokeAllDirectDebitsResponse revokeAllDirectDebits(
			String creditorSchemeId, String mandateId, RevokeAllDirectDebitsRequest revokeAllDirectDebitsRequest) {

		String url = String.format(getApiUri() + REVOKEALL_DIRECTDEBITS, creditorSchemeId, mandateId);
		String payload = JsonUtils.toJson(revokeAllDirectDebitsRequest);

		return JsonUtils.fromJson(httpClient.put(url, headers(), payload), RevokeAllDirectDebitsResponse.class);
	}

	@Override
	public RepresentDirectDebitResponse representDirectDebit(
			String creditorSchemeId, String mandateId, String directDebitId, RepresentDirectDebitRequest representDirectDebitRequest) {

		String url = String.format(getApiUri() + REPRESENT_FAILED_DIRECTDEBIT, creditorSchemeId, mandateId, directDebitId);
		String payload = JsonUtils.toJson(representDirectDebitRequest);

		return JsonUtils.fromJson(httpClient.post(url, headers(), payload), RepresentDirectDebitResponse.class);
	}
}
