<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index</title>
</head>
<body>

	<h1>Index Page</h1>
	<%@ include file="menu.jsp" %>
	
	${1+2}
	${10 gt 5 }
	${1 eq "1" }
	${pageContext.request.contextPath}

</body>
</html>