/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Singer;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.DBConnection;

/**
 *
 * @author SAMSUNG
 */
public class SingerDAO extends DBConnection {

    public void create(Singer c) {
        try {
            Statement st = this.connect().createStatement();
            st.executeUpdate("insert into singer (firstName, lastName) values ('" + c.getFirstName() + "', '"+c.getLastName()+"')");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Singer> read() {
        List<Singer> list = new ArrayList<>();
        try {
            Statement st = this.connect().createStatement();
            ResultSet rs = st.executeQuery("select * from singer");

            while (rs.next()) {
                Singer tmp = new Singer(rs.getInt("singerID"), rs.getString("firstName"), rs.getString("lastName"), rs.getDate("last_update"));
                list.add(tmp);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    public void update(Singer c) {
        try {
            Statement st = this.connect().createStatement();
            st.executeUpdate("update singer set firstName = '" + c.getFirstName() + "', lastName= '"+c.getLastName()+"' where singerID=" + c.getSingerID());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void delete(Singer c) {
        try {
            Statement st = this.connect().createStatement();
            st.executeUpdate("delete from singer where singerID=" + c.getSingerID());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
