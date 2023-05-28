<%-- 
    Document   : login
    Created on : 23 May 2023, 11:43:03
    Author     : Sheriff
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
        <link href="css/login.css" rel="stylesheet" type="text/css"/>
    </head>
    <link href="css/style.css" rel="stylesheet" type="text/css"/>
    <body>

        <div class="logo text-center">
            <h1 >Engineering Project Management</h1>
        </div>
        <div class="wrapper">
            <div class="inner-warpper text-center">
                <h2 class="title">Login to your account</h2>
                <form action="userServlet" method="post" id="formvalidate">
                    <div class="input-group">
                        <label class="palceholder" for="userName">User Name</label>
                        <input class="form-control" name="userName" id="userName" type="text" placeholder="" />
                        <span class="lighting"></span>
                    </div>
                    <div class="input-group">
                        <label class="palceholder" for="userPassword">Password</label>
                        <input class="form-control" name="userPassword" id="userPassword" type="password" placeholder="" />
                        <span class="lighting"></span>
                    </div>

                    <button type="submit" id="login">Login</button>
                    <div class="clearfix supporter">
                        <div class="pull-left remember-me">
                            <input id="rememberMe" type="checkbox">
                            <label for="rememberMe">Remember Me</label>
                        </div>
                    </div>
                    <div style="color:red; margin:25px 0">
                        ${msg}
                    <div/>
                </form>
            </div>
        </div>
        <!-- partial -->
        <script src='https://code.jquery.com/jquery-2.2.4.min.js'></script>
        <script src='https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.15.0/jquery.validate.min.js'></script>
        <script src="js/script.js" type="text/javascript"></script>
    </body>
</html>
