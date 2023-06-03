<%-- 
    Document   : tasklist
    Created on : Jun 1, 2023, 10:42:06 AM
    Author     : EJAS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Hashtable" %>
<%@page import="entities.Project" %>
<%@page import="entities.Task" %>
<%@page import="java.util.List" %>
<!DOCTYPE html>
<html>
    <head>
        <link href="css/tasklist.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
            Hashtable<String,List<Task>> tasks = (Hashtable<String,List<Task>>)request.getAttribute("tasks"); 
            Project prj = (Project)request.getAttribute("project");
        %>
        <!-- side panel -->
        <div class="side-panel">
            <h3><%= prj.name %></h3>
            <p style="color: white;"><%= prj.desc %></p>
            <button >Create Task</button>
        </div>
        
        <!-- content -->
        <div class="content"> 
            
            
            <div class="list-section">
                <h4>Todos</h4>
                <div class="task-list">
                    <% for(int i=0;i< tasks.get("todos").size();i++){ %>
                        <div id="task-item" class="task-item">
                            <p class="task-name"><%= tasks.get("todos").get(i).name%></p>
                            <p>End Date: <%= tasks.get("todos").get(i).endDate %></p>
                        </div>
                    <%}%>
                </div>
            </div>
                
                <div class="list-section">
                <h4>In Progress</h4>
                <div class="task-list">
                    <% for(int i=0;i< tasks.get("in progress").size();i++){ %>
                        <div class="task-item">
                            <p class="task-name"><%= tasks.get("in progress").get(i).name%></p>
                            <p>End Date: <%= tasks.get("in progress").get(i).endDate %></p>
                        </div>
                    <%}%>
                </div>
            </div>
                
                <div class="list-section">
                <h4>Completed</h4>
                <div  class="task-list">
                    <% for(int i=0;i< tasks.get("done").size();i++){ %>
                        <div class="task-item">
                            <p class="task-name"><%= tasks.get("done").get(i).name%></p>
                            <p>End Date: <%= tasks.get("done").get(i).endDate %></p>
                        </div>
                    <%}%>
                </div>
            </div>
        </div>
        
                <!-- The Modal -->
        <div id="myModal" class="modal">
          <!-- Modal content -->
          <div class="modal-content">
              
            <div class="row margin-btm">
                <span class="close">&times;</span>
                <h4 class="inline">Task Name</h4>
                <p class="status">Status: Todo</p>
            </div>
              
              <div class="desc-field">
                  <p>some things here and there</p>
              </div>
              
              <div class="row">
                  <div class="date-style float-left">
                      <p class="inline">End date : 2020-22-24</p>
                  </div>
                  <div class="date-style">
                      <p class="inline">End date : 2020-22-24</p>
                  </div>
              </div>
              
<!--            <textarea class="desc-field" placeholder="Description" rows="12" name="text"></textarea>
            
            <div>
                <label for="start-date">Start Date</label>
                <input placeholder="Start date" id="start-date" type="text">
            </div>-->
              
              
          </div>

        </div>
        
      <script src="js/task_detail.js" type="text/javascript"></script>
    </body>
</html>
