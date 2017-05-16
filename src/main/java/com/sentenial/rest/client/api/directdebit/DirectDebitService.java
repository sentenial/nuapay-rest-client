package com.sentenial.rest.client.api.directdebit;

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

public interface DirectDebitService {

	CreateDirectDebitResponse createDirectDebit(
			String creditorSchemeId, String mandateId, CreateDirectDebitRequest createDirectDebitRequest);

	CreateDirectDebitAndMandateResponse createDirectDebitAndMandate(
			String creditorSchemeId, CreateDirectDebitAndMandateRequest createDirectDebitAndMandateRequest);
	
	RetrieveDirectDebitResponse retrieveDirectDebit(
			String creditorSchemeId, String mandateId, String directDebitId);
	
	ListDirectDebitResponse listDirectDebits(
			ListDirectDebitRequestParameters listDirectDebitRequestParameters);
	
	ListDirectDebitResponse listDirectDebits(
			String creditorSchemeId, ListDirectDebitRequestParameters listDirectDebitRequestParameters);

	ListDirectDebitResponse listDirectDebits(
			String creditorSchemeId, String mandateId, ListDirectDebitRequestParameters listDirectDebitRequestParameters);
	
	ListFailedDirectDebitResponse listFailedDirectDebits(
			ListFailedDirectDebitRequestParameters listFailedDirectDebitRequestParameters);
	
	RevokeDirectDebitResponse revokeDirectDebit(
			String creditorSchemeId, String mandateId, String directDebitId, RevokeDirectDebitRequest revokeDirectDebitRequest);
	
	RevokeAllDirectDebitsResponse revokeAllDirectDebits(
			String creditorSchemeId, String mandateId, RevokeAllDirectDebitsRequest revokeAllDirectDebitsRequest);
	
	RepresentDirectDebitResponse representDirectDebit(
			String creditorSchemeId, String mandateId, String directDebitId, RepresentDirectDebitRequest representDirectDebitRequest);
	
}
