<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.User" %>
<% User loginUser = (User) session.getAttribute("loginUser"); %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<% if(loginUser == null) { %>
			<h2>ログイン失敗</h2>
			<a href="/ArkDino/Index">戻る</a>
		<% } else {%>
			<h1>沼地へようこそ</h1>
			<a href="/ArkDino/View">登録済みの恐竜一覧</a>
			<a href="/ArkDino/Edit">恐竜の登録/更新</a>
		<% } %>
	</body>
	<footer>
		<h3>Copylight 2023 &copy; Ark Nitro Server Swamp Association. All right reserved.</h3>
	</footer>
	
</html>