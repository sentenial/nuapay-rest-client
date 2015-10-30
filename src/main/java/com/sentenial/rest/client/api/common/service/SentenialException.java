package com.sentenial.rest.client.api.common.service;

import static java.lang.String.format;

import com.sentenial.rest.client.api.error.ErrorResponse;

public class SentenialException extends RuntimeException {

	private static final long serialVersionUID = -9018466630393618186L;
	
	private ErrorResponse errorResponse;

	public SentenialException(String msg) {
		super(msg);
	}

	public SentenialException(String msg, Throwable ex) {
		super(msg, ex);
	}

	public SentenialException(String url, int statusCode, String responseString) {    
		super(format("[url: %s, error code: %d, response: %s]", url, statusCode, responseString));    
	}
	
	public SentenialException(String url, int statusCode, ErrorResponse errorResponse) {    
		super(format("[url: %s, error code: %d, response: %s]", url, statusCode, errorResponse));
		this.errorResponse = errorResponse;
	}

	public ErrorResponse getErrorResponse() {
		return errorResponse;
	}
	
}
