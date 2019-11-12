
package org.mahxwell.openlib.service.library;

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
@WebServiceClient(name = "library", targetNamespace = "http://library.service.openlib.mahxwell.org/", wsdlLocation = "http://DESKTOP-SLCNU9U:8080/Openlibrary-Webservice8721089228461807260/library?wsdl")
public class Library_Service
    extends Service
{

    private final static URL LIBRARY_WSDL_LOCATION;
    private final static WebServiceException LIBRARY_EXCEPTION;
    private final static QName LIBRARY_QNAME = new QName("http://library.service.openlib.mahxwell.org/", "library");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://DESKTOP-SLCNU9U:8080/Openlibrary-Webservice8721089228461807260/library?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        LIBRARY_WSDL_LOCATION = url;
        LIBRARY_EXCEPTION = e;
    }

    public Library_Service() {
        super(__getWsdlLocation(), LIBRARY_QNAME);
    }

    public Library_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), LIBRARY_QNAME, features);
    }

    public Library_Service(URL wsdlLocation) {
        super(wsdlLocation, LIBRARY_QNAME);
    }

    public Library_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, LIBRARY_QNAME, features);
    }

    public Library_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Library_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns LibraryService
     */
    @WebEndpoint(name = "LibraryServicePort")
    public LibraryService getLibraryServicePort() {
        return super.getPort(new QName("http://library.service.openlib.mahxwell.org/", "LibraryServicePort"), LibraryService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns LibraryService
     */
    @WebEndpoint(name = "LibraryServicePort")
    public LibraryService getLibraryServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://library.service.openlib.mahxwell.org/", "LibraryServicePort"), LibraryService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (LIBRARY_EXCEPTION!= null) {
            throw LIBRARY_EXCEPTION;
        }
        return LIBRARY_WSDL_LOCATION;
    }

}
