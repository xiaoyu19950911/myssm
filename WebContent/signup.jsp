<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册页面</title>
</head>
<body>
	<script type="text/javascript">
		  
        function checkUserName(obj) {
			var username = obj;
			var checkUserNameResult = document
					.getElementById("checkUserNameResult");
			if (username.trim().length == 0) {
				checkUserNameResult.innerHTML = "用户名不能为空";
				obj.focus();
			} else {
				checkUserNameResult.innerHTML = "";
			}
		}  
    
	</script>
	  
	<script type="text/javascript">
		  
        function checkPassword(obj) {
			var password = obj;
			var checkPasswordResult = document
					.getElementById("checkPasswordResult");
			if (password.trim().length == 0) {
				checkPasswordResult.innerHTML = "密码不能为空";
				obj.focus();
			} else {
				checkPasswordResult.innerHTML = "";
			}
		}  
  
    
	</script>
	  
	<h1 align="center">用户注册</h1>
	<form action="/myssm1/user/signup" name="form1"
		onsubmit="return check()" method="post">
		<table align="center">
			<tr>
				<td align="right">用户名：</td>
				<td><input id="username" type="text" name="username"
					onblur="checkUserName(this.value);"></td>
				<td><span id="checkUserNameResult" style="color: red"></span>  </td>
			</tr>
			<tr>
				<td align="right">密码：</td>
				<td><input id="password" type="password" name="password"
					onblur="checkPassword(this.value);"></td>
				<td><span id="checkPasswordResult" style="color: red"></span></td>
			</tr>
			<tr>
				<td align="center" colspan="2"><input type="submit" value="注册"></td>
			</tr>
		</table>
	</form>
	<script type="text/javascript">
		function check() {
			var username = document.getElementById("username").value;
			var password = document.getElementById("password").value;
			if (username == null || password == null || username == ""
					|| password == "") {
				alert("用户名密码不能为空！")
				return false;
			}
			return true;
		}
	</script>
</body>
</html>