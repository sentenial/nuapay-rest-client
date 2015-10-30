package com.sentenial.rest.client.api.common.resource;

import java.util.ArrayList;
import java.util.List;

public class RestPaginatedCollectionResponseEnvelope<T, S extends RestResponseEnvelopeInner<T>> extends RestCollectionResponseEnvelope<T, S>{

	
	private RestResponsePaginationDetails page;
	
	private List<String> sort = new ArrayList<String>();
	
	
	public RestResponsePaginationDetails getPage() {
		return page;
	}

	public void setPage(RestResponsePaginationDetails page) {
		this.page = page;
	}

	public List<String> getSort() {
		return sort;
	}

	public void setSort(List<String> sort) {
		this.sort = sort;
	}

	@Override
	public String toString() {
		return "RestPaginatedCollectionResponseEnvelope [uri=" + getUri() + ", data=" + getData() 
				+ ", page=" + page + ", sort=" + sort + ", getUri()=" + "]";
	}
}
