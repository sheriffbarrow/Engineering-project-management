/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dbadmins;

import databaseConnection.DBConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import entities.UserBean;
import java.sql.PreparedStatement;

/**
 *
 * @author EJAS
 */
public class UserAdmin {
    
    
    public UserBean login(UserBean userbean) throws SQLException, Exception{
        
        boolean loggedIn = false;
        Connection conn;
        String sql = "SELECT * FROM USER WHERE name = ? and password = ?";
        
        try{
            conn = DBConnection.dBconnect();
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, userbean.getUsername());
                stmt.setString(2, userbean.getPassword());
                try (ResultSet result = stmt.executeQuery()) {
                    loggedIn = result.next();
                    if(loggedIn){
                        System.out.println("logged in successful");
                        return userbean;
                    }else{
                        System.out.println("could not logged in");
                    }
                    result.close();
                    stmt.close();
                }
            }
        }catch(SQLException e){
            throw new Exception(e.getMessage());
            
        }finally{
            System.out.println("connection closed!!");
            DBConnection.closeConnection();
        }
        return null;
       

    }


}
