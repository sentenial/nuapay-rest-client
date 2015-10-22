package com.sentenial.rest.client.api.directdebit.dto;

import java.util.Date;

import com.sentenial.rest.client.api.common.resource.PagingRequestParameters;
import com.sentenial.rest.client.utils.DateUtils;

public class ListDirectDebitRequestParameters extends PagingRequestParameters{

	
	private Date actualCollectionDateFrom;
	
	private Date actualCollectionDateTo;
	
	private String scheduleId;
	
	private PaymentStatus paymentStatus;
	
	
	public String generateRequestParamsString(){
		StringBuilder builder = new StringBuilder();
		
		if (actualCollectionDateFrom != null){
			builder.append("actualcollectiondatefrom=" + DateUtils.fromDate(actualCollectionDateFrom) + "&");
		}
		if (actualCollectionDateTo != null){
			builder.append("actualcollectiondateto=" + DateUtils.fromDate(actualCollectionDateTo) + "&");
		}
		if (scheduleId != null){
			builder.append("scheduleid=" + scheduleId + "&");
		}
		if (paymentStatus != null){
			builder.append("paymentstatus=" + paymentStatus + "&");
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

	public ListDirectDebitRequestParameters withPaymentStatus(PaymentStatus paymentStatus) {
		this.paymentStatus = paymentStatus;
		return this;
	}

	public ListDirectDebitRequestParameters withActualCollectionDateFrom(Date actualcollectiondatefrom) {
		this.actualCollectionDateFrom = actualcollectiondatefrom;
		return this;
	}

	public ListDirectDebitRequestParameters withActualCollectionDateTo(Date actualcollectiondateto) {
		this.actualCollectionDateTo = actualcollectiondateto;
		return this;
	}

	public ListDirectDebitRequestParameters withScheduleId(String scheduleid) {
		this.scheduleId = scheduleid;
		return this;
	}

	public Date getActualCollectionDateFrom() {
		return actualCollectionDateFrom;
	}

	public void setActualCollectionDateFrom(Date actualcollectiondatefrom) {
		this.actualCollectionDateFrom = actualcollectiondatefrom;
	}

	public Date getActualCollectionDateTo() {
		return actualCollectionDateTo;
	}

	public void setActualCollectionDateTo(Date actualcollectiondateto) {
		this.actualCollectionDateTo = actualcollectiondateto;
	}

	public String getScheduleid() {
		return scheduleId;
	}

	public void setScheduleid(String scheduleid) {
		this.scheduleId = scheduleid;
	}

	public PaymentStatus getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(PaymentStatus paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	@Override
	public String toString() {
		return "ListDirectDebitRequestParameters [actualcollectiondatefrom=" + actualCollectionDateFrom
				+ ", actualcollectiondateto=" + actualCollectionDateTo + ", scheduleid=" + scheduleId
				+ ", paymentStatus=" + paymentStatus + "]";
	}

	
}
