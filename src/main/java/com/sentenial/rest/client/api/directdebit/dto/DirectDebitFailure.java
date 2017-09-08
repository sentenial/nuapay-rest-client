package com.sentenial.rest.client.api.directdebit.dto;

import java.math.BigDecimal;
import java.util.Calendar;

public class DirectDebitFailure {


	private String scheduleId;
	
	private String endToEndId;
	
	private BigDecimal paymentAmount;
	
	private Calendar requestedCollectionDate;
	
	private Calendar actualCollectionDate;
	
	private Calendar exportDate;
	
	private String remittanceInfo;
	
	private String originalEndToEndId;
	
	private Integer representationAttemptNumber;
	
	private String paymentStatus;

	
	public DirectDebitFailure withScheduleId(String scheduleId) {
		this.scheduleId = scheduleId;
		return this;
	}

	public DirectDebitFailure withEndToEndId(String endToEndId) {
		this.endToEndId = endToEndId;
		return this;
	}

	public DirectDebitFailure withPaymentAmount(BigDecimal paymentAmount) {
		this.paymentAmount = paymentAmount;
		return this;
	}

	public DirectDebitFailure withRequestedCollectionDate(Calendar requestedCollectionDate) {
		this.requestedCollectionDate = requestedCollectionDate;
		return this;
	}

	public DirectDebitFailure withActualCollectionDate(Calendar actualCollectionDate) {
		this.actualCollectionDate = actualCollectionDate;
		return this;
	}

	public DirectDebitFailure withExportDate(Calendar exportDate) {
		this.exportDate = exportDate;
		return this;
	}

	public DirectDebitFailure withRemittanceInformation(String remittanceInformation) {
		this.remittanceInfo = remittanceInformation;
		return this;
	}

	public DirectDebitFailure withOriginalEndToEndId(String originalEndToEndId) {
		this.originalEndToEndId = originalEndToEndId;
		return this;
	}

	public DirectDebitFailure withRepresentationAttemptNumber(Integer representationAttemptNumber) {
		this.representationAttemptNumber = representationAttemptNumber;
		return this;
	}

	public DirectDebitFailure withPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
		return this;
	}

	public String getScheduleId() {
		return scheduleId;
	}

	public void setScheduleId(String scheduleId) {
		this.scheduleId = scheduleId;
	}

	public String getEndToEndId() {
		return endToEndId;
	}

	public void setEndToEndId(String endToEndId) {
		this.endToEndId = endToEndId;
	}

	public BigDecimal getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(BigDecimal paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public Calendar getRequestedCollectionDate() {
		return requestedCollectionDate;
	}

	public void setRequestedCollectionDate(Calendar requestedCollectionDate) {
		this.requestedCollectionDate = requestedCollectionDate;
	}

	public Calendar getActualCollectionDate() {
		return actualCollectionDate;
	}

	public void setActualCollectionDate(Calendar actualCollectionDate) {
		this.actualCollectionDate = actualCollectionDate;
	}

	public Calendar getExportDate() {
		return exportDate;
	}

	public void setExportDate(Calendar exportDate) {
		this.exportDate = exportDate;
	}

	public String getRemittanceInfo() {
		return remittanceInfo;
	}

	public void setRemittanceInfo(String remittanceInformation) {
		this.remittanceInfo = remittanceInformation;
	}

	public String getOriginalEndToEndId() {
		return originalEndToEndId;
	}

	public void setOriginalEndToEndId(String originalEndToEndId) {
		this.originalEndToEndId = originalEndToEndId;
	}

	public Integer getRepresentationAttemptNumber() {
		return representationAttemptNumber;
	}

	public void setRepresentationAttemptNumber(Integer representationAttemptNumber) {
		this.representationAttemptNumber = representationAttemptNumber;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	@Override
	public String toString() {
		return "DirectDebit [scheduleId=" + scheduleId + ", endToEndId=" + endToEndId + ", paymentAmount="
				+ paymentAmount + ", requestedCollectionDate=" + requestedCollectionDate + ", actualCollectionDate="
				+ actualCollectionDate + ", exportDate=" + exportDate + ", remittanceInfo="
				+ remittanceInfo + ", originalEndToEndId=" + originalEndToEndId
				+ ", representationAttemptNumber=" + representationAttemptNumber + ", paymentStatus=" + paymentStatus
				+ "]";
	}

}
