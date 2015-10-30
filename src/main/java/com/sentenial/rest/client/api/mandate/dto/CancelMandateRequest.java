package com.sentenial.rest.client.api.mandate.dto;

public class CancelMandateRequest {

	private String operationReason;
	
	public CancelMandateRequest withOperationReason(String operationReason) {
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
