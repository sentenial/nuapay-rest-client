package com.sentenial.rest.client.api.common.resource;

public class PagingRequestParameters {

	
	private Integer pageSize;
	
	private Integer pageNumber;
	
	
	public PagingRequestParameters withPageSize(Integer pagesize) {
		this.pageSize = pagesize;
		return this;
	}

	public PagingRequestParameters withPageNumber(Integer pagenumber) {
		this.pageNumber = pagenumber;
		return this;
	}

	public Integer getPagesize() {
		return pageSize;
	}

	public void setPageSize(Integer pagesize) {
		this.pageSize = pagesize;
	}

	public Integer getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(Integer pagenumber) {
		this.pageNumber = pagenumber;
	}
	
	public String generatePagingRequestParamsString(){
		StringBuilder builder = new StringBuilder();
		
		if (pageSize != null){
			builder.append("pagesize=" + pageSize + "&");
		}
		if (pageNumber != null){
			builder.append("pagenumber=" + pageNumber + "&");
		}
		
		return (builder.length() > 0)? builder.toString(): null;
	}

	@Override
	public String toString() {
		return "PagingRequestParameters [pagesize=" + pageSize + ", pagenumber=" + pageNumber + "]";
	}

}
