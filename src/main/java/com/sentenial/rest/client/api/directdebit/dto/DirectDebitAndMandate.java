package com.sentenial.rest.client.api.directdebit.dto;

import com.sentenial.rest.client.api.mandate.dto.MandateIdentifier;

public class DirectDebitAndMandate extends DirectDebit {
	
	private MandateIdentifier mandate;

	public MandateIdentifier getMandate() {
		return mandate;
	}

	public void setMandate(MandateIdentifier mandate) {
		this.mandate = mandate;
	}


	@Override
	public String toString() {
		return "DirectDebitAndMandate [scheduleId=" + getScheduleId() + ", endToEndId=" + getEndToEndId() + ", paymentAmount="
				+ getPaymentAmount() + ", requestedCollectionDate=" + getRequestedCollectionDate() + ", actualCollectionDate="
				+ getActualCollectionDate() + ", exportDate=" + getExportDate() + ", remittanceInformation="
				+ getRemittanceInformation() + ", originalEndToEndId=" + getOriginalEndToEndId()
				+ ", representationAttemptNumber=" + getRepresentationAttemptNumber() + ", paymentStatus=" + getPaymentStatus()
				+ ", mandate=" + mandate + "]";
	}

}

