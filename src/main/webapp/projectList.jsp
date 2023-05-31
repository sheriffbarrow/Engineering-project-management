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
        <title>Project List</title>
    </head>
    <body>
        
        <div class="titles">
            <h1 class ='header'>My Projects</h1>
            <button class="add-button">Add Project + </button>
        </div>


        <div class='content'>
            <% List<Project> projects = (List<Project>)request.getAttribute("projects");
           for(int i=0;i<projects.size();i++){
        %>
           <div class="box effect">
            <div class="project-title">
                <h1><%= projects.get(i).name %></h1>
            </div>
            <div class="description">
                <p>
                    <%= projects.get(i).desc +" more thing jakdf  dkafj dkfj "
                            + "adjfk df kdfja dkfj a dfjak ajfaldjfkajdfk dkjfakd "
                            + "kdjfakd j adkfj ka djfkd  kjdf a;dfk j adkfja fkj "
                            + "ksdjf kad jfad kfd fj k a jdkfjakdjfakd kdjfakdf d"
                            + "akdjfk  kdjfakd something is about to chan"
                    %>
                </p>
            </div>
        </div>
                        
        <% } %>
        </div>
    </body>
</html>
