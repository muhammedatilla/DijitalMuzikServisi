/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.SongDocumentDAO;
import entity.SongDocument;
import java.io.File;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.servlet.http.Part;

/**
 *
 * @author SAMSUNG
 */
@Named
@SessionScoped
public class SongDocumentBean implements Serializable {

    private SongDocumentDAO dao;
    private SongDocument entity;
    private List<SongDocument> documentList;

    private Part doc;

    private final String uploadTo = "C:/Users/SAMSUNG/Documents/NetBeansProjects/DijitalMuzikServisi/music/";

    public void upload() {
        try{
            InputStream input = doc.getInputStream();
            File f = new File(uploadTo + doc.getSubmittedFileName());
            Files.copy(input, f.toPath());
            
            entity =this.getEntity();
            entity.setDocPath(f.getParent());
            entity.setDocName(f.getName());
            entity.setDocType(doc.getContentType());
 
            this.getDao().create(entity);
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public SongDocumentBean() {
    }

    public String getUploadTo() {
        return uploadTo;
    }

    public SongDocumentDAO getDao() {
        if (this.dao == null) {
            this.dao = new SongDocumentDAO();
        }
        return dao;
    }

    public void setDao(SongDocumentDAO dao) {
        this.dao = dao;
    }

    public SongDocument getEntity() {
        if (this.entity == null) {
            this.entity = new SongDocument();
        }
        return entity;
    }

    public void setEntity(SongDocument entity) {
        this.entity = entity;
    }

    public List<SongDocument> getDocumentList() {
        this.documentList = this.getDao().read();
        return documentList;
    }

    public void setDocumentList(List<SongDocument> documentList) {
        this.documentList = documentList;
    }

    public Part getDoc() {
        return doc;
    }

    public void setDoc(Part doc) {
        this.doc = doc;
    }

}
