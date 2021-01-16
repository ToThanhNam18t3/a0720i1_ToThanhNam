<%--
  Created by IntelliJ IDEA.
  User: HS
  Date: 12/26/2020
  Time: 1:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Change Money</title>
</head>
<body>
<form action="convert" method="post">
    <h1>Currency Converter</h1>
    rate: <br>
    <input type="text" name="rate"> <br>
    usd: <br>
    <input type="text" name="USD"> <br>
    <button>Convert</button>
    <h1>Result : ${changed}</h1>
</form>

</body>
</html>
