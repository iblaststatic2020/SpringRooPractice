<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<%@ page session="false" %>

<html>
<head>
</head>
<body>
	<form:form commandName="user" method="POST">
			<p align="center">
			User name:<form:input path="username"/><br/>
			</p>
			<p align="center">
			Password: <form:password path="password"/>
			</p>
			<p align="center">
			Confirm Password: <input type="password" id="confirmPassword"/>
			</p>
			<p align="center">
			<form:radiobuttons path="accountType" items="${mySpecialAccountTypes}" element="div"/><br/>
			<form:checkboxes path="selectedCountries" items="${countries}" element="div"/><br/>
			<form:checkbox path="termsOfService" label="Terms of service"/> 
			 <p align="center">
			 <input type="button" id="registerbutton" value="Register"/>
			<input type="button" id="submitbutton" value="Login"/>
			</p>
			<p align="center" style="color: red">${result}</p>
		</form:form>

</body>
</html>