<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>로그인 폼 양식을 만들어서 제출하는 코드를 작성하시오</h1>
	
	<form action="loginProc.jsp" method = "post">
		<label for = "username">UserName</label>
		<input type="text" name = "username" id = "username" required="required">
		<label for = "password">Password</label>
		<input type="password" name = "password" id = "password" required="required">
		<input type="submit" value="Login">
	</form>
</body>
</html>