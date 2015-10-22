package com.sentenial.rest.client.api.directdebit.dto;

public class RevokeAllDirectDebitsRequest {

	private String operationReason;

	public RevokeAllDirectDebitsRequest withOperationReason(String operationReason) {
		this.operationReason = operationReason;
		return this;
	}
	
	public String getOperationReason() {
		return operationReason;
	}

	public void setOperationReason(String operationReason) {
		this.operationReason = operationReason;
	}
	
}
