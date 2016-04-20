<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<%@ page session="false" %>
<html>
<head>
<spring:url value="/resources/Supernice.css" var="supernicecss" />
<link rel="stylesheet" type="text/css" href="${supernicecss}">
	<title>Home</title>
	
	
	<script src="//code.jquery.com/jquery-1.12.0.min.js" type="text/javascript"></script>
	<script type="text/javascript">
		$(function(){
			$("#submitbutton").click(function(){
				/* var password = $("#password").val();
				var confirmPassword = $("#confirmPassword").val();
				
				if(password == confirmPassword){
					$("#userObject").submit();
				}
				else{
					alert("Passwords do not match");
				} */
				$("#user").submit();
				
				
			});
			$("#registerbutton").click(function(){
				window.location.href = "register.jsp";
			});
			
		});
		
	</script>
</head>
	<body>
		<h1>
			User registration 
		</h1>
		<form:form commandName="user" method="POST">
			<p align="center">
			User name:<form:input path="username"/><br/>
			</p>
			<p align="center">
			Password: <form:password path="password"/>
			</p>
			<%-- <p align="center">
			Confirm Password: <input type="password" id="confirmPassword"/>
			</p>
			<p align="center">
			<form:radiobuttons path="accountType" items="${mySpecialAccountTypes}" element="div"/><br/>
			<form:checkboxes path="selectedCountries" items="${countries}" element="div"/><br/>
			<form:checkbox path="termsOfService" label="Terms of service"/> --%>
			 <p align="center">
			 <input type="button" id="registerbutton" value="Register"/>
			<input type="button" id="submitbutton" value="Login"/>
			</p>
			<p align="center" style="color: red">${result}</p>
		</form:form>
	</body>
</html>
