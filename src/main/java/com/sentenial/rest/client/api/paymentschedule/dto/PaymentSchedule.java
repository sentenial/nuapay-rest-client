package com.sentenial.rest.client.api.paymentschedule.dto;

import java.math.BigDecimal;
import java.util.Date;

public class PaymentSchedule {


	private String scheduleId;
	
	private PaymentFrequency paymentFrequency;
	
	private PaymentType paymentType;
	
	private Date startDate;
	
	private Integer numberOfPayments;
	
	private BigDecimal paymentAmount;
	
	private BigDecimal firstPaymentAmount;
	
	private BigDecimal lastPaymentAmount;
	
	private String remittanceInformation;
	
	private PaymentDayofWeek paymentDayOfWeek;
	
	private PmtWeekOfMonth paymentWeekOfMonth;
	
	private Integer paymentDateInMonth;
	
	private String paymentCustomFrequency;
	
	private Boolean twoPaymentsSamePeriod;
	
	private PaymentScheduleStatus paymentScheduleStatus;


	public PaymentSchedule withScheduleId(String scheduleId) {
		this.scheduleId = scheduleId;
		return this;
	}

	public PaymentSchedule withPaymentFrequency(PaymentFrequency paymentFrequency) {
		this.paymentFrequency = paymentFrequency;
		return this;
	}

	public PaymentSchedule withPaymentType(PaymentType paymentType) {
		this.paymentType = paymentType;
		return this;
	}

	public PaymentSchedule withStartDate(Date startDate) {
		this.startDate = startDate;
		return this;
	}

	public PaymentSchedule withNumberOfPayments(Integer numberOfPayments) {
		this.numberOfPayments = numberOfPayments;
		return this;
	}

	public PaymentSchedule withPaymentAmount(BigDecimal paymentAmount) {
		this.paymentAmount = paymentAmount;
		return this;
	}

	public PaymentSchedule withFirstPaymentAmount(BigDecimal firstPaymentAmount) {
		this.firstPaymentAmount = firstPaymentAmount;
		return this;
	}

	public PaymentSchedule withLastPaymentAmount(BigDecimal lastPaymentAmount) {
		this.lastPaymentAmount = lastPaymentAmount;
		return this;
	}

	public PaymentSchedule withRemittanceInformation(String remittanceInformation) {
		this.remittanceInformation = remittanceInformation;
		return this;
	}

	public PaymentSchedule withPaymentDayOfWeek(PaymentDayofWeek paymentDayOfWeek) {
		this.paymentDayOfWeek = paymentDayOfWeek;
		return this;
	}

	public PaymentSchedule withPaymentWeekOfMonth(PmtWeekOfMonth paymentWeekOfMonth) {
		this.paymentWeekOfMonth = paymentWeekOfMonth;
		return this;
	}

	public PaymentSchedule withPaymentDateInMonth(Integer paymentDateInMonth) {
		this.paymentDateInMonth = paymentDateInMonth;
		return this;
	}

	public PaymentSchedule withPaymentCustomFrequency(String paymentCustomFrequency) {
		this.paymentCustomFrequency = paymentCustomFrequency;
		return this;
	}

	public PaymentSchedule withTwoPaymentsSamePeriod(Boolean twoPaymentsSamePeriod) {
		this.twoPaymentsSamePeriod = twoPaymentsSamePeriod;
		return this;
	}

	public PaymentSchedule withPaymentScheduleStatus(PaymentScheduleStatus paymentScheduleStatus) {
		this.paymentScheduleStatus = paymentScheduleStatus;
		return this;
	}

	public String getScheduleId() {
		return scheduleId;
	}

	public void setScheduleId(String scheduleId) {
		this.scheduleId = scheduleId;
	}

	public PaymentFrequency getPaymentFrequency() {
		return paymentFrequency;
	}

	public void setPaymentFrequency(PaymentFrequency paymentFrequency) {
		this.paymentFrequency = paymentFrequency;
	}

	public PaymentType getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(PaymentType paymentType) {
		this.paymentType = paymentType;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Integer getNumberOfPayments() {
		return numberOfPayments;
	}

	public void setNumberOfPayments(Integer numberOfPayments) {
		this.numberOfPayments = numberOfPayments;
	}

	public BigDecimal getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(BigDecimal paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public BigDecimal getFirstPaymentAmount() {
		return firstPaymentAmount;
	}

	public void setFirstPaymentAmount(BigDecimal firstPaymentAmount) {
		this.firstPaymentAmount = firstPaymentAmount;
	}

	public BigDecimal getLastPaymentAmount() {
		return lastPaymentAmount;
	}

	public void setLastPaymentAmount(BigDecimal lastPaymentAmount) {
		this.lastPaymentAmount = lastPaymentAmount;
	}

	public String getRemittanceInformation() {
		return remittanceInformation;
	}

	public void setRemittanceInformation(String remittanceInformation) {
		this.remittanceInformation = remittanceInformation;
	}

	public PaymentDayofWeek getPaymentDayOfWeek() {
		return paymentDayOfWeek;
	}

	public void setPaymentDayOfWeek(PaymentDayofWeek paymentDayOfWeek) {
		this.paymentDayOfWeek = paymentDayOfWeek;
	}

	public PmtWeekOfMonth getPaymentWeekOfMonth() {
		return paymentWeekOfMonth;
	}

	public void setPaymentWeekOfMonth(PmtWeekOfMonth paymentWeekOfMonth) {
		this.paymentWeekOfMonth = paymentWeekOfMonth;
	}

	public Integer getPaymentDateInMonth() {
		return paymentDateInMonth;
	}

	public void setPaymentDateInMonth(Integer paymentDateInMonth) {
		this.paymentDateInMonth = paymentDateInMonth;
	}

	public String getPaymentCustomFrequency() {
		return paymentCustomFrequency;
	}

	public void setPaymentCustomFrequency(String paymentCustomFrequency) {
		this.paymentCustomFrequency = paymentCustomFrequency;
	}

	public Boolean getTwoPaymentsSamePeriod() {
		return twoPaymentsSamePeriod;
	}

	public void setTwoPaymentsSamePeriod(Boolean twoPaymentsSamePeriod) {
		this.twoPaymentsSamePeriod = twoPaymentsSamePeriod;
	}

	public PaymentScheduleStatus getPaymentScheduleStatus() {
		return paymentScheduleStatus;
	}

	public void setPaymentScheduleStatus(PaymentScheduleStatus paymentScheduleStatus) {
		this.paymentScheduleStatus = paymentScheduleStatus;
	}

	@Override
	public String toString() {
		return "PaymentSchedule [scheduleId=" + scheduleId + ", paymentFrequency=" + paymentFrequency + ", paymentType="
				+ paymentType + ", startDate=" + startDate + ", numberOfPayments=" + numberOfPayments
				+ ", paymentAmount=" + paymentAmount + ", firstPaymentAmount=" + firstPaymentAmount
				+ ", lastPaymentAmount=" + lastPaymentAmount + ", remittanceInformation=" + remittanceInformation
				+ ", paymentDayOfWeek=" + paymentDayOfWeek + ", paymentWeekOfMonth=" + paymentWeekOfMonth
				+ ", paymentDateInMonth=" + paymentDateInMonth + ", paymentCustomFrequency=" + paymentCustomFrequency
				+ ", twoPaymentsSamePeriod=" + twoPaymentsSamePeriod + ", paymentScheduleStatus="
				+ paymentScheduleStatus + "]";
	}

}
