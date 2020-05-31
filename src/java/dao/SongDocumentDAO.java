/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.SongDocument;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.DBConnection;

/**
 *
 * @author SAMSUNG
 */
public class SongDocumentDAO extends DBConnection{
    
    public void create(SongDocument c) {
        String query = "insert into songdocument (docPath, docName, docType) values (?,?,?)";
        try {
            PreparedStatement pst = this.connect().prepareStatement(query);
            pst.setString(1, c.getDocPath());
            pst.setString(2, c.getDocName());
            pst.setString(3, c.getDocType());
            pst.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public List<SongDocument> read() {
        List<SongDocument> list = new ArrayList<>();
        try {
            PreparedStatement pst = this.connect().prepareStatement("select * from songdocument");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                SongDocument tmp = new SongDocument(rs.getInt("docID"), rs.getString("docPath"), rs.getString("docName"), rs.getString("docType"));
                list.add(tmp);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
    
}
