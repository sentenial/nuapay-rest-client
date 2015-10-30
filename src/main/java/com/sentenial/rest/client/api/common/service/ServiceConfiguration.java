package com.sentenial.rest.client.api.common.service;

public class ServiceConfiguration {


	public final static String LIVE_ENVIRONMENT_URL = "https://api.nuapay.com/v1";
	public final static String UAT_ENVIRONMENT_URL = "https://api.sentenialtest.com/v1";


	private String baseApiUrl;

	private String apiKey;


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

}
