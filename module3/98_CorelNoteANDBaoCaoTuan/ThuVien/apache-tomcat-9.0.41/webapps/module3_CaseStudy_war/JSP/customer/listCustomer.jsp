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
    <a class="btn btn-primary button_create" href="${pageContext.request.contextPath}/home?action=create">Create new
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
    </tr>
    <c:forEach items="${customers}" var="customer">
        <tr>
            <td>
                <a href="${pageContext.request.contextPath}/customer?action=view&ID=${customer.customerID}"> ${customer.customerId}</a>
            <td>
                ${customer.customerTypeId}
            </td>
            <td>${customer.customerIdentity}</td>
            <td>${customer.customerNumberPhone}</td>
            <td>${customer.customerEmail}</td>
            <td>${customer.customerAddress}</td>
            <td><a href="${pageContext.request.contextPath}/customer?action=edit&ID=${customer.customerID}">edit</a></td>
            <td><a href="${pageContext.request.contextPath}/customer?action=delete&ID=${customer.customerID}">Delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
