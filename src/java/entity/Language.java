/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Date;

/**
 *
 * @author CASPER
 */
public class Language {
    
    
    private int languageID;
    private String name;
    private Date lastUpdate;

    public Language() {
    }

    public Language(int languageID, String name, Date lastUpdate) {
        this.languageID = languageID;
        this.name = name;
        this.lastUpdate = lastUpdate;
    }

    public int getLanguageID() {
        return languageID;
    }

    public void setLanguageID(int languageID) {
        this.languageID = languageID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
    
    
    
}
