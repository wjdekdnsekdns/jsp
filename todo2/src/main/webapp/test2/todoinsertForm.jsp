<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>카테고리 정보 저장하기</title>
</head>
<body>
<h1>Todo Insert form</h1>
	<form action="/todo/todoTest?action=insert" method="post">
		<input type="text"  name="title"  required="required">
		<input type="text"  name="description"  required="required">
		<input type="number"  name="priority"  required="required">
		<input type="number"  name="completed"  required="required">
		<input type="number"  name="category_id"  required="required">
		<input type="submit" value="카테고리저장">
	</form>
</body>
</html>