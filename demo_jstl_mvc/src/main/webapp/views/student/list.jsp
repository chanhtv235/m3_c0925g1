<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <c:import url="../library.jsp"/>

</head>
<body>
<c:import url="../navbar.jsp"/>
<h1>Danh sách sinh viên</h1>
<a class="btn btn-sm btn-success" href="/students?action=add"> Thêm mới</a>
<table class="table table-striped table-dark">
    <tr>
        <th>STT</th>
        <th>ID</th>
        <th>Name</th>
        <th>Gender</th>
        <th>Score</th>
    </tr>
    <c:forEach items="${studentList}" var="student" varStatus="status">
        <tr>
            <td>${status.count}</td>
            <td>${student.id}</td>
            <td>${student.name}</td>
            <td>${student.gender}</td>
            <td>${student.score}</td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
