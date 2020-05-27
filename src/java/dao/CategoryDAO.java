/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Category;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.DBConnection;

/**
 *
 * @author CASPER
 */
public class CategoryDAO  extends DBConnection {

    public void create(Category c) {
        try {
            Statement st = this.connect().createStatement();
            st.executeUpdate("insert into category (name) values ('" + c.getName() + "')");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Category> read() {
        List<Category> list = new ArrayList<>();
        try {
            Statement st = this.connect().createStatement();
            ResultSet rs = st.executeQuery("select * from category");

            while (rs.next()) {
                Category tmp = new Category(rs.getInt("categoryID"), rs.getString("name"), rs.getDate("last_update"));
                list.add(tmp);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    public void update(Category c) {
        try {
            Statement st = this.connect().createStatement();
            st.executeUpdate("update category set name = '" + c.getName() + "' where categoryID=" + c.getCategoryID());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void delete(Category c) {
        try {
            Statement st = this.connect().createStatement();
            st.executeUpdate("delete from category where categoryID=" + c.getCategoryID());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
