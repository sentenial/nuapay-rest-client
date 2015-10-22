package com.sentenial.rest.client.api.mandate.dto;

import java.util.Calendar;

public class MandateSummary {
	
	
	private String mandateId;
	
	private String debtorName;
	
	private String debtorIBAN;
	
	private String debtorMobileNumber;
	
	private MandateStatus mandateStatus;
	
	private Calendar creationDate;

	
	public String getMandateId() {
		return mandateId;
	}

	public void setMandateId(String mandateId) {
		this.mandateId = mandateId;
	}

	public String getDebtorName() {
		return debtorName;
	}

	public void setDebtorName(String debtorName) {
		this.debtorName = debtorName;
	}

	public String getDebtorIBAN() {
		return debtorIBAN;
	}

	public void setDebtorIBAN(String debtorIBAN) {
		this.debtorIBAN = debtorIBAN;
	}

	public String getDebtorMobileNumber() {
		return debtorMobileNumber;
	}

	public void setDebtorMobileNumber(String debtorMobileNumber) {
		this.debtorMobileNumber = debtorMobileNumber;
	}

	public MandateStatus getMandateStatus() {
		return mandateStatus;
	}

	public void setMandateStatus(MandateStatus mandateStatus) {
		this.mandateStatus = mandateStatus;
	}

	public Calendar getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Calendar creationDate) {
		this.creationDate = creationDate;
	}

	@Override
	public String toString() {
		return "MandateSummary [mandateId=" + mandateId + ", debtorName=" + debtorName + ", debtorIBAN=" + debtorIBAN
				+ ", debtorMobileNumber=" + debtorMobileNumber + ", mandateStatus=" + mandateStatus + ", creationDate="
				+ creationDate + "]";
	}

}
