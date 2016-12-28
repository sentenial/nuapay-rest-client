package com.sentenial.rest.client.api.paymentschedule.dto;

import com.sentenial.rest.client.api.common.resource.PagingRequestParameters;

public class ListPaymentScheduleRequestParameters extends PagingRequestParameters{

	private PaymentScheduleStatus paymentScheduleStatus;
	
	
	public String generateRequestParamsString(){
		StringBuilder builder = new StringBuilder();
		
		if (paymentScheduleStatus != null){
			builder.append("paymentschedulestatus=" + paymentScheduleStatus + "&");
		}
		String paging = super.generatePagingRequestParamsString();
		if (paging != null){
			builder.append(paging);
		}
		
		if (builder.length() > 0){
			builder.insert(0, "?");
			if (builder.charAt(builder.length() - 1) == '&') {
				builder.deleteCharAt(builder.length() - 1);
			}
		}
		
		return builder.toString();
	}

	public ListPaymentScheduleRequestParameters withPaymentStatus(PaymentScheduleStatus paymentScheduleStatus) {
		this.paymentScheduleStatus = paymentScheduleStatus;
		return this;
	}

	public PaymentScheduleStatus getPaymentScheduleStatus() {
		return paymentScheduleStatus;
	}

	public void setPaymentScheduleStatus(PaymentScheduleStatus paymentScheduleStatus) {
		this.paymentScheduleStatus = paymentScheduleStatus;
	}

	@Override
	public String toString() {
		return "ListPaymentScheduleRequestParameters [paymentScheduleStatus=" + paymentScheduleStatus + ", toString()=" + super.toString() + "]";
	}
}
