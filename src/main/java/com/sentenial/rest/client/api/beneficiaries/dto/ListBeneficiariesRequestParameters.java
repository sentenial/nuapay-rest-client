package com.sentenial.rest.client.api.beneficiaries.dto;

import com.sentenial.rest.client.api.common.resource.PagingRequestParameters;

public class ListBeneficiariesRequestParameters extends PagingRequestParameters{

	
	private String beneficiaryIban;
	
	private String beneficiaryName;
	
	
	public String generateRequestParamsString(){
		StringBuilder builder = new StringBuilder();
		
		if (beneficiaryIban != null){
			builder.append("beneficiaryIban=" + beneficiaryIban + "&");
		}
		if (beneficiaryName != null){
			builder.append("beneficiaryName=" + beneficiaryName + "&");
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

	public ListBeneficiariesRequestParameters withBeneficiaryIban(String beneficiaryIban) {
		this.beneficiaryIban = beneficiaryIban;
		return this;
	}

	public ListBeneficiariesRequestParameters withBeneficiaryName(String beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
		return this;
	}

	public String getBeneficiaryIban() {
		return beneficiaryIban;
	}

	public void setBeneficiaryIban(String beneficiaryIban) {
		this.beneficiaryIban = beneficiaryIban;
	}

	public String getBeneficiaryName() {
		return beneficiaryName;
	}

	public void setBeneficiaryName(String beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
	}

	@Override
	public String toString() {
		return "ListBeneficiariesRequestParameters [beneficiaryIban=" + beneficiaryIban + ", beneficiaryName="
				+ beneficiaryName + "]";
	}

}
