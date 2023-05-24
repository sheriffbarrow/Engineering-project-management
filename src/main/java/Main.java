/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author EJAS
 */
import dbadmins.UserAdmin;
import entities.User;

public class Main {
    
    public static void main(String args[]){
        UserAdmin userAdmin = new UserAdmin();
        try{
            User user = userAdmin.auth("ejas", "something");
            if(user == null){
                System.out.println("User not authenticated");
            } else{
                System.out.println(user.name);
            }
            
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    
}
