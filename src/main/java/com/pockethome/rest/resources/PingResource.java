package com.pockethome.rest.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

import com.pockethome.rest.beans.TestBean;

@Component
@Path("/test")
public class PingResource {

	@GET
	@Path("/ping")
	@Produces(MediaType.TEXT_PLAIN)
	public String ping() {
		return "Pong!";
	}

	@GET
	@Path("/getBean")
	@Produces(MediaType.APPLICATION_JSON)
	public TestBean getBean() {
		return new TestBean("0001", "Terry");
	}

}
