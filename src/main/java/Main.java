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
            UserBean bean = new UserBean();
            bean.setUsername("sheriff");
            bean.setPassword("12345");
            
            System.out.println("user bean: " + bean.getUsername());
            System.out.println("user bean: " + bean.getPassword());

            UserAdmin useradmin = new UserAdmin();
            UserBean user = useradmin.login(bean);
            if(user == null){
                System.out.println("not logged in");
            } else{
                System.out.println("logged in successfully");
            }
            
            
            // get projects tests:------------------------------------------
            getProjects(proAdmin);
            
            //creat porject tests:------------------------------------------
            Project pj = new Project();
            pj.setId(3);
            pj.setName("Test Project");
            pj.setDesc("testing to see if it works");
            pj.setUserId(1);
            int affectedRows = proAdmin.createProject(pj);
            if(affectedRows > 0){
                System.out.print("Rows afected: ");
                System.out.println(affectedRows);
                getProjects(proAdmin);
            }
            
            // get Tasks for project:---------------------------------------
//            List<Task> tasks = taskAdmin.getTasks(1,"todo");
//            if(tasks.isEmpty()){
//                System.out.println(" no tasks for this project");
//            } else{
//                for(int i =0;i<tasks.size();i++){
//                    System.out.println(tasks.get(i).name);
//                }
//            }
            
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    
    public static void getProjects(ProjectAdmin proAdmin) throws Exception{
        List<Project> projects = proAdmin.getProjects(1);
            if(projects.isEmpty()){
                System.out.println("you've no projects");
            } else{
                for(int i = 0; i<projects.size(); i++){
                    System.out.println(projects.get(i).name);
                }
            }
    }
    
}
