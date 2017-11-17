<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

	<head>
		<title>首页</title>
	</head>

	<body>

		<form action="${pageContext.request.contextPath }/user/user_login.do" method="post">

			<table>
				<tr>
					<td>USERNAME</td>
					<td><input type="text" name="username" value="root" id="username" /></td>
				</tr>
				<tr>
					<td>PASSWORD</td>
					<td><input type="text" name="password" value="root" id="password" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="LOGIN" /></td>
					<td>
						<a href="${pageContext.request.contextPath }/router_reg.do">REGISTRY</a>
					</td>
				</tr>
			</table>
		</form>
		
		<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
		<script>
		</script>
	</body>

</html>