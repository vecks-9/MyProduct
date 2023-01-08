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
		<h3>ようこそ　<%=loginUser.getUserid() %>さん</h3>

		<h1>読書記録</h1>
		<a href="/Yonda/ViewBook">記録を見る</a>
		<a href="/Yonda/RegistBook">本を登録する</a>
		<hr>
		<a href="/Yonda/Logout">ログアウト</a>
		<footer>
			<h4 id="copy">Copyright 2022 &copy; YondaBook Corporation. All rights reserved.</h4>
		</footer>
	</body>
</html>