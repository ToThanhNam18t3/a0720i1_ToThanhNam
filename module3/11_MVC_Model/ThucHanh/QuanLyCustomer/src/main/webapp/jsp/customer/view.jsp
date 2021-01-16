<%--
  Created by IntelliJ IDEA.
  User: HS
  Date: 1/7/2021
  Time: 1:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Infomation of customer</title>
</head>
<body>
<%--    <h1>CUSTOMER</h1>--%>
<%--    <br>--%>
<%--    <tr>--%>
<%--        <th>ID</th>--%>
<%--        <th>Name</th>--%>
<%--        <th>Email</th>--%>
<%--        <th>Address</th>--%>
<%--    </tr>--%>
<%--    <tr>--%>
<%--        <td>${customer.id}</td>--%>
<%--        <td>${customer.name}</td>--%>
<%--        <td>${customer.email}</td>--%>
<%--        <td>${customer.address}</td>--%>
<%--    </tr>--%>
<%--    <a href="customers">Back to list !</a>--%>
<p>Information of customer</p>
<table>
    <tr>
        <td>ID</td>
        <td>${customer.id}</td>
    </tr>
    <tr>
        <td>Name</td>
        <td>${customer.name}</td>
    </tr>
    <tr>
        <td>Email</td>
        <td>${customer.email}</td>
    </tr>
    <tr>
        <td>Address</td>
        <td>${customer.address}</td>
    </tr>

    <a href="customers">Back to menu</a>
</table>
</body>
</html>
