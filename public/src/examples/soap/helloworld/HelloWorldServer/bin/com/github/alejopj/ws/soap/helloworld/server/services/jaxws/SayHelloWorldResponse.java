
package com.github.alejopj.ws.soap.helloworld.server.services.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "sayHelloWorldResponse", namespace = "http://services.server.helloworld.soap.ws.alejopj.github.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sayHelloWorldResponse", namespace = "http://services.server.helloworld.soap.ws.alejopj.github.com/")
public class SayHelloWorldResponse {

    @XmlElement(name = "hello", namespace = "")
    private String hello;

    /**
     * 
     * @return
     *     returns String
     */
    public String getHello() {
        return this.hello;
    }

    /**
     * 
     * @param hello
     *     the value for the hello property
     */
    public void setHello(String hello) {
        this.hello = hello;
    }

}
