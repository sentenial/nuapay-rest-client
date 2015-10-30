package com.sentenial.rest.client.api.directdebit.dto;

import java.math.BigDecimal;
import java.util.Date;

public class RepresentDirectDebitRequest {

	
	private Date representationDate;
	
	private BigDecimal representationFee;
	
	private String endToEndId;

	
	public RepresentDirectDebitRequest withRepresentationDate(Date representationDate) {
		this.representationDate = representationDate;
		return this;
	}

	public RepresentDirectDebitRequest withRepresentationFee(BigDecimal representationFee) {
		this.representationFee = representationFee;
		return this;
	}

	public RepresentDirectDebitRequest withEndToEndId(String endToEndId) {
		this.endToEndId = endToEndId;
		return this;
	}

	public Date getRepresentationDate() {
		return representationDate;
	}

	public void setRepresentationDate(Date representationDate) {
		this.representationDate = representationDate;
	}

	public BigDecimal getRepresentationFee() {
		return representationFee;
	}

	public void setRepresentationFee(BigDecimal representationFee) {
		this.representationFee = representationFee;
	}

	public String getEndToEndId() {
		return endToEndId;
	}

	public void setEndToEndId(String endToEndId) {
		this.endToEndId = endToEndId;
	}

	@Override
	public String toString() {
		return "RepresentDirectDebitRequest [representationDate=" + representationDate + ", representationFee="
				+ representationFee + ", endToEndId=" + endToEndId + "]";
	}

}
