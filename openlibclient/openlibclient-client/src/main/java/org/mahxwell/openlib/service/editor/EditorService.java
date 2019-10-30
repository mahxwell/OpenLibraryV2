
package org.mahxwell.openlib.service.editor;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebService(name = "EditorService", targetNamespace = "http://editor.service.openlib.mahxwell.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface EditorService {


    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "updateEditor", targetNamespace = "http://editor.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.editor.UpdateEditor")
    @ResponseWrapper(localName = "updateEditorResponse", targetNamespace = "http://editor.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.editor.UpdateEditorResponse")
    @Action(input = "http://editor.service.openlib.mahxwell.org/EditorService/updateEditorRequest", output = "http://editor.service.openlib.mahxwell.org/EditorService/updateEditorResponse")
    public void updateEditor(
        @WebParam(name = "arg0", targetNamespace = "")
        Editor arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Editor arg1);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "deleteEditor", targetNamespace = "http://editor.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.editor.DeleteEditor")
    @ResponseWrapper(localName = "deleteEditorResponse", targetNamespace = "http://editor.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.editor.DeleteEditorResponse")
    @Action(input = "http://editor.service.openlib.mahxwell.org/EditorService/deleteEditorRequest", output = "http://editor.service.openlib.mahxwell.org/EditorService/deleteEditorResponse")
    public void deleteEditor(
        @WebParam(name = "arg0", targetNamespace = "")
        Editor arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns org.mahxwell.openlib.service.editor.Editor
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getEditor", targetNamespace = "http://editor.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.editor.GetEditor")
    @ResponseWrapper(localName = "getEditorResponse", targetNamespace = "http://editor.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.editor.GetEditorResponse")
    @Action(input = "http://editor.service.openlib.mahxwell.org/EditorService/getEditorRequest", output = "http://editor.service.openlib.mahxwell.org/EditorService/getEditorResponse")
    public Editor getEditor(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0);

    /**
     * 
     * @return
     *     returns java.util.List<org.mahxwell.openlib.service.editor.Editor>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listeditor", targetNamespace = "http://editor.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.editor.Listeditor")
    @ResponseWrapper(localName = "listeditorResponse", targetNamespace = "http://editor.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.editor.ListeditorResponse")
    @Action(input = "http://editor.service.openlib.mahxwell.org/EditorService/listeditorRequest", output = "http://editor.service.openlib.mahxwell.org/EditorService/listeditorResponse")
    public List<Editor> listeditor();

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "addEditor", targetNamespace = "http://editor.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.editor.AddEditor")
    @ResponseWrapper(localName = "addEditorResponse", targetNamespace = "http://editor.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.editor.AddEditorResponse")
    @Action(input = "http://editor.service.openlib.mahxwell.org/EditorService/addEditorRequest", output = "http://editor.service.openlib.mahxwell.org/EditorService/addEditorResponse")
    public void addEditor(
        @WebParam(name = "arg0", targetNamespace = "")
        Editor arg0);

}
