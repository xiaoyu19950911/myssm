<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户登录</title>
</head>
<body>
	<form action="/myssm1/user/login" method="post" id="myform">
		<table align="center" border="2">
			<tr>
				<td>用户名：</td>
				<td><input type="text" id="username" name="username" /></td>
			</tr>
			<tr>
				<td>密码：</td>
				<td><input type="password" id="password" name="password" /></td>
			</tr>
			<tr>
				<td align="center" colspan="2"><input type="submit" value="提交"
					id="login" /></td>
			</tr>
			<tr>
				<td align="center" colspan="2"><a href="/myssm1/signup.jsp">没有用户名，立即注册？</a></td>
			</tr>
		</table>

	</form>

</body>
</html>