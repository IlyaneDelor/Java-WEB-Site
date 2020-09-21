<%-- 
    Document   : register
    Created on : 13 avr. 2020, 15:05:21
    Author     : user
--%>

<!DOCTYPE html>

<head>
    <title>Register Home Service</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">



    <link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">

    <link rel="stylesheet" type="text/css" href="fonts/Linearicons-Free-v1.0.0/icon-font.min.css">



    <link rel="stylesheet" type="text/css" href="css/util.css">

    <link rel="stylesheet" type="text/css" href="css/main.css">
    <link href="css/bootstrap/css/bootstrap.min.css" rel="stylesheet">	

    <script src="jquery/jquery-3.2.1.min.js"></script>
</head>
<body>
    <header>

        <nav class="navbar navbar-expand-lg navbar-dark bg-dark static-top" style="padding:0px;margin:0px;border-radius: 0px;">
            <div class="container" >

                <a href="index.jsp"><img src="images/logo.png" class="logo"></a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse" id="navbarResponsive">
                    <ul class="navbar-nav ml-auto" style="padding-left: 85%;">

                        <li class="nav-item" id="navblue">
                            <a class="nav-link"  href="index.jsp">Connexion</a>
                        </li>

                        <li class="nav-item" id="navorange">
                            <a class="nav-link" href="register.jsp">Inscription</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
    </header>

    <form action="register" method="post" >
        <div class = "limiter" >
            <div class="login">
                <div class="wrap-login p-l-50 p-r-50 p-t-77 p-b-30">
                    <div class="login-form validate-form">
                        <span class="login-form-title p-b-55">
                            REGISTER
                        </span>

                        <div class="wrap-input validate-input m-b-16" >
                            <input class="input" type="text" id="name" name="name" placeholder="Name">
                            <span class="erreur">${form.erreurs['nom']}</span>
                            <span class="focus-input"></span>
                            <span class="symbol-input">
                                <span class="lnr lnr-user"></span>
                            </span>
                        </div>
                        <div class="wrap-input validate-input m-b-16" >
                            <input class="input" type="text" id="firstName" name="firstName" placeholder="FirstName">
                            <span class="erreur">${form.erreurs['firstName']}</span>
                            <span class="focus-input"></span>
                            <span class="symbol-input">
                                <span class="lnr lnr-user"></span>
                            </span>
                        </div>
                        <div class="wrap-input validate-input m-b-16">

                            <input class="input" type="text" id="mail" name="mail" placeholder="Email">
                            <span class="erreur">${form.erreurs['email']}</span>
                            <span class="focus-input"></span>
                            <span class="symbol-input">
                                <span class="lnr lnr-envelope"></span>
                            </span>
                        </div>

                        <div class="wrap-input validate-input m-b-16" >
                            <input class="input" type="date" id=birthDate" name="birthDate">
                            <span class="focus-input"></span>
                            <span class="symbol-input">
                                <span class="lnr lnr-heart"></span>
                            </span>
                        </div>

                        <div class="wrap-input validate-input m-b-16" >
                            <input class="input" type="tel" name="tel" id="tel"placeholder="Phone ex: 0654846578">
                            <span class="erreur">${form.erreurs['tel']}</span>
                            <span class="focus-input"></span>
                            <span class="focus-input"></span>
                            <span class="symbol-input">
                                <span class="lnr lnr-phone"></span>
                            </span>
                        </div>






                        <div class="wrap-input validate-input m-b-16" data-validate = "Passsword is required">
                            <input class="input" type="text" name="password" id="password" placeholder="Password">
                            <span class="erreur">${form.erreurs['password']}</span>
                            <span class="focus-input"></span>
                            <span class="focus-input"></span>
                            <span class="symbol-input">
                                <span class="lnr lnr-home"></span>
                            </span>
                        </div>

                        <div class="wrap-input validate-input m-b-16" >
                            <input class="input" type="text" name="confirmation" placeholder="Confirmation Password" id="confirmation">
                            <span class="erreur">${form.erreurs['confirmation']}</span>
                            <span class="focus-input"></span>
                            <span class="symbol-input">
                                <span class="lnr lnr-home"></span>
                            </span>
                        </div>

                        <div class="container-login-form-btn p-t-25">
                            <input type="submit" class="login-form-btn" value="Register">

                        </div>




                        <p class="${empty form.erreurs ? 'succes' : 'erreur'}">${form.resultat}</p>

                        <div class="text-center w-full p-t-42 p-b-22">
                            <span class="txt1">
                                Or register with
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
                                Already a member?
                            </span>

                            <a class="txt1 bo1 hov1" href="#">
                                Sign in						
                            </a>
                        </div>
                    </div>
                </div>
            </div>
        </div>

    </form>


</body>
