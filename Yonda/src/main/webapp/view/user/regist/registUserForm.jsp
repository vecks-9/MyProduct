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
		<form action="/Yonda/RegistUser" method="post">
			<table>
				<tr>
					<th>ユーザーID</th><td><input type="text" name="userid"></td>
				</tr>
				<tr>
					<th>パスワード</th><td><input type="text" name="password"></td>
				</tr>
			</table>
			<input type="submit" name="command" value="登録">
			<input type="reset" name="command" value="リセット">
		</form>
		<hr>
		<a href="/Yonda/Top">戻る</a>
		<footer>
			<h4 id="copy">Copyright 2022 &copy; YondaBook Corporation. All rights reserved.</h4>
		</footer>
	</body>
</html>