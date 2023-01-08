<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.Book" %>
<% Book registBook = (Book) session.getAttribute("registBook"); %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>本の登録確認</title>
	</head>

	<body>
		<h3>登録</h3>
		<% if(registBook.getTitle() != null) { %>
			<%=registBook.getTitle()%>を登録しました。
			<a href="/Yonda/Main">戻る</a>
		<% }else { %>
			本の登録に失敗しました。
			<a href="/Yonda/Main">戻る</a>
		<% }%>
		<footer>
			<h4 id="copy">Copyright 2022 &copy; YondaBook Corporation. All rights reserved.</h4>
		</footer>

	</body>
</html>