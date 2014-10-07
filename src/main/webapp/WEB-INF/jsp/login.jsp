<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
	<head>
		<title>Login Page</title>
	</head>

	<body>

	<c:if test="${!empyt error}"	
	<font color="red"><c:out value="${error}"/></font>
	</c:if>


	<form action="<c:url value='/loginCheck.html'/>" method="post">
		UsreName:<input type="text" name="userName">
		<br />

		PassWord:<input type="password" name="password">
		<br />

		<input type="submit" value="Login"/>
		<input type="reset" value="Reset"/>
	
	</form>

	</body>

</html>

