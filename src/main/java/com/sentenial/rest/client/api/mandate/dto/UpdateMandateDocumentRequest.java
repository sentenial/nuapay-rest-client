package com.sentenial.rest.client.api.mandate.dto;

public class UpdateMandateDocumentRequest {

	private String fileName;

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public String toString() {
		return "UpdateMandateDocumentRequest [fileName=" + fileName + "]";
	}
}
