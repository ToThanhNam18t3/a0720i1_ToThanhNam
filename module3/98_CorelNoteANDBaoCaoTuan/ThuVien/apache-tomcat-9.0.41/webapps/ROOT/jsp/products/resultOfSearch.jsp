<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: HS
  Date: 1/20/2021
  Time: 1:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1">
    <tr>
        <td>ID</td>
        <td>Name</td>
        <td>Price</td>
        <td>Image</td>
        <td>Author Name</td>
    </tr>
    <c:forEach items="${products}" var="product">
        <tr>
            <td>${product.ID}</td>
            <td>
                <a href="${pageContext.request.contextPath}/product?action=view&ID=${product.ID}">${product.nameProduct}</a>
            </td>
            <td>${product.price}</td>
            <td>${product.image}</td>
            <td>
                <c:forEach items="${authors}" var="author">
                    <c:if test="${product.idAuthor == author.idAuthor}">
                        ${author.authorName}
                    </c:if>
                </c:forEach>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
