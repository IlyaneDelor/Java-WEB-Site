<%-- 
    Document   : confirmationService
    Created on : 14 avr. 2020, 08:53:46
    Author     : user
--%>


<%@page import="java.sql.*"%>
 <%@page import="javax.servlet.http.HttpSession"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Confirmation Service</title>

        <link rel="stylesheet" type="text/css" href="css/util.css">
        <link rel="stylesheet" type="text/css" href="css/index.css">
        <link rel="stylesheet" type="text/css" href="css/main.css">
        <link href="css/bootstrap/css/bootstrap.min.css" rel="stylesheet">	

        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>

        <link href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">



    </head>



    
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
                                <a class="nav-link"  href="confirmationService.jsp">Mission</a>
                            </li>
                            <li class="nav-item" id="navblue">
                                <a class="nav-link"  href="planing.jsp">Planing</a>
                            </li>

                            <li class="nav-item" id="navorange">
                                <a class="nav-link" href="historique.jsp">Historique</a>
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
    <body>

        
                        <%
                            Connection dbcon;
                            // Déclaration du driver
                            Class.forName("com.mysql.jdbc.Driver");
                            // Url de connexion
                            String dbUrl = "jdbc:mysql://localhost:3306/pomocServiceDb";
                            // Profil / Mot de passe
                            String user = "root";
                            String password = "";
                            // Connexion à la base
                            dbcon = DriverManager.getConnection(dbUrl, user, password);
                            PreparedStatement reqconnexion = dbcon.prepareStatement("SELECT * FROM intervention WHERE WORKER_idWORKER IS NULL");
                            ResultSet resultreq = reqconnexion.executeQuery();

                        %> 
                       
                            <%                          do { %>
                            <%
                                 
                              
                                 
                         
         
                                 
                                if (resultreq.next()) {
                       
                            %>

                         
                        
			  <div class="cadre">

                             <div class="service">
				<img src="images/icons/wash.png" class="icon-abo" >
				<h1 class="titre-icon1" ><% out.println(resultreq.getString("title")); %></h1>
                                
				<p class="text-serv">au <% out.println(resultreq.getString("addressIntervention")); %></p>
                                <p class="text-serv"> Code Postal :  <% out.println(resultreq.getString("postalCode")); %></p>
                                <p class="text-serv">Ville : <% out.println(resultreq.getString("city")); %></p>
                                <h3 class="text-serv" >commence à <% out.println(resultreq.getString("hourIntervention")); %></h3>
                                <h3 class="text-serv">Durée: <% out.println(resultreq.getString("duration"));%>h</h3>
                                <h4 class="text-serv">le: <% out.println(resultreq.getString("dateIntervention"));%></h4>
                                <p class="text-serv"> <% out.println(resultreq.getString("detail")); %></p>
                                <%
                                    int test =  Integer.parseInt(resultreq.getString("idIntervention"));
                                    
                                    
                                    
                                %>
                           
                             <form method="post" action="serviceAccepted" >
                                 <input type="hidden" name="idIntervention" value="<%  out.println(Integer.parseInt(resultreq.getString("idIntervention"))); %>" </input>
                                <button  type="submit" class="service-button" style="text-decoration: none;"  >Accepter</button>
                             </form>
                               
                               
                               

                                
                             </div>
                          </div>

                            <%
                                    }
                                } while (resultreq.next());
                            %>
                    
    </body>
   
                    
           
        
    

