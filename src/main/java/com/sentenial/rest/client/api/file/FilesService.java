package com.sentenial.rest.client.api.file;

import com.sentenial.rest.client.api.file.dto.UploadFileRequest;
import com.sentenial.rest.client.api.file.dto.UploadFileResponse;

public interface FilesService {

	public UploadFileResponse uploadFile(UploadFileRequest uploadFileRequest, byte[] fileContent);
	
}
