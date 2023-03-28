<%@page import="com.tenco.todo.dto.CategoryDTO"%>
<%@page import="java.util.*"%>
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
	<h2>Categoty List</h2>
	<table>
		<tr>
			<th>ID</th>
			<th>Name</th>
		</tr>
		<c:forEach var="cartegory" items="${list}">
			<tr>
				<td>${ cartegory.id } </td>
				<td>${ cartegory.name }<button><a href="/todo/cTest?action=delete&cid=${ cartegory.id }">delete</a></button></td>
				<td></td>
			</tr>
			
		</c:forEach>
	</table>
</body>
</html>