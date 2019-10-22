package org.mahxwell.openlib.model.bean.openlib;


/**
 * @author Mahxwell
 * <h1>Editor Class Object</h1>
 */
public class Editor {

    private Integer editorId;
    private String editorName, editorNationality;

    public Integer getEditorId() {
        return editorId;
    }

    public void setEditorId(Integer editorId) {
        this.editorId = editorId;
    }

    public String getEditorName() {
        return editorName;
    }

    public void setEditorName(String editorName) {
        this.editorName = editorName;
    }

    public String getEditorNationality() {
        return editorNationality;
    }

    public void setEditorNationality(String editorNationality) {
        this.editorNationality = editorNationality;
    }

    @Override
    public String toString() {
        return "Editor{" +
                "editorId=" + editorId +
                ", editorName='" + editorName + '\'' +
                ", editorNationality='" + editorNationality + '\'' +
                '}';
    }
}
