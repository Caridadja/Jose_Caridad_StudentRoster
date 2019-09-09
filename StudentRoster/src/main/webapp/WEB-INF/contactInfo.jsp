<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contact Information</title>
</head>
<body>
<form:form action="/contact/create" method="post" modelAttribute="address">
			<form:label path="student">Person:
				<form:select path="student">
					<c:forEach items="${students}" var="student">
        					<form:option value="${student.id}"><c:out value="${student.firstName} ${student.lastName}"/></form:option>
   					</c:forEach>
				</form:select>
			</form:label>
			<form:label path="street">Street: 
				<form:input type="text" path="street"/>
			</form:label>
			<form:label path="city">City: 
				<form:input type="text" path="city"/>
			</form:label>
			<form:label path="state">State: 
				<form:input type="text" path="state"/>
			</form:label>
			<input type="submit" value="Create contact information">
		</form:form>
</body>
</html>