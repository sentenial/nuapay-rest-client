package com.sentenial.rest.client.api.creditorscheme;

import com.sentenial.rest.client.api.creditorscheme.dto.CreditorSchemeConfigResponse;
import com.sentenial.rest.client.api.creditorscheme.dto.ListCreditorSchemesResponse;

public interface CreditorSchemeService {

	public ListCreditorSchemesResponse listCreditorSchemes();

	CreditorSchemeConfigResponse retrieveCreditorSchemeConfig(String creditorSchemeId);
	
}
