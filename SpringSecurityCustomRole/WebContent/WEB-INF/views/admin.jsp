<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>


<head>
	<title>HelloWorld Admin page</title>
</head>
<body>
	Dear <strong>${user}</strong>, Welcome to Admin Page.
	<a href="<c:url value="/logout" />">Logout</a>
</body>
</html>