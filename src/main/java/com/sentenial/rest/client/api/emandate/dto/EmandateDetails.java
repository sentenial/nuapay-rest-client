package com.sentenial.rest.client.api.emandate.dto;

import java.util.Date;

public class EmandateDetails {

	private String token;
	private Date createDate;
	private Date authenticationDate;
	private MerchantDetails merchantDetails;
	private DebtorDetails debtorDetails;
	
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getAuthenticationDate() {
		return authenticationDate;
	}
	public void setAuthenticationDate(Date authenticationDate) {
		this.authenticationDate = authenticationDate;
	}
	public MerchantDetails getMerchantDetails() {
		return merchantDetails;
	}
	public void setMerchantDetails(MerchantDetails merchantDetails) {
		this.merchantDetails = merchantDetails;
	}
	public DebtorDetails getDebtorDetails() {
		return debtorDetails;
	}
	public void setDebtorDetails(DebtorDetails debtorDetails) {
		this.debtorDetails = debtorDetails;
	}
	@Override
	public String toString() {
		return "EmandateDetails [token=" + token + ", createDate=" + createDate + ", authenticationDate="
				+ authenticationDate + ", merchantDetails=" + merchantDetails + ", debtorDetails=" + debtorDetails
				+ "]";
	}
}