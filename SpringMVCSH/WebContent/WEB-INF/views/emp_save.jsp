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
		<h3>新增员工页面</h3>
		<form action="${pageContext.request.contextPath}/emp/save.do" method="post">
		<table>
			<tr>
				<td>姓名</td>
				<td>
					<input type="text" name="ename" value="emp1"/>
				</td>
			</tr>
			<tr>
				<td>岗位</td>
				<td>
					<input type="text" name="job" value="SE"/>
				</td>
			</tr>
			<tr>
				<td>上级</td>
				<td>
				<input type="number" name="mgr" value="2" />
				</td>
			</tr>
			<tr>
				<td>入职日期</td>
				<td><input type="date" name="hiredate" value="2017-01-01"/></td>
			</tr>
			<tr>
				<td>工资</td>
				<td><input type="number" name="sal" value="5000"/></td>
			</tr>
			<tr>
				<td>奖金</td>
				<td>
					<input type="number" name="comm" value="200" />
				</td>
			</tr>
			<tr>
				<td>部门编号</td>
				<td>
				<input type="number" name="deptno" value="3" />
				</td>
			</tr>
			<tr>
				<td>
					<input type="submit" value="SAVE" />
				</td>
				<td>
					<input type="reset" value="RESET">
				</td>
			</tr>
		</table>
		</form>
	</body>

</html>