package com.sentenial.rest.client.api.directdebit.dto;

import java.util.Date;

import com.sentenial.rest.client.api.common.resource.PagingRequestParameters;
import com.sentenial.rest.client.utils.DateUtils;

public class ListFailedDirectDebitRequestParameters extends PagingRequestParameters{

	
	private Date rejectCreateFrom;
	
	private Date rejectCreateTo;
	
	private Boolean technicalRejects;
	
	
	public String generateRequestParamsString(){
		
		StringBuilder builder = new StringBuilder();
		
		if (rejectCreateFrom != null){
			builder.append("rejectCreateFrom=" + DateUtils.fromDate(rejectCreateFrom) + "&");
		}
		if (rejectCreateTo != null){
			builder.append("rejectCreateTo=" + DateUtils.fromDate(rejectCreateTo) + "&");
		}
		if (technicalRejects != null){
			builder.append("technicalRejects=" + technicalRejects + "&");
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

	public ListFailedDirectDebitRequestParameters withRejectCreateFrom(Date rejectCreateFrom) {
		this.rejectCreateFrom = rejectCreateFrom;
		return this;
	}

	public ListFailedDirectDebitRequestParameters withRejectCreateTo(Date rejectCreateTo) {
		this.rejectCreateTo = rejectCreateTo;
		return this;
	}

	public ListFailedDirectDebitRequestParameters withTechnicalRejects(Boolean technicalRejects) {
		this.technicalRejects = technicalRejects;
		return this;
	}

	public Date getRejectCreateFrom() {
		return rejectCreateFrom;
	}

	public void setRejectCreateFrom(Date rejectCreateFrom) {
		this.rejectCreateFrom = rejectCreateFrom;
	}

	public Date getRejectCreateTo() {
		return rejectCreateTo;
	}

	public void setRejectCreateTo(Date rejectCreateTo) {
		this.rejectCreateTo = rejectCreateTo;
	}

	public Boolean getTechnicalRejects() {
		return technicalRejects;
	}

	public void setTechnicalRejects(Boolean technicalRejects) {
		this.technicalRejects = technicalRejects;
	}

}
