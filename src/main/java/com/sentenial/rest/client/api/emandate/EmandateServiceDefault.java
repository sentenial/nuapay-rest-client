package com.sentenial.rest.client.api.emandate;

import com.sentenial.rest.client.api.common.service.AbstractServiceDefault;
import com.sentenial.rest.client.api.common.service.ServiceConfiguration;
import com.sentenial.rest.client.api.emandate.dto.CreateEmandateRequest;
import com.sentenial.rest.client.api.emandate.dto.CreateEmandateResponse;
import com.sentenial.rest.client.api.emandate.dto.RetrieveEmandateResponse;
import com.sentenial.rest.client.utils.JsonUtils;

public class EmandateServiceDefault extends AbstractServiceDefault implements EmandateService{


	public static final String CREATE_EMANDATE = "/emandates";
	public static final String RETRIEVE_EMANDATE = "/emandates/%s";

	public EmandateServiceDefault(ServiceConfiguration serviceConfiguration) {
		super(serviceConfiguration);
	}

	@Override
	public CreateEmandateResponse createEmandate(CreateEmandateRequest createEmandateRequest) {

		String url = String.format(getApiUri() + CREATE_EMANDATE);
		String payload = JsonUtils.toJson(createEmandateRequest);

		return JsonUtils.fromJson(httpClient.post(url, headers(), payload), CreateEmandateResponse.class);
	}

	@Override
	public RetrieveEmandateResponse retrieveEmandate(String emandateToken) {

		String url = String.format(getApiUri() + RETRIEVE_EMANDATE, emandateToken);		
		return JsonUtils.fromJson(httpClient.get(url, headers()), RetrieveEmandateResponse.class);
	}
}