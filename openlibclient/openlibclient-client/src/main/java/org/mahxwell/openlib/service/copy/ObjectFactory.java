
package org.mahxwell.openlib.service.copy;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.mahxwell.openlib.service.copy package. 
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

    private final static QName _DeleteCopy_QNAME = new QName("http://copy.service.openlib.mahxwell.org/", "deleteCopy");
    private final static QName _GetCopy_QNAME = new QName("http://copy.service.openlib.mahxwell.org/", "getCopy");
    private final static QName _AddCopy_QNAME = new QName("http://copy.service.openlib.mahxwell.org/", "addCopy");
    private final static QName _ListcopyResponse_QNAME = new QName("http://copy.service.openlib.mahxwell.org/", "listcopyResponse");
    private final static QName _Listcopybybook_QNAME = new QName("http://copy.service.openlib.mahxwell.org/", "listcopybybook");
    private final static QName _GetCopyResponse_QNAME = new QName("http://copy.service.openlib.mahxwell.org/", "getCopyResponse");
    private final static QName _AddCopyResponse_QNAME = new QName("http://copy.service.openlib.mahxwell.org/", "addCopyResponse");
    private final static QName _UpdateCopyResponse_QNAME = new QName("http://copy.service.openlib.mahxwell.org/", "updateCopyResponse");
    private final static QName _DeleteCopyResponse_QNAME = new QName("http://copy.service.openlib.mahxwell.org/", "deleteCopyResponse");
    private final static QName _ListcopybybookResponse_QNAME = new QName("http://copy.service.openlib.mahxwell.org/", "listcopybybookResponse");
    private final static QName _Listcopy_QNAME = new QName("http://copy.service.openlib.mahxwell.org/", "listcopy");
    private final static QName _UpdateCopy_QNAME = new QName("http://copy.service.openlib.mahxwell.org/", "updateCopy");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.mahxwell.openlib.service.copy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddCopyResponse }
     * 
     */
    public AddCopyResponse createAddCopyResponse() {
        return new AddCopyResponse();
    }

    /**
     * Create an instance of {@link UpdateCopyResponse }
     * 
     */
    public UpdateCopyResponse createUpdateCopyResponse() {
        return new UpdateCopyResponse();
    }

    /**
     * Create an instance of {@link AddCopy }
     * 
     */
    public AddCopy createAddCopy() {
        return new AddCopy();
    }

    /**
     * Create an instance of {@link ListcopyResponse }
     * 
     */
    public ListcopyResponse createListcopyResponse() {
        return new ListcopyResponse();
    }

    /**
     * Create an instance of {@link Listcopybybook }
     * 
     */
    public Listcopybybook createListcopybybook() {
        return new Listcopybybook();
    }

    /**
     * Create an instance of {@link DeleteCopy }
     * 
     */
    public DeleteCopy createDeleteCopy() {
        return new DeleteCopy();
    }

    /**
     * Create an instance of {@link GetCopy }
     * 
     */
    public GetCopy createGetCopy() {
        return new GetCopy();
    }

    /**
     * Create an instance of {@link GetCopyResponse }
     * 
     */
    public GetCopyResponse createGetCopyResponse() {
        return new GetCopyResponse();
    }

    /**
     * Create an instance of {@link Listcopy }
     * 
     */
    public Listcopy createListcopy() {
        return new Listcopy();
    }

    /**
     * Create an instance of {@link UpdateCopy }
     * 
     */
    public UpdateCopy createUpdateCopy() {
        return new UpdateCopy();
    }

    /**
     * Create an instance of {@link DeleteCopyResponse }
     * 
     */
    public DeleteCopyResponse createDeleteCopyResponse() {
        return new DeleteCopyResponse();
    }

    /**
     * Create an instance of {@link ListcopybybookResponse }
     * 
     */
    public ListcopybybookResponse createListcopybybookResponse() {
        return new ListcopybybookResponse();
    }

    /**
     * Create an instance of {@link Copy }
     * 
     */
    public Copy createCopy() {
        return new Copy();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCopy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://copy.service.openlib.mahxwell.org/", name = "deleteCopy")
    public JAXBElement<DeleteCopy> createDeleteCopy(DeleteCopy value) {
        return new JAXBElement<DeleteCopy>(_DeleteCopy_QNAME, DeleteCopy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCopy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://copy.service.openlib.mahxwell.org/", name = "getCopy")
    public JAXBElement<GetCopy> createGetCopy(GetCopy value) {
        return new JAXBElement<GetCopy>(_GetCopy_QNAME, GetCopy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCopy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://copy.service.openlib.mahxwell.org/", name = "addCopy")
    public JAXBElement<AddCopy> createAddCopy(AddCopy value) {
        return new JAXBElement<AddCopy>(_AddCopy_QNAME, AddCopy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListcopyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://copy.service.openlib.mahxwell.org/", name = "listcopyResponse")
    public JAXBElement<ListcopyResponse> createListcopyResponse(ListcopyResponse value) {
        return new JAXBElement<ListcopyResponse>(_ListcopyResponse_QNAME, ListcopyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Listcopybybook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://copy.service.openlib.mahxwell.org/", name = "listcopybybook")
    public JAXBElement<Listcopybybook> createListcopybybook(Listcopybybook value) {
        return new JAXBElement<Listcopybybook>(_Listcopybybook_QNAME, Listcopybybook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCopyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://copy.service.openlib.mahxwell.org/", name = "getCopyResponse")
    public JAXBElement<GetCopyResponse> createGetCopyResponse(GetCopyResponse value) {
        return new JAXBElement<GetCopyResponse>(_GetCopyResponse_QNAME, GetCopyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCopyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://copy.service.openlib.mahxwell.org/", name = "addCopyResponse")
    public JAXBElement<AddCopyResponse> createAddCopyResponse(AddCopyResponse value) {
        return new JAXBElement<AddCopyResponse>(_AddCopyResponse_QNAME, AddCopyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCopyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://copy.service.openlib.mahxwell.org/", name = "updateCopyResponse")
    public JAXBElement<UpdateCopyResponse> createUpdateCopyResponse(UpdateCopyResponse value) {
        return new JAXBElement<UpdateCopyResponse>(_UpdateCopyResponse_QNAME, UpdateCopyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCopyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://copy.service.openlib.mahxwell.org/", name = "deleteCopyResponse")
    public JAXBElement<DeleteCopyResponse> createDeleteCopyResponse(DeleteCopyResponse value) {
        return new JAXBElement<DeleteCopyResponse>(_DeleteCopyResponse_QNAME, DeleteCopyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListcopybybookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://copy.service.openlib.mahxwell.org/", name = "listcopybybookResponse")
    public JAXBElement<ListcopybybookResponse> createListcopybybookResponse(ListcopybybookResponse value) {
        return new JAXBElement<ListcopybybookResponse>(_ListcopybybookResponse_QNAME, ListcopybybookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Listcopy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://copy.service.openlib.mahxwell.org/", name = "listcopy")
    public JAXBElement<Listcopy> createListcopy(Listcopy value) {
        return new JAXBElement<Listcopy>(_Listcopy_QNAME, Listcopy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCopy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://copy.service.openlib.mahxwell.org/", name = "updateCopy")
    public JAXBElement<UpdateCopy> createUpdateCopy(UpdateCopy value) {
        return new JAXBElement<UpdateCopy>(_UpdateCopy_QNAME, UpdateCopy.class, null, value);
    }

}
