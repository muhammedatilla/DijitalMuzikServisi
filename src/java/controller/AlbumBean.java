/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.AlbumDAO;
import entity.Album;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author CASPER
 */
@Named
@SessionScoped
public class AlbumBean implements Serializable {

    private AlbumDAO dao;
    private Album entity;

    public String create() {
        this.getDao().create(entity);
        this.entity = new Album();
        return "/album/list";
    }

    public List<Album> getRead() {
        return this.getDao().read();
    }

    public String updateForm(Album c) {
        this.entity = c;
        return "/album/update";
    }

    public String update() {
        this.getDao().update(entity);
        this.entity = new Album();
        return "/album/list";
    }

    public void delete(Album c) {
        this.getDao().delete(c);
    }

    public AlbumBean() {
    }

    public AlbumDAO getDao() {
        if (this.dao == null) {
            this.dao = new AlbumDAO();
        }
        return dao;
    }

    public void setDao(AlbumDAO dao) {
        this.dao = dao;
    }

    public Album getEntity() {
        if (this.entity == null) {
            this.entity = new Album();
        }
        return entity;
    }

    public void setEntity(Album entity) {
        this.entity = entity;
    }

}
