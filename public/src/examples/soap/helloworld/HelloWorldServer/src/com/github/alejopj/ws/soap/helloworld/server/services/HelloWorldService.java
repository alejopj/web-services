package com.github.alejopj.ws.soap.helloworld.server.services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface HelloWorldService {

	@WebMethod
	@WebResult(name = "hello")
	public String sayHelloWorld();
	
	@WebMethod
	@WebResult(name = "hello")
	public String sayHelloTo(@WebParam(name = "name") String name);
	
	@WebMethod
	public void thankYou(@WebParam(name = "name") String name);
}
