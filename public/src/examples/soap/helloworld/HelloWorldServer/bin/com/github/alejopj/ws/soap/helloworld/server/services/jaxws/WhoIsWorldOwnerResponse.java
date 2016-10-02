
package com.github.alejopj.ws.soap.helloworld.server.services.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "whoIsWorldOwnerResponse", namespace = "http://services.server.helloworld.soap.ws.alejopj.github.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "whoIsWorldOwnerResponse", namespace = "http://services.server.helloworld.soap.ws.alejopj.github.com/")
public class WhoIsWorldOwnerResponse {

    @XmlElement(name = "worldOwner", namespace = "")
    private com.github.alejopj.ws.soap.helloworld.entities.WorldOwner worldOwner;

    /**
     * 
     * @return
     *     returns WorldOwner
     */
    public com.github.alejopj.ws.soap.helloworld.entities.WorldOwner getWorldOwner() {
        return this.worldOwner;
    }

    /**
     * 
     * @param worldOwner
     *     the value for the worldOwner property
     */
    public void setWorldOwner(com.github.alejopj.ws.soap.helloworld.entities.WorldOwner worldOwner) {
        this.worldOwner = worldOwner;
    }

}
