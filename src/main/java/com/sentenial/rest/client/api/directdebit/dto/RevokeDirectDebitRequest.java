package com.sentenial.rest.client.api.directdebit.dto;

public class RevokeDirectDebitRequest {

	private String operationReason;

	public RevokeDirectDebitRequest withOperationReason(String operationReason) {
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
