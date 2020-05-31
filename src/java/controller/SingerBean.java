/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.SingerDAO;
import entity.Singer;
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
public class SingerBean implements Serializable {

    private SingerDAO dao;
    private Singer entity;

    public String create() {
        this.getDao().create(entity);
        this.entity = new Singer();
        return "/singer/list";
    }

    public List<Singer> getRead() {
        return this.getDao().read();
    }

    public String updateForm(Singer c) {
        this.entity = c;
        return "/singer/update";
    }

    public String update() {        
        this.getDao().update(entity);
        this.entity = new Singer();
        return "/singer/list";
    }

    public void delete(Singer c) {
        this.getDao().delete(c);
    }

    public SingerBean() {
    }

    public SingerDAO getDao() {
        if (this.dao == null) {
            this.dao = new SingerDAO();
        }
        return dao;
    }

    public void setDao(SingerDAO dao) {
        this.dao = dao;
    }

    public Singer getEntity() {
        if (this.entity == null) {
            this.entity = new Singer();
        }
        return entity;
    }

    public void setEntity(Singer entity) {
        this.entity = entity;
    }
    
}
