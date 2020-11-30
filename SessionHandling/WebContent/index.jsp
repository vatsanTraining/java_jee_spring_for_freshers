<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Session Handling</title>
</head>
<body>


<c:out value="${pageContext.session.id}"/>




<p style="color:#ff0000"><c:out value="${errorMessage}"/></p>

<form action="session" method="post">
	<label for="">User Name</label>
	<input type="text" name="userName"  required="required"/>
	<label for="">Pass Word</label>
	<input type="password".  name="password" required="required"/>
	
	<input type="submit" value="submit">
</form>

</body>
</html>