package com.sentenial.rest.client.api.error;

import java.util.List;


public class ErrorResponse {

	
    private String returnCode;
    
    private String returnDescription;
    
    private List<ErrorDetail> details;
    
	public String getReturnCode() {
		return returnCode;
	}
	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}

	public String getReturnDescription() {
		return returnDescription;
	}
	public void setReturnDescription(String returnDescription) {
		this.returnDescription = returnDescription;
	}
	
	public List<ErrorDetail> getDetails() {
		return details;
	}
	public void setDetails(List<ErrorDetail> details) {
		this.details = details;
	}


	@Override
	public String toString() {
		return "ErrorResponse [returnCode=" + returnCode + ", returnDescription=" + returnDescription + ", details="
				+ details + "]";
	}

}
