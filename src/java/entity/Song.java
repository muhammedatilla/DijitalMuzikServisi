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
    private int songSinger;
    private int songCategory;
    private int songAlbum;
    private int songLanguage;
    private int songHit;
    private String songPath;

    public Song() {
    }

    public Song(int songID, String songName, int songSinger, int songCategory, int songAlbum, int songLanguage, int songHit, String songPath) {
        this.songID = songID;
        this.songName = songName;
        this.songSinger = songSinger;
        this.songCategory = songCategory;
        this.songAlbum = songAlbum;
        this.songLanguage = songLanguage;
        this.songHit = songHit;
        this.songPath = songPath;
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

    public int getSongSinger() {
        return songSinger;
    }

    public void setSongSinger(int songSinger) {
        this.songSinger = songSinger;
    }

    public int getSongCategory() {
        return songCategory;
    }

    public void setSongCategory(int songCategory) {
        this.songCategory = songCategory;
    }

    public int getSongAlbum() {
        return songAlbum;
    }

    public void setSongAlbum(int songAlbum) {
        this.songAlbum = songAlbum;
    }

    public int getSongLanguage() {
        return songLanguage;
    }

    public void setSongLanguage(int songLanguage) {
        this.songLanguage = songLanguage;
    }

    public int getSongHit() {
        return songHit;
    }

    public void setSongHit(int songHit) {
        this.songHit = songHit;
    }

    public String getSongPath() {
        return songPath;
    }

    public void setSongPath(String songPath) {
        this.songPath = songPath;
    }

}
