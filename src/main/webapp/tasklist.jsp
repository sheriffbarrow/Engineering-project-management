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
            Task selectedTask;
        %>
        <!-- side panel -->
        <div class="side-panel">
            <h3><%= prj.name %></h3>
            <p style="color: white;"><%= prj.desc %></p>
            <button onclick="document.getElementById('id03').style.display = 'block'"  class="create-button">Create Task</button>
        </div>
        
        <!-- content -->
        <div class="content"> 
            
            
            <div class="list-section">
                <h4>Todos</h4>
                <div class="task-list">
                    <% for(int i=0;i< tasks.get("todos").size();i++){ %>
                        <div onclick="document.getElementById('id02').style.display = 'block'"  class="task-item">
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
                        <div onclick="document.getElementById('id01').style.display = 'block'" class="task-item">
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
                        <div onclick="document.getElementById('id01').style.display = 'block'" class="task-item">
                            <p class="task-name"><%= tasks.get("done").get(i).name%></p>
                            <p>End Date: <%= tasks.get("done").get(i).endDate %></p>
                        </div>
                    <%}%>
                </div>
            </div>
        </div>
        
                <!-- The Modal -->
        <div id="id01" class="w3-modal modal"> <!-- class="modal"
          <!-- Modal content -->
          <div class="modal-content">
              
            <div class="row margin-btm">
                <span onclick="document.getElementById('id01').style.display = 'none'" class="close">&times;</span>
                <h4 class="inline">Schematic Development</h4>
                <p class="status">Status: In Progress</p>
            </div>
              
              <div class="desc-field">
                  <p>The Skyfront Perimeter has the longest endurance of any drone on the market. It flies for hours and carries large payloads in a wide range of operating conditions.</p>
              </div>
              
              <div class="row">
                  <div class="date-style float-left">
                      <p class="inline">Start date : 2023-06-15</p>
                  </div>
                  <div class="date-style">
                      <p class="inline">End date : 2023-07-11</p>
                  </div>
              </div>
              
          </div>

        </div>
                
        <div id="id02" class="w3-modal modal"> <!-- class="modal"
          <!-- Modal content -->
          <div class="modal-content">
              
            <div class="row margin-btm">
                <span onclick="document.getElementById('id02').style.display = 'none'" class="close">&times;</span>
                <h4 class="inline">Chasses Generative Design</h4>
                <p class="status todo-color">Status: Todo</p>
            </div>
              
              <div class="desc-field">
                  <p>A cyber-physical system or intelligent system is a computer system in which a mechanism is controlled or monitored by computer-based algorithms</p>
              </div>
              
              <div class="row">
                  <div class="date-style float-left">
                      <p class="inline">Start date : 2023-06-15</p>
                  </div>
                  <div class="date-style">
                      <p class="inline">End date : 2023-04-22</p>
                  </div>
              </div>
          </div>

        </div>
                
          <div id="id03" class="w3-modal modal"> <!-- class="modal"
          <!-- Modal content -->
          <div class="modal-content">
              
            <div class="row margin-btm">
                <span onclick="document.getElementById('id03').style.display = 'none'" class="close">&times;</span>
                <h4 class="inline">Enter task name</h4>
                <p class="status todo-color">Status: Todo</p>
            </div>
              
              <div class="desc-field">
                  <p>Description</p>
              </div>
              
              <div class="row">
                  <div class="date-style float-left">
                      <p class="inline">Start date : </p>
                  </div>
                  <div class="date-style">
                      <p class="inline">End date : </p>
                  </div>
              </div>
          </div>

        </div>
        
      <!--<script src="js/task_detail.js" type="text/javascript"></script>-->
    </body>
</html>
