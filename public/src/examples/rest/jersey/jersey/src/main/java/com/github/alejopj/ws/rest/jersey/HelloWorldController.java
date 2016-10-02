package com.github.alejopj.ws.rest.jersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloWorldController {

	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public String getHello(@QueryParam("name") String name) {
		String who = name != null ? name : "world";
		return "Hello " + who + "!";
	}
}
