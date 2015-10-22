package com.sentenial.rest.client.examples;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sentenial.rest.client.api.common.service.ServiceConfiguration;
import com.sentenial.rest.client.api.creditorscheme.CreditorSchemeService;
import com.sentenial.rest.client.api.creditorscheme.CreditorSchemeServiceDefault;
import com.sentenial.rest.client.api.creditorscheme.dto.CreditorSchemeResource;

public class CreditorSchemeActions {

	private static final Logger logger = LoggerFactory.getLogger(CreditorSchemeActions.class);

	private CreditorSchemeService creditorSchemeService;
	
	public CreditorSchemeActions(ServiceConfiguration serviceConfiguration){
		this.creditorSchemeService = new CreditorSchemeServiceDefault(serviceConfiguration);
	}
	
	public List<CreditorSchemeResource> listCreditorSchemes(){
		List<CreditorSchemeResource> creditorSchemes = creditorSchemeService.listCreditorSchemes().getData();
		logger.info(creditorSchemes.toString());
		
		return creditorSchemes;
	}
	
}
