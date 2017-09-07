package com.sentenial.rest.client.api.error;

public class ErrorDetail {

	private String code;
	private String description;
    private String field;

	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}


	@Override
	public String toString() {
		return "ErrorDetail [code=" + code + ", description=" + description + ", field=" + field + "]";
	}


}
