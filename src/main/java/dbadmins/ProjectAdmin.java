/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dbadmins;

import entities.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import entities.Project;

/**
 *
 * @author EJAS
 */
public class ProjectAdmin {
    
    Statement stmt;
    Connection conn;
    String url = "jdbc:mysql://localhost/project_management";
    String username = "root";
    String password = "ejas";
    
    
    public ProjectAdmin(){
        try{
            this.conn = DriverManager.getConnection(url, username, password);
            System.out.println("Coonection successful");
            this.stmt = conn.createStatement();
        } catch(SQLException e){
            System.err.println("Error: " + e.getMessage());
        }
    }
    
    public void getProjects(int userId){
        try{
            String query = String.format("SELECT * FROM project WHERE user_id = %d", userId);
            ResultSet rs = stmt.executeQuery(query);
            Project[] projects = {};
            
            while (rs.next()) {
                String name = rs.getString("genre_name");
                System.out.println("Name: " + name);
            }
        } catch(SQLException e){
            System.err.println("Error: " + e.getMessage());
        }
    }
    
}
