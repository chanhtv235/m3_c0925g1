<%--
  Created by IntelliJ IDEA.
  User: Home
  Date: 1/8/2026
  Time: 10:07 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <head>
        <title>Title</title>
        <c:import url="../library.jsp"/>

    </head>
<body>
<c:import url="../navbar.jsp"/>
<h1>Thêm mới</h1>
<form action="/students?action=add" method="post">
    <input class="form-control form-control-sm" name="id">
    <input class="form-control form-control-sm" name="name">
    <button class="btn btn-waring btn-sm">Save</button>
</form>
</body>
</html>
