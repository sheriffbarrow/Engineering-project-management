/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author EJAS
 */
import dbadmins.*;
import entities.*;
import java.util.List;

public class Main {
    
    public static void main(String args[]){
        UserAdmin userAdmin = new UserAdmin();
        ProjectAdmin proAdmin = new ProjectAdmin();
        TaskAdmin taskAdmin = new TaskAdmin();
        try{
            // login test:--------------------------------------------------
            User user = userAdmin.auth("ejas", "something");
            if(user == null){
                System.out.println("User not authenticated");
            } else{
                System.out.println(user.name);
            }
            
            // get projects tests:------------------------------------------
            List<Project> projects = proAdmin.getProjects(2);
            if(projects.isEmpty()){
                System.out.println("you've no projects");
            } else{
                for(int i = 0;i<projects.size();i++){
                    System.out.println(projects.get(i).name);
                }
            }
            
            // get Tasks for project:---------------------------------------
            List<Task> tasks = taskAdmin.getTasks(1,"todo");
            if(tasks.isEmpty()){
                System.out.println(" no tasks for this project");
            } else{
                for(int i =0;i<tasks.size();i++){
                    System.out.println(tasks.get(i).name);
                }
            }
            
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    
}
