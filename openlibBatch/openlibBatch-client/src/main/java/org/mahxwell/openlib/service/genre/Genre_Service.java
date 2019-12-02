
package org.mahxwell.openlib.service.genre;

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
@WebServiceClient(name = "genre", targetNamespace = "http://genre.service.openlib.mahxwell.org/", wsdlLocation = "http://DESKTOP-JQMEVRQ:8080/Openlibrary-Webservice/genre?wsdl")
public class Genre_Service
    extends Service
{

    private final static URL GENRE_WSDL_LOCATION;
    private final static WebServiceException GENRE_EXCEPTION;
    private final static QName GENRE_QNAME = new QName("http://genre.service.openlib.mahxwell.org/", "genre");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://DESKTOP-JQMEVRQ:8080/Openlibrary-Webservice/genre?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        GENRE_WSDL_LOCATION = url;
        GENRE_EXCEPTION = e;
    }

    public Genre_Service() {
        super(__getWsdlLocation(), GENRE_QNAME);
    }

    public Genre_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), GENRE_QNAME, features);
    }

    public Genre_Service(URL wsdlLocation) {
        super(wsdlLocation, GENRE_QNAME);
    }

    public Genre_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, GENRE_QNAME, features);
    }

    public Genre_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Genre_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns GenreService
     */
    @WebEndpoint(name = "GenreServicePort")
    public GenreService getGenreServicePort() {
        return super.getPort(new QName("http://genre.service.openlib.mahxwell.org/", "GenreServicePort"), GenreService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GenreService
     */
    @WebEndpoint(name = "GenreServicePort")
    public GenreService getGenreServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://genre.service.openlib.mahxwell.org/", "GenreServicePort"), GenreService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (GENRE_EXCEPTION!= null) {
            throw GENRE_EXCEPTION;
        }
        return GENRE_WSDL_LOCATION;
    }

}
