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
<body>
<form action="customer" method="post">
    <table>
        <tr>
            <td>Customer ID</td>
            <td><input type="text" name="customerId" value="${customer.customerId}" readonly></td>
        </tr>
        <tr>
            <td>Customer TypeId</td>
            <td><input type="text" name="customerTypeId" value="${customer.customerTypeId}"></td>
        </tr>
        <tr>
            <td>Name</td>
            <td><input type="text" name="customerName" value="${customer.customerName}"></td>
        </tr>
        <tr>
            <td>Date Of Birth</td>
            <td><input type="text" name="customerDob" value="${customer.customerDob}"></td>
        </tr>
        <tr>
            <td>CMND</td>
            <td><input type="text" name="customerIdentity" value="${customer.customerIdentity}"></td>
        </tr>
        <tr>
            <td>Number Phone</td>
            <td><input type="text" name="customerNumberPhone" value="${customer.customerNumberPhone}"></td>
        </tr>
        <tr>
            <td>Email</td>
            <td><input type="text" name="customerEmail" value="${customer.customerEmail}"></td>
        </tr>
        <tr>
            <td>Address</td>
            <td><input type="text" name="customerAddress" value="${customer.customerAddress}"></td>
        </tr>
        <tr>
            <td><input type="submit" value="Update"></td>
            <td><input type="reset" value="Reset"></td>
        </tr>
    </table>
    <a href="customer">Back to list</a>
    <input type="hidden" name="action" value="edit">
</form>
</body>
</html>
