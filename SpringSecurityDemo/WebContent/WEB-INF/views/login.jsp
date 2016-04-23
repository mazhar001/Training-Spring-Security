<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${param.error!=null}">
		<p>Invalid Id or Password</p>
	</c:if>
	<c:if test="${param.logout!=null}">
		<p>YOu have Logged out successfully</p>
	</c:if>
	
	<form action="login" method="POST">
		<form:input path="id"/>
		<form:password path="password"/>
		<input type="submit" value="Log In"/>
	</form>
</body>
</html>