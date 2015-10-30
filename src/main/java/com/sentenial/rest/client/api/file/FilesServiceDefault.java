package com.sentenial.rest.client.api.file;

import com.sentenial.rest.client.api.common.service.AbstractServiceDefault;
import com.sentenial.rest.client.api.common.service.ServiceConfiguration;
import com.sentenial.rest.client.api.file.dto.UploadFileRequest;
import com.sentenial.rest.client.api.file.dto.UploadFileResponse;
import com.sentenial.rest.client.utils.JsonUtils;

public class FilesServiceDefault extends AbstractServiceDefault implements FilesService{

	public static final String UPLOAD_FILE = "/files";


	public FilesServiceDefault(ServiceConfiguration serviceConfiguration) {
		super(serviceConfiguration);
	}

	@Override
	public UploadFileResponse uploadFile(UploadFileRequest uploadFileRequest, byte[] fileContent) {

		String url = getApiUri() + UPLOAD_FILE;
		String payload = JsonUtils.toJson(uploadFileRequest);

		return JsonUtils.fromJson(httpClient.postMultipart(url, headers(), "json", payload, "file", fileContent), UploadFileResponse.class);
	}

}
