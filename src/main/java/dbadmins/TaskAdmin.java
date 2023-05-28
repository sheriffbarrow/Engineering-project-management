/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dbadmins;

import entities.Task;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author EJAS
 */
public class TaskAdmin {
    
    Statement stmt;
    Connection conn;
    String url = "jdbc:mysql://localhost/project_management";
    String username = "root";
    String password = "your password";
    /*
    public TaskAdmin(){
        try{
            this.conn = DriverManager.getConnection(url, username, password);
            System.out.println("Coonection successful");
            this.stmt = conn.createStatement();
        } catch(SQLException e){
            System.err.println("Error: " + e.getMessage());
        }
    }
    
    public List<Task> getTasks(int projId, String status)throws Exception{
        
        try{
            String query = String.format("SELECT * FROM Task WHERE project_id = %d AND status = '%s'", projId, status);
            ResultSet rs = stmt.executeQuery(query);
            List<Task> tasks = new ArrayList<Task>();
            
            while (rs.next()) {
                Task thisTask = new Task();
                
                thisTask.setId(rs.getInt("task_id"));
                thisTask.setName(rs.getString("name"));
                thisTask.setDesc(rs.getString("description"));
                thisTask.setStatus(rs.getString("status"));
                thisTask.setStartDate(rs.getDate("start_date"));
                thisTask.setEndDate(rs.getDate("end_date"));
                
                tasks.add(thisTask);
            }
            return tasks;
        } catch(SQLException e){
            System.err.println("Error: " + e.getMessage());
            throw e;
        }
    }
    */
}
