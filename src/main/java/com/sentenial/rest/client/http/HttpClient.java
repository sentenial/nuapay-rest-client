package com.sentenial.rest.client.http;

import java.util.Map;

public interface HttpClient {

	String get(String url, Map<String, String> headers);
	
	byte[] getAsStream(String url, Map<String, String> headers);

	String post(String url, Map<String, String> headers, String payload);
	
	public String postMultipart(String url, Map<String, String> headers, 
			String textPartName, String textPartPayload, 
			String filePartName, byte[] filePartPayload);

	String put(String url, Map<String, String> headers, String payload);
	
	String delete(String url, Map<String, String> headers, String payload);

}