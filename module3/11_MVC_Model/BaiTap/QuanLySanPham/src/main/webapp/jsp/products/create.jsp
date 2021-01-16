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
<body>
<form action="product" method="post">
    <table>
        <tr>
            <td>ID</td>
            <td><input type="text" name="ID"></td>
        </tr>
        <tr>
            <td>Name</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>Price</td>
            <td><input type="text" name="price"></td>
        </tr>
        <tr>
            <td>Image</td>
            <td><input type="text" name="image"></td>
        </tr>
        <tr>
            <td><input type="submit" value="Create"></td>
            <td><input type="reset" value="Reset"></td>
        </tr>
    </table>
    <a href="product">Back to list</a>
    <input type="hidden" name="action" value="create">
</form>
</body>
</html>
