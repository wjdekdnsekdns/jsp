<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
// 넘겨 받은 값 username 과 password를 확인해서
// admin1 과 1234 값이 같다면 로그인 처리하는 코드를 작성하시오
// 아이디와 비번이 틀리다면 login.jsp 페이지로 이동하는 코드도 작성하시오

String username = request.getParameter("username");
String password = request.getParameter("password");
if (username != null && password != null) {
	if (username.equals("admin1") && password.equals("1234")) {
		session.setAttribute("username", username);
		response.sendRedirect("index.jsp");
	} else {
		out.println("<script>alert('로그인에 실패했습니다'); location.href='login.jsp'</script>");
	}
}
%>