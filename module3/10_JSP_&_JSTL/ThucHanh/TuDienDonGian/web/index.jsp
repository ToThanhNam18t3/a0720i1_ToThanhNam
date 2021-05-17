<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: HS
  Date: 12/29/2020
  Time: 1:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="search" method="get">
    <h1>VietNamese Dictionary</h1>
    <input type="text" placeholder="Enter your word: " name="input">
    <button>Search</button>
  </form>

  <h1>Word: ${word}</h1>
  <h2>Result: ${result}</h2>
  <h1> <c:out value="${word}"/> </h1>

<%--  <c:set var="num" value="20"/>--%>
<%--  <p>Number : <c:out value="${num}"/></p>--%>
<%--  --%>
<%--  <c:if test="${num % 2 == 0}">--%>
<%--    <p>Even</p>--%>
<%--  </c:if>--%>
<%--  <c:if test="${num % 2 != 0}">--%>
<%--    <p>Even</p>--%>
<%--  </c:if>--%>

<%--  <c:set var="list" value="PHP;JAVA;C++"/>--%>
<%--  <br>--%>
<%--  <c:forTokens var="it" items="${list}" delims=";">--%>
<%--    <p>${it}-</p>--%>
<%--  </c:forTokens>--%>

  </body>
</html>
