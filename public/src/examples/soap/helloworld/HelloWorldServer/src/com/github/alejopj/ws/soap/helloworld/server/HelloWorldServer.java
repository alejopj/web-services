package com.github.alejopj.ws.soap.helloworld.server;

import javax.xml.ws.Endpoint;

import com.github.alejopj.ws.soap.helloworld.server.services.HelloWorldService;
import com.github.alejopj.ws.soap.helloworld.server.services.impl.HelloWorldServiceImpl;

public class HelloWorldServer {
	
	private static String uri = "http://localhost:8080/hello-world-service";
	private static HelloWorldService service = new HelloWorldServiceImpl();
	
	public static void main(String[] args) {
		
		Endpoint.publish(uri, service);
	}

}
