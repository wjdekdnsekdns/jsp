<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	// 세션을 꺼내는 방법 확인 
	String username = (String)session.getAttribute("username");
	if(username == null) {
		response.sendRedirect("login.jsp");
	}

%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	body{
		background-color: #f2f2f2;
		font-family: Arial, sans-serif;
	}
	
	h1{
		color: #333333;
		text-align: center;
		margin-top: 50px;
	}
	
	form{
		text-align: center;
		margin-top: 30px;
	}
	
	input[type=submit]{
	background-color: #4CAF50;
	color: white;
	padding: 12px 24px;
	border: none;
	border-radius: 5px;
	cursor: pointer;
	transition: background-color 0.3s ease;
	}
	input[type=submit]:hover{
	background-color: #3e8e41;
}
</style>
</head>
<body>
	<h1>Welcome, <%= username %>!</h1>
	<form action="logout.jsp">
		<input type="submit" value="logout">
	</form>
	
	
</body>
</html>
