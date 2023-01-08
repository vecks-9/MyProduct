<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.Dino" %>
<%@ page import="java.util.*" %>
<% @SuppressWarnings("unchecked")
List<Dino> dinoList = (List<Dino>) application.getAttribute("dinoList"); %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>

	<body>
		<hr>
		<table>
			<% int number = 1; %>
			<% for(Dino dino : dinoList) { %>
			<tr>
				<th rowspan="10"><%=number %></th>
			</tr>
			<tr>
				<th>恐竜の種類：</th>
				<td><%=dino.getKind() %></td>
			</tr>
			<tr>
				<th>HP：</th>
				<td><%=dino.getHp() %></td>
			</tr>
			<tr>
				<th>スタミナ：</th>
				<td><%=dino.getStamina() %></td>
			</tr>
			<tr>
				<th>重量値：</th>
				<td><%=dino.getWeight() %></td>
			</tr>
			<tr>
				<th>酸素値：</th>
				<td><%=dino.getOxygen() %></td>
			</tr>
			<tr>
				<th>火力：</th>
				<td><%=dino.getStrength() %></td>
			</tr>
			<tr>
				<th>食糧値：</th>
				<td><%=dino.getFood() %></td>
			</tr>
			<tr>
				<th>速度：</th>
				<td><%=dino.getSpeed() %></td>
			</tr>
			<tr>
				<th>変異回数：</th>
				<td><%=dino.getMutation() %></td>
			</tr>
			<%number++; } %>
		</table>
	</body>
	<footer>
		<h3>Copylight 2023 &copy; Ark Nitro Server Swamp Association. All right reserved.</h3>
	</footer>
</html>