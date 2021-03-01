<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%--&lt;%&ndash;--%>
<%--  Created by IntelliJ IDEA.--%>
<%--  User: HS--%>
<%--  Date: 1/26/2021--%>
<%--  Time: 12:20 PM--%>
<%--  To change this template use File | Settings | File Templates.--%>
<%--&ndash;%&gt;--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <title>Title</title>--%>
<%--</head>--%>
<%--<script src="https://code.jquery.com/jquery-3.5.1.min.js" type="text/javascript"></script>--%>
<%--<link rel="stylesheet" href="css/bootstrap.min.css">--%>
<%--<link rel="stylesheet" href="js/bootstrap.min.js">--%>
<%--<script src="js/customer/deleteCustomer.js"></script>--%>
<%--<script src="js/customer/searchCustomer.js" type="text/javascript"></script>--%>
<%--<body>--%>
<%--<h1 class="title" style="text-align: center; color: white">Customers</h1>--%>

<%--&lt;%&ndash; DIV INCLUDE SEARCH AND CREATE BUTTON &ndash;%&gt;--%>

<%--<div class="input-group search_create">--%>
<%--    <div class="header__create-btn">--%>
<%--        <a class="btn btn-primary button_create" href="${pageContext.request.contextPath}/customer?action=create">Create new--%>
<%--            Customer</a>--%>
<%--    </div>--%>
<%--    <form class="form-inline my-2 my-lg-0 search_btn">--%>
<%--        <input class="form-control mr-sm-2" type="search" placeholder="Customer Name" aria-label="Search" id="customerName">--%>
<%--        <a type="submit" id="search" class="btn btn btn-success my-2 my-sm-0">Search</a>--%>
<%--    </form>--%>
<%--</div>--%>

<%--&lt;%&ndash; MODAL DELETE&ndash;%&gt;--%>

<%--<div class="modal" tabindex="-1" role="dialog">--%>
<%--    <div class="modal-dialog" role="document">--%>
<%--        <div class="modal-content">--%>
<%--            <div class="modal-header">--%>
<%--                <h5 class="modal-title">Confirm delete Customer</h5>--%>
<%--                <button type="button" class="close" data-dismiss="modal" aria-label="Close">--%>
<%--                    <span aria-hidden="true">&times;</span>--%>
<%--                </button>--%>
<%--            </div>--%>
<%--            <div class="modal-body">--%>
<%--                <p>Do you want to detele this customer ?</p>--%>
<%--            </div>--%>
<%--            <div class="modal-footer" id="button-modal">--%>
<%--                <a type="button" class="btn btn-primary" id="deleteCustomer">Delete</a>--%>
<%--                <a type="button" class="btn btn-secondary close" data-dismiss="modal">Close</a>--%>
<%--            </div>--%>
<%--        </div>--%>
<%--    </div>--%>
<%--</div>--%>

<%--<table border="1" class="table table-striped table-hover" id="result">--%>
<%--    <tr class="table-light">--%>
<%--        <td>ID Khách Hàng</td>--%>
<%--        <td>Loại Khách</td>--%>
<%--        <td>Họ Tên</td>--%>
<%--        <td>Ngày sinh</td>--%>
<%--        <td>SoCMTND</td>--%>
<%--        <td>SDT</td>--%>
<%--        <td>Email</td>--%>
<%--        <td>Địa chỉ</td>--%>
<%--        <td>Edit</td>--%>
<%--        <td>Delete</td>--%>
<%--    </tr>--%>


<%--    <c:forEach items="${customers}" var="customer">--%>
<%--        <tr class="table-light">--%>
<%--            <td>--%>
<%--                <a href="customer?action=view&ID=${customer.customerId}">${customer.customerId}</a>--%>
<%--            </td>--%>
<%--            <td>--%>
<%--                    ${customer.customerTypeName}--%>
<%--            </td>--%>
<%--            <td>${customer.customerName}</td>--%>
<%--            <td>${customer.customerDob}</td>--%>
<%--            <td>${customer.customerIdentity}</td>--%>
<%--            <td>${customer.customerNumberPhone}</td>--%>
<%--            <td>${customer.customerEmail}</td>--%>
<%--            <td>${customer.customerAddress}</td>--%>
<%--            <td><a href="${pageContext.request.contextPath}/customer?action=edit&ID=${customer.customerId}"--%>
<%--                   class="btn btn-success edit" data-toggle="modal">edit</a>--%>
<%--            </td>--%>
<%--                &lt;%&ndash;<td><a href="${pageContext.request.contextPath}/customer?action=delete&ID=${customer.customerId}"--%>
<%--                       class="btn btn-danger delete" data-toggle="modal" onclick="return confirm('Are you sure you want to delete?')" >Delete</a>--%>
<%--                </td>&ndash;%&gt;--%>
<%--            <td>--%>
<%--                    &lt;%&ndash;<c:set var="url" value="${pageContext.request.contextPath}/customer?action=delete&ID=${customer.customerId}" />&ndash;%&gt;--%>
<%--                <a class="btn btn-danger delete" data-toggle="modal" onclick="showModalDelete('${pageContext.request.contextPath}/customer?action=delete&ID=${customer.customerId}')">Delete</a>--%>
<%--            </td>--%>
<%--        </tr>--%>
<%--    </c:forEach>--%>
<%--</table>--%>
<%--</body>--%>
<%--</html>--%>
