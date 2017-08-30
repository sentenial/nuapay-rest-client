package com.sentenial.rest.client.api.paymentschedule.dto;

import java.util.List;

import com.sentenial.rest.client.api.common.resource.ResourceLink;
import com.sentenial.rest.client.api.common.resource.RestResponseEnvelopeInner;

public class PaymentScheduleResource extends RestResponseEnvelopeInner<PaymentSchedule> {

	private List<ResourceLink> links;

	public List<ResourceLink> getLinks() {
		return links;
	}

	public void setLinks(List<ResourceLink> links) {
		this.links = links;
	}

	@Override
	public String toString() {
		return "PaymentScheduleResource [id=" + getId() + ", uri=" + getUri() + ", wrapped=" + getWrapped() + ", links=" + links + "]";
	}
}
