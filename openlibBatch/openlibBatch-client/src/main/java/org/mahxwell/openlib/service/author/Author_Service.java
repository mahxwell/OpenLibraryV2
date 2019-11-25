
package org.mahxwell.openlib.service.author;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "author", targetNamespace = "http://author.service.openlib.mahxwell.org/", wsdlLocation = "http://DESKTOP-JQMEVRQ:8080/Openlibrary-Webservice118081987544380985/author?wsdl")
public class Author_Service
    extends Service
{

    private final static URL AUTHOR_WSDL_LOCATION;
    private final static WebServiceException AUTHOR_EXCEPTION;
    private final static QName AUTHOR_QNAME = new QName("http://author.service.openlib.mahxwell.org/", "author");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://DESKTOP-JQMEVRQ:8080/Openlibrary-Webservice118081987544380985/author?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        AUTHOR_WSDL_LOCATION = url;
        AUTHOR_EXCEPTION = e;
    }

    public Author_Service() {
        super(__getWsdlLocation(), AUTHOR_QNAME);
    }

    public Author_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), AUTHOR_QNAME, features);
    }

    public Author_Service(URL wsdlLocation) {
        super(wsdlLocation, AUTHOR_QNAME);
    }

    public Author_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, AUTHOR_QNAME, features);
    }

    public Author_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Author_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns AuthorService
     */
    @WebEndpoint(name = "AuthorServicePort")
    public AuthorService getAuthorServicePort() {
        return super.getPort(new QName("http://author.service.openlib.mahxwell.org/", "AuthorServicePort"), AuthorService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AuthorService
     */
    @WebEndpoint(name = "AuthorServicePort")
    public AuthorService getAuthorServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://author.service.openlib.mahxwell.org/", "AuthorServicePort"), AuthorService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (AUTHOR_EXCEPTION!= null) {
            throw AUTHOR_EXCEPTION;
        }
        return AUTHOR_WSDL_LOCATION;
    }

}
