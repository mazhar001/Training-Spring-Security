<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
	<title>HelloWorld Super Admin page</title>
</head>
<body>
	Dear <strong>${user}</strong>, Welcome to SuperAdmin Page.
	<a href="<c:url value="/logout" />">Logout</a>
</body>
</html>