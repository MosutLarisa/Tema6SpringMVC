<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Detalii Laptop</title>
</head>
<body>
<p> Laptop(
	<c:out value="${lap.brand}" />,
	<c:out value="${lap.price}" /> RON, 
	<c:out value="${lap.ram}" /> GB )

</body>
</html>
