<%@ page session="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<head>
<link rel="stylesheet" href="<c:url value="//resources/Supernice.css" />" type="text/css" >

	<title>Home</title>
	<script src="//code.jquery.com/jquery-1.12.0.min.js" type="text/javascript"></script>
	<script type="text/javascript">
		
		
	</script>
</head>
	<body>
		<h1>
			Home
		</h1>
		<p>Thanks for logging in ${user.username}</p>
		<c:forEach items="${messages}" var="message">
		<p>${message.content}</p>
		</c:forEach>
	</body>
</html>
