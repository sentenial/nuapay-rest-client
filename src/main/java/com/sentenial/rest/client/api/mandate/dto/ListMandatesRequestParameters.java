package com.sentenial.rest.client.api.mandate.dto;

import java.util.Date;

import com.sentenial.rest.client.api.common.resource.PagingRequestParameters;
import com.sentenial.rest.client.utils.DateUtils;

public class ListMandatesRequestParameters extends PagingRequestParameters{

	
	private String debtorIban;
	
	private String debtorName;
	
	private Date createDateFrom;
	
	private Date createDateTo;
	
	private String mandateId;
	
	private MandateStatus mandateStatus;
	
	
	public String generateRequestParamsString(){
		StringBuilder builder = new StringBuilder();
		
		if (debtorIban != null){
			builder.append("debtoriban=" + debtorIban + "&");
		}
		if (debtorName != null){
			builder.append("debtorname=" + debtorName + "&");
		}
		if (createDateFrom != null){
			builder.append("createdatefrom=" + DateUtils.fromDate(createDateFrom) + "&");
		}
		if (createDateTo != null){
			builder.append("createdateto=" + DateUtils.fromDate(createDateTo) + "&");
		}
		if (mandateId != null){
			builder.append("mandateid=" + mandateId + "&");
		}
		if (mandateStatus != null){
			builder.append("mandatestatus=" + mandateStatus + "&");
		}
		String paging = super.generatePagingRequestParamsString();
		if (paging != null){
			builder.append(paging);
		}
		
		if (builder.length() > 0){
			builder.insert(0, "?");
			if (builder.charAt(builder.length() - 1) == '&') {
				builder.deleteCharAt(builder.length() - 1);
			}
		}
		
		return builder.toString();
	}

	public ListMandatesRequestParameters withDebtorIban(String debtorIban) {
		this.debtorIban = debtorIban;
		return this;
	}

	public ListMandatesRequestParameters withDebtorName(String debtorName) {
		this.debtorName = debtorName;
		return this;
	}

	public ListMandatesRequestParameters withCreateDateFrom(Date createDateFrom) {
		this.createDateFrom = createDateFrom;
		return this;
	}

	public ListMandatesRequestParameters withCreateDateTo(Date createDateTo) {
		this.createDateTo = createDateTo;
		return this;
	}
	
	public ListMandatesRequestParameters withMandateId(String mandateId) {
		this.mandateId = mandateId;
		return this;
	}

	public ListMandatesRequestParameters withMandateStatus(MandateStatus mandateStatus) {
		this.mandateStatus = mandateStatus;
		return this;
	}

	public String getDebtorIban() {
		return debtorIban;
	}

	public void setDebtorIban(String debtorIban) {
		this.debtorIban = debtorIban;
	}

	public String getDebtorName() {
		return debtorName;
	}

	public void setDebtorName(String debtorName) {
		this.debtorName = debtorName;
	}

	public Date getCreateDateFrom() {
		return createDateFrom;
	}

	public void setCreateDateFrom(Date createDateFrom) {
		this.createDateFrom = createDateFrom;
	}

	public Date getCreateDateTo() {
		return createDateTo;
	}

	public void setCreateDateTo(Date createDateTo) {
		this.createDateTo = createDateTo;
	}

	public String getMandateId() {
		return mandateId;
	}

	public void setMandateId(String mandateId) {
		this.mandateId = mandateId;
	}

	public MandateStatus getMandateStatus() {
		return mandateStatus;
	}

	public void setMandateStatus(MandateStatus mandateStatus) {
		this.mandateStatus = mandateStatus;
	}

	@Override
	public String toString() {
		return "ListMandatesRequestParameters [debtorIban=" + debtorIban + ", debtorName=" + debtorName
				+ ", createDateFrom=" + createDateFrom + ", createDateTo=" + createDateTo + ", mandateId=" + mandateId
				+ ", mandateStatus=" + mandateStatus + "]";
	}

}
