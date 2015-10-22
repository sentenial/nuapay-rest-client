package com.sentenial.rest.client.api.directdebit.dto;

import java.math.BigDecimal;
import java.util.Calendar;

public class DirectDebit {


	private String scheduleId;
	
	private String endToEndId;
	
	private BigDecimal paymentAmount;
	
	private Calendar requestedCollectionDate;
	
	private Calendar actualCollectionDate;
	
	private Calendar exportDate;
	
	private String remittanceInformation;
	
	private String originalEndToEndId;
	
	private Integer representationAttemptNumber;
	
	private String paymentStatus;

	
	public DirectDebit withScheduleId(String scheduleId) {
		this.scheduleId = scheduleId;
		return this;
	}

	public DirectDebit withEndToEndId(String endToEndId) {
		this.endToEndId = endToEndId;
		return this;
	}

	public DirectDebit withPaymentAmount(BigDecimal paymentAmount) {
		this.paymentAmount = paymentAmount;
		return this;
	}

	public DirectDebit withRequestedCollectionDate(Calendar requestedCollectionDate) {
		this.requestedCollectionDate = requestedCollectionDate;
		return this;
	}

	public DirectDebit withActualCollectionDate(Calendar actualCollectionDate) {
		this.actualCollectionDate = actualCollectionDate;
		return this;
	}

	public DirectDebit withExportDate(Calendar exportDate) {
		this.exportDate = exportDate;
		return this;
	}

	public DirectDebit withRemittanceInformation(String remittanceInformation) {
		this.remittanceInformation = remittanceInformation;
		return this;
	}

	public DirectDebit withOriginalEndToEndId(String originalEndToEndId) {
		this.originalEndToEndId = originalEndToEndId;
		return this;
	}

	public DirectDebit withRepresentationAttemptNumber(Integer representationAttemptNumber) {
		this.representationAttemptNumber = representationAttemptNumber;
		return this;
	}

	public DirectDebit withPaymentStatus(String paymentStatus) {
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

	public String getRemittanceInformation() {
		return remittanceInformation;
	}

	public void setRemittanceInformation(String remittanceInformation) {
		this.remittanceInformation = remittanceInformation;
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

}
