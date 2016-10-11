<%--
  Created by IntelliJ IDEA.
  User: MahfuzCSE'11
  Date: 11-Oct-16
  Time: 7:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<html>
<head>
    <%--Adding title --%>
    <title><tiles:getAsString name="title"/></title>
</head>
<body>
<tiles:insertAttribute name="body"/>

<br><br>
<center>
    <tiles:insertAttribute name="footer"/>
</center>
</body>
</html>
