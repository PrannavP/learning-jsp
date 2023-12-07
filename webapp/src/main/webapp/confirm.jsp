<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Records</title>
</head>
<body>

	<h3>Student Record Successfully</h3>
	<table border=1>
		<thead>
			<tr>
				<th>Attribute</th>
				<th>Value</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>Name:</td> <td>${student_info.name}</td>
			</tr>
			<tr>
				<td>Address:</td> <td>${student_info.address}</td>
			</tr>
			<tr>
				<td>Hobby:</td> <td>${student_info.hobby}</td>
			</tr>
			<tr>
				<td>Age:</td> <td>${student_info.age}</td>
			</tr>
		</tbody>
	</table>

</body>
</html>