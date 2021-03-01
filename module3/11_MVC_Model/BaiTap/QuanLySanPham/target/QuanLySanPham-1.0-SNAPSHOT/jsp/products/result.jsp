<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: HS
  Date: 1/14/2021
  Time: 2:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<table border="1">
    <tr>
        <td>ID</td>
        <td>Name</td>
        <td>Price</td>
        <td>Image</td>
        <td>Delete</td>
        <td>Edit</td>
    </tr>
    <c:forEach items="${products}" var="product">
        <tr>
            <td>${product.ID}</td>
            <td>
                <a href="${pageContext.request.contextPath}/product?action=view&ID=${product.ID}">${product.nameProduct}</a>
            </td>
            <td>${product.price}</td>
            <td>${product.image}</td>
            <td><a href="${pageContext.request.contextPath}/product?action=edit&ID=${product.ID}">edit</a></td>
            <td><a href="${pageContext.request.contextPath}/product?action=delete&ID=${product.ID}">delete</a></td>
        </tr>
    </c:forEach>
</table>
