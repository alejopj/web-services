
package com.github.alejopj.ws.soap.helloworld.server.services.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "sayHelloTo", namespace = "http://services.server.helloworld.soap.ws.alejopj.github.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sayHelloTo", namespace = "http://services.server.helloworld.soap.ws.alejopj.github.com/")
public class SayHelloTo {

    @XmlElement(name = "name", namespace = "")
    private String name;

    /**
     * 
     * @return
     *     returns String
     */
    public String getName() {
        return this.name;
    }

    /**
     * 
     * @param name
     *     the value for the name property
     */
    public void setName(String name) {
        this.name = name;
    }

}
