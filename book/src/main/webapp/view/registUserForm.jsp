<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>ユーザー登録</title>
	</head>

	<body>
		<h2>記録する内容を入力してください</h2>
		<form action="/book/RegistUserServlet" method="post">
			<table>
				<tr>
					<th>ユーザーID</th><td><input type="text" name="userid"></td>
					<th>パスワード</th><td><input type="text" name="password"></td>
				</tr>
			</table>
			<input type="submit" name="command" value="登録">
			<input type="reset" name="command" value="リセット">
		</form>
	</body>
</html>