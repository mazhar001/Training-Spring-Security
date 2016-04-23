<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Login page</title>
</head>
<body>
	<c:if test="${param.error != null}">
		<div>
			<p>Invalid username and password.</p>
		</div>
	</c:if>
	<c:if test="${param.logout != null}">
		<div>
			<p>You have been logged out successfully.</p>
		</div>
	</c:if>
	<form action="login" method="post">
		<input type="text" id="username" name="ssoId">
		<input type="password" id="password" name="password">
		<%-- 		<input type="hidden" name="${_csrf.parameterName}"   value="${_csrf.token}" /> --%>
		<input type="submit" value="Log in">
	</form>
</body>
</html>