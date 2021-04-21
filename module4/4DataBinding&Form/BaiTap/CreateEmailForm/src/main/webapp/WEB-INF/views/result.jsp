<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--
  Created by IntelliJ IDEA.
  User: HS
  Date: 3/2/2021
  Time: 6:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h3>List Email</h3>
    <table>
        <tr>
            <td>Language</td>
            <td>${email.language}</td>
        </tr>
        <tr>
            <td>Page Size</td>
            <td>${email.pageSize}</td>
        </tr><tr>
        <td>Spam Filter</td>
        <td>${email.spamFilter}</td>
    </tr>
        <tr>
        <td>Signature</td>
        <td>${email.signature}</td>
    </tr>
        <button><a href="/home" style="text-decoration: none">Comeback</a></button>
    </table>

</body>
</html>
