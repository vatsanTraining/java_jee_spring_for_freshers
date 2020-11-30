<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Drivers</title>
<style type="text/css">
table{
	
	border: 1px solid green;
	margin: auto;
	border-collapse: collapse;
}

tr,td,th{
	
	border: 1px solid green;
}
</style>
</head>
<body>

<h2 style="text-align: center;"> Drivers List</h2>
<table>
<tr>
	<th>Id</th>
	<th>Driver Name</th>
	<th>Location</th>
	<th>Rating</th>
</tr>

<c:forEach items="${list}" var="eachItem">
<tr>
<td><c:out value="${eachItem.id}"/></td>
<td><c:out value="${eachItem.driverName}"/></td>
<td><c:out value="${eachItem.address}"/></td>
<td><c:out value="${eachItem.rating}"/></td>
</tr>
</c:forEach>
</table>
</body>
</html>