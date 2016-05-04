<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<%@ page session="false" %>

<html>
<head>
<script src="//code.jquery.com/jquery-1.12.0.min.js" type="text/javascript"></script>
	<script type="text/javascript">
		$(function(){
			
			if(("#username").length > 2){
				
				$("#loginButton").click(function(){
					$("#user").submit();
				});
			}
			else{
				alert("Username is too short")
			}
				
				
				
		});
		</script>
</head>
<body>
	<form:form commandName="user" method="POST">
			<p align="center">
			User name:<form:input path="username" id = "username"/><br/>
			</p>
			<p align="center">
			Password: <form:password path="password" id="password"/>
			</p>
			<p align="center">
			Confirm Password: <input type="password" id="confirmPassword"/>
			</p>
			<p align="center">
			<form:radiobuttons path="accountType" items="${mySpecialAccountTypes}" element="div"/><br/>
			
			<form:checkbox path="termsOfService" label="Terms of service"/> 
			 <p align="center">
			 
			<input type="button" id="loginButton" value="Login"/>
			</p>
			<p align="center" style="color: red">${result}</p>
		</form:form>

</body>
</html>