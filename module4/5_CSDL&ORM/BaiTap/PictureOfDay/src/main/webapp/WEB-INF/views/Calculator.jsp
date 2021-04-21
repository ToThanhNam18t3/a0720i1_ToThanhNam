<%--
  Created by IntelliJ IDEA.
  User: HS
  Date: 2/26/2021
  Time: 2:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>My Calculator</title>
</head>
<body>
<h1>Calculator</h1> <br>
<form action="/Calculator">

    <input type="number" name="value1" value="" required> <br>
    <input type="number" name="value2" value="" required> <br> <br>
    <input type="submit" name="math" value="Addition ( + )" id="Add">
    <input type="submit" name="math" value="Subtraction ( - )" id="Sub">
    <input type="submit" name="math" value="Multiple ( * )" id="Multy">
    <input type="submit" name="math" value="Division ( / )" id="Div">
</form>
<h2>
    Result : ${result}
</h2>
</body>
</html>
