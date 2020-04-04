<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body bgcolor="lavender">
	<center>
		<h1>ZEE-ZEE Web Portal</h1>
	</center>
	<sf:form modelAttribute="login" action="/submitlogin" method="post">
		<table>
			<tr>
				<td><sf:label path="userName">UserName</sf:label></td>
				<td><sf:input name="userName" path="userName" id="userName" /></td>
			</tr>
			<tr>
				<td><sf:label path="password">Password</sf:label></td>
				<td><sf:password path="password" name="password" id="password" />
				</td>
			</tr>
			<tr>
				<td><button type="submit" name="submit">Login</button></td>
				<td><button type="reset">Cancel</button></td>
			</tr>
		</table>
	</sf:form>
</body>
</html>