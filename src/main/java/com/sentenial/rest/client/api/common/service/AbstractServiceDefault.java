package com.sentenial.rest.client.api.common.service;

import com.sentenial.rest.client.http.HttpClient;
import com.sentenial.rest.client.http.HttpUtils;
import org.apache.commons.lang.StringUtils;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractServiceDefault {

	
	protected HttpClient httpClient;
	
	private ServiceConfiguration serviceConfiguration;
	
	
	public AbstractServiceDefault(ServiceConfiguration serviceConfiguration){
		serviceConfiguration.initialize();
		this.serviceConfiguration = serviceConfiguration;
		this.httpClient = serviceConfiguration;
	}
	
	public AbstractServiceDefault(ServiceConfiguration serviceConfiguration, HttpClient httpClient){
		this.serviceConfiguration = serviceConfiguration;
		this.httpClient = httpClient;
	}
	
	protected String getApiUri(){
		return serviceConfiguration.getBaseApiUrl();
	}

    protected Map<String, String> headers() {
      Map<String, String> headers = new HashMap<String, String>();

      if (StringUtils.isNotBlank(serviceConfiguration.getToken())) {
		  Map.Entry<String, String> authHeader = HttpUtils.bearerAuth(serviceConfiguration.getToken());
		  headers.put(authHeader.getKey(), authHeader.getValue());
	  } else {
		  Map.Entry<String, String> authHeader = HttpUtils.basicAuth(serviceConfiguration.getApiKey());
		  headers.put(authHeader.getKey(), authHeader.getValue());
	  }
      Map<String, String> additionalHeaders = serviceConfiguration.getAdditionalHeaders();
      if (additionalHeaders != null){
    	  headers.putAll(additionalHeaders);
      }
      return headers;
    }

}
