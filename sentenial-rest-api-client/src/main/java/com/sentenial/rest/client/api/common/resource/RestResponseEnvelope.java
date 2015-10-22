package com.sentenial.rest.client.api.common.resource;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RestResponseEnvelope<T>{

	private String uri;
	
	@JsonProperty("data")
	private T data;
	
	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "RestResponseEnvelope [uri=" + uri + ", data=" + data + "]";
	}

}
