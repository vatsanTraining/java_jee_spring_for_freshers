<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Books</title>
<link href="css/style.css" rel="stylesheet">

</head>
<body>
<header>
<%@ include file="menuBar.html" %>
</header>
<section>
<h2 style="text-align: center;">Book List</h2>
<table>
	<tr>
		<th>Book Number</th>
		<th>Book Name</th>
		<th>Author</th>
		<th>Category</th>
	</tr>
<c:forEach items="${bookList}" var="eachBook">	
<tr>
	<td><c:out value="${eachBook.bookNumber}"/></td>
	<td><c:out value="${eachBook.bookName}"/></td>
	<td><c:out value="${eachBook.author}"/></td>
	<td> 
	       <c:forEach items="${eachBook.category}" var="item">
	           <c:out value="${item}"/> </c:forEach>
	      </td>
	</tr>
</c:forEach>	
</table>


</section>
<footer>
<jsp:include page="footer.jsp"/>

</footer>

</body>
</html>