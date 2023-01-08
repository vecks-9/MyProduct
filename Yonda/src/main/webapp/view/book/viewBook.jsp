<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.*" %>
<%@ page import="java.util.*" %>
<% List<Book> bookList = (List<Book>) application.getAttribute("bookList"); %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>登録した本の一覧</title>
	</head>

	<body>
		<hr>
		<table>
		<% for(Book book : bookList) { %>
			<tr>
				<th><%=book.getId() %></th>
					<td>タイトル：<%=book.getTitle() %></td>
					<td>著者：<%=book.getAuthor() %></td>
					<td>感想：<%=book.getImpression() %></td>
		<% } %>
			</tr>
		</table>
		<hr>
	<a href="/Yonda/Main">戻る</a>
	</body>
</html>