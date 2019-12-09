
package org.mahxwell.openlib.service.reservation;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.mahxwell.openlib.service.reservation package. 
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

    private final static QName _AddReservationResponse_QNAME = new QName("http://reservation.service.openlib.mahxwell.org/", "addReservationResponse");
    private final static QName _ListreservationByUser_QNAME = new QName("http://reservation.service.openlib.mahxwell.org/", "listreservationByUser");
    private final static QName _GetReservation_QNAME = new QName("http://reservation.service.openlib.mahxwell.org/", "getReservation");
    private final static QName _GetReservationResponse_QNAME = new QName("http://reservation.service.openlib.mahxwell.org/", "getReservationResponse");
    private final static QName _ListreservationByUserResponse_QNAME = new QName("http://reservation.service.openlib.mahxwell.org/", "listreservationByUserResponse");
    private final static QName _Listreservation_QNAME = new QName("http://reservation.service.openlib.mahxwell.org/", "listreservation");
    private final static QName _GetReservationByUserIdAndCopyIdResponse_QNAME = new QName("http://reservation.service.openlib.mahxwell.org/", "getReservationByUserIdAndCopyIdResponse");
    private final static QName _ReservationsOrderById_QNAME = new QName("http://reservation.service.openlib.mahxwell.org/", "reservationsOrderById");
    private final static QName _ReservationByUserAndByBooks_QNAME = new QName("http://reservation.service.openlib.mahxwell.org/", "reservationByUserAndByBooks");
    private final static QName _AddReservation_QNAME = new QName("http://reservation.service.openlib.mahxwell.org/", "addReservation");
    private final static QName _ListreservationByBooks_QNAME = new QName("http://reservation.service.openlib.mahxwell.org/", "listreservationByBooks");
    private final static QName _ListreservationByBooksResponse_QNAME = new QName("http://reservation.service.openlib.mahxwell.org/", "listreservationByBooksResponse");
    private final static QName _ReservationsOrderByIdResponse_QNAME = new QName("http://reservation.service.openlib.mahxwell.org/", "reservationsOrderByIdResponse");
    private final static QName _DeleteReservation_QNAME = new QName("http://reservation.service.openlib.mahxwell.org/", "deleteReservation");
    private final static QName _ReservationsByCopyIdResponse_QNAME = new QName("http://reservation.service.openlib.mahxwell.org/", "reservationsByCopyIdResponse");
    private final static QName _GetReservationByMailDateNotNull_QNAME = new QName("http://reservation.service.openlib.mahxwell.org/", "getReservationByMailDateNotNull");
    private final static QName _UpdateReservation_QNAME = new QName("http://reservation.service.openlib.mahxwell.org/", "updateReservation");
    private final static QName _ListreservationResponse_QNAME = new QName("http://reservation.service.openlib.mahxwell.org/", "listreservationResponse");
    private final static QName _ReservationByUserAndByBooksResponse_QNAME = new QName("http://reservation.service.openlib.mahxwell.org/", "reservationByUserAndByBooksResponse");
    private final static QName _UpdateReservationResponse_QNAME = new QName("http://reservation.service.openlib.mahxwell.org/", "updateReservationResponse");
    private final static QName _GetReservationByUserIdAndCopyId_QNAME = new QName("http://reservation.service.openlib.mahxwell.org/", "getReservationByUserIdAndCopyId");
    private final static QName _DeleteReservationResponse_QNAME = new QName("http://reservation.service.openlib.mahxwell.org/", "deleteReservationResponse");
    private final static QName _GetReservationByMailDateNotNullResponse_QNAME = new QName("http://reservation.service.openlib.mahxwell.org/", "getReservationByMailDateNotNullResponse");
    private final static QName _ReservationsByCopyId_QNAME = new QName("http://reservation.service.openlib.mahxwell.org/", "reservationsByCopyId");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.mahxwell.openlib.service.reservation
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteReservationResponse }
     * 
     */
    public DeleteReservationResponse createDeleteReservationResponse() {
        return new DeleteReservationResponse();
    }

    /**
     * Create an instance of {@link GetReservationByMailDateNotNullResponse }
     * 
     */
    public GetReservationByMailDateNotNullResponse createGetReservationByMailDateNotNullResponse() {
        return new GetReservationByMailDateNotNullResponse();
    }

    /**
     * Create an instance of {@link ReservationsByCopyId }
     * 
     */
    public ReservationsByCopyId createReservationsByCopyId() {
        return new ReservationsByCopyId();
    }

    /**
     * Create an instance of {@link ListreservationResponse }
     * 
     */
    public ListreservationResponse createListreservationResponse() {
        return new ListreservationResponse();
    }

    /**
     * Create an instance of {@link ReservationByUserAndByBooksResponse }
     * 
     */
    public ReservationByUserAndByBooksResponse createReservationByUserAndByBooksResponse() {
        return new ReservationByUserAndByBooksResponse();
    }

    /**
     * Create an instance of {@link UpdateReservationResponse }
     * 
     */
    public UpdateReservationResponse createUpdateReservationResponse() {
        return new UpdateReservationResponse();
    }

    /**
     * Create an instance of {@link GetReservationByUserIdAndCopyId }
     * 
     */
    public GetReservationByUserIdAndCopyId createGetReservationByUserIdAndCopyId() {
        return new GetReservationByUserIdAndCopyId();
    }

    /**
     * Create an instance of {@link GetReservationByMailDateNotNull }
     * 
     */
    public GetReservationByMailDateNotNull createGetReservationByMailDateNotNull() {
        return new GetReservationByMailDateNotNull();
    }

    /**
     * Create an instance of {@link UpdateReservation }
     * 
     */
    public UpdateReservation createUpdateReservation() {
        return new UpdateReservation();
    }

    /**
     * Create an instance of {@link DeleteReservation }
     * 
     */
    public DeleteReservation createDeleteReservation() {
        return new DeleteReservation();
    }

    /**
     * Create an instance of {@link ReservationsByCopyIdResponse }
     * 
     */
    public ReservationsByCopyIdResponse createReservationsByCopyIdResponse() {
        return new ReservationsByCopyIdResponse();
    }

    /**
     * Create an instance of {@link AddReservation }
     * 
     */
    public AddReservation createAddReservation() {
        return new AddReservation();
    }

    /**
     * Create an instance of {@link ListreservationByBooks }
     * 
     */
    public ListreservationByBooks createListreservationByBooks() {
        return new ListreservationByBooks();
    }

    /**
     * Create an instance of {@link ListreservationByBooksResponse }
     * 
     */
    public ListreservationByBooksResponse createListreservationByBooksResponse() {
        return new ListreservationByBooksResponse();
    }

    /**
     * Create an instance of {@link ReservationsOrderByIdResponse }
     * 
     */
    public ReservationsOrderByIdResponse createReservationsOrderByIdResponse() {
        return new ReservationsOrderByIdResponse();
    }

    /**
     * Create an instance of {@link ReservationByUserAndByBooks }
     * 
     */
    public ReservationByUserAndByBooks createReservationByUserAndByBooks() {
        return new ReservationByUserAndByBooks();
    }

    /**
     * Create an instance of {@link GetReservationByUserIdAndCopyIdResponse }
     * 
     */
    public GetReservationByUserIdAndCopyIdResponse createGetReservationByUserIdAndCopyIdResponse() {
        return new GetReservationByUserIdAndCopyIdResponse();
    }

    /**
     * Create an instance of {@link ReservationsOrderById }
     * 
     */
    public ReservationsOrderById createReservationsOrderById() {
        return new ReservationsOrderById();
    }

    /**
     * Create an instance of {@link Listreservation }
     * 
     */
    public Listreservation createListreservation() {
        return new Listreservation();
    }

    /**
     * Create an instance of {@link GetReservationResponse }
     * 
     */
    public GetReservationResponse createGetReservationResponse() {
        return new GetReservationResponse();
    }

    /**
     * Create an instance of {@link ListreservationByUserResponse }
     * 
     */
    public ListreservationByUserResponse createListreservationByUserResponse() {
        return new ListreservationByUserResponse();
    }

    /**
     * Create an instance of {@link ListreservationByUser }
     * 
     */
    public ListreservationByUser createListreservationByUser() {
        return new ListreservationByUser();
    }

    /**
     * Create an instance of {@link GetReservation }
     * 
     */
    public GetReservation createGetReservation() {
        return new GetReservation();
    }

    /**
     * Create an instance of {@link AddReservationResponse }
     * 
     */
    public AddReservationResponse createAddReservationResponse() {
        return new AddReservationResponse();
    }

    /**
     * Create an instance of {@link Reservation }
     * 
     */
    public Reservation createReservation() {
        return new Reservation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddReservationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://reservation.service.openlib.mahxwell.org/", name = "addReservationResponse")
    public JAXBElement<AddReservationResponse> createAddReservationResponse(AddReservationResponse value) {
        return new JAXBElement<AddReservationResponse>(_AddReservationResponse_QNAME, AddReservationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListreservationByUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://reservation.service.openlib.mahxwell.org/", name = "listreservationByUser")
    public JAXBElement<ListreservationByUser> createListreservationByUser(ListreservationByUser value) {
        return new JAXBElement<ListreservationByUser>(_ListreservationByUser_QNAME, ListreservationByUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReservation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://reservation.service.openlib.mahxwell.org/", name = "getReservation")
    public JAXBElement<GetReservation> createGetReservation(GetReservation value) {
        return new JAXBElement<GetReservation>(_GetReservation_QNAME, GetReservation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReservationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://reservation.service.openlib.mahxwell.org/", name = "getReservationResponse")
    public JAXBElement<GetReservationResponse> createGetReservationResponse(GetReservationResponse value) {
        return new JAXBElement<GetReservationResponse>(_GetReservationResponse_QNAME, GetReservationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListreservationByUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://reservation.service.openlib.mahxwell.org/", name = "listreservationByUserResponse")
    public JAXBElement<ListreservationByUserResponse> createListreservationByUserResponse(ListreservationByUserResponse value) {
        return new JAXBElement<ListreservationByUserResponse>(_ListreservationByUserResponse_QNAME, ListreservationByUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Listreservation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://reservation.service.openlib.mahxwell.org/", name = "listreservation")
    public JAXBElement<Listreservation> createListreservation(Listreservation value) {
        return new JAXBElement<Listreservation>(_Listreservation_QNAME, Listreservation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReservationByUserIdAndCopyIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://reservation.service.openlib.mahxwell.org/", name = "getReservationByUserIdAndCopyIdResponse")
    public JAXBElement<GetReservationByUserIdAndCopyIdResponse> createGetReservationByUserIdAndCopyIdResponse(GetReservationByUserIdAndCopyIdResponse value) {
        return new JAXBElement<GetReservationByUserIdAndCopyIdResponse>(_GetReservationByUserIdAndCopyIdResponse_QNAME, GetReservationByUserIdAndCopyIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReservationsOrderById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://reservation.service.openlib.mahxwell.org/", name = "reservationsOrderById")
    public JAXBElement<ReservationsOrderById> createReservationsOrderById(ReservationsOrderById value) {
        return new JAXBElement<ReservationsOrderById>(_ReservationsOrderById_QNAME, ReservationsOrderById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReservationByUserAndByBooks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://reservation.service.openlib.mahxwell.org/", name = "reservationByUserAndByBooks")
    public JAXBElement<ReservationByUserAndByBooks> createReservationByUserAndByBooks(ReservationByUserAndByBooks value) {
        return new JAXBElement<ReservationByUserAndByBooks>(_ReservationByUserAndByBooks_QNAME, ReservationByUserAndByBooks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddReservation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://reservation.service.openlib.mahxwell.org/", name = "addReservation")
    public JAXBElement<AddReservation> createAddReservation(AddReservation value) {
        return new JAXBElement<AddReservation>(_AddReservation_QNAME, AddReservation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListreservationByBooks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://reservation.service.openlib.mahxwell.org/", name = "listreservationByBooks")
    public JAXBElement<ListreservationByBooks> createListreservationByBooks(ListreservationByBooks value) {
        return new JAXBElement<ListreservationByBooks>(_ListreservationByBooks_QNAME, ListreservationByBooks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListreservationByBooksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://reservation.service.openlib.mahxwell.org/", name = "listreservationByBooksResponse")
    public JAXBElement<ListreservationByBooksResponse> createListreservationByBooksResponse(ListreservationByBooksResponse value) {
        return new JAXBElement<ListreservationByBooksResponse>(_ListreservationByBooksResponse_QNAME, ListreservationByBooksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReservationsOrderByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://reservation.service.openlib.mahxwell.org/", name = "reservationsOrderByIdResponse")
    public JAXBElement<ReservationsOrderByIdResponse> createReservationsOrderByIdResponse(ReservationsOrderByIdResponse value) {
        return new JAXBElement<ReservationsOrderByIdResponse>(_ReservationsOrderByIdResponse_QNAME, ReservationsOrderByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteReservation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://reservation.service.openlib.mahxwell.org/", name = "deleteReservation")
    public JAXBElement<DeleteReservation> createDeleteReservation(DeleteReservation value) {
        return new JAXBElement<DeleteReservation>(_DeleteReservation_QNAME, DeleteReservation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReservationsByCopyIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://reservation.service.openlib.mahxwell.org/", name = "reservationsByCopyIdResponse")
    public JAXBElement<ReservationsByCopyIdResponse> createReservationsByCopyIdResponse(ReservationsByCopyIdResponse value) {
        return new JAXBElement<ReservationsByCopyIdResponse>(_ReservationsByCopyIdResponse_QNAME, ReservationsByCopyIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReservationByMailDateNotNull }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://reservation.service.openlib.mahxwell.org/", name = "getReservationByMailDateNotNull")
    public JAXBElement<GetReservationByMailDateNotNull> createGetReservationByMailDateNotNull(GetReservationByMailDateNotNull value) {
        return new JAXBElement<GetReservationByMailDateNotNull>(_GetReservationByMailDateNotNull_QNAME, GetReservationByMailDateNotNull.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateReservation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://reservation.service.openlib.mahxwell.org/", name = "updateReservation")
    public JAXBElement<UpdateReservation> createUpdateReservation(UpdateReservation value) {
        return new JAXBElement<UpdateReservation>(_UpdateReservation_QNAME, UpdateReservation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListreservationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://reservation.service.openlib.mahxwell.org/", name = "listreservationResponse")
    public JAXBElement<ListreservationResponse> createListreservationResponse(ListreservationResponse value) {
        return new JAXBElement<ListreservationResponse>(_ListreservationResponse_QNAME, ListreservationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReservationByUserAndByBooksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://reservation.service.openlib.mahxwell.org/", name = "reservationByUserAndByBooksResponse")
    public JAXBElement<ReservationByUserAndByBooksResponse> createReservationByUserAndByBooksResponse(ReservationByUserAndByBooksResponse value) {
        return new JAXBElement<ReservationByUserAndByBooksResponse>(_ReservationByUserAndByBooksResponse_QNAME, ReservationByUserAndByBooksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateReservationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://reservation.service.openlib.mahxwell.org/", name = "updateReservationResponse")
    public JAXBElement<UpdateReservationResponse> createUpdateReservationResponse(UpdateReservationResponse value) {
        return new JAXBElement<UpdateReservationResponse>(_UpdateReservationResponse_QNAME, UpdateReservationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReservationByUserIdAndCopyId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://reservation.service.openlib.mahxwell.org/", name = "getReservationByUserIdAndCopyId")
    public JAXBElement<GetReservationByUserIdAndCopyId> createGetReservationByUserIdAndCopyId(GetReservationByUserIdAndCopyId value) {
        return new JAXBElement<GetReservationByUserIdAndCopyId>(_GetReservationByUserIdAndCopyId_QNAME, GetReservationByUserIdAndCopyId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteReservationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://reservation.service.openlib.mahxwell.org/", name = "deleteReservationResponse")
    public JAXBElement<DeleteReservationResponse> createDeleteReservationResponse(DeleteReservationResponse value) {
        return new JAXBElement<DeleteReservationResponse>(_DeleteReservationResponse_QNAME, DeleteReservationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReservationByMailDateNotNullResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://reservation.service.openlib.mahxwell.org/", name = "getReservationByMailDateNotNullResponse")
    public JAXBElement<GetReservationByMailDateNotNullResponse> createGetReservationByMailDateNotNullResponse(GetReservationByMailDateNotNullResponse value) {
        return new JAXBElement<GetReservationByMailDateNotNullResponse>(_GetReservationByMailDateNotNullResponse_QNAME, GetReservationByMailDateNotNullResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReservationsByCopyId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://reservation.service.openlib.mahxwell.org/", name = "reservationsByCopyId")
    public JAXBElement<ReservationsByCopyId> createReservationsByCopyId(ReservationsByCopyId value) {
        return new JAXBElement<ReservationsByCopyId>(_ReservationsByCopyId_QNAME, ReservationsByCopyId.class, null, value);
    }

}
