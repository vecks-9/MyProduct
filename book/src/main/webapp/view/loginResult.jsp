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
		<h4>ログイン可否</h4>
		<hr>
		<% if(loginUser != null) { %>
			ログインに成功しました！
			ようこそ<%=loginUser.getUserId()%>さん
			<a href="/book/view/main.jsp">メインページへ</a>
		<% }else { %>
			ログインに失敗しました
			<a href="/book/top.jsp">トップへ戻る</a>
		<% }%>
	</body>
</html>