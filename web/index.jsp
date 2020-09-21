<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">


        <title>Login</title>


        <link rel="stylesheet" type="text/css" href="css/util.css">

        <link rel="stylesheet" type="text/css" href="css/main.css">
        <link href="css/bootstrap/css/bootstrap.min.css" rel="stylesheet">	

        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>

        <link href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <link rel="stylesheet" type="text/css" href="fonts/Linearicons-Free-v1.0.0/icon-font.min.css">




    </head>



    <body >
        <header>
            <!-- Navigation -->
            <nav class="navbar navbar-expand-lg navbar-dark bg-dark static-top" style="padding:0px;margin:0px;border-radius: 0px;">
                <div class="container" >

                    <a href="index.jsp"><img src="images/logo.png" class="logo"></a>
                    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>

                    <div class="collapse navbar-collapse" id="navbarResponsive">
                        <ul class="navbar-nav ml-auto" style="padding-left: 85%;">

                            <li class="nav-item" id="navblue">
                                <a class="nav-link"  href="login.jsp">Connexion</a>
                            </li>

                            <li class="nav-item" id="navorange">
                                <a class="nav-link" href="register.jsp">Inscription</a>
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>
        </header>

        <style type="text/css">
            .wrap-input {
                position: relative;
                width: 100%;
                z-index: 1;
            }
            .wrap-login {
                width: 450px;
                background: #fff;
                border-radius: 3px;
                overflow: hidden;
            }

        </style>
    
       
            <div class="limiter">
                <div class="login">
                    <div class="wrap-login p-l-50 p-r-50 p-t-77 p-b-30">
                        <form method="post" action="login" class="login-form validate-form">
                            <span class="login-form-title p-b-55">
                                Login
                            </span>

                            <div class="wrap-input validate-input m-b-16" data-validate = "Valid email is required: Talioh@abc.xyz">
                                <input class="input" type="text" name="mail" id="mail" placeholder="Email">
                                <span class="focus-input"></span>
                                <span class="symbol-input">
                                    <span class="lnr lnr-envelope"></span>
                                </span>
                            </div>

                            <div class="wrap-input validate-input m-b-16" data-validate = "Password is required">
                                <input class="input" type="password" name="pass" id="pass"placeholder="Password">
                                <span class="focus-input"></span>
                                <span class="symbol-input">
                                    <span class="lnr lnr-lock"></span>
                                </span>
                            </div>

                            <div class="contact-form-checkbox m-l-4">
                                <input class="input-checkbox" id="ckb1" type="checkbox" name="remember-me">
                                <label class="label-checkbox" for="ckb1">
                                    Remember me
                                </label>
                            </div>
                            <% 
                                if(request.getAttribute("error") == "Cet utilisateur n'existe pas"){
                                String error = (String) request.getAttribute("error");
                               %>
                                  <h4 style="color:red">
                                  <% out.println(error); %>
                            </h4>
                              <%
                                }
                               %>

                            <div class="container-login-form-btn p-t-25">
                                <input type="submit" class="login-form-btn" value="Login">
                                    
                           
                            </div>

                            <div class="text-center w-full p-t-42 p-b-22">
                                <span class="txt1">
                                    Or login with
                                </span>
                            </div>

                            <a href="#" class="btn-face m-b-10">
                                <i class="fa fa-facebook-official"></i>
                                Facebook
                            </a>

                            <a href="#" class="btn-google m-b-10">
                                <img src="images/icons/icon-google.png" alt="GOOGLE">
                                Google
                            </a>

                            <div class="text-center w-full p-t-115">
                                <span class="txt1">
                                    Not a member?
                                </span>

                                <a class="txt1 bo1 hov1" href="#">
                                    Sign up now							
                                </a>
                            </div>
                        </form>
                    </div>
                </div>
            </div>






    </body>
</html>