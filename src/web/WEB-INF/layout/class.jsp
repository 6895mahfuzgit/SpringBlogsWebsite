<%--
  Created by IntelliJ IDEA.
  User: MahfuzCSE'11
  Date: 11-Oct-16
  Time: 7:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<html>
<head>
    <%--Adding title --%>
    <title><tiles:getAsString name="title"/></title>


    <!-- Bootstrap core CSS -->
    <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet"/>
    <link href="<c:url value="/resources/css/carousel.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/css/signin.css"/>" rel="stylesheet">


    <%-- Jquery --%>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script>window.jQuery || document.write('<script src="<c:url value="/resources/js/jquery-1.12.4.min.js" />"><\/script>')</script>
    <script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>

</head>
<body>


<%@ taglib uri="http://tiles.apache.org/tags-tiles-extras" prefix="tilesextra" %>
<tilesextra:useAttribute name="current"/>


<div class="container">

    <!-- Static navbar -->
    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar"
                        aria-expanded="false" aria-controls="navbar">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="<spring:url value="/"/>">Spring Blog</a>
            </div>
            <div id="navbar" class="navbar-collapse collapse">
                <ul class="nav navbar-nav">
                    <li class="${current=='home'?'active':''}"><a href="<spring:url value="/"/>">Home</a></li>
                    <li class="${current=='users'?'active':''}"><a href="<spring:url value="/users"/>">Users</a></li>
                    <li class="${current=='register'?'active':''}"><a
                            href="<spring:url value="/register"/>">Register</a>
                    </li>

                    <li class="${current=='login'?'active':''}"><a href="<spring:url value="/login"/>">Login</a></li>
                    <li><a href="<spring:url value="/logout"/>">Logout</a></li>
                    <li><a href="#">About</a></li>
                    <li><a href="#">Contact</a></li>
                </ul>
            </div>
            <!--/.nav-collapse -->
        </div>
        <!--/.container-fluid -->
    </nav>
    <tiles:insertAttribute name="body"/>
    <br><br>
    <center>
        <tiles:insertAttribute name="footer"/>
    </center>
</div>
</body>
</html>
