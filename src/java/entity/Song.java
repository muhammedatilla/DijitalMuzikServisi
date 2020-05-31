/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author SAMSUNG
 */
public class Song {

    private int songID;
    private String songName;
    private int singer;
    private int category;
    private int album;
    private int language;
    private int songDoc;

    public Song() {
    }

    public Song(int songID, String songName, int singer, int category, int album, int language, int songDoc) {
        this.songID = songID;
        this.songName = songName;
        this.singer = singer;
        this.category = category;
        this.album = album;
        this.language = language;
        this.songDoc = songDoc;
    }

    public int getSongID() {
        return songID;
    }

    public void setSongID(int songID) {
        this.songID = songID;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public int getSinger() {
        return singer;
    }

    public void setSinger(int singer) {
        this.singer = singer;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public int getAlbum() {
        return album;
    }

    public void setAlbum(int album) {
        this.album = album;
    }

    public int getLanguage() {
        return language;
    }

    public void setLanguage(int language) {
        this.language = language;
    }

    public int getSongDoc() {
        return songDoc;
    }

    public void setSongDoc(int songDoc) {
        this.songDoc = songDoc;
    }

}
