<%--
  Created by IntelliJ IDEA.
  User: MahfuzCSE'11
  Date: 11-Oct-16
  Time: 6:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../layout/taglibs.jsp" %>

<div class="Header">
    <h2>Latest News From Spring World!</h2>

</div>


<table class="table table-bordered table-hover table-striped">
    <thead>
    <tr>
        <th>date</th>
        <th>item</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${item}" var="item">
        <tr>
            <td>
                <c:out value="${item.publishedDate}"/>
                <br/>
                <c:out value="${item.blog.name}"/>
            </td>
            <td>
                <strong>
                    <a href="<c:out value="${item.link}" />" target="_blank">
                        <c:out value="${item.title}"/>
                    </a>
                </strong>
                <br/>
                    ${item.description}
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

