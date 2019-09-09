<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Roster</title>
</head>
<body>
<table>
		<thead>
			<tr>
				<th>Name</th>
				<th>Age</th>
				<th>Address</th>
				<th>City</th>
				<th>State</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${students}" var="student">
    			<tr>    
   				<td><c:out value="${student.firstName} ${student.lastName}"/></td>
    				<td><c:out value="${student.age}"/></td>
    				<td><c:out value="${student.address.street}"/></td>
    				<td><c:out value="${student.address.city}"/></td>
    				<td><c:out value="${student.address.state}"/></td>
    			</tr>
			</c:forEach>
		</tbody>
		</table>
</body>
</html>