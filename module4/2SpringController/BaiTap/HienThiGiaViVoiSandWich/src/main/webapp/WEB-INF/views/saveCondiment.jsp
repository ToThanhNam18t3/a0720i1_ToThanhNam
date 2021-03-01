<%--
  Created by IntelliJ IDEA.
  User: HS
  Date: 2/25/2021
  Time: 5:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Condiment for SandWich</title>
</head>
<body>
    <h1>SandWich Condiments</h1>
    <form action="/saveCondiment" method="post">
        <input type="checkbox" id="Lettuce" name="condiment" value="Lettuce">
        <label for="Lettuce"> Lettuce</label><br>
        <input type="checkbox" id="Tomato" name="condiment" value="Tomato">
        <label for="Tomato"> Tomato </label><br>
        <input type="checkbox" id="Mustard" name="condiment" value="Mustard">
        <label for="Mustard"> Mustard </label><br><br>
        <input type="submit" value="Save">
    </form>
    <h3 style="color:red">SANDWICH : ${message}</h3>
</body>
</html>
