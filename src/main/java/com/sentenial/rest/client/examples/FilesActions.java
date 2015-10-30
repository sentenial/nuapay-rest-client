package com.sentenial.rest.client.examples;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sentenial.rest.client.api.common.dto.FileType;
import com.sentenial.rest.client.api.common.dto.SchemeType;
import com.sentenial.rest.client.api.common.service.ServiceConfiguration;
import com.sentenial.rest.client.api.file.FilesService;
import com.sentenial.rest.client.api.file.FilesServiceDefault;
import com.sentenial.rest.client.api.file.dto.UploadFileRequest;
import com.sentenial.rest.client.api.file.dto.UploadFileResponse;

public class FilesActions {

	private static final Logger logger = LoggerFactory.getLogger(FilesActions.class);

	private FilesService filesService;
	
	public FilesActions(ServiceConfiguration serviceConfiguration){
		this.filesService = new FilesServiceDefault(serviceConfiguration);
	}
	
	public String uploadFile(){

		File file = new File("f://import.xml");
		
		byte[] fileContent;
		try {
			fileContent = FileUtils.readFileToByteArray(file);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		
		UploadFileRequest uploadFileRequest = 
				new UploadFileRequest()
					.withFileType(FileType.DD)
					.withFileName("12345.xml")
					.withFileFormat("BE_SCHEME")
					.withSchemeType(SchemeType.CORE)
					.withCreditorSchemeId("CreditorSchemeName");
		
		UploadFileResponse uploadFileResponse = filesService.uploadFile(uploadFileRequest, fileContent);
		
		logger.info(uploadFileResponse.getData().getId());
		
		return uploadFileResponse.getData().getId();
	}
		
}
