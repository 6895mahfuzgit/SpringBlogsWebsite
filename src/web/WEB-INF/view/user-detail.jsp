<%--
  Created by IntelliJ IDEA.
  User: MahfuzCSE'11
  Date: 12-Oct-16
  Time: 6:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@include file="../layout/taglibs.jsp" %>

<h1>${user.name}</h1>
<c:forEach items="${user.blogs}" var="blog">
    <h1>${blog.name}</h1>

    <p>${blog.url}</p>

    <table class="table  table-bordered  table-hover table-striped table-sm">
        <thead>
        <tr>
            <th>Title</th>
            <th>Link</th>

        </tr>
        </thead>
        <tbody>

        <c:forEach items="${blog.items}" var="item">

            <tr>
                <th>${item.title}</th>
                <th>${item.link}</th>

            </tr>

        </c:forEach>

        </tbody>


    </table>
</c:forEach>

