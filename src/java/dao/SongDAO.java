/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Song;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.DBConnection;

/**
 *
 * @author SAMSUNG
 */
public class SongDAO extends DBConnection {

    public void create(Song c) {
        try {
            Statement st = this.connect().createStatement();
            st.executeUpdate("insert into song (name, singer, category, album, language, songDoc) values ('" + c.getSongName() + "', '" + c.getSinger() + "', '" + c.getCategory() + "', '" + c.getAlbum() + "', '" + c.getLanguage() + "', '" + c.getSongDoc() + "')");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Song> read() {
        List<Song> list = new ArrayList<>();
        try {
            Statement st = this.connect().createStatement();
            ResultSet rs = st.executeQuery("select * from song");
            while (rs.next()) {
                Song tmp = new Song(rs.getInt("songID"), rs.getString("songName"), rs.getInt("singer"), rs.getInt("category"), rs.getInt("album"), rs.getInt("language"), rs.getInt("songDoc"));
                list.add(tmp);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    public void update(Song c) {
        try {
            Statement st = this.connect().createStatement();
            st.executeUpdate("update song set name = '" + c.getSongName() + "', singer='"+c.getSinger()+"', category='"+c.getCategory()+"', album='"+c.getAlbum()+"', language='"+c.getLanguage()+"', songDoc='"+c.getSongDoc()+"' where songID=" + c.getSongID());          
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void delete(Song c) {
        try {
            Statement st = this.connect().createStatement();
            st.executeUpdate("delete from song where songID = " + c.getSongID());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
