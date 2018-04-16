package com.sentenial.rest.client.utils;

import java.text.SimpleDateFormat;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonGenerator.Feature;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtils {

	public static final ObjectMapper objectMapper = new ObjectMapper()
			.setSerializationInclusion(Include.NON_NULL)
			.enable(Feature.WRITE_BIGDECIMAL_AS_PLAIN)
			.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
			.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));

	public static <T> T fromJson(String json, Class<T> clazz) {
		try {
			return objectMapper.readValue(json, clazz);
		} catch (Exception e) {
			throw new JsonTransformationException(e);
		} 
	}

	public static String toJson(Object src) {
		
		try {
			return objectMapper.writeValueAsString(src);
		} catch (Exception e) {
			throw new JsonTransformationException(e);
		} 
	}

}
