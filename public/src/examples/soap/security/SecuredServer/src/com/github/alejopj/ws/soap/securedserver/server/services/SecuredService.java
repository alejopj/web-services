package com.github.alejopj.ws.soap.securedserver.server.services;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface SecuredService {

	@WebMethod
	@WebResult(name = "authenticate")
	public String authenticate();
	
	@WebMethod
	@WebResult(name = "whatTimeIsIt")
	public String whatTimeIsIt();
}
