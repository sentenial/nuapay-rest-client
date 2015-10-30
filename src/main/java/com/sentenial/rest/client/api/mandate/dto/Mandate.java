package com.sentenial.rest.client.api.mandate.dto;

import com.sentenial.rest.client.api.common.dto.BasicAccount;

public class Mandate {

	
	private Debtor debtor;
	
	private MandateInfo mandateInfo;
	
	private BasicAccount debtorAccount;
	
	private BasicAccount creditorAccount;

	
	public Mandate withDebtor(Debtor debtor) {
		this.debtor = debtor;
		return this;
	}
	
	public Mandate withMandateInfo(MandateInfo mandateInfo) {
		this.mandateInfo = mandateInfo;
		return this;
	}
	
	public Mandate withDebtorAccount(BasicAccount debtorAccount) {
		this.debtorAccount = debtorAccount;
		return this;
	}
	
	public Mandate withCreditorAccount(BasicAccount creditorAccount) {
		this.creditorAccount = creditorAccount;
		return this;
	}
	
	public Debtor getDebtor() {
		return debtor;
	}

	public void setDebtor(Debtor debtor) {
		this.debtor = debtor;
	}

	public MandateInfo getMandateInfo() {
		return mandateInfo;
	}

	public void setMandateInfo(MandateInfo mandateInfo) {
		this.mandateInfo = mandateInfo;
	}

	public BasicAccount getDebtorAccount() {
		return debtorAccount;
	}

	public void setDebtorAccount(BasicAccount debtorAccount) {
		this.debtorAccount = debtorAccount;
	}

	public BasicAccount getCreditorAccount() {
		return creditorAccount;
	}

	public void setCreditorAccount(BasicAccount creditorAccount) {
		this.creditorAccount = creditorAccount;
	}

	@Override
	public String toString() {
		return "Mandate [debtor=" + debtor + ", mandateInfo=" + mandateInfo + ", debtorAccount=" + debtorAccount
				+ ", creditorAccount=" + creditorAccount + "]";
	}

}
