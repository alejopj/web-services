package com.github.alejopj.ws.soap.helloworld.client;

import com.github.alejopj.ws.soap.helloworld.server.services.impl.HelloWorldService;
import com.github.alejopj.ws.soap.helloworld.server.services.impl.HelloWorldServiceImplService;

public class HelloWorldClient {
	
	private static String NAME = "CIXUG";
	
	private static HelloWorldService service =
			new HelloWorldServiceImplService().getHelloWorldServiceImplPort();
	
	public static void main(String[] args) {
		
		String hello = service.sayHelloWorld();
		System.out.println(hello);
		
		String helloTo = service.sayHelloTo(NAME);
		System.out.println(helloTo);
		
		service.thankYou(NAME);
	}

}
