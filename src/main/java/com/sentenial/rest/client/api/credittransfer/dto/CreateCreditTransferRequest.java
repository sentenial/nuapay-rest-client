package com.sentenial.rest.client.api.credittransfer.dto;

import java.math.BigDecimal;
import java.util.Date;

public class CreateCreditTransferRequest {


	private String originatorIban;
	
	private Date requestedExecutionDate;

	private BigDecimal paymentAmount;
	
	private String paymentCurrency;
	
	private String endToEndId;
	
	private String remittanceInformation;

	
	public CreateCreditTransferRequest withOriginatorIban(String originatorIban) {
		this.originatorIban = originatorIban;
		return this;
	}

	public CreateCreditTransferRequest withRequestedExecutionDate(Date requestedExecutionDate) {
		this.requestedExecutionDate = requestedExecutionDate;
		return this;
	}

	public CreateCreditTransferRequest withPaymentAmount(BigDecimal paymentAmount) {
		this.paymentAmount = paymentAmount;
		return this;
	}

	public CreateCreditTransferRequest withPaymentCurrency(String paymentCurrency) {
		this.paymentCurrency = paymentCurrency;
		return this;
	}

	public CreateCreditTransferRequest withEndToEndId(String endToEndId) {
		this.endToEndId = endToEndId;
		return this;
	}

	public CreateCreditTransferRequest withRemittanceInformation(String remittanceInformation) {
		this.remittanceInformation = remittanceInformation;
		return this;
	}

	public String getOriginatorIban() {
		return originatorIban;
	}

	public void setOriginatorIban(String originatorIban) {
		this.originatorIban = originatorIban;
	}

	public Date getRequestedExecutionDate() {
		return requestedExecutionDate;
	}

	public void setRequestedExecutionDate(Date requestedExecutionDate) {
		this.requestedExecutionDate = requestedExecutionDate;
	}

	public BigDecimal getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(BigDecimal paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public String getPaymentCurrency() {
		return paymentCurrency;
	}

	public void setPaymentCurrency(String paymentCurrency) {
		this.paymentCurrency = paymentCurrency;
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

	@Override
	public String toString() {
		return "CreditTransfer [originatorIban=" + originatorIban + ", requestedExecutionDate=" + requestedExecutionDate
				+ ", paymentAmount=" + paymentAmount + ", paymentCurrency=" + paymentCurrency + ", endToEndId="
				+ endToEndId + ", remittanceInformation=" + remittanceInformation + "]";
	}

}
