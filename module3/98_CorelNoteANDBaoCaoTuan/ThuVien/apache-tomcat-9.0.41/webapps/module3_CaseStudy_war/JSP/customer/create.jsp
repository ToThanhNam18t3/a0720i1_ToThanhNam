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
<body>
<form action="customer" method="post">
    <div class="form-group">
        <label for="idKhachHang">ID Customer</label>
        <input type="text" name="idKhachHang" class="form-control" id="idKhachHang">
        <label for="name">ID Customer Type</label>
        <input type="text" name="idLoaiKhach" class="form-control" id="name">
        <label for="customerName">Full Name</label>
        <input type="text" name="customerName" class="form-control" id="customerName">
        <label for="dob">Dob</label>
        <input type="text" name="customerDob" class="form-control" id="dob">
        <label for="cusId">customerIdentity</label>
        <input type="text" name="customerIdentity" class="form-control" id="cusId">
        <label for="cusPhone">customerNumberPhone</label>
        <input type="text" name="customerNumberPhone" class="form-control" id="cusPhone">
        <label for="cusEmail">customerEmail</label>
        <input type="text" name="customerEmail" class="form-control" id="cusEmail">
        <label for="cusAdd">customerAddress</label>
        <input type="text" name="customerAddress" class="form-control" id="cusAdd">
    </div>
<%--    <div class="form-group">--%>
<%--        <label for="exampleFormControlSelect1">Author</label>--%>
<%--        <select class="form-control" id="exampleFormControlSelect1" name="author">--%>
<%--            <c:forEach items="${authors}" var="author">--%>
<%--                <option value="${author.idAuthor}">${author.authorName}</option>--%>
<%--            </c:forEach>--%>
<%--        </select>--%>
<%--    </div>--%>
    <input type="submit" value="Create">
    <input type="reset" value="Reset">
    <input type="hidden" name="action" value="create" />
</form>
<a href="product">Back to list</a>
</body>
</html>
