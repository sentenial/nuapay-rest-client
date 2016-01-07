package com.sentenial.rest.client.api.file;

import java.util.UUID;

import com.sentenial.rest.client.api.common.service.AbstractServiceDefault;
import com.sentenial.rest.client.api.common.service.ServiceConfiguration;
import com.sentenial.rest.client.api.file.dto.UploadFileRequest;
import com.sentenial.rest.client.api.file.dto.UploadFileResponse;
import com.sentenial.rest.client.utils.JsonUtils;

public class FilesServiceDefault extends AbstractServiceDefault implements FilesService{

	public static final String UPLOAD_FILE = "/files";
	private static final String CONTENT_TYPE_JSON = "application/json";
	private static final String CONTENT_TYPE_XML = "application/xml";


	public FilesServiceDefault(ServiceConfiguration serviceConfiguration) {
		super(serviceConfiguration);
	}

	@Override
	public UploadFileResponse uploadFile(UploadFileRequest uploadFileRequest, byte[] fileContent) {

		String url = getApiUri() + UPLOAD_FILE;
		String payload = JsonUtils.toJson(uploadFileRequest);

		return JsonUtils.fromJson(httpClient.postMultipart(url, headers(), "json", payload, CONTENT_TYPE_JSON,"file", fileContent,CONTENT_TYPE_XML, UUID.randomUUID().toString()), UploadFileResponse.class);
	}

}
