<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Informații Brand</title>
</head>
<body>
	<p><c:out value="${name}" />, <c:out value="${count}" /> caractere</p>
    <p><c:out value="${name}" />, <c:out value="${parity}" /></p>
</body>
</html>
