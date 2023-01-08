<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>

	<body>
		<h1>ニトロサーバー　沼地協会</h1>
		<form action="/ArkDino/Login" method="post">
			<table>
				<tr>
					<th>ユーザーID</th>
					<td><input type="text" name="userid" size="25" value="" placeholder="IDを入力"></td>
				</tr>
				<tr>
					<th>パスワード</th>
					<td><input type="text" name="userid" size="25" value="" placeholder="パスワードを入力"></td>
				</tr>
			</table>
			<input type="submit" name="command" value="login">
			<input type="reset" name="command" value="reset">
		</form>
		
		<a href="/ArkDino/Regist">入会</a>
		<a href="/ArkDino/Manage">管理</a>
	</body>
	<footer>
		<h3>Copylight 2023 &copy; Ark Nitro Server Swamp Association. All right reserved.</h3>
	</footer>
</html>