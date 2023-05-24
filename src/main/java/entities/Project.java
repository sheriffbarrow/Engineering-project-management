/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author EJAS
 */
public class Project {
    int id;
    String name;
    String desc;
    
    public Project(int pId, String pName, String pDesc){
        this.id = pId;
        this.name = pName;
        this.desc = pDesc;
    }
    
    //setters
    
    public void setId(int pid){
        this.id = pid;
    }
    public void setName(String pName){
        this.name = pName;
    }
    
    public void setDesc(String pDesc){
        this.desc = pDesc;
    }
    
}
