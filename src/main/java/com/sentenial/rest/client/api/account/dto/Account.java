package com.sentenial.rest.client.api.account.dto;

public class Account {


	private String iban;	

	private String domesticAccountNumber;

	private String accountCountry;

	private String domesticBankCode;

	private String domesticBranchCode;

	private String domesticCheckSum;

	private String bic;


	public Account withIban(String iban) {
		this.iban = iban;
		return this;
	}

	public Account withDomesticAccountNumber(String domesticAccountNumber) {
		this.domesticAccountNumber = domesticAccountNumber;
		return this;
	}

	public Account withAccountCountry(String accountCountry) {
		this.accountCountry = accountCountry;
		return this;
	}

	public Account withDomesticBankCode(String domesticBankCode) {
		this.domesticBankCode = domesticBankCode;
		return this;
	}

	public Account withDomesticBranchCode(String domesticBranchCode) {
		this.domesticBranchCode = domesticBranchCode;
		return this;
	}

	public Account withDomesticCheckSum(String domesticCheckSum) {
		this.domesticCheckSum = domesticCheckSum;
		return this;
	}

	public Account withBic(String bic) {
		this.bic = bic;
		return this;
	}


	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public String getDomesticAccountNumber() {
		return domesticAccountNumber;
	}

	public void setDomesticAccountNumber(String domesticAccountNumber) {
		this.domesticAccountNumber = domesticAccountNumber;
	}

	public String getAccountCountry() {
		return accountCountry;
	}

	public void setAccountCountry(String accountCountry) {
		this.accountCountry = accountCountry;
	}

	public String getDomesticBankCode() {
		return domesticBankCode;
	}

	public void setDomesticBankCode(String domesticBankCode) {
		this.domesticBankCode = domesticBankCode;
	}

	public String getDomesticBranchCode() {
		return domesticBranchCode;
	}

	public void setDomesticBranchCode(String domesticBranchCode) {
		this.domesticBranchCode = domesticBranchCode;
	}

	public String getDomesticCheckSum() {
		return domesticCheckSum;
	}

	public void setDomesticCheckSum(String domesticCheckSum) {
		this.domesticCheckSum = domesticCheckSum;
	}

	public String getBic() {
		return bic;
	}

	public void setBic(String bic) {
		this.bic = bic;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountCountry == null) ? 0 : accountCountry.hashCode());
		result = prime * result + ((bic == null) ? 0 : bic.hashCode());
		result = prime * result + ((domesticAccountNumber == null) ? 0 : domesticAccountNumber.hashCode());
		result = prime * result + ((domesticBankCode == null) ? 0 : domesticBankCode.hashCode());
		result = prime * result + ((domesticBranchCode == null) ? 0 : domesticBranchCode.hashCode());
		result = prime * result + ((domesticCheckSum == null) ? 0 : domesticCheckSum.hashCode());
		result = prime * result + ((iban == null) ? 0 : iban.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (accountCountry == null) {
			if (other.accountCountry != null)
				return false;
		} else if (!accountCountry.equals(other.accountCountry))
			return false;
		if (bic == null) {
			if (other.bic != null)
				return false;
		} else if (!bic.equals(other.bic))
			return false;
		if (domesticAccountNumber == null) {
			if (other.domesticAccountNumber != null)
				return false;
		} else if (!domesticAccountNumber.equals(other.domesticAccountNumber))
			return false;
		if (domesticBankCode == null) {
			if (other.domesticBankCode != null)
				return false;
		} else if (!domesticBankCode.equals(other.domesticBankCode))
			return false;
		if (domesticBranchCode == null) {
			if (other.domesticBranchCode != null)
				return false;
		} else if (!domesticBranchCode.equals(other.domesticBranchCode))
			return false;
		if (domesticCheckSum == null) {
			if (other.domesticCheckSum != null)
				return false;
		} else if (!domesticCheckSum.equals(other.domesticCheckSum))
			return false;
		if (iban == null) {
			if (other.iban != null)
				return false;
		} else if (!iban.equals(other.iban))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Account [iban=" + iban + ", domesticAccountNumber=" + domesticAccountNumber + ", accountCountry="
				+ accountCountry + ", domesticBankCode=" + domesticBankCode + ", domesticBranchCode="
				+ domesticBranchCode + ", domesticCheckSum=" + domesticCheckSum + ", bic=" + bic + "]";
	}

}
