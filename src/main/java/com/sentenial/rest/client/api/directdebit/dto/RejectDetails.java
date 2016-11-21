package com.sentenial.rest.client.api.directdebit.dto;

public class RejectDetails {

	
	private String rejectReason;
	
	private String rejectDescription;
	
	private String rejectType;
	
	private String rejectDate;

	
	public RejectDetails withRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
		return this;
	}

	public RejectDetails withRejectDescription(String rejectDescription) {
		this.rejectDescription = rejectDescription;
		return this;
	}

	public RejectDetails withRejectType(String rejectType) {
		this.rejectType = rejectType;
		return this;
	}

	public RejectDetails withRejectDate(String rejectDate) {
		this.rejectDate = rejectDate;
		return this;
	}

	public String getRejectReason() {
		return rejectReason;
	}

	public String getRejectDescription() {
		return rejectDescription;
	}

	public String getRejectType() {
		return rejectType;
	}

	public String getRejectDate() {
		return rejectDate;
	}

	@Override
	public String toString() {
		return "RejectDetails [rejectReason=" + rejectReason + ", rejectDescription=" + rejectDescription
				+ ", rejectType=" + rejectType + ", rejectDate=" + rejectDate + "]";
	}
	
}
