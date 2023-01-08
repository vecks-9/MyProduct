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
			ようこそ<%=registUser.getUserid()%>さん
			<a href="/Yonda/Top">トップへ戻る</a>
		<% }else { %>
			登録に失敗しました
			<a href="/Yonda/Top">トップへ戻る</a>
		<% }%>
	</body>
</html>