package com.sentenial.rest.client.api.directdebit.dto;

import java.math.BigDecimal;

public class RevokeAllDirectDebitsResponse {

	
	private String uri;
	
	private RevokeAllDirectDebitsSummary data;
	
	
	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public RevokeAllDirectDebitsSummary getData() {
		return data;
	}

	public void setData(RevokeAllDirectDebitsSummary data) {
		this.data = data;
	}


	public class RevokeAllDirectDebitsSummary{
		
		private String uri;
		
		private Integer totalTransactionsRevoked;
		
		private BigDecimal totalAmountRevoked;

		
		public String getUri() {
			return uri;
		}

		public void setUri(String uri) {
			this.uri = uri;
		}

		public Integer getTotalTransactionsRevoked() {
			return totalTransactionsRevoked;
		}

		public void setTotalTransactionsRevoked(Integer totalTransactionsRevoked) {
			this.totalTransactionsRevoked = totalTransactionsRevoked;
		}

		public BigDecimal getTotalAmountRevoked() {
			return totalAmountRevoked;
		}

		public void setTotalAmountRevoked(BigDecimal totalAmountRevoked) {
			this.totalAmountRevoked = totalAmountRevoked;
		}
	}

}
