package com.sentenial.rest.client.http;

import org.apache.commons.codec.binary.Base64;

import java.util.AbstractMap;
import java.util.Map;

public class HttpUtils {

	public static Map.Entry<String, String> basicAuth(String apiKey) {
		
		String credentials = apiKey + ":";
		String basicAuth = Base64.encodeBase64String(credentials.getBytes());

		return new AbstractMap.SimpleImmutableEntry<String, String>("Authorization", "Basic " + basicAuth);
	}

	public static Map.Entry<String, String> bearerAuth(String token) {
		return new AbstractMap.SimpleImmutableEntry<String, String>("Authorization", "Bearer " + token);
	}

}
