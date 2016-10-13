<%--
  Created by IntelliJ IDEA.
  User: MahfuzCSE'11
  Date: 12-Oct-16
  Time: 3:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../layout/taglibs.jsp" %>


<script type="text/javascript">
    $(document).ready(function () {


        $('.triggerRemove').click(function (e) {

            e.preventDefault();

            $("#modalRemove .removeBtn").attr("href", $(this).attr("href"));

            $("#modalRemove").modal();
        });


    });
</script>

<table class="table  table-bordered  table-hover table-striped table-sm">
    <thead>
    <tr>
        <th>Users</th>
        <th>Operations</th>

    </tr>
    </thead>
    <tbody>

    <c:forEach items="${users}" var="user">
        <tr>
            <td>

                <a href="<spring:url value="/users/${user.id}" />">
                 <c:out value="${user.name}" />

                </a>
            </td>
            <td>

                <a href="<spring:url value="/users/remove/${user.id}" />" class="btn btn-danger triggerRemove">

                    Remove
                </a>
            </td>


        </tr>
    </c:forEach>
    </tbody>
</table>


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
