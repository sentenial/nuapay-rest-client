package com.sentenial.rest.client.api.emandate;

import com.sentenial.rest.client.api.emandate.dto.CreateEmandateRequest;
import com.sentenial.rest.client.api.emandate.dto.CreateEmandateResponse;
import com.sentenial.rest.client.api.emandate.dto.RetrieveEmandateResponse;

public interface EmandateService {

	CreateEmandateResponse createEmandate(CreateEmandateRequest createMandateRequest);

	RetrieveEmandateResponse retrieveEmandate(String emandateToken);
}
