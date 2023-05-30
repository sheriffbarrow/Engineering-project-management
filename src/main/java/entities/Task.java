/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;
import java.util.*;

/**
 *
 * @author EJAS
 */
public class Task {
    public int id;
    public int projectId;
    public int userId;
    public String name;
    public String desc;
    public String status;
    public Date startDate;
    public Date endDate;
    
    
    public Task(){}

    public void setId(int id) {
        this.id = id;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    
    
    
    
    
}
