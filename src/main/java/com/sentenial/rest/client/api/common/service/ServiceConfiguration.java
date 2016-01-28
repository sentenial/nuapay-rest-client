package com.sentenial.rest.client.api.common.service;

import java.util.Map;

public class ServiceConfiguration {


	public final static String LIVE_ENVIRONMENT_URL = "https://api.nuapay.com/v1";
	public final static String UAT_ENVIRONMENT_URL = "https://api.sentenialtest.com/v1";


	private String baseApiUrl;

	private String apiKey;
	
	private Map<String, String> additionalHeaders;


	public ServiceConfiguration(){
		this.baseApiUrl = LIVE_ENVIRONMENT_URL;
	}

	public ServiceConfiguration(boolean liveEnv){
		this.baseApiUrl = liveEnv? LIVE_ENVIRONMENT_URL: UAT_ENVIRONMENT_URL;
	}

	public ServiceConfiguration(String envUrl){
		this.baseApiUrl = envUrl;
	}

	public String getBaseApiUrl() {
		return baseApiUrl;
	}

	public String getApiKey() {
		return apiKey;
	}

	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}

	public Map<String, String> getAdditionalHeaders() {
		return additionalHeaders;
	}

	public void setAdditionalHeaders(Map<String, String> additionalHeaders) {
		this.additionalHeaders = additionalHeaders;
	}

}
