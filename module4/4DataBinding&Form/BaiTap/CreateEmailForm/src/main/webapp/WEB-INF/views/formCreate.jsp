<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: HS
  Date: 3/2/2021
  Time: 5:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Email Home</title>
</head>
<body>
    <h1>Settings</h1>
    <form:form action="/result" method="post" modelAttribute="email">
        <table>
            <tr>
                <td><b>Languages</b></td>
                <td>
                    <form:select path="language" >
                        <form:options items="${languages}"/>
                    </form:select>
                </td>
            </tr>

            <tr>
                <td><b>Page Sizes:</b></td>
                <td>Show
                    <form:select path="pageSize">
                        <form:options items="${sizePage}"/>
                    </form:select>
                </td>
            </tr>

            <tr>
                <td><b>Spam Filter:</b></td>
                <td>
                    <form:checkbox path="spamFilter"/> Enable Spams filters
                </td>
            </tr>

            <tr>
                <td><b>Signature</b></td>
                <td>
                    <form:input type="text" path="signature"/>
                </td>
            </tr>

            <tr>
                <td></td>
                <td>
                    <button>Update</button>
                    <button>Cancle</button>
                </td>
            </tr>
        </table>
    </form:form>

</body>
</html>
