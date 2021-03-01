<%--
  Created by IntelliJ IDEA.
  User: HS
  Date: 12/26/2020
  Time: 8:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>VietNamese Dictionary</h1> <br>
<form action="search" method="post">
    <input type="text" name="english" placeholder="Enter English word: ">
    <button type="submit">Search</button>
    <h2>Your word:  ${search}</h2> <br>
    <h2>Result: ${result}</h2>
</form>
</body>
</html>
