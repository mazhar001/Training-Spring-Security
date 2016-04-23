<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>User's List</title>
</head>
<body>
	<h2>List of Users</h2>	
	<table>
		<tr>
			<td>id</td><td>First Name</td><td>Last Name</td><td>Type</td><td></td><td></td>
		</tr>
		<c:forEach items="${users}" var="user">
			<tr>
			<td>${user.id}</td>
			<td>${user.firstName}</td>
			<td>${user.lastName}</td>
			<td>${user.type}</td>
			<td><a href="<c:url value='/edit-user-${user.id}' />">edit</a></td>
			<td><a href="<c:url value='/delete-user-${user.id}' />">delete</a></td>
			</tr>
		</c:forEach>
	</table>
	<br/>
	<a href="<c:url value='/logout' />">Logout</a>
</body>
</html>