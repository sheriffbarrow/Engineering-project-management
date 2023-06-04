<%-- 
    Document   : dashboard
    Created on : 27 May 2023, 21:00:16
    Author     : nascotek
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="entities.Project" %>
<%@page import="java.util.List" %>
<!DOCTYPE html>
<html>
    <head>
        <link href="css/projectList.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <title>Project List</title>
    </head>
    <body>

        <div class="titles">
            <h1 class ='header'>My Projects</h1>
            <button onclick="document.getElementById('id01').style.display = 'block'" class="add-button">Add Project +</button>

        </div>

        <div class="w3-container">

            <div id="id01" class="w3-modal">
                <div class="w3-modal-content w3-card-4 w3-animate-zoom" style="max-width:600px">

                    <div class="w3-center"><br>
                        <span onclick="document.getElementById('id01').style.display = 'none'" class="w3-button w3-xlarge w3-hover-red w3-display-topright" title="Close Modal">&times;</span>
                        <div style="float: left; margin-left: 15px; font-size: 30px; font-family: Arial;"> Create Project</div>
                    </div>
w3
                    <form class="w3-container" action="" method="post">
                        <div class="w3-section">
                            <input class="w3-input w3-border w3-margin-bottom" type="text" placeholder="Project Name" name="project-name" required style="background-color: #E4F1F6; height: 70px;">
                            <textarea id="w3review" placeholder="Description" name="w3review" rows="6" cols="60" style="background-color: #E4F1F6;"></textarea>
                            <div style="margin-top: 20px;">

                                <input placeholder="Start Date" type="text" onfocus="(this.type = 'date')" onblur="(this.type = 'text')" id="date" id="start-date" name="start-date" style="background-color: #E4F1F6; height: 50px; ">
                                <input placeholder="End Date"  type="text" onfocus="(this.type = 'date')" onblur="(this.type = 'text')" id="date" id="end-date" name="end-date" style="float:right; margin-right: 5px; background-color: #E4F1F6; height: 50px;">
                            </div>       
                        </div>
                    </form>

                    <div class="w3-container w3-border-top w3-padding-16 w3-light-grey">
                        <button class="create" type="button" style='background-color: #4B6A74; border-radius: 47px; display: block; height: 60px; width: 500px; text-align: center; margin-left: 30px; color: white; font-family: Arial; font-size: 30px;'>Create Project</button>
                    </div>

                </div>
            </div>
        </div>

        <div class='content'>
            <% List<Project> projects = (List<Project>)request.getAttribute("projects");
           for(int i=0;i<projects.size();i++){
           Project prj = projects.get(i);
           String ref = String.format("taskListServlet?project_id=%d",prj.id);
        %>
        <a href=<%= ref %>>
            <div class="box effect" a>
            <div class="project-title">
                <h1><%= prj.name %></h1>
            </div>
            <div class="description">
                <p>
                    <%= prj.desc%>
                </p>
            </div>
        </div>
        </a>
                        
        <% } %>
        </div>
    </body>
</html>
