<%-- 
    Document   : planing
    Created on : 3 mai 2020, 17:21:24
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Planing</title>

        <link rel="stylesheet" type="text/css" href="css/util.css">
        <link rel="stylesheet" type="text/css" href="css/planing.css">
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
<body onload="renderDate()">
    <div class="wrapper">
        <div class="calendar">
            <div class="month">
                <div class="prev" onclick="moveDate('prev')">
                    <span>prec</span>
                </div>
                <div>
                    <h2 id="month"></h2>
                    <p id="date_str"></p>
                </div>
                <div class="next" onclick="moveDate('next')">
                    <span>suiv</span>
                </div>
            </div>
            <div class="weekdays">
                <div>Dim</div>
                <div>Lun</div>
                <div>Mar</div>
                <div>Mer</div>
                <div>Jeu</div>
                <div>Ven</div>
                <div>Sam</div>
            </div>
            <div class="days">

            </div>
        </div>
    </div>
   
    <script>
        
        var dt = new Date();
        function renderDate() {
            dt.setDate(1);
            var day = dt.getDay();
            var today = new Date();
            
        
            var endDate = new Date(
                dt.getFullYear(),
                dt.getMonth() + 1,
                0
            ).getDate();

            var prevDate = new Date(
                dt.getFullYear(),
                dt.getMonth(),
                0
            ).getDate();
            var months = [
                "Janvier",
                "Fevrier",
                "Mars",
                "Avril",
                "Mai",
                "Juin",
                "Juillet",
                "Août",
                "Septembre",
                "Octobre",
                "Novembre",
                "Decembre"
            ];
            document.getElementById("month").innerHTML = months[dt.getMonth()];
            document.getElementById("date_str").innerHTML = dt.toDateString();
            var cells = "";
            for (x = day; x > 0; x--) {
                cells += "<div class='prev_date'>" + (prevDate - x + 1) + "</div>";
            }
            
            for (i = 1; i <= endDate; i++) {
                if (i === today.getDate() && dt.getMonth() === today.getMonth()) cells += "<div class='today'>" + i + "</div>";
                else
                    cells += "<div>" + i + "</div>";
            }
            document.getElementsByClassName("days")[0].innerHTML = cells;
            
            
            
          

        }

        function moveDate(para) {
            if(para == "prev") {
                dt.setMonth(dt.getMonth() - 1);
            } else if(para == 'next') {
                dt.setMonth(dt.getMonth() + 1);
            }
            renderDate();
        }
    </script>
</body>

</html>