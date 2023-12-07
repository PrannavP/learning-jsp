<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%@ include file="menu.jsp" %>
	
	<h3>Send your queries</h3>
	
	<form action="contact" method="post">
		<p>
			<label>Username: </label>
			<input type="text" id="username" name="username" placeholder="Enter your username" required>
		</p>
		
		<p>
			<label>Email:</label>
			<input type="email" id="email" name="email" placeholder="Enter your email" required>
		</p>
		
		<p>
			<label>Message:</label>
			<textarea rows="7" cols="70" id="message" name="message" placeholder="Enter your message" required></textarea>
		</p>
		
		<p>
			<input type="submit" value="Send Message">
			<input type="reset" value="Reset Message">
		</p>
	</form>

</body>
</html>