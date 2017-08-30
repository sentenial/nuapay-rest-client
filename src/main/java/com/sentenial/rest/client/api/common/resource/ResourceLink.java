package com.sentenial.rest.client.api.common.resource;

public class ResourceLink {

	private String resourceType;
	private String id;
	private String uri;

	public String getResourceType() {
		return resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	@Override
	public String toString() {
		return "ResourceLink [resourceType=" + resourceType + ", id=" + id + ", uri=" + uri + "]";
	}

}
