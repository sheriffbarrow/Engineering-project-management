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
    public String name;
    public String desc;
    
    public Project(){}
    
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
