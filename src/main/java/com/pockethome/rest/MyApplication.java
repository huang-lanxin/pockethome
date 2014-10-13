package com.pockethome.rest;

import org.glassfish.jersey.server.ResourceConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.pockethome.rest.resources.PingResource;

public class MyApplication extends ResourceConfig {
	
	private static final Logger logger = LoggerFactory.getLogger(MyApplication.class);

	public MyApplication() {
		logger.info("Registering resources.....");
		registerClasses(PingResource.class);
	}

}
