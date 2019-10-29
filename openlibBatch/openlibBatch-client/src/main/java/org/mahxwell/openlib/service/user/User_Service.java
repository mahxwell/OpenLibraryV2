
package org.mahxwell.openlib.service.user;

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
@WebServiceClient(name = "user", targetNamespace = "http://user.service.openlib.mahxwell.org/", wsdlLocation = "http://Mahxwells-MacBook.local:8080/Openlibrary-Webservice5112920012513696107/user?wsdl")
public class User_Service
    extends Service
{

    private final static URL USER_WSDL_LOCATION;
    private final static WebServiceException USER_EXCEPTION;
    private final static QName USER_QNAME = new QName("http://user.service.openlib.mahxwell.org/", "user");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://Mahxwells-MacBook.local:8080/Openlibrary-Webservice5112920012513696107/user?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        USER_WSDL_LOCATION = url;
        USER_EXCEPTION = e;
    }

    public User_Service() {
        super(__getWsdlLocation(), USER_QNAME);
    }

    public User_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), USER_QNAME, features);
    }

    public User_Service(URL wsdlLocation) {
        super(wsdlLocation, USER_QNAME);
    }

    public User_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, USER_QNAME, features);
    }

    public User_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public User_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns UserService
     */
    @WebEndpoint(name = "UserServicePort")
    public UserService getUserServicePort() {
        return super.getPort(new QName("http://user.service.openlib.mahxwell.org/", "UserServicePort"), UserService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UserService
     */
    @WebEndpoint(name = "UserServicePort")
    public UserService getUserServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://user.service.openlib.mahxwell.org/", "UserServicePort"), UserService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (USER_EXCEPTION!= null) {
            throw USER_EXCEPTION;
        }
        return USER_WSDL_LOCATION;
    }

}
