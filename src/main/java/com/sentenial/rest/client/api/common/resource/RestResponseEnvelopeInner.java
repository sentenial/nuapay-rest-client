package com.sentenial.rest.client.api.common.resource;

import com.fasterxml.jackson.annotation.JsonUnwrapped;

public class RestResponseEnvelopeInner<S>{

	private String id;
	
	private String uri;
	
	@JsonUnwrapped
	private S wrapped;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public S getWrapped() {
		return wrapped;
	}

	public void setWrapped(S wrapped) {
		this.wrapped = wrapped;
	}

	@Override
	public String toString() {
		return "RestResponseEnvelopeInner [id=" + id + ", uri=" + uri + ", wrapped=" + wrapped + "]";
	}

}
