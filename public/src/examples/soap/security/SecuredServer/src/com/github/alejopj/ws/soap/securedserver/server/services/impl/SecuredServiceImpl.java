package com.github.alejopj.ws.soap.securedserver.server.services.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

import com.github.alejopj.ws.soap.securedserver.server.services.SecuredService;

@WebService(endpointInterface="com.github.alejopj.ws.soap.securedserver.server.services.SecuredService")
public class SecuredServiceImpl implements SecuredService {
	
	@Resource
    WebServiceContext wsctx;
	
	private static String USER = "user";
	private static String PASSWORD = "password";
	private static String TOKEN = "1234";
	
	@Override
	public String authenticate() {

		MessageContext mctx = wsctx.getMessageContext();
		Map<?, ?> http_headers = (Map<?, ?>) mctx.get(MessageContext.HTTP_REQUEST_HEADERS);
        List<?> users = (List<?>) http_headers.get("user");
        List<?> passwords = (List<?>) http_headers.get("password");
        
        String user = "";
        String password = "";
        
        if (users != null) {
        	user = users.get(0).toString();
        }
        if (passwords != null) {
        	password = passwords.get(0).toString();
        }
        
        if (user.equals(USER) && password.equals(PASSWORD)) {
        	return TOKEN;
        } else {
        	return "Nope!";
        }
	}

	@Override
	public String whatTimeIsIt() {
		
		MessageContext mctx = wsctx.getMessageContext();
		Map<?, ?> http_headers = (Map<?, ?>) mctx.get(MessageContext.HTTP_REQUEST_HEADERS);
        List<?> tokens = (List<?>) http_headers.get("token");
        String token = "";
        
        if (tokens != null) {
        	token = tokens.get(0).toString();
        }
        
        if (token.equals(TOKEN)) {
        	return "" + System.currentTimeMillis();
        } else {
        	return "Nope!";
        }
	}
}
