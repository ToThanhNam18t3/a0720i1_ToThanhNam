<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: HS
  Date: 1/27/2021
  Time: 8:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <style>
        body {
            background-image: url("css/background.jpg");
        }

        .search_create{
            justify-content: space-around;
            padding-bottom: 30px;
        }

        .search_btn{
            display: flex;
        }

        /*#result{*/
        /*    display: none;*/
        /*}*/
    </style>

</head>
                <%--All library + link--%>
<script src="https://code.jquery.com/jquery-3.5.1.min.js" type="text/javascript"></script>
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="js/bootstrap.min.js">
<script src="js/customer/deleteCustomer.js"></script>
<script src="js/customer/searchCustomer.js" type="text/javascript"></script>
<body>
<div id="result">
<h1 class="title" style="text-align: center; color: white">Customers</h1>

                        <%-- DIV INCLUDE SEARCH AND CREATE BUTTON --%>

        <div class="input-group search_create">
            <div class="header__create-btn">
                <a class="btn btn-primary button_create" href="${pageContext.request.contextPath}/customer?action=create">Create new
                    Customer</a>
            </div>
            <form class="form-inline my-2 my-lg-0 search_btn">
                <input class="form-control mr-sm-2" type="search" placeholder="Customer Name" aria-label="Search" id="customerName">
                <a type="submit" id="search" class="btn btn btn-success my-2 my-sm-0">Search</a>
            </form>
        </div>

                                    <%-- MODAL DELETE--%>

        <div class="modal" tabindex="-1" role="dialog">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title">Confirm delete Customer</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <p>Do you want to delete this customer ?</p>
                    </div>
                    <div class="modal-footer" id="button-modal">
                        <a type="button" class="btn btn-primary" id="deleteCustomer">Delete</a>
                        <a type="button" class="btn btn-secondary close" data-dismiss="modal">Close</a>
                    </div>
                </div>
            </div>
        </div>

    <table border="1" class="table table-striped table-hover">
        <tr class="table-light">
            <td>ID Khách Hàng</td>
            <td>Loại Khách</td>
            <td>Họ Tên</td>
            <td>Ngày sinh</td>
            <td>SoCMTND</td>
            <td>SDT</td>
            <td>Email</td>
            <td>Địa chỉ</td>
            <td>Edit</td>
            <td>Delete</td>
        </tr>


        <c:forEach items="${customers}" var="customer">
            <tr class="table-light">
                <td>
                    <a href="customer?action=view&ID=${customer.customerId}">${customer.customerId}</a>
                </td>
                <td>
                        ${customer.customerTypeName}
                </td>
                <td>${customer.customerName}</td>
                <td>${customer.customerDob}</td>
                <td>${customer.customerIdentity}</td>
                <td>${customer.customerNumberPhone}</td>
                <td>${customer.customerEmail}</td>
                <td>${customer.customerAddress}</td>
                <td><a href="${pageContext.request.contextPath}/customer?action=edit&ID=${customer.customerId}"
                       class="btn btn-success edit" data-toggle="modal">edit</a>
                </td>
                <%--<td><a href="${pageContext.request.contextPath}/customer?action=delete&ID=${customer.customerId}"
                       class="btn btn-danger delete" data-toggle="modal" onclick="return confirm('Are you sure you want to delete?')" >Delete</a>
                </td>--%>
                <td>
                    <%--<c:set var="url" value="${pageContext.request.contextPath}/customer?action=delete&ID=${customer.customerId}" />--%>
                    <a class="btn btn-danger delete" data-toggle="modal" onclick="showModalDelete('${pageContext.request.contextPath}/customer?action=delete&ID=${customer.customerId}')">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <c:if test="${customerName =! null}">
        <button id="btn_backList" class="btn btn-info" >Back List</button>
    </c:if>
</div>
</body>
</html>
