package com.sentenial.rest.client.api.mandate;

import com.sentenial.rest.client.api.common.service.AbstractServiceDefault;
import com.sentenial.rest.client.api.common.service.ServiceConfiguration;
import com.sentenial.rest.client.api.mandate.dto.ActivateMandateRequest;
import com.sentenial.rest.client.api.mandate.dto.ActivateMandateResponse;
import com.sentenial.rest.client.api.mandate.dto.CancelMandateRequest;
import com.sentenial.rest.client.api.mandate.dto.CancelMandateResponse;
import com.sentenial.rest.client.api.mandate.dto.CreateMandateRequest;
import com.sentenial.rest.client.api.mandate.dto.CreateMandateResponse;
import com.sentenial.rest.client.api.mandate.dto.ListMandatesRequestParameters;
import com.sentenial.rest.client.api.mandate.dto.ListMandatesResponse;
import com.sentenial.rest.client.api.mandate.dto.RetrieveMandateResponse;
import com.sentenial.rest.client.api.mandate.dto.UpdateMandateDocumentRequest;
import com.sentenial.rest.client.api.mandate.dto.UpdateMandateDocumentResponse;
import com.sentenial.rest.client.api.mandate.dto.UpdateMandateRequest;
import com.sentenial.rest.client.api.mandate.dto.UpdateMandateResponse;
import com.sentenial.rest.client.utils.JsonUtils;

public class MandateServiceDefault extends AbstractServiceDefault implements MandateService{


	public static final String LIST_MANDATES = "/schemes";
	public static final String LIST_MANDATES_BY_CREDITOR_SCHEME = "/schemes/%s/mandates";
	public static final String CREATE_MANDATE = "/schemes/%s/mandates";
	public static final String RETRIEVE_MANDATE = "/schemes/%s/mandates/%s";
	public static final String RETRIEVE_MANDATE_DOCUMENT = "/schemes/%s/mandates/%s/document";
	public static final String UPDATE_MANDATE_DOCUMENT = "/schemes/%s/mandates/%s/document";
	public static final String UPDATE_MANDATE = "/schemes/%s/mandates/%s";
	public static final String ACTIVATE_MANDATE = "/schemes/%s/mandates/%s/activate";
	public static final String CANCEL_MANDATE = "/schemes/%s/mandates/%s/cancel";


	private static final String CONTENT_TYPE_JSON = "application/json";
	private static final String CONTENT_TYPE_PDF = "application/pdf";
	
	public MandateServiceDefault(ServiceConfiguration serviceConfiguration) {
		super(serviceConfiguration);
	}

	@Override
	public CreateMandateResponse createMandate(String creditorSchemeId, CreateMandateRequest createMandateRequest) {

		String url = String.format(getApiUri() + CREATE_MANDATE, creditorSchemeId);
		String payload = JsonUtils.toJson(createMandateRequest);

		return JsonUtils.fromJson(httpClient.post(url, headers(), payload), CreateMandateResponse.class);
	}

	@Override
	public RetrieveMandateResponse retrieveMandate(String creditorSchemeId, String mandateId) {

		String url = String.format(getApiUri() + RETRIEVE_MANDATE, creditorSchemeId, mandateId);

		return JsonUtils.fromJson(httpClient.get(url, headers()), RetrieveMandateResponse.class);
	}

	@Override
	public byte[] retrieveMandateDocument(String creditorSchemeId, String mandateId) {

		String url = String.format(getApiUri() + RETRIEVE_MANDATE_DOCUMENT, creditorSchemeId, mandateId);

		return httpClient.getAsStream(url, headers());
	}

	@Override
	public UpdateMandateDocumentResponse updateMandateDocument(String creditorSchemeId, String mandateId, UpdateMandateDocumentRequest updateMandateDocumentRequest, byte[] fileContent) {

		String url = String.format(getApiUri() + UPDATE_MANDATE_DOCUMENT, creditorSchemeId, mandateId);
		String payload = JsonUtils.toJson(updateMandateDocumentRequest);
		
		String result = httpClient.postMultipart(url, headers(), "json", payload, CONTENT_TYPE_JSON, "file", fileContent, CONTENT_TYPE_PDF, updateMandateDocumentRequest.getFileName());

		return JsonUtils.fromJson(result, UpdateMandateDocumentResponse.class);
	}

	@Override
	public ListMandatesResponse listMandates(String creditorSchemeId, ListMandatesRequestParameters listMandatesRequestParameters) {
		
		listMandatesRequestParameters = (listMandatesRequestParameters != null)? listMandatesRequestParameters: new ListMandatesRequestParameters();

		String url = String.format(getApiUri() + LIST_MANDATES_BY_CREDITOR_SCHEME, creditorSchemeId) + listMandatesRequestParameters.generateRequestParamsString();		

		return JsonUtils.fromJson(httpClient.get(url, headers()), ListMandatesResponse.class);
	}
	
	@Override
	public ListMandatesResponse listMandates(ListMandatesRequestParameters listMandatesRequestParameters) {

		listMandatesRequestParameters = (listMandatesRequestParameters != null)? listMandatesRequestParameters: new ListMandatesRequestParameters();
		
		String url = getApiUri() + LIST_MANDATES + listMandatesRequestParameters.generateRequestParamsString();

		return JsonUtils.fromJson(httpClient.get(url, headers()), ListMandatesResponse.class);
	}

	@Override
	public UpdateMandateResponse updateMandate(String creditorSchemeId, String mandateId, UpdateMandateRequest updateMandateRequest) {

		String url = String.format(getApiUri() + UPDATE_MANDATE, creditorSchemeId, mandateId);
		String payload = JsonUtils.toJson(updateMandateRequest);

		return JsonUtils.fromJson(httpClient.put(url, headers(), payload), UpdateMandateResponse.class);
	}

	@Override
	public ActivateMandateResponse activateMandate(String creditorSchemeId, String mandateId, ActivateMandateRequest activateMandateRequest) {

		String url = String.format(getApiUri() + ACTIVATE_MANDATE, creditorSchemeId, mandateId);
		String payload = JsonUtils.toJson(activateMandateRequest);

		return JsonUtils.fromJson(httpClient.post(url, headers(), payload), ActivateMandateResponse.class);
	}

	@Override
	public CancelMandateResponse cancelMandate(String creditorSchemeId, String mandateId, CancelMandateRequest cancelMandateRequest) {

		String url = String.format(getApiUri() + CANCEL_MANDATE, creditorSchemeId, mandateId);
		String payload = JsonUtils.toJson(cancelMandateRequest);

		return JsonUtils.fromJson(httpClient.post(url, headers(), payload), CancelMandateResponse.class);
	}
}