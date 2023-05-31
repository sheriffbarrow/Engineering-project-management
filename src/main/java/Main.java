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
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

public class Main {
    
    public static void main(String args[]){
        UserAdmin userAdmin = new UserAdmin();
        ProjectAdmin proAdmin = new ProjectAdmin();
        TaskAdmin taskAdmin = new TaskAdmin();
        try{
            // login test:--------------------------------------------------
//            UserBean bean = new UserBean();
//            bean.setUsername("sheriff");
//            bean.setPassword("12345");
//            
//            System.out.println("user bean: " + bean.getUsername());
//            System.out.println("user bean: " + bean.getPassword());
//
//            UserAdmin useradmin = new UserAdmin();
//            UserBean user = useradmin.login(bean);
//            if(user == null){
//                System.out.println("not logged in");
//            } else{
//                System.out.println("logged in successfully");
//            }
            
            
            // get projects tests:------------------------------------------
            getProjects(proAdmin);
            
            //create porject tests:------------------------------------------
//            Project pj = new Project();
////            pj.setId(5);
//            pj.setName("Test Project");
//            pj.setDesc("testing to see if it works");
//            pj.setUserId(2);
//            int affectedRows = proAdmin.createProject(pj);
//            if(affectedRows > 0){
//                System.out.print("Rows afected: ");
//                System.out.println(affectedRows);
//                getProjects(proAdmin);
//            }
            
            // get Tasks for project:---------------------------------------
//            Hashtable<String,List<Task>> tasks = new Hashtable<>();
//            List<Task> todos = taskAdmin.getTasks(2, "todo");
//            List<Task> inProgress = taskAdmin.getTasks(2,"in progress");
//            List<Task> done = taskAdmin.getTasks(2, "done");
//            tasks.put("todos", todos);
//            tasks.put("in progress", inProgress);
//            tasks.put("done", done);
//            if(tasks.isEmpty()){
//                System.out.println(" no tasks for this project");
//            } else{
//                for(int i =0;i<tasks.size();i++){
//                    System.out.println(i);
//                    String currentKey;
//                    switch(i){
//                        case 0: currentKey = "todos";
//                        break;
//                        case 1: currentKey = "in progress";
//                        break;
//                        default: currentKey = "done";
//                        break;
//                    }
//                    System.out.println(currentKey);
//                    for(int index=0;index<tasks.get(currentKey).size();index++){
//                        System.out.println(tasks.get(currentKey).get(index).name);
//                    }
//                }
//            }
//            
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
