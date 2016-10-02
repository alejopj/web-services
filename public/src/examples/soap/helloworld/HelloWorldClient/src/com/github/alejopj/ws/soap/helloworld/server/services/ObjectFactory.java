
package com.github.alejopj.ws.soap.helloworld.server.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.github.alejopj.ws.soap.helloworld.server.services package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SayHelloWorldResponse_QNAME = new QName("http://services.server.helloworld.soap.ws.alejopj.github.com/", "sayHelloWorldResponse");
    private final static QName _ThankYou_QNAME = new QName("http://services.server.helloworld.soap.ws.alejopj.github.com/", "thankYou");
    private final static QName _SayHelloToResponse_QNAME = new QName("http://services.server.helloworld.soap.ws.alejopj.github.com/", "sayHelloToResponse");
    private final static QName _SayHelloWorld_QNAME = new QName("http://services.server.helloworld.soap.ws.alejopj.github.com/", "sayHelloWorld");
    private final static QName _ThankYouResponse_QNAME = new QName("http://services.server.helloworld.soap.ws.alejopj.github.com/", "thankYouResponse");
    private final static QName _SayHelloTo_QNAME = new QName("http://services.server.helloworld.soap.ws.alejopj.github.com/", "sayHelloTo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.github.alejopj.ws.soap.helloworld.server.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SayHelloWorld }
     * 
     */
    public SayHelloWorld createSayHelloWorld() {
        return new SayHelloWorld();
    }

    /**
     * Create an instance of {@link SayHelloToResponse }
     * 
     */
    public SayHelloToResponse createSayHelloToResponse() {
        return new SayHelloToResponse();
    }

    /**
     * Create an instance of {@link ThankYouResponse }
     * 
     */
    public ThankYouResponse createThankYouResponse() {
        return new ThankYouResponse();
    }

    /**
     * Create an instance of {@link SayHelloTo }
     * 
     */
    public SayHelloTo createSayHelloTo() {
        return new SayHelloTo();
    }

    /**
     * Create an instance of {@link SayHelloWorldResponse }
     * 
     */
    public SayHelloWorldResponse createSayHelloWorldResponse() {
        return new SayHelloWorldResponse();
    }

    /**
     * Create an instance of {@link ThankYou }
     * 
     */
    public ThankYou createThankYou() {
        return new ThankYou();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloWorldResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.server.helloworld.soap.ws.alejopj.github.com/", name = "sayHelloWorldResponse")
    public JAXBElement<SayHelloWorldResponse> createSayHelloWorldResponse(SayHelloWorldResponse value) {
        return new JAXBElement<SayHelloWorldResponse>(_SayHelloWorldResponse_QNAME, SayHelloWorldResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThankYou }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.server.helloworld.soap.ws.alejopj.github.com/", name = "thankYou")
    public JAXBElement<ThankYou> createThankYou(ThankYou value) {
        return new JAXBElement<ThankYou>(_ThankYou_QNAME, ThankYou.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloToResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.server.helloworld.soap.ws.alejopj.github.com/", name = "sayHelloToResponse")
    public JAXBElement<SayHelloToResponse> createSayHelloToResponse(SayHelloToResponse value) {
        return new JAXBElement<SayHelloToResponse>(_SayHelloToResponse_QNAME, SayHelloToResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloWorld }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.server.helloworld.soap.ws.alejopj.github.com/", name = "sayHelloWorld")
    public JAXBElement<SayHelloWorld> createSayHelloWorld(SayHelloWorld value) {
        return new JAXBElement<SayHelloWorld>(_SayHelloWorld_QNAME, SayHelloWorld.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThankYouResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.server.helloworld.soap.ws.alejopj.github.com/", name = "thankYouResponse")
    public JAXBElement<ThankYouResponse> createThankYouResponse(ThankYouResponse value) {
        return new JAXBElement<ThankYouResponse>(_ThankYouResponse_QNAME, ThankYouResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloTo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.server.helloworld.soap.ws.alejopj.github.com/", name = "sayHelloTo")
    public JAXBElement<SayHelloTo> createSayHelloTo(SayHelloTo value) {
        return new JAXBElement<SayHelloTo>(_SayHelloTo_QNAME, SayHelloTo.class, null, value);
    }

}
