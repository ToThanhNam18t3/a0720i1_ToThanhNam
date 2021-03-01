<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: HS
  Date: 1/14/2021
  Time: 1:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<link rel="stylesheet" href="../../css/bootstrap.min.css">
<body>
<form action="product" method="post">
    <div class="form-group">
        <label for="ID">ID</label>
        <input type="text" name="ID" class="form-control" id="ID">
        <label for="name">Name</label>
        <input type="text" name="name" class="form-control" id="name">
        <label for="price">Price</label>
        <input type="text" name="price" class="form-control" id="price">
        <label for="image">Image</label>
        <input type="text" name="image" class="form-control" id="image">
    </div>
    <div class="form-group">
        <label for="exampleFormControlSelect1">Author</label>
            <select class="form-control" id="exampleFormControlSelect1" name="author">
                <c:forEach items="${authors}" var="author">
                    <option value="${author.idAuthor}">${author.authorName}</option>
                </c:forEach>
            </select>
    </div>
    <input type="submit" value="Create">
    <input type="reset" value="Reset">
    <input type="hidden" name="action" value="create" />
</form>
<a href="product">Back to list</a>
</body>
</html>
