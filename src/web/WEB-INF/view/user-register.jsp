<%--
  Created by IntelliJ IDEA.
  User: MahfuzCSE'11
  Date: 13-Oct-16
  Time: 12:22 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@include file="../layout/taglibs.jsp" %>


<form:form commandName="user" class="form-horizontal">
    <div class="form-group">
        <label class="col-sm-2 control-label">Name:</label>

        <div class="col-sm-10">
            <form:input path="name" class="form-control" id="inputEmail3" placeholder="Name"/>
        </div>
    </div>

    <div class="form-group">
        <label class="col-sm-2 control-label">Email:</label>

        <div class="col-sm-10">
            <form:input path="email" class="form-control" id="inputEmail3" placeholder="Email"/>
        </div>
    </div>


    <div class="form-group">
        <label class="col-sm-2 control-label">Password:</label>

        <div class="col-sm-10">
            <form:password path="password" class="form-control" id="inputEmail3" placeholder="Password"/>
        </div>
    </div>

    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <button type="submit" value="save" class="btn btn-default">Sign in</button>
        </div>
    </div>
</form:form>
