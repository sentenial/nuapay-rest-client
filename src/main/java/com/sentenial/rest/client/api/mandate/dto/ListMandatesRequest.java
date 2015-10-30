package com.sentenial.rest.client.api.mandate.dto;

import java.util.Date;

public class ListMandatesRequest {

	
	private String debtoriban;
	
	private String debtorname;
	
	private Date createdatefrom;
	
	private Date createdateto;
	
	private String mandateid;
	
	private MandateStatus mandatestatus;

	
	public String getDebtoriban() {
		return debtoriban;
	}

	public void setDebtoriban(String debtoriban) {
		this.debtoriban = debtoriban;
	}

	public String getDebtorname() {
		return debtorname;
	}

	public void setDebtorname(String debtorname) {
		this.debtorname = debtorname;
	}

	public Date getCreatedatefrom() {
		return createdatefrom;
	}

	public void setCreatedatefrom(Date createdatefrom) {
		this.createdatefrom = createdatefrom;
	}

	public Date getCreatedateto() {
		return createdateto;
	}

	public void setCreatedateto(Date createdateto) {
		this.createdateto = createdateto;
	}

	public String getMandateid() {
		return mandateid;
	}

	public void setMandateid(String mandateid) {
		this.mandateid = mandateid;
	}

	public MandateStatus getMandatestatus() {
		return mandatestatus;
	}

	public void setMandatestatus(MandateStatus mandatestatus) {
		this.mandatestatus = mandatestatus;
	}

}
