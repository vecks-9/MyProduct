<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.User" %>
<% User loginUser = (User) session.getAttribute("loginUser"); %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Yonda</title>
	</head>

	<body>
		<h3>ようこそ　<%=loginUser.getUserId() %>さん</h3>

		<h1>読書記録</h1>
		<a href="/book/ViewRecordServlet">記録を見る</a>
		<a href="/book/RegistBookServlet">本を登録する</a>
	</body>
</html>