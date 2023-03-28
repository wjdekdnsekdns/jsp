<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Todo List</h2>
	<c:forEach var="todo" items="${list}">
	<tr>
	<td>${ todo.id }</td>
	<td>${ todo.title }</td>
	<td>${ todo.description }</td>
	<td>${ todo.priority }</td>
	<td>${ todo.completed }</td>
	<td>${ todo.createdAt }</td>
		</tr>
	</c:forEach>
</body>
</html>