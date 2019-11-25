
package org.mahxwell.openlib.service.reservation;

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
@WebServiceClient(name = "reservation", targetNamespace = "http://reservation.service.openlib.mahxwell.org/", wsdlLocation = "http://DESKTOP-JQMEVRQ:8080/Openlibrary-Webservice118081987544380985/reservation?wsdl")
public class Reservation_Service
    extends Service
{

    private final static URL RESERVATION_WSDL_LOCATION;
    private final static WebServiceException RESERVATION_EXCEPTION;
    private final static QName RESERVATION_QNAME = new QName("http://reservation.service.openlib.mahxwell.org/", "reservation");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://DESKTOP-JQMEVRQ:8080/Openlibrary-Webservice118081987544380985/reservation?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        RESERVATION_WSDL_LOCATION = url;
        RESERVATION_EXCEPTION = e;
    }

    public Reservation_Service() {
        super(__getWsdlLocation(), RESERVATION_QNAME);
    }

    public Reservation_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), RESERVATION_QNAME, features);
    }

    public Reservation_Service(URL wsdlLocation) {
        super(wsdlLocation, RESERVATION_QNAME);
    }

    public Reservation_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, RESERVATION_QNAME, features);
    }

    public Reservation_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Reservation_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ReservationService
     */
    @WebEndpoint(name = "ReservationServicePort")
    public ReservationService getReservationServicePort() {
        return super.getPort(new QName("http://reservation.service.openlib.mahxwell.org/", "ReservationServicePort"), ReservationService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ReservationService
     */
    @WebEndpoint(name = "ReservationServicePort")
    public ReservationService getReservationServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://reservation.service.openlib.mahxwell.org/", "ReservationServicePort"), ReservationService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (RESERVATION_EXCEPTION!= null) {
            throw RESERVATION_EXCEPTION;
        }
        return RESERVATION_WSDL_LOCATION;
    }

}
