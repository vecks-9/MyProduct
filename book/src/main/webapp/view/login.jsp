<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>

	<head>
		<meta charset="UTF-8">
		<title>ろぐいんぺーじ</title>
		<!-- 全体用css -->
		<link rel="stylesheet" href="/book/css/common.css" type="text/css"/>

	</head>

	<body>
		<h3 id="title">ログイン認証</h3>

		<hr>
		<p>会員IDとパスワードを入力し「ログイン」をクリックしてください</p>

		<form action="/book/LoginServlet" method="post">
			<table> <!-- 入力フォーム＝テーブル -->
				<tr>
					<th>ユーザーID</th> <!-- 項目名 -->
						<!-- inputはテキストp255 -->
						<td><input type="text" name="userid" size="25" value="" placeholder="会員IDを入力してください。"></td>
				</tr>
				<tr>
					<th>パスワード</th> <!-- 項目名 -->
						<td><input type="password" name="password" size="15" value="" placeholder="パスワードを入力してください。"></td>
				</tr>
			</table>

			<input type="submit" name="command" value="login">
			<input type="reset" name="command" value="reset">
		</form>


		<p>トップページへ戻るには「<a href="/book/top.jsp"><strong>トップページへ戻る</strong></a>」をクリックしてください
		<footer>
			<h4 id="copy">Copyright 2022 &copy; YondaBook Corporation. All rights reserved.</h4>
		</footer>
	</body>

</html>