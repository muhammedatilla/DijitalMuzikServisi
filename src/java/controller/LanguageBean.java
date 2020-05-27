/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.LanguageDAO;
import entity.Language;
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
public class LanguageBean implements Serializable {

    private LanguageDAO dao;
    private Language entity;

    public String create() {
        this.getDao().create(entity);
        this.entity = new Language();
        return "/language/list";
    }

    public List<Language> getRead() {
        return this.getDao().read();
    }

    public String updateForm(Language c) {
        this.entity = c;
        return "/language/update";
    }

    public String update() {
        this.entity = new Language();
        this.getDao().update(entity);
        return "/language/list";
    }

    public void delete(Language c) {
        this.getDao().delete(c);
    }

    public LanguageBean() {
    }

    public LanguageDAO getDao() {
        if (this.dao == null) {
            this.dao = new LanguageDAO();
        }
        return dao;
    }

    public void setDao(LanguageDAO dao) {
        this.dao = dao;
    }

    public Language getEntity() {
        if (this.entity == null) {
            this.entity = new Language();
        }
        return entity;
    }

    public void setEntity(Language entity) {
        this.entity = entity;
    }

}
