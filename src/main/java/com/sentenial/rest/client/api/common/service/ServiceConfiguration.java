package com.sentenial.rest.client.api.common.service;

import java.util.Map;

import com.sentenial.rest.client.http.HttpClientDefault;

public class ServiceConfiguration extends HttpClientDefault {


	public final static String LIVE_ENVIRONMENT_URL = "https://api.nuapay.com";
	public final static String UAT_ENVIRONMENT_URL = "https://api.sentenialtest.com";


	private String baseApiUrl;

	private String apiKey;
	private String token;

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

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
}
