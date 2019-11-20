
package org.mahxwell.openlib.service.copy;

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
@WebServiceClient(name = "copy", targetNamespace = "http://copy.service.openlib.mahxwell.org/", wsdlLocation = "http://DESKTOP-JQMEVRQ:8080/Openlibrary-Webservice8784515580378901408/copy?wsdl")
public class Copy_Service
    extends Service
{

    private final static URL COPY_WSDL_LOCATION;
    private final static WebServiceException COPY_EXCEPTION;
    private final static QName COPY_QNAME = new QName("http://copy.service.openlib.mahxwell.org/", "copy");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://DESKTOP-JQMEVRQ:8080/Openlibrary-Webservice8784515580378901408/copy?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        COPY_WSDL_LOCATION = url;
        COPY_EXCEPTION = e;
    }

    public Copy_Service() {
        super(__getWsdlLocation(), COPY_QNAME);
    }

    public Copy_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), COPY_QNAME, features);
    }

    public Copy_Service(URL wsdlLocation) {
        super(wsdlLocation, COPY_QNAME);
    }

    public Copy_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, COPY_QNAME, features);
    }

    public Copy_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Copy_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CopyService
     */
    @WebEndpoint(name = "CopyServicePort")
    public CopyService getCopyServicePort() {
        return super.getPort(new QName("http://copy.service.openlib.mahxwell.org/", "CopyServicePort"), CopyService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CopyService
     */
    @WebEndpoint(name = "CopyServicePort")
    public CopyService getCopyServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://copy.service.openlib.mahxwell.org/", "CopyServicePort"), CopyService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (COPY_EXCEPTION!= null) {
            throw COPY_EXCEPTION;
        }
        return COPY_WSDL_LOCATION;
    }

}
