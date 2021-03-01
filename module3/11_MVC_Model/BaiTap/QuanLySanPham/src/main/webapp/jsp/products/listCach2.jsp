<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: HS
  Date: 1/22/2021
  Time: 8:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<link rel="stylesheet" href="../../css/list.css">
<link rel="stylesheet" href="../../css/bootstrap.min.css">
<body>
<h1 class="title" style="text-align: center">Products</h1>
<div class="header__create-btn">
    <a class="btn btn-primary button_create" href="${pageContext.request.contextPath}/product?action=create">Create new Product</a>
</div>
<table border="1" class="table table-striped table-hover">
    <tr>
        <td>ID</td>
        <td class="name">Name</td>
        <td>Price</td>
        <td>Image</td>
        <td>Author</td>
        <td>Delete</td>
        <td>Edit</td>
    </tr>
    <c:forEach items="${thuVienDTOList}" var="thuvien">
        <tr>
            <td>${thuvien.ID}</td>
            <td><a href="${pageContext.request.contextPath}/product?action=view&ID=${thuvien.ID}">${thuvien.nameProduct}</a></td>
            <td>${thuvien.price}</td>
            <td>${thuvien.image}</td>
            <td>
                ${thuvien.authorName}
            </td>
            <td><a href="${pageContext.request.contextPath}/product?action=edit&ID=${thuvien.ID}">edit</a></td>
                <%--            <td><a href="${pageContext.request.contextPath}/product?action=delete&ID=${product.ID}">delete</a></td>--%>
            <td><a href="${pageContext.request.contextPath}/product?action=delete&ID=${thuvien.ID}">delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
