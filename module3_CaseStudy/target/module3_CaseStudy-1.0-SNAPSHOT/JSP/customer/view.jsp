<%--
  Created by IntelliJ IDEA.
  User: HS
  Date: 1/26/2021
  Time: 12:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View</title>
</head>
<body>
<p>Information of Customer</p>
<table class="table table-striped">
    <tr>
        <td>ID Khách Hàng</td>
        <td>${customer.customerId}</td>
    </tr>
    <tr>
        <td>ID Loại Khách</td>
        <td>${customer.customerTypeId}</td>
    </tr>
    <tr>
        <td>Họ Tên</td>
        <td>${customer.customerName}</td>
    </tr>
    <tr>
        <td>Ngày Sinh</td>
        <td>${customer.customerDob}</td>
    </tr>
    <tr>
        <td>CMND</td>
        <td>${customer.customerIdentity}</td>
    </tr>
    <tr>
        <td>Số điện thoại</td>
        <td>${customer.customerNumberPhone}</td>
    </tr>
    <tr>
        <td>Email</td>
        <td>${customer.customerEmail}</td>
    </tr>
    <tr>
        <td>Địa chỉ </td>
        <td>${customer.customerAddress}</td>
    </tr>
</table>

<div class="center__button">
    <a href="customer" class="btn btn-success">Back to list</a>
</div>
</body>
</html>
