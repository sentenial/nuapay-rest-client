package com.sentenial.rest.client.utils;

import java.text.SimpleDateFormat;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class JsonUtils {

	public static final ObjectMapper objectMapper = new ObjectMapper()
			.setSerializationInclusion(Include.NON_NULL)
			.enable(SerializationFeature.WRITE_BIGDECIMAL_AS_PLAIN)
			.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));

	public static <T> T fromJson(String json, Class<T> clazz) {
		try {
			return objectMapper.readValue(json, clazz);
		} catch (Exception e) {
			throw new RuntimeException(e);
		} 
	}

	public static String toJson(Object src) {
		
		try {
			return objectMapper.writeValueAsString(src);
		} catch (Exception e) {
			throw new RuntimeException(e);
		} 
	}

}
