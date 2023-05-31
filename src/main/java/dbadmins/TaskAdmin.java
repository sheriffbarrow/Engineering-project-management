/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dbadmins;

import databaseConnection.DBConnection;
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
//    String url = "jdbc:mysql://localhost/project_management";
//    String username = "root";
//    String password = "your password";
    
//    public TaskAdmin(){
//        try{
//            this.conn = DriverManager.getConnection(url, username, password);
//            System.out.println("Coonection successful");
//            this.stmt = conn.createStatement();
//        } catch(SQLException e){
//            System.err.println("Error: " + e.getMessage());
//        }
//    }
    
    public List<Task> getTasks(int projId, String status)throws Exception{
        
        try{
            this.conn = DBConnection.dBconnect();
            this.stmt = conn.createStatement();
            String query = String.format("SELECT * FROM task WHERE project_id = %d AND status = '%s'", projId, status);
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
    
    public int createTask(Task tsk) throws Exception{
        try{
            this.conn = DBConnection.dBconnect();
            this.stmt = conn.createStatement();
            String query = String.format("INSERT INTO project "
                    + "(tast_id, project_id, user_id, name, description, status, start_date, end_date) "
                    + "VALUES (%d,%d,%d,'%s','%s','%s','%s','%s')", 
                    tsk.id, tsk.projectId, tsk.userId, tsk.name, tsk.desc,tsk.status,tsk.startDate,tsk.endDate);
            int rowsAffected = stmt.executeUpdate(query);
            return rowsAffected;
        }catch(Exception e){
            throw e;
        }
    }
    
}
