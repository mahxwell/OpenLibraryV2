
package org.mahxwell.openlib.service.bookloaning;

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
@WebServiceClient(name = "bookloaning", targetNamespace = "http://bookloaning.service.openlib.mahxwell.org/", wsdlLocation = "http://DESKTOP-JQMEVRQ:8080/Openlibrary-Webservice118081987544380985/bookloaning?wsdl")
public class Bookloaning_Service
    extends Service
{

    private final static URL BOOKLOANING_WSDL_LOCATION;
    private final static WebServiceException BOOKLOANING_EXCEPTION;
    private final static QName BOOKLOANING_QNAME = new QName("http://bookloaning.service.openlib.mahxwell.org/", "bookloaning");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://DESKTOP-JQMEVRQ:8080/Openlibrary-Webservice118081987544380985/bookloaning?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BOOKLOANING_WSDL_LOCATION = url;
        BOOKLOANING_EXCEPTION = e;
    }

    public Bookloaning_Service() {
        super(__getWsdlLocation(), BOOKLOANING_QNAME);
    }

    public Bookloaning_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), BOOKLOANING_QNAME, features);
    }

    public Bookloaning_Service(URL wsdlLocation) {
        super(wsdlLocation, BOOKLOANING_QNAME);
    }

    public Bookloaning_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BOOKLOANING_QNAME, features);
    }

    public Bookloaning_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Bookloaning_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BookloaningService
     */
    @WebEndpoint(name = "BookloaningServicePort")
    public BookloaningService getBookloaningServicePort() {
        return super.getPort(new QName("http://bookloaning.service.openlib.mahxwell.org/", "BookloaningServicePort"), BookloaningService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BookloaningService
     */
    @WebEndpoint(name = "BookloaningServicePort")
    public BookloaningService getBookloaningServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://bookloaning.service.openlib.mahxwell.org/", "BookloaningServicePort"), BookloaningService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BOOKLOANING_EXCEPTION!= null) {
            throw BOOKLOANING_EXCEPTION;
        }
        return BOOKLOANING_WSDL_LOCATION;
    }

}
