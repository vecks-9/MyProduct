<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.Book" %>
<% Book book = (Book) session.getAttribute("registBook"); %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title><%=book.getTitle() %></title>
	</head>

	<body>
		<h2><%=book.getTitle() %></h2>
		<hr>
			<table>
				<tr>
					<th>タイトル：</th><td><%=book.getTitle() %></td>
					<th>　著者　：</th><td><%=book.getAuthor() %></td>
					<th>　感想　：</th><td><%=book.getImpression() %></td>
				</tr>
			</table>
		<hr>
		<a href="/book/view/main.jsp">戻る</a>
	</body>
</html>

<!-- 1ページの表示上限3件　オフセット -->