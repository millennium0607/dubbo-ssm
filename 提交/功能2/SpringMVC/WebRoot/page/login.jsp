<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript">
	function check(form) {
		var username = form.username.value;
		var password = form.password.value;
		var gender = form.gender.value;
		var age = form.age.value;
		var address = form.address.value;
		if ("" == username) {
			alert("请输入账号！");
			return false;
		} else if ("" == password) {
			alert("请输入密码！");
			return false;
		} else if ("" == gender) {
			alert("请输入性别！");
			return false;
		} else if ("" == age) {
			alert("请输入年龄！");
			return false;
		} else if ("" == address) {
			alert("请输入家庭住址！");
			return false;
		} else {
			return true;
		}
	}
</script>
</head>
<body>
	<form name="regist" action="regist.do" method="post"
		onsubmit="return check(this);">


		<table align="center" border="1">
			<tr align="center">
				<td align="right">账号:</td>
				<td align="left"><input type="text" name="username" /></td>
			</tr>
			<tr align="center">
				<td align="right">密码:</td>
				<td align="left"><input type="password" name="password" /></td>
			</tr>
			<tr align="center">
				<td align="right">性别:</td>
				<td align="left"><select id="gender" name="gender">
						<option value="male">男</option>
						<option value="female">女</option>
				</select></td>
			</tr>
			<tr align="center">
				<td align="right">年龄:</td>
				<td align="left"><input type="text"
					onkeyup="this.value=this.value.replace(/\D/g,'')" name="age" /></td>
			</tr>
			<tr align="center">
				<td align="right">地址:</td>
				<td align="left"><input type="text" name="address" /></td>
			</tr>
			<tr align="center">
				<td colspan="2"><button type="submit" class="submit_button" />submit
					</button></td>
			</tr>
		</table>
	</form>

</body>
</html>