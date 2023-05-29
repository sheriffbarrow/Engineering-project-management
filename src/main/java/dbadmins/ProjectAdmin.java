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

import entities.Project;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author EJAS
 */
public class ProjectAdmin {
    
    Statement stmt;
    Connection conn;
    String url = "jdbc:mysql://localhost/project_management";
    String username = "root";
    String password = "s0249612579S";
    
    /*
    public ProjectAdmin(){
        try{
            this.conn = DriverManager.getConnection(url, username, password);
            System.out.println("Coonection successful");
            this.stmt = conn.createStatement();
        } catch(SQLException e){
            System.err.println("Error: " + e.getMessage());
        }
    }
    
    public List<Project> getProjects(int userId)throws Exception{
        try{
            String query = String.format("SELECT * FROM project WHERE user_id = %d", userId);
            ResultSet rs = stmt.executeQuery(query);
            List<Project> projects = new ArrayList<Project>();
            
            while (rs.next()) {
                Project thisProject = new Project();
                thisProject.setId(rs.getInt("project_id"));
                thisProject.setName(rs.getString("name"));
                thisProject.setDesc(rs.getString("description"));
                projects.add(thisProject);
            }
            return projects;
        } catch(SQLException e){
            System.err.println("Error: " + e.getMessage());
            throw e;
        }
    }
    */
}
