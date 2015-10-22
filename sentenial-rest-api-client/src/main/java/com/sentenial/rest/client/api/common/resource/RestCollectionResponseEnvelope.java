package com.sentenial.rest.client.api.common.resource;

import java.util.ArrayList;
import java.util.List;

public class RestCollectionResponseEnvelope<T, S extends RestResponseEnvelopeInner<T>> {

	private String uri;
	
	private List<S> data = new ArrayList<S>();

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public List<S> getData() {
		return data;
	}
	
	public void setData(List<S> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "RestCollectionResponseEnvelope [uri=" + uri + ", data=" + data + "]";
	}

}
