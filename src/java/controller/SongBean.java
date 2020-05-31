/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.SongDAO;
import entity.Song;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author SAMSUNG
 */
@Named
@SessionScoped
public class SongBean implements Serializable{
    
    private SongDAO dao;
    private Song entity;

    public String create() {
        this.getDao().create(entity);
        this.entity = new Song();
        return "/song/list";
    }

    public List<Song> getRead() {
        return this.getDao().read();
    }

    public String updateForm(Song c) {
        this.entity = c;
        return "/song/update";
    }

    public String update() {        
        this.getDao().update(entity);
        this.entity = new Song();
        return "/song/list";
    }

    public void delete(Song c) {
        this.getDao().delete(c);
    }
    
    public SongBean() {
    }

    public SongDAO getDao() {
        if (this.dao == null) {
            this.dao = new SongDAO();
        }
        return dao;
    }

    public void setDao(SongDAO dao) {
        this.dao = dao;
    }

    public Song getEntity() {
         if (this.entity == null) {
            this.entity = new Song();
        }
        return entity;
    }

    public void setEntity(Song entity) {
        this.entity = entity;
    }
    
}
