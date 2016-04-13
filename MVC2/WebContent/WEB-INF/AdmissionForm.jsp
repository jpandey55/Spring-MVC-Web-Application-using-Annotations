
<html>
<head>
<h1>${headerMessage}</h1>
<title>STUDENT ADMISSION FORM FOR ENGINEERING COURSES</title>
</head>
<body>
	<form action="./submitAdmissionForm.html" method="post">
	<table>
		<tr><td>Student's Name: </td><td><input type="text" name="studentName" /> </td></tr>
		<tr><td>Student's Hobby: </td><td><input type="text" name="studentHobby" /></td></tr>
		<tr><td>Student's Mobile: </td><td><input type="text" name="studentMobile" /></td></tr>
		<tr><td>Student's DOB: </td><td><input type="text" name="studentDOB" /></td></tr>
		<tr><td>Student's Skills set: </td><td> <select name="studentSkills" multiple>
													<option value="Java Core">Java Core </option>
													<option value="Spring Core">Spring Core </option>
													<option value="Spring MVC">Spring MVC </option>
													</select></td></tr>
	</table>
	
	<table>
			<tr><td>Student's Address: </td></tr>
		<tr>
			<td>Country: <input type="text" name="studentAddress.country"/></td>
			<td>City: <input type="text" name="studentAddress.city"/></td>
			<td>Street: <input type="text" name="studentAddress.street"/></td>
			<td>Pincode: <input type="text" name="studentAddress.pincode"/></td>
		</tr>
		
		<tr><td><input type="submit" value="Submit this form"/></td></tr>
	</table>
	
	</form>
</body>
</html>