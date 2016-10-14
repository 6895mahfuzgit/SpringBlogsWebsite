<%--
  Created by IntelliJ IDEA.
  User: MahfuzCSE'11
  Date: 12-Oct-16
  Time: 6:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@include file="../layout/taglibs.jsp" %>


<c:if test="${blogadded eq true}">
    <div class="alert alert-success">
        Added Blog Successfully!!!
    </div>

</c:if>


<h1><c:out value="${user.name}"/></h1>


<!-- Button trigger modal -->
<button type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">
    New Blog
</button>
<form:form commandName="blog" class="form-horizontal">
    <!-- Modal -->
    <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                            aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title" id="myModalLabel">Modal title</h4>
                </div>
                <div class="modal-body">


                    <div class="form-group">
                        <label class="col-sm-2 control-label">Name:</label>

                        <div class="col-sm-10">
                            <form:input path="name" class="form-control" id="inputEmail3" placeholder="Name"/>
                            <form:errors path="name" cssStyle="color: #c7254e"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-2 control-label">Url:</label>

                        <div class="col-sm-10">
                            <form:input path="url" class="form-control" id="inputEmail3" placeholder="Name"/>
                            <form:errors path="url" cssStyle="color: #c7254e"/>
                        </div>
                    </div>


                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                    <input type="submit" class="btn btn-default" value="Save"/>
                </div>
            </div>
        </div>
    </div>

</form:form>


<br/>
<br/>


<div>


    <script type="text/javascript">
        $(document).ready(function () {

            $('.nav-tabs a:first').tab('show'); // Select first tab
            $('.triggerRemove').click(function (e) {

                e.preventDefault();

                $("#modalRemove .removeBtn").attr("href", $(this).attr("href"));

                $("#modalRemove").modal();
            });


        });
    </script>
    <!-- Nav tabs -->
    <ul class="nav nav-tabs">


        <c:forEach items="${user.blogs}" var="blog">
            <li><a href="#blog_${blog.id}"
                   data-toggle="tab">${blog.name}</a></li>

        </c:forEach>

    </ul>

    <!-- Tab panes -->
    <div class="tab-content">

        <c:forEach items="${user.blogs}" var="blog">

            <div class="tab-pane" id="blog_${blog.id}">


                <h1><c:out value="${blog.name}"/></h1>

                <p>
                    <a href="<spring:url value="/blog/remove/${blog.id}"  />" class="btn btn-danger triggerRemove">Remove
                        Blog</a>
                    <c:out value="${blog.url}"/></p>

                <table class="table  table-bordered  table-hover table-striped table-sm">
                    <thead>
                    <tr>
                        <th>Date</th>
                        <th>Link</th>

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


            </div>

        </c:forEach>

    </div>

    <div class="modal fade" id="modalRemove" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                            aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title" id="myModalLabel">Remove Blog</h4>
                </div>
                <div class="modal-body">
                    Really Remove
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">Cancle</button>
                    <a href="" class="btn btn-danger removeBtn">Remove</a>
                </div>
            </div>
        </div>
    </div>


</div>
