package com.sentenial.rest.client.api.emandate.dto;

public class CreateEmandateRequest{

	private MerchantDetails merchantDetails;
	private DebtorDetails debtorDetails;
	
	public CreateEmandateRequest withMerchantDetails(MerchantDetails merchantDetails) {
		this.merchantDetails = merchantDetails;
		return this;
	}

	public CreateEmandateRequest withDebtorDetails(DebtorDetails debtorDetails) {
		this.debtorDetails = debtorDetails;
		return this;
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
}
