
package org.mahxwell.openlib.service.copy;

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
@WebService(name = "CopyService", targetNamespace = "http://copy.service.openlib.mahxwell.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CopyService {


    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "addCopy", targetNamespace = "http://copy.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.copy.AddCopy")
    @ResponseWrapper(localName = "addCopyResponse", targetNamespace = "http://copy.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.copy.AddCopyResponse")
    @Action(input = "http://copy.service.openlib.mahxwell.org/CopyService/addCopyRequest", output = "http://copy.service.openlib.mahxwell.org/CopyService/addCopyResponse")
    public void addCopy(
        @WebParam(name = "arg0", targetNamespace = "")
        Copy arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns org.mahxwell.openlib.service.copy.Copy
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCopy", targetNamespace = "http://copy.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.copy.GetCopy")
    @ResponseWrapper(localName = "getCopyResponse", targetNamespace = "http://copy.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.copy.GetCopyResponse")
    @Action(input = "http://copy.service.openlib.mahxwell.org/CopyService/getCopyRequest", output = "http://copy.service.openlib.mahxwell.org/CopyService/getCopyResponse")
    public Copy getCopy(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0);

    /**
     * 
     * @return
     *     returns java.util.List<org.mahxwell.openlib.service.copy.Copy>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listcopy", targetNamespace = "http://copy.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.copy.Listcopy")
    @ResponseWrapper(localName = "listcopyResponse", targetNamespace = "http://copy.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.copy.ListcopyResponse")
    @Action(input = "http://copy.service.openlib.mahxwell.org/CopyService/listcopyRequest", output = "http://copy.service.openlib.mahxwell.org/CopyService/listcopyResponse")
    public List<Copy> listcopy();

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "deleteCopy", targetNamespace = "http://copy.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.copy.DeleteCopy")
    @ResponseWrapper(localName = "deleteCopyResponse", targetNamespace = "http://copy.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.copy.DeleteCopyResponse")
    @Action(input = "http://copy.service.openlib.mahxwell.org/CopyService/deleteCopyRequest", output = "http://copy.service.openlib.mahxwell.org/CopyService/deleteCopyResponse")
    public void deleteCopy(
        @WebParam(name = "arg0", targetNamespace = "")
        Copy arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "updateCopy", targetNamespace = "http://copy.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.copy.UpdateCopy")
    @ResponseWrapper(localName = "updateCopyResponse", targetNamespace = "http://copy.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.copy.UpdateCopyResponse")
    @Action(input = "http://copy.service.openlib.mahxwell.org/CopyService/updateCopyRequest", output = "http://copy.service.openlib.mahxwell.org/CopyService/updateCopyResponse")
    public void updateCopy(
        @WebParam(name = "arg0", targetNamespace = "")
        Copy arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Copy arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<org.mahxwell.openlib.service.copy.Copy>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listcopybybook", targetNamespace = "http://copy.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.copy.Listcopybybook")
    @ResponseWrapper(localName = "listcopybybookResponse", targetNamespace = "http://copy.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.copy.ListcopybybookResponse")
    @Action(input = "http://copy.service.openlib.mahxwell.org/CopyService/listcopybybookRequest", output = "http://copy.service.openlib.mahxwell.org/CopyService/listcopybybookResponse")
    public List<Copy> listcopybybook(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0);

}
