package com.sentenial.rest.client.api.paymentschedule.dto;


import com.sentenial.rest.client.api.mandate.dto.MandateIdentifier;

public class PaymentScheduleAndMandate extends PaymentSchedule {


	private MandateIdentifier mandate;

	public MandateIdentifier getMandate() {
		return mandate;
	}

	public void setMandate(MandateIdentifier mandate) {
		this.mandate = mandate;
	}

	@Override
	public String toString() {
		return "PaymentSchedule [scheduleId=" + getScheduleId() + ", paymentFrequency=" + getPaymentFrequency() + ", paymentType="
				+ getPaymentType() + ", startDate=" + getStartDate() + ", numberOfPayments=" + getNumberOfPayments()
				+ ", paymentAmount=" + getPaymentAmount() + ", firstPaymentAmount=" + getFirstPaymentAmount()
				+ ", lastPaymentAmount=" + getLastPaymentAmount() + ", remittanceInformation=" + getRemittanceInformation()
				+ ", paymentDayOfWeek=" + getPaymentDayOfWeek() + ", paymentWeekOfMonth=" + getPaymentWeekOfMonth()
				+ ", paymentDateInMonth=" + getPaymentDateInMonth() + ", paymentCustomFrequency=" + getPaymentCustomFrequency()
				+ ", twoPaymentsSamePeriod=" + getTwoPaymentsSamePeriod() + ", paymentScheduleStatus="
				+ getPaymentScheduleStatus() + ", mandate=" + mandate + "]";
	}
	
}
