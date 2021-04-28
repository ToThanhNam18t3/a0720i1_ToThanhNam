<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <title>Title</title>
</head>
<link rel="stylesheet" href="css/bootstrap.min.css">
<style>
    body{
        display: flex;
        justify-content: center;
        align-items: center;
        background-image: url("css/backCus.jpg");
        background-repeat: no-repeat;
        background-size: cover;
    }

    .contain{
        padding: 50px;
        border: 2px solid #000000;
        width: 90%;
        height: auto;
    }
</style>

<body>
<div class="contain">
<form action="customer" method="post">
    <div class="form-group row">
        <label for="idKhachHang" class="col-2 col-form-label">ID Customer</label>
        <div class="col-10">
            <input type="text" name="customerId" class="form-control" id="idKhachHang" value="${customer.customerId}">
        </div>

        <label for="typeName" class="col-2 col-form-label">Customer Type</label>
        <div class="col-10">
            <select class="form-control" id="typeName" name="customerType">
                    <c:forEach items="${customersType}" var="customerType">
                        <option value="${customerType.customerTypeId}">${customerType.customerTypeName}</option>
                    </c:forEach>
            </select>
        </div>

        <label for="customerName" class="col-2 col-form-label">Full Name</label>
        <div class="col-10">
            <input type="text" name="customerName" class="form-control" id="customerName" value="${customer.customerName}">
        </div>


        <label for="dob" class="col-2 col-form-label">Dob</label>
        <div class="col-10">
            <input type="date" name="customerDob" class="form-control" id="dob" value="${customer.customerDob}">
        </div>

        <label for="cusId" class="col-2 col-form-label">customerIdentity</label>
        <div class="col-10">
            <input type="text" name="customerIdentity" class="form-control" id="cusId" value="${customer.customerIdentity}">
        </div>

        <label for="cusPhone" class="col-2 col-form-label">customerNumberPhone</label>
        <div class="col-10">
            <input type="text" name="customerNumberPhone" class="form-control" id="cusPhone" value="${customer.customerNumberPhone}">
            <small id="emailHelp" class=""alert alert-primary">${message}</small> <%-- VALIADATE --%>
        </div>

        <label for="cusEmail" class="col-2 col-form-label">customerEmail</label>
        <div class="col-10">
            <input type="text" name="customerEmail" class="form-control" id="cusEmail" value="${customer.customerEmail}">
            <small id="emailHelp" class=""alert alert-primary">${message}</small> <%-- VALIADATE --%>
        </div>
        <label for="cusAdd" class="col-2 col-form-label">customerAddress</label>
        <div class="col-10">
            <input type="text" name="customerAddress" class="form-control" id="cusAdd" value="${customer.customerAddress}">
            <small id="emailHelp" class=""alert alert-primary">${message}</small> <%-- VALIADATE --%>
        </div>

    </div>

    <input type="submit" value="Create" class="btn btn-outline-success">
    <input type="reset" value="Reset" class="btn btn-outline-primary">
    <input type="hidden" name="action" value="create">
</form>
<a href="customer" class="btn btn-outline-warning">Back to list</a>
</div>
</body>
</html>
