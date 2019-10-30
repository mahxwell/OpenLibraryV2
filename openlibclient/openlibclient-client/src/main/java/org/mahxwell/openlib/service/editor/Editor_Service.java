
package org.mahxwell.openlib.service.editor;

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
@WebServiceClient(name = "editor", targetNamespace = "http://editor.service.openlib.mahxwell.org/", wsdlLocation = "http://Mahxwells-MacBook.local:8080/Openlibrary-Webservice4884919888204003743/editor?wsdl")
public class Editor_Service
    extends Service
{

    private final static URL EDITOR_WSDL_LOCATION;
    private final static WebServiceException EDITOR_EXCEPTION;
    private final static QName EDITOR_QNAME = new QName("http://editor.service.openlib.mahxwell.org/", "editor");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://Mahxwells-MacBook.local:8080/Openlibrary-Webservice4884919888204003743/editor?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        EDITOR_WSDL_LOCATION = url;
        EDITOR_EXCEPTION = e;
    }

    public Editor_Service() {
        super(__getWsdlLocation(), EDITOR_QNAME);
    }

    public Editor_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), EDITOR_QNAME, features);
    }

    public Editor_Service(URL wsdlLocation) {
        super(wsdlLocation, EDITOR_QNAME);
    }

    public Editor_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, EDITOR_QNAME, features);
    }

    public Editor_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Editor_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns EditorService
     */
    @WebEndpoint(name = "EditorServicePort")
    public EditorService getEditorServicePort() {
        return super.getPort(new QName("http://editor.service.openlib.mahxwell.org/", "EditorServicePort"), EditorService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EditorService
     */
    @WebEndpoint(name = "EditorServicePort")
    public EditorService getEditorServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://editor.service.openlib.mahxwell.org/", "EditorServicePort"), EditorService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (EDITOR_EXCEPTION!= null) {
            throw EDITOR_EXCEPTION;
        }
        return EDITOR_WSDL_LOCATION;
    }

}
