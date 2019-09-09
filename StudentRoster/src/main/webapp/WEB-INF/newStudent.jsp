<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Student</title>
</head>
<body>
<form:form action="/students/create" method="POST" modelAttribute="student">
			<form:label path="firstName">First Name: 
				<form:input type="text" path="firstName"/>
			</form:label>
			<form:label path="lastName">Last Name: 
				<form:input type="text" path="lastName"/>
			</form:label>
			<form:label path="age">Age: 
				<form:input type="number" path="age"/>
			</form:label>
			<input type="submit" value="New Student">
		</form:form>
</body>
</html>