
package org.mahxwell.openlib.service.editor;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.mahxwell.openlib.service.editor package. 
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

    private final static QName _AddEditor_QNAME = new QName("http://editor.service.openlib.mahxwell.org/", "addEditor");
    private final static QName _UpdateEditor_QNAME = new QName("http://editor.service.openlib.mahxwell.org/", "updateEditor");
    private final static QName _AddEditorResponse_QNAME = new QName("http://editor.service.openlib.mahxwell.org/", "addEditorResponse");
    private final static QName _UpdateEditorResponse_QNAME = new QName("http://editor.service.openlib.mahxwell.org/", "updateEditorResponse");
    private final static QName _DeleteEditorResponse_QNAME = new QName("http://editor.service.openlib.mahxwell.org/", "deleteEditorResponse");
    private final static QName _Listeditor_QNAME = new QName("http://editor.service.openlib.mahxwell.org/", "listeditor");
    private final static QName _ListeditorResponse_QNAME = new QName("http://editor.service.openlib.mahxwell.org/", "listeditorResponse");
    private final static QName _DeleteEditor_QNAME = new QName("http://editor.service.openlib.mahxwell.org/", "deleteEditor");
    private final static QName _GetEditor_QNAME = new QName("http://editor.service.openlib.mahxwell.org/", "getEditor");
    private final static QName _GetEditorResponse_QNAME = new QName("http://editor.service.openlib.mahxwell.org/", "getEditorResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.mahxwell.openlib.service.editor
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetEditor }
     * 
     */
    public GetEditor createGetEditor() {
        return new GetEditor();
    }

    /**
     * Create an instance of {@link DeleteEditor }
     * 
     */
    public DeleteEditor createDeleteEditor() {
        return new DeleteEditor();
    }

    /**
     * Create an instance of {@link GetEditorResponse }
     * 
     */
    public GetEditorResponse createGetEditorResponse() {
        return new GetEditorResponse();
    }

    /**
     * Create an instance of {@link ListeditorResponse }
     * 
     */
    public ListeditorResponse createListeditorResponse() {
        return new ListeditorResponse();
    }

    /**
     * Create an instance of {@link Listeditor }
     * 
     */
    public Listeditor createListeditor() {
        return new Listeditor();
    }

    /**
     * Create an instance of {@link DeleteEditorResponse }
     * 
     */
    public DeleteEditorResponse createDeleteEditorResponse() {
        return new DeleteEditorResponse();
    }

    /**
     * Create an instance of {@link AddEditorResponse }
     * 
     */
    public AddEditorResponse createAddEditorResponse() {
        return new AddEditorResponse();
    }

    /**
     * Create an instance of {@link UpdateEditorResponse }
     * 
     */
    public UpdateEditorResponse createUpdateEditorResponse() {
        return new UpdateEditorResponse();
    }

    /**
     * Create an instance of {@link AddEditor }
     * 
     */
    public AddEditor createAddEditor() {
        return new AddEditor();
    }

    /**
     * Create an instance of {@link UpdateEditor }
     * 
     */
    public UpdateEditor createUpdateEditor() {
        return new UpdateEditor();
    }

    /**
     * Create an instance of {@link Editor }
     * 
     */
    public Editor createEditor() {
        return new Editor();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddEditor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://editor.service.openlib.mahxwell.org/", name = "addEditor")
    public JAXBElement<AddEditor> createAddEditor(AddEditor value) {
        return new JAXBElement<AddEditor>(_AddEditor_QNAME, AddEditor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateEditor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://editor.service.openlib.mahxwell.org/", name = "updateEditor")
    public JAXBElement<UpdateEditor> createUpdateEditor(UpdateEditor value) {
        return new JAXBElement<UpdateEditor>(_UpdateEditor_QNAME, UpdateEditor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddEditorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://editor.service.openlib.mahxwell.org/", name = "addEditorResponse")
    public JAXBElement<AddEditorResponse> createAddEditorResponse(AddEditorResponse value) {
        return new JAXBElement<AddEditorResponse>(_AddEditorResponse_QNAME, AddEditorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateEditorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://editor.service.openlib.mahxwell.org/", name = "updateEditorResponse")
    public JAXBElement<UpdateEditorResponse> createUpdateEditorResponse(UpdateEditorResponse value) {
        return new JAXBElement<UpdateEditorResponse>(_UpdateEditorResponse_QNAME, UpdateEditorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteEditorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://editor.service.openlib.mahxwell.org/", name = "deleteEditorResponse")
    public JAXBElement<DeleteEditorResponse> createDeleteEditorResponse(DeleteEditorResponse value) {
        return new JAXBElement<DeleteEditorResponse>(_DeleteEditorResponse_QNAME, DeleteEditorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Listeditor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://editor.service.openlib.mahxwell.org/", name = "listeditor")
    public JAXBElement<Listeditor> createListeditor(Listeditor value) {
        return new JAXBElement<Listeditor>(_Listeditor_QNAME, Listeditor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListeditorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://editor.service.openlib.mahxwell.org/", name = "listeditorResponse")
    public JAXBElement<ListeditorResponse> createListeditorResponse(ListeditorResponse value) {
        return new JAXBElement<ListeditorResponse>(_ListeditorResponse_QNAME, ListeditorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteEditor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://editor.service.openlib.mahxwell.org/", name = "deleteEditor")
    public JAXBElement<DeleteEditor> createDeleteEditor(DeleteEditor value) {
        return new JAXBElement<DeleteEditor>(_DeleteEditor_QNAME, DeleteEditor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEditor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://editor.service.openlib.mahxwell.org/", name = "getEditor")
    public JAXBElement<GetEditor> createGetEditor(GetEditor value) {
        return new JAXBElement<GetEditor>(_GetEditor_QNAME, GetEditor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEditorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://editor.service.openlib.mahxwell.org/", name = "getEditorResponse")
    public JAXBElement<GetEditorResponse> createGetEditorResponse(GetEditorResponse value) {
        return new JAXBElement<GetEditorResponse>(_GetEditorResponse_QNAME, GetEditorResponse.class, null, value);
    }

}
