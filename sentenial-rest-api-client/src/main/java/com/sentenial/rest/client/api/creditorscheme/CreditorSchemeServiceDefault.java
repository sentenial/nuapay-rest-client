package com.sentenial.rest.client.api.creditorscheme;

import com.sentenial.rest.client.api.common.service.AbstractServiceDefault;
import com.sentenial.rest.client.api.common.service.ServiceConfiguration;
import com.sentenial.rest.client.api.creditorscheme.dto.ListCreditorSchemesResponse;
import com.sentenial.rest.client.utils.JsonUtils;

public class CreditorSchemeServiceDefault extends AbstractServiceDefault implements CreditorSchemeService {


	private static final String LIST_CREDITOR_SCHEMES = "/schemes";
	
	
	public CreditorSchemeServiceDefault(ServiceConfiguration serviceConfiguration) {
		super(serviceConfiguration);
	}

	@Override
	public ListCreditorSchemesResponse listCreditorSchemes() {
		
		String url = getApiUri() + LIST_CREDITOR_SCHEMES;

		return JsonUtils.fromJson(httpClient.get(url, headers()), ListCreditorSchemesResponse.class);
	}

}
