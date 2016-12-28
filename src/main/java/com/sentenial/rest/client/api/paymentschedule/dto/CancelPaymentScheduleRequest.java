package com.sentenial.rest.client.api.paymentschedule.dto;

public class CancelPaymentScheduleRequest {

	private String operationReason;

	public CancelPaymentScheduleRequest withOperationReason(String operationReason) {
		this.operationReason = operationReason;
		return this;
	}
	
	public String getOperationReason() {
		return operationReason;
	}

	public void setOperationReason(String operationReason) {
		this.operationReason = operationReason;
	}

	@Override
	public String toString() {
		return "CancelPaymentScheduleRequest [operationReason=" + operationReason + "]";
	}
	
}
