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
<h2>Categoty List2</h2>
<table>
	<tr>
		<th>ID</th>
		<th>Name</th>
	</tr>
	<c:forEach var="category" items="${list}">
		<tr>
			<td>${category.id}</td>
			<td>${category.name}</td>
		</tr>
	</c:forEach>
	
</table>
</body>
</html>