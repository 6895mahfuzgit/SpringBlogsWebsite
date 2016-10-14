<%--
  Created by IntelliJ IDEA.
  User: MahfuzCSE'11
  Date: 11-Oct-16
  Time: 6:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../layout/taglibs.jsp" %>
<div class="container-fluid">
    <div class="jumbotron">
        <h1>Latest News From Spring World!</h1>

    </div>
</div>

<table class="table  table-bordered  table-hover table-striped table-sm">
    <thead>
    <tr>
        <th>Date</th>
        <th>Items</th>

    </tr>
    </thead>
    <tbody>

    <c:forEach items="${blog.items}" var="item">

        <tr>
            <th><c:out value="${item.publishedDate}"/></th>
            <th>
                <strong>
                    <a href="<c:out value="${item.link}"/>" target="_blank">

                        <c:out value="${item.title}"/>
                    </a>

                </strong>
                <br/>
                    ${item.description}


            </th>

        </tr>

    </c:forEach>

    </tbody>


</table>

