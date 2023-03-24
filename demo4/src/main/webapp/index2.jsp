<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="login2.jsp">
	<label>id : </label><input type="text" name = "id"  id = "id">
	<label>pw : </label><input type="password" name = "pw"  id = "pw">
	<input type="submit" value="로그인">
	</form>
	<%
	if(session.getAttribute("id") != null){
		%>
		<p>사용자 Id<%=session.getAttribute("id") %></p>
	<%}%>
</body>
</html>