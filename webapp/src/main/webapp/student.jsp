<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student</title>
</head>
<body>

	<form action="student" method="post">
	
		<label for="name">Name:</label>
		<input type="text" name="name" id="name"><br>
		
		<label for="address">Address:</label>
		<select name="address">
			<option value="Kathmandu">Kathmandu</option>
			<option value="Chitwan">Chitwan</option>
			<option value="Pokhara">Pokhara</option>
			<option value="Itahari">Itahari</option>
			<option value="Nepalgunj">Nepalgunj</option>
		</select><br>
		
		<label for="hobby">Hobby:</label>
		<input type="radio" name="hobby" value="Swiming">Swiming &nbsp;&nbsp;
		<input type="radio" name="hobby" value="Coding">Coding &nbsp;&nbsp;
		<input type="radio" name="hobby" value="Gaming">Gaming<br>
		
		<label for="age">Age:</label>
		<input type="number" name="age" id="age"><br>
		
		<input type="submit" value="Insert">
	
	</form>

</body>
</html>