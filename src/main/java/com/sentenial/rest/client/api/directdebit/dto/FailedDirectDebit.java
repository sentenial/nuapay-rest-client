package com.sentenial.rest.client.api.directdebit.dto;

import com.sentenial.rest.client.api.creditorscheme.dto.CreditorScheme;

public class FailedDirectDebit {

	
	private CreditorScheme creditorScheme;
	
	private DirectDebitMandateInfo mandateInfo;
	
	private DirectDebitFailure directDebitInfo;
	
	private RejectDetails rejectDetails;

	
	public FailedDirectDebit withCreditorScheme(CreditorScheme creditorScheme) {
		this.creditorScheme = creditorScheme;
		return this;
	}

	public FailedDirectDebit withMandateInfo(DirectDebitMandateInfo mandateInfo) {
		this.mandateInfo = mandateInfo;
		return this;
	}

	public FailedDirectDebit withDirectDebitInfo(DirectDebitFailure directDebitInfo) {
		this.directDebitInfo = directDebitInfo;
		return this;
	}

	public FailedDirectDebit withRejectDetails(RejectDetails rejectDetails) {
		this.rejectDetails = rejectDetails;
		return this;
	}

	public CreditorScheme getCreditorScheme() {
		return creditorScheme;
	}

	public void setCreditorScheme(CreditorScheme creditorScheme) {
		this.creditorScheme = creditorScheme;
	}

	public DirectDebitMandateInfo getMandateInfo() {
		return mandateInfo;
	}

	public void setMandateInfo(DirectDebitMandateInfo mandateInfo) {
		this.mandateInfo = mandateInfo;
	}

	public DirectDebitFailure getDirectDebitInfo() {
		return directDebitInfo;
	}

	public void setDirectDebitInfo(DirectDebitFailure directDebitInfo) {
		this.directDebitInfo = directDebitInfo;
	}

	public RejectDetails getRejectDetails() {
		return rejectDetails;
	}

	public void setRejectDetails(RejectDetails rejectDetails) {
		this.rejectDetails = rejectDetails;
	}

	@Override
	public String toString() {
		return "ListFailedDirectDebitResponse [creditorScheme=" + creditorScheme + ", mandateInfo=" + mandateInfo
				+ ", directDebitInfo=" + directDebitInfo + ", rejectDetails=" + rejectDetails + "]";
	}

}

