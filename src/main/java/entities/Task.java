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
    int id;
    int projectId;
    int userId;
    String name;
    String desc;
    String status;
    Date startDate;
    Date endDate;
    
    
    public Task(int pId, int pProjectId, int pUserId, String pName, String pDesc, String pStatus, Date pStartDate, Date pEndDate){
           this.id = pId;
           this.projectId = pProjectId;
           this.userId = pUserId;
           this.name = pName;
           this.desc = pDesc;
           this.status = pStatus;
           this.startDate = pStartDate;
           this.endDate = pEndDate;
    }
    
}
