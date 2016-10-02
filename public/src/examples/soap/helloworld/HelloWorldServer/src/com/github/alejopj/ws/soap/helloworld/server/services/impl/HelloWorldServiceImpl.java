package com.github.alejopj.ws.soap.helloworld.server.services.impl;

import javax.jws.WebService;

import com.github.alejopj.ws.soap.helloworld.server.services.HelloWorldService;

@WebService(endpointInterface="com.github.alejopj.ws.soap.helloworld.server.services.HelloWorldService")
public class HelloWorldServiceImpl implements HelloWorldService {
	
	@Override
	public String sayHelloWorld() {

		return "Hello world!";
	}

	@Override
	public String sayHelloTo(String name) {
		
		return "Hello " + name + "!";
	}
	
	@Override
	public void thankYou(String name) {
		System.out.println(name + " has said thank you to me!");
	}

}
