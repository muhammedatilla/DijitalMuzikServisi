/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Language;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.DBConnection;

/**
 *
 * @author CASPER
 */
public class LanguageDAO  extends DBConnection {

    public void create(Language c) {
        try {
            Statement st = this.connect().createStatement();
            st.executeUpdate("insert into language (name) values ('" + c.getName() + "')");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Language> read() {
        List<Language> list = new ArrayList<>();
        try {
            Statement st = this.connect().createStatement();
            ResultSet rs = st.executeQuery("select * from language");

            while (rs.next()) {
                Language tmp = new Language(rs.getInt("languageID"), rs.getString("name"), rs.getDate("last_update"));
                list.add(tmp);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    public void update(Language c) {
        try {
            Statement st = this.connect().createStatement();
            st.executeUpdate("update language set name = '" + c.getName() + "' where languageID=" + c.getLanguageID());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void delete(Language c) {
        try {
            Statement st = this.connect().createStatement();
            st.executeUpdate("delete from language where languageID=" + c.getLanguageID());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
