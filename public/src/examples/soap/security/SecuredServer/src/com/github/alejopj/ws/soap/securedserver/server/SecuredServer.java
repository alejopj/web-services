package com.github.alejopj.ws.soap.securedserver.server;

import javax.xml.ws.Endpoint;

import com.github.alejopj.ws.soap.securedserver.server.services.SecuredService;
import com.github.alejopj.ws.soap.securedserver.server.services.impl.SecuredServiceImpl;

public class SecuredServer {
	
	private static String uri = "http://localhost:8080/secured-service";
	private static SecuredService service = new SecuredServiceImpl();
	
	public static void main(String[] args) {
		
		Endpoint.publish(uri, service);
	}

}
