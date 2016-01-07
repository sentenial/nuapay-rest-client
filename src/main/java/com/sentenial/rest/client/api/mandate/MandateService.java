package com.sentenial.rest.client.api.mandate;

import java.io.File;
import java.util.Map;

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
import com.sentenial.rest.client.api.mandate.dto.UpdateMandateRequest;
import com.sentenial.rest.client.api.mandate.dto.UpdateMandateResponse;

public interface MandateService {

	CreateMandateResponse createMandate(String creditorSchemeId, CreateMandateRequest createMandateRequest);

	RetrieveMandateResponse retrieveMandate(String creditorSchemeId, String mandateId);

	byte[] retrieveMandateDocument(String creditorSchemeId, String mandateId);

	void updateMandateDocument(File file, UpdateMandateDocumentRequest fileName, String creditorSchemeId, String mandateId, Map<String, String> additionalHeaders);
	
	ListMandatesResponse listMandates(String creditorSchemeId, ListMandatesRequestParameters listMandatesRequestParameters);

	ListMandatesResponse listMandates(ListMandatesRequestParameters listMandatesRequestParameters); 

	UpdateMandateResponse updateMandate(String creditorSchemeId, String mandateId, UpdateMandateRequest updateMandateRequest);

	ActivateMandateResponse activateMandate(String creditorSchemeId, String mandateId, ActivateMandateRequest activateMandateRequest);

	CancelMandateResponse cancelMandate(String creditorSchemeId, String mandateId, CancelMandateRequest cancelMandateRequest);

}
