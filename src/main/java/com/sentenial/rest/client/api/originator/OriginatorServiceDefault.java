package com.sentenial.rest.client.api.originator;

import com.sentenial.rest.client.api.common.service.AbstractServiceDefault;
import com.sentenial.rest.client.api.common.service.ServiceConfiguration;
import com.sentenial.rest.client.api.originator.dto.OriginatorResponse;
import com.sentenial.rest.client.utils.JsonUtils;

public class OriginatorServiceDefault extends AbstractServiceDefault implements OriginatorService {

    public static final String ORIGINATOR = "/originator";

    public OriginatorServiceDefault(ServiceConfiguration serviceConfiguration) {
        super(serviceConfiguration);
    }

    @Override
    public OriginatorResponse retrieveOriginatorInformation() {
        String url = String.format(getApiUri() + ORIGINATOR);
        return JsonUtils.fromJson(httpClient.get(url, headers()), OriginatorResponse.class);
    }
}
