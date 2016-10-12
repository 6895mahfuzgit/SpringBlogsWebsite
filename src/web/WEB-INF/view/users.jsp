<%--
  Created by IntelliJ IDEA.
  User: MahfuzCSE'11
  Date: 12-Oct-16
  Time: 3:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<table class="table  table-bordered  table-hover table-striped table-sm">
    <thead>
    <tr>
        <th>Users</th>

    </tr>
    </thead>
    <tbody>

    <c:forEach items="${users}" var="user">
        <tr>
            <td>

                <a href="<spring:url value="/users/${user.id}"/>">
                        ${user.name}
                </a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
