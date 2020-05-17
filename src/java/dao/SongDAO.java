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

    public void create(Song s) {
        try {
            Statement st = this.connect().createStatement();
            st.executeUpdate("insert into song (songName, songSinger, songCategory, songAlbum, songLanguage, songHit, songPath) values ('" + s.getSongName() + "', '" + s.getSongSinger() + "', '" + s.getSongCategory() + "', '" + s.getSongAlbum() + "', '" + s.getSongLanguage() + "', '" + s.getSongHit() + "', '" + s.getSongPath() + "')");
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
                Song tmp = new Song(rs.getInt("songID"), rs.getString("songName"), rs.getInt("songSinger"), rs.getInt("songCategory"), rs.getInt("songAlbum"), rs.getInt("songLanguage"), rs.getInt("songHit"), rs.getString("songPath"));
                list.add(tmp);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    public void update(Song s) {
        try {
            Statement st = this.connect().createStatement();
            st.executeUpdate("update song songName = '" + s.getSongName() + "', songSinger = '" + s.getSongSinger() + "', songCategory = '" + s.getSongCategory() + "', songAlbum = '" + s.getSongAlbum() + "', songLanguage = '" + s.getSongLanguage() + "', songHit = '" + s.getSongHit() + "', songPath = '" + s.getSongPath() + "' where songID = " + s.getSongID());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void delete(Song s) {
        try {
            Statement st = this.connect().createStatement();
            st.executeUpdate("delete from song where songID = " + s.getSongID());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
