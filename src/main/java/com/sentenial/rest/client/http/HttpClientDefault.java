package com.sentenial.rest.client.http;

import static java.lang.String.format;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.apache.http.Consts;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicHeader;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sentenial.rest.client.api.common.service.SentenialException;
import com.sentenial.rest.client.api.error.ErrorResponse;
import com.sentenial.rest.client.utils.JsonUtils;

public class HttpClientDefault implements HttpClient {

	private static final Logger logger = LoggerFactory.getLogger(HttpClientDefault.class);

	public final static String CLIENT_VERSION = "1.0.0";

	public static final String CUSTOM_USER_AGENT = format("sentenial-java/%s", CLIENT_VERSION);

	protected enum RequestMethod {GET, POST, PUT, DELETE};
	
	private RequestConfig requestConfig;
	private CloseableHttpClient httpClient;

	private int httpConnectTimeout = 10000;
	private int httpReadTimeout = 30000;

	public HttpClientDefault() {
		initialize();
	}
	
	public void initialize(){
		requestConfig = RequestConfig.custom().setConnectTimeout(httpConnectTimeout).setSocketTimeout(httpReadTimeout).build();
		httpClient = HttpClientBuilder.create().setDefaultRequestConfig(requestConfig).build();
	}


	@Override
	public String get(String url, Map<String, String> headers) {
		return requestWithStringResult(RequestMethod.GET, url, headers, null);
	}

	@Override
	public byte[] getAsStream(String url, Map<String, String> headers) {
		return requestWithBytesResult(RequestMethod.GET, url, headers, null);
	}
	
	@Override
	public String post(String url, Map<String, String> headers, String payload) {
		return requestWithStringResult(RequestMethod.POST, url, headers, payload);
	}
	
	@Override
	public String postMultipart(String url, Map<String, String> headers, 
			String textPartName, String textPartPayload, 
			String filePartName, byte[] filePartPayload) {
		return requestPostMultiPartWithStringResult(url, headers, textPartName,textPartPayload, filePartName, filePartPayload);
	}
	
	@Override
	public String put(String url, Map<String, String> headers, String payload) {
		return requestWithStringResult(RequestMethod.PUT, url, headers, payload);
	}
	
	@Override
	public String delete(String url, Map<String, String> headers, String payload) {
		return requestWithStringResult(RequestMethod.DELETE, url, headers, payload);
	}

	private String requestPostMultiPartWithStringResult(String url, Map<String, String> headers, 
			String textPartName, String textPartPayload, 
			String filePartName, byte[] filePartPayload){

		MultipartEntityBuilder builder = MultipartEntityBuilder.create();
		builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
		builder.setContentType(ContentType.MULTIPART_FORM_DATA);

		builder.addBinaryBody(filePartName, filePartPayload, ContentType.APPLICATION_XML, UUID.randomUUID().toString());
		builder.addTextBody(textPartName, textPartPayload, ContentType.APPLICATION_JSON);
		
		HttpEntity multipartHttpEntity = builder.build();
		
		String result = null;
		try {
			HttpEntity httpEntity = requestHttpEntity(RequestMethod.POST, url, headers, multipartHttpEntity);
			result = EntityUtils.toString(httpEntity);
		} catch (ClientProtocolException e) {
			throw new SentenialException(format("Failed request [url: %s]", url), e);
		} catch (IOException e) {
			throw new SentenialException(format("Failed request [url: %s]", url), e);
		}
		
		return result;
	}
	
	private String requestWithStringResult(RequestMethod method, String url, Map<String, String> headers, String payload){
		
		HttpEntity requestEntity = null;
		if (payload != null){
			requestEntity = new StringEntity(payload, ContentType.APPLICATION_JSON);
		}
		
		String result = null;
		try {
			HttpEntity responseEntity = requestHttpEntity(method, url, headers, requestEntity);
			result = EntityUtils.toString(responseEntity);
		} catch (ClientProtocolException e) {
			throw new SentenialException(format("Failed request [url: %s]", url), e);
		} catch (IOException e) {
			throw new SentenialException(format("Failed request [url: %s]", url), e);
		}
		
		return result;
	}
	
	private byte[] requestWithBytesResult(RequestMethod method, String url, Map<String, String> headers, String payload){
		
		HttpEntity requestEntity = null;
		if (payload != null){
			requestEntity = new StringEntity(payload, ContentType.APPLICATION_JSON);
		}
		
		byte[] result = null;
		try {
			HttpEntity responseEntity = requestHttpEntity(method, url, headers, requestEntity);
			result = EntityUtils.toByteArray(responseEntity);
		} catch (ClientProtocolException e) {
			throw new SentenialException(format("Failed request [url: %s]", url), e);
		} catch (IOException e) {
			throw new SentenialException(format("Failed request [url: %s]", url), e);
		}
		
		return result;
	}
	
	
	private HttpEntity requestHttpEntity(RequestMethod method, String url, Map<String, String> headers, HttpEntity postEntity) 
			throws ClientProtocolException, IOException{
		
		HttpUriRequest request = null;
		
		if (method.equals(RequestMethod.GET)) {
			request = new HttpGet(url);
		} else if (method.equals(RequestMethod.POST)) {
			request = new HttpPost(url);
			((HttpPost)request).setEntity(postEntity);
		} else if (method.equals(RequestMethod.PUT)) {
			request = new HttpPut(url);
			((HttpPut)request).setEntity(postEntity);
		} else {
			throw new SentenialException(format("Unsupported Request Method [method: %s, url: %s]", method, url));
		}
		
		Map<String, String> finalHeaders = new HashMap<String, String>();
		finalHeaders.put("User-Agent", CUSTOM_USER_AGENT);
		finalHeaders.putAll(headers);
		request.setHeaders(transformHeaders(finalHeaders));

		HttpResponse response;
		response = httpClient.execute(request);
		int statusCode = response.getStatusLine().getStatusCode();

		if (statusCode < 500 && statusCode >= 400) {
			throw new SentenialException(url, statusCode, JsonUtils.fromJson(EntityUtils.toString(response.getEntity(), Consts.UTF_8), ErrorResponse.class));
		} else if (statusCode < 200 || statusCode >= 300) {
			throw new SentenialException(url, statusCode, EntityUtils.toString(response.getEntity(), Consts.UTF_8));
		}   
		
		return response.getEntity();
	}

	private static Header[] transformHeaders(Map<String, String> headers){
		
		List<Header> headerList = new ArrayList<Header>();
		
		for (Map.Entry<String, String> headerEntry : headers.entrySet()) {
			headerList.add(new BasicHeader(headerEntry.getKey(), headerEntry.getValue()));
		}
		
		return headerList.toArray(new Header[headerList.size()]);
	}

	public void setHttpConnectTimeout(int httpConnectTimeout) {
		this.httpConnectTimeout = httpConnectTimeout;
	}

	public void setHttpReadTimeout(int httpReadTimeout) {
		this.httpReadTimeout = httpReadTimeout;
	}
	
	

}
