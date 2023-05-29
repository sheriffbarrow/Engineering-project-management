/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package databaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Sheriff
 */
public class DBConnection {
    
    private static Connection conn = null;
    
    private static final String username = "root";
    private static final String password = "s0249612579S";
    private static final String url = "jdbc:mysql://localhost/project_management?autoReconnect=true&useSSL=false";
    
    
    public static Connection dBconnect() throws Exception {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
        }
        try {
            if (conn == null || conn.isClosed()) {
                Class.forName("com.mysql.cj.jdbc.Driver"); 
                conn = DriverManager.getConnection(url, username, password);
                System.out.println("connection successful");
            }
            return conn;

        } catch (SQLException e) {
            System.out.println("connectoin failedddd");
            throw new Exception(e.getMessage());
        }

    }

    public static void closeConnection() throws Exception {
        try {
            if(conn != null && !conn.isClosed()){
                conn.close();
            }
        } catch (SQLException e) {
            throw new Exception(e.getMessage());
        }
    }
    
}
