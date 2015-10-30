package com.sentenial.rest.client.api.error;

public class ErrorResponse {

	
    private String returnCode;
    
    private String returnDescription;
    
    
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
	
	@Override
	public String toString() {
		return "ErrorResponse [returnCode=" + returnCode + ", returnDescription=" + returnDescription + "]";
	}

}
