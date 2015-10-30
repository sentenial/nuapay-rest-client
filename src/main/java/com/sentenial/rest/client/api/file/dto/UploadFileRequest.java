package com.sentenial.rest.client.api.file.dto;

import com.sentenial.rest.client.api.common.dto.FileType;
import com.sentenial.rest.client.api.common.dto.SchemeType;

public class UploadFileRequest {

	
	private FileType fileType;
	
	private String fileFormat;
	
	private SchemeType schemeType;
	
	private String creditorSchemeId;
	
	private String fileName;
	
	
	public UploadFileRequest withFileType(FileType fileType) {
		this.fileType = fileType;
		return this;
	}

	public UploadFileRequest withFileFormat(String fileFormat) {
		this.fileFormat = fileFormat;
		return this;
	}

	public UploadFileRequest withSchemeType(SchemeType schemeType) {
		this.schemeType = schemeType;
		return this;
	}

	public UploadFileRequest withCreditorSchemeId(String creditorSchemeId) {
		this.creditorSchemeId = creditorSchemeId;
		return this;
	}

	public UploadFileRequest withFileName(String fileName) {
		this.fileName = fileName;
		return this;
	}

	public FileType getFileType() {
		return fileType;
	}

	public void setFileType(FileType fileType) {
		this.fileType = fileType;
	}

	public String getFileFormat() {
		return fileFormat;
	}

	public void setFileFormat(String fileFormat) {
		this.fileFormat = fileFormat;
	}

	public SchemeType getSchemeType() {
		return schemeType;
	}

	public void setSchemeType(SchemeType schemeType) {
		this.schemeType = schemeType;
	}

	public String getCreditorSchemeId() {
		return creditorSchemeId;
	}

	public void setCreditorSchemeId(String creditorSchemeId) {
		this.creditorSchemeId = creditorSchemeId;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

}
