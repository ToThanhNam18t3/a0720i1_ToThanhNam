<%--
  Created by IntelliJ IDEA.
  User: HS
  Date: 1/14/2021
  Time: 2:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>Information of customer</p>
<table>
    <tr>
        <td>ID</td>
        <td>${product.ID}</td>
    </tr>
    <tr>
        <td>Name</td>
        <td>${product.nameProduct}</td>
    </tr>
    <tr>
        <td>Price</td>
        <td>${product.price}</td>
    </tr>
    <tr>
        <td>Image</td>
        <td>${product.image}</td>
    </tr>
</table>
<a href="product">Back to list !^^</a>
</body>
</html>
