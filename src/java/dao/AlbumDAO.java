/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Album;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.DBConnection;

/**
 *
 * @author CASPER
 */
public class AlbumDAO  extends DBConnection {

    public void create(Album c) {
        try {
            Statement st = this.connect().createStatement();
            st.executeUpdate("insert into album (name) values ('" + c.getName() + "')");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Album> read() {
        List<Album> list = new ArrayList<>();
        try {
            Statement st = this.connect().createStatement();
            ResultSet rs = st.executeQuery("select * from album");

            while (rs.next()) {
                Album tmp = new Album(rs.getInt("albumID"), rs.getString("name"), rs.getDate("last_update"));
                list.add(tmp);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    public void update(Album c) {
        try {
            Statement st = this.connect().createStatement();
            st.executeUpdate("update album set name = '" + c.getName() + "' where albumID=" + c.getAlbumID());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void delete(Album c) {
        try {
            Statement st = this.connect().createStatement();
            st.executeUpdate("delete from album where albumID=" + c.getAlbumID());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
