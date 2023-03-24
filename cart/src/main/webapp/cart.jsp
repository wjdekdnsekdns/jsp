<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<form action="cartProc.jsp" method="post">
	<div>
			<input type="checkbox" name="apple" value="fruit"> 사과
		</div>
		<div>
			<input type="checkbox" name="banana" value="fruit"> 바나나
		</div>
		<div>
			<input type="checkbox" name="peach" value="fruit"> 복숭아
		</div>
		<div>
		<input type="submit" value="선택완료">
		</div>
		<div>
		<input type="submit" value="삭제" name = "delete">
		</div>
	</form>

</body>
</html>