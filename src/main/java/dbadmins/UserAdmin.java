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
    
    public User auth(String name, String password) throws Exception {
        try{
            String query = String.format("SELECT * FROM user WHERE name = '%s' AND password = '%s'", name, password);
            ResultSet rs = stmt.executeQuery(query);
            if(rs.next()){
                User user = new User();
                user.setName(rs.getString("name"));
                user.setPhone(rs.getInt("phone"));
                return user;
            } else {
                return null;
            }
//            rs.
//            while (rs.next()) {
//                String name = rs.getString("genre_name");
//                System.out.println("Name: " + name);
//            }
        } catch(SQLException e) {
            System.err.println("Error: " + e.getMessage());
            throw e;
        }
    }
    
}
