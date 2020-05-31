/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.CategoryDAO;
import entity.Category;
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
public class CategoryBean implements Serializable {

    private CategoryDAO dao;
    private Category entity;

    public String create() {
        this.getDao().create(entity);
        this.entity = new Category();
        return "/category/list";
    }

    public List<Category> getRead() {
        return this.getDao().read();
    }

    public String updateForm(Category c) {
        this.entity = c;
        return "/category/update";
    }

    public String update() {        
        this.getDao().update(entity);
        this.entity = new Category();
        return "/category/list";
    }

    public void delete(Category c) {
        this.getDao().delete(c);
    }

    public CategoryBean() {
    }

    public CategoryDAO getDao() {
        if (this.dao == null) {
            this.dao = new CategoryDAO();
        }
        return dao;
    }

    public void setDao(CategoryDAO dao) {
        this.dao = dao;
    }

    public Category getEntity() {
        if (this.entity == null) {
            this.entity = new Category();
        }
        return entity;
    }

    public void setEntity(Category entity) {
        this.entity = entity;
    }

}
