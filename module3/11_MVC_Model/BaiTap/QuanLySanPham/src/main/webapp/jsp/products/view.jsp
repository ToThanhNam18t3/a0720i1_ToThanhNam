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
<link rel="stylesheet" href="../../css/bootstrap.min.css">
<link rel="stylesheet" href="../../css/view.css">
<body>
<p>Information of Product</p>
<table class="table table-striped">
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

<div class="center__button">
<a href="product" class="btn btn-success">Back to list</a>
</div>
</body>
</html>
