<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.User" %>
<% User registUser = (User) session.getAttribute("registUser"); %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>ユーザー登録確認</title>
	</head>

	<body>
		<p></p>
		<!-- 登録したユーザーがnullでなければ -->
		<% if(registUser != null) { %>
			登録に成功しました！
			ようこそ<%=registUser.getUserId()%>さん
			<a href="/book/view/main.jsp">メインページへ</a>
		<% }else { %>
			登録に失敗しました
			<a href="/book/top.jsp">トップへ戻る</a>
		<% }%>
	</body>
</html>