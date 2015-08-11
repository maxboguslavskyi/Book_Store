<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Books List</title>
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
                <div align="left"><b>Books List</b></div>
                <div align="right"><a href="createBook">Add New Book</a></div>
            </h3>
        </div>
        <div class="panel-body">
            <c:if test="${empty bookList}">
                There are no Books
            </c:if>
            <c:if test="${not empty bookList}">
                <table class="table table-hover table-bordered">
                    <thead style="background-color: #bce8f1;">
                    <tr>
                        <th>Id</th>
                        <th>Name</th>
                        <th>Code</th>
                        <th>Price</th>
                        <th>Author(s)</th>
                        <th>ISBN</th>
                        <th>Publisher</th>
                        <th>Published Date</th>
                        <th>Edit</th>
                        <th>Delete</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${bookList}" var="book">
                        <tr>
                            <td><c:out value="${book.id}"/></td>
                            <td><c:out value="${book.name}"/></td>
                            <td><c:out value="${book.code}"/></td>
                            <td><c:out value="${book.price}"/></td>
                            <td><c:out value="${book.authors}"/></td>
                            <td><c:out value="${book.isbn}"/></td>
                            <td><c:out value="${book.publisher}"/></td>
                            <td><c:out value="${book.publishedOn}"/></td>

                            <td><a href="editBook?id=${book.id}">Edit</a></td>
                            <td><a href="deleteBook?id=${book.id}">Delete</a></td>
                        </tr>
                        <script src="<c:url value="/resources/js/jquery-2.1.4.js"/>"></script>
                        <script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
                        <script src="<c:url value="/resources/js/book.js"/>"></script>
                    </c:forEach>
                    </tbody>
                </table>
            </c:if>
        </div>
    </div>
</div>
<script src="<c:url value="/resources/js/jquery-2.1.4.js"/>"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
<script src="<c:url value="/resources/js/book.js"/>"></script>
</body>
</html>