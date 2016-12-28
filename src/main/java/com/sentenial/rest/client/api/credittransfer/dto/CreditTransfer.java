package com.sentenial.rest.client.api.credittransfer.dto;

import java.math.BigDecimal;
import java.util.Calendar;

public class CreditTransfer {


	private String originatorIban;
	
	private Calendar requestedExecutionDate;

	private BigDecimal paymentAmount;
	
	private String paymentCurrency;
	
	private String endToEndId;
	
	private String remittanceInformation;

	private String paymentStatus;
	
	private String beneficiaryName;
	
	private String beneficiaryIban;

	
	public CreditTransfer withOriginatorIban(String originatorIban) {
		this.originatorIban = originatorIban;
		return this;
	}

	public CreditTransfer withRequestedExecutionDate(Calendar requestedExecutionDate) {
		this.requestedExecutionDate = requestedExecutionDate;
		return this;
	}

	public CreditTransfer withPaymentAmount(BigDecimal paymentAmount) {
		this.paymentAmount = paymentAmount;
		return this;
	}

	public CreditTransfer withPaymentCurrency(String paymentCurrency) {
		this.paymentCurrency = paymentCurrency;
		return this;
	}

	public CreditTransfer withEndToEndId(String endToEndId) {
		this.endToEndId = endToEndId;
		return this;
	}

	public CreditTransfer withRemittanceInformation(String remittanceInformation) {
		this.remittanceInformation = remittanceInformation;
		return this;
	}

	public CreditTransfer withPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
		return this;
	}
	
	public CreditTransfer withBeneficiaryName(String beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
		return this;
	}

	public CreditTransfer withBeneficiaryIban(String beneficiaryIban) {
		this.beneficiaryIban = beneficiaryIban;
		return this;
	}

	public String getOriginatorIban() {
		return originatorIban;
	}

	public void setOriginatorIban(String originatorIban) {
		this.originatorIban = originatorIban;
	}

	public Calendar getRequestedExecutionDate() {
		return requestedExecutionDate;
	}

	public void setRequestedExecutionDate(Calendar requestedExecutionDate) {
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

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public String getBeneficiaryName() {
		return beneficiaryName;
	}

	public void setBeneficiaryName(String beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
	}

	public String getBeneficiaryIban() {
		return beneficiaryIban;
	}

	public void setBeneficiaryIban(String beneficiaryIban) {
		this.beneficiaryIban = beneficiaryIban;
	}

	@Override
	public String toString() {
		return "CreditTransfer [originatorIban=" + originatorIban + ", requestedExecutionDate=" + requestedExecutionDate
				+ ", paymentAmount=" + paymentAmount + ", paymentCurrency=" + paymentCurrency + ", endToEndId="
				+ endToEndId + ", remittanceInformation=" + remittanceInformation + ", paymentStatus=" + paymentStatus
				+ ", beneficiaryName=" + beneficiaryName + ", beneficiaryIban=" + beneficiaryIban + "]";
	}

}
