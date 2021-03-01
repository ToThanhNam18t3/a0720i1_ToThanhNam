<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: HS
  Date: 1/25/2021
  Time: 5:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome to Furama</title>
</head>
<body>
<h1 class="title" style="text-align: center">Customers</h1>
<div class="header__create-btn">
    <a class="btn btn-primary button_create" href="${pageContext.request.contextPath}/customer?action=create">Create new
        Customer</a>
</div>
<table border="1" class="table table-striped table-hover">
    <tr>
        <td>ID Khách Hàng</td>
        <td>ID Loại Khách</td>
        <td>Họ Tên</td>
        <td>Ngày sinh</td>
        <td>SoCMTND</td>
        <td>SDT</td>
        <td>Email</td>
        <td>Dia Chi</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>
    <c:forEach items="${customers}" var="customer">
        <tr>
            <td>
                <a href="customer?action=view&ID=${customer.customerId}">${customer.customerId}</a>
            </td>
            <td>
                ${customer.customerTypeId}
            </td>
            <td>${customer.customerName}</td>
            <td>${customer.customerDob}</td>
            <td>${customer.customerIdentity}</td>
            <td>${customer.customerNumberPhone}</td>
            <td>${customer.customerNumberPhone}</td>
            <td>${customer.customerAddress}</td>
            <td><a href="${pageContext.request.contextPath}/customer?action=edit&ID=${customer.customerId}">edit</a></td>
            <div>
            <td><a href="${pageContext.request.contextPath}/customer?action=delete&ID=${customer.customerId}">Delete</a></td>
                <div class="modal" tabindex="-1" role="dialog">
                    <div class="modal-dialog" role="document">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h5 class="modal-title">Modal title</h5>
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                    <span aria-hidden="true">&times;</span>
                                </button>
                            </div>
                            <div class="modal-body">
                                <p>Modal body text goes here.</p>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                <button type="button" class="btn btn-primary">Save changes</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </tr>
    </c:forEach>
</table>
</body>
</html>
