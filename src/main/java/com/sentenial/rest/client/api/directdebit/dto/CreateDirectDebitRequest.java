package com.sentenial.rest.client.api.directdebit.dto;

import java.math.BigDecimal;
import java.util.Date;

public class CreateDirectDebitRequest {

	
    private Date requestedCollectionDate;

    private BigDecimal paymentAmount;

    private String endToEndId;

    private String remittanceInformation;
    
    private Boolean settlementDateShift;

	public CreateDirectDebitRequest withRequestedCollectionDate(Date requestedCollectionDate) {
		this.requestedCollectionDate = requestedCollectionDate;
		return this;
	}

	public CreateDirectDebitRequest withPaymentAmount(BigDecimal paymentAmount) {
		this.paymentAmount = paymentAmount;
		return this;
	}

	public CreateDirectDebitRequest withEndToEndId(String endToEndId) {
		this.endToEndId = endToEndId;
		return this;
	}

	public CreateDirectDebitRequest withRemittanceInformation(String remittanceInformation) {
		this.remittanceInformation = remittanceInformation;
		return this;
	}

	public Date getRequestedCollectionDate() {
		return requestedCollectionDate;
	}

	public void setRequestedCollectionDate(Date requestedCollectionDate) {
		this.requestedCollectionDate = requestedCollectionDate;
	}

	public BigDecimal getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(BigDecimal paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public String getEndToEndId() {
		return endToEndId;
	}

	public void setEndToEndId(String endToEndId) {
		this.endToEndId = endToEndId;
	}

	public String getRemittanceInformation() {
		return remittanceInformation;
	}

	public void setRemittanceInformation(String remittanceInformation) {
		this.remittanceInformation = remittanceInformation;
	}

	public Boolean getSettlementDateShift() {
		return settlementDateShift;
	}

	public void setSettlementDateShift(Boolean settlementDateShift) {
		this.settlementDateShift = settlementDateShift;
	}    
}
