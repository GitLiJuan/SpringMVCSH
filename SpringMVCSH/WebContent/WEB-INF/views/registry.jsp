<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

	<head>
		<title>REGISTRY PAGE</title>
		<meta charset="utf-8" />
	</head>

	<body>
		<h3>注册页面</h3>
		<form action="${pageContext.request.contextPath}/user/user_registry.do" method="post">
		<table>
			<tr>
				<td>用户名</td>
				<td>
					<input type="text" name="login.username" value="user1"/>
				</td>
			</tr>
			<tr>
				<td>密码</td>
				<td>
					<input type="text" name="login.password" value="123456"/>
				</td>
			</tr>
			<tr>
				<td>优先级</td>
				<td>
					<select name="login.priority">
						<option value="1" selected>1</option>
						<option value="2">2</option>
						<option value="3">3</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>真实姓名</td>
				<td><input type="text" name="detail.realname" value="you guess"/></td>
			</tr>
			<tr>
				<td>出生日期</td>
				<td><input type="date" name="detail.birthday" value="2017-01-01"/></td>
			</tr>
			<tr>
				<td>余额</td>
				<td>
					<input type="number" name="detail.balance" value="20000" />
				</td>
			</tr>
			<tr>
				<td>
					<input type="submit" value="REGISTRY" />
				</td>
				<td>
					<input type="reset" value="RESET">
				</td>
			</tr>
		</table>
		</form>
	</body>

</html>