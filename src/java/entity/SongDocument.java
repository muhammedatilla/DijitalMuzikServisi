/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author SAMSUNG
 */
public class SongDocument {

    private int docID;
    private String docPath;
    private String docName;
    private String docType;

    public SongDocument() {
    }

    public SongDocument(int docID, String docPath, String docName, String docType) {
        this.docID = docID;
        this.docPath = docPath;
        this.docName = docName;
        this.docType = docType;
    }

    public int getDocID() {
        return docID;
    }

    public void setDocID(int docID) {
        this.docID = docID;
    }

    public String getDocPath() {
        return docPath;
    }

    public void setDocPath(String docPath) {
        this.docPath = docPath;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

}
