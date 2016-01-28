package com.sentenial.rest.client.api.common.service;

import java.util.HashMap;
import java.util.Map;

import com.sentenial.rest.client.http.HttpClient;
import com.sentenial.rest.client.http.HttpClientDefault;
import com.sentenial.rest.client.http.HttpUtils;

public abstract class AbstractServiceDefault {

	
	protected HttpClient httpClient;
	
	private ServiceConfiguration serviceConfiguration;
	
	
	public AbstractServiceDefault(ServiceConfiguration serviceConfiguration){
		this.serviceConfiguration = serviceConfiguration;
		this.httpClient = new HttpClientDefault();
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
      
      Map.Entry<String, String> basicAuthHeader = HttpUtils.basicAuth(serviceConfiguration.getApiKey());
      
      headers.put(basicAuthHeader.getKey(), basicAuthHeader.getValue());
      
      Map<String, String> additionalHeaders = serviceConfiguration.getAdditionalHeaders();
      if (additionalHeaders != null){
    	  headers.putAll(additionalHeaders);
      }
      
      return headers;
    }

}
