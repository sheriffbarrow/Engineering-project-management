/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dbadmins;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import entities.User;

/**
 *
 * @author EJAS
 */
public class UserAdmin {
    Statement stmt;
    Connection conn;
    String url = "jdbc:mysql://localhost/project_management";
    String username = "root";
    String password = "ejas";
    
    
    public UserAdmin(){
        try{
            this.conn = DriverManager.getConnection(url, username, password);
            System.out.println("Coonection successful");
            this.stmt = conn.createStatement();
        } catch(SQLException e){
            System.err.println("Error: " + e.getMessage());
        }
    }
    
    public void auth(int phone, String name){
        try{
            String query = String.format("SELECT * FROM user WHERE name = %s AND phone = %d", name, phone);
            ResultSet rs = stmt.executeQuery(query);
            User user = new User();
            user.setName(rs.getString("name"));
            user.setPhone(rs.getInt("phone"));
//            rs.
//            while (rs.next()) {
//                String name = rs.getString("genre_name");
//                System.out.println("Name: " + name);
//            }
        } catch(SQLException e){
            System.err.println("Error: " + e.getMessage());
        }
    }
    
}
