/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.SongDAO;
import entity.Song;
import java.io.Serializable;
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

    public SongBean() {
    }

    public SongDAO getDao() {
        return dao;
    }

    public void setDao(SongDAO dao) {
        this.dao = dao;
    }

    public Song getEntity() {
        return entity;
    }

    public void setEntity(Song entity) {
        this.entity = entity;
    }
    
}
