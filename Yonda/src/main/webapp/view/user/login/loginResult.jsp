<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.User" %>
<% User loginUser = (User) session.getAttribute("loginUser"); %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>ログインページ</title>
	</head>

	<body>
		<h4>ログイン認証</h4>
		<hr>
		<p><% if(loginUser != null) { %>
			ログインに成功しました！</p>
			<p>ようこそ<%=loginUser.getUserid()%>さん</p>
			<a href="/Yonda/Main">メインページへ</a>
		<% }else { %>
			<p>ログインに失敗しました</p>
			<a href="/Yonda/Top">トップへ戻る</a>
		<% }%>

		<footer>
			<h4 id="copy">Copyright 2022 &copy; YondaBook Corporation. All rights reserved.</h4>
		</footer>
	</body>
</html>