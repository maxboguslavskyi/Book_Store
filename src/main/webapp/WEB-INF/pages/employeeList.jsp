<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Employees List</title>
    <!-- Bootstrap CSS -->
    <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
    <style type="text/css">
        .myrow-container {
            margin: 20px;
        }
    </style>
</head>
<body class=".container-fluid">
<div class="container myrow-container">
    <div class="panel panel-success">
        <div class="panel-heading">
            <h3 class="panel-title">
                <div align="left"><b>Employees List</b></div>
                <div align="right"><a href="createEmployee">Add New Employee</a></div>
            </h3>
        </div>
        <div class="panel-body">
            <c:if test="${empty employeeList}">
                There are no Employees
            </c:if>
            <c:if test="${not empty employeeList}">
                <table class="table table-hover table-bordered">
                    <thead style="background-color: #bce8f1;">
                    <tr>
                        <th>Id</th>
                        <th>Name</th>
                        <th>Age</th>
                        <th>Salary</th>
                        <th>Edit</th>
                        <th>Delete</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${employeeList}" var="emp">
                        <tr>
                            <td><c:out value="${emp.id}"/></td>
                            <td><c:out value="${emp.name}"/></td>
                            <td><c:out value="${emp.age}"/></td>
                            <td><c:out value="${emp.salary}"/></td>

                            <td><a href="editEmployee?id=${emp.id}">Edit</a></td>
                            <td><a href="deleteEmployee?id=${emp.id}">Delete</a></td>
                        </tr>
                        <script src="<c:url value="/resources/js/jquery-2.1.4.js"/>"></script>
                        <script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
                        <script src="<c:url value="/resources/js/employee.js"/>"></script>
                    </c:forEach>
                    </tbody>
                </table>
            </c:if>
        </div>
    </div>
</div>
<script src="<c:url value="/resources/js/jquery-2.1.4.js"/>"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
<script src="<c:url value="/resources/js/employee.js"/>"></script>
</body>
</html>