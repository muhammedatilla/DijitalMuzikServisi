/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Date;

/**
 *
 * @author SAMSUNG
 */
public class Singer {

    private int singerID;
    private String firstName;
    private String lastName;
    private Date lastUpdate;

    public Singer() {
    }

    public Singer(int singerID, String firstName, String lastName, Date lastUpdate) {
        this.singerID = singerID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.lastUpdate = lastUpdate;
    }

    public int getSingerID() {
        return singerID;
    }

    public void setSingerID(int singerID) {
        this.singerID = singerID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

}
