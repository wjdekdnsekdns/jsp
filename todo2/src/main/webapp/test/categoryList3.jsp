<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Loop Example</title>


</head>
<body>

		<c:set var="count" value="0"/>
	반복문 사용해서
	<c:forEach var="i" begin="1" end="10" step="1">
	<P>Number ${count +i}</P>
	</c:forEach>
</body>
</html>