<html>
<body>
	<h1>${headerMessage}</h1>
	<h1>Congratulations!! the Engineering College has processed your application form successfully</h1>
	<h2>Details submitted by you</h2>
	<table>
		<tr>
			<td>Student Name</td>
			<td>${student1.studentName }</td>
		</tr>
		<tr>
			<td>Student Hobby</td>
			<td>${student1.studentHobby }</td>
		</tr>
		<tr>
			<td>Student Mobile</td>
			<td>${student1.studentMobile }</td>
		</tr>
		<tr>
			<td>Student DOB</td>
			<td>${student1.studentDOB }</td>
		</tr>
		<tr>
			<td>Student Skills</td>
			<td>${student1.studentSkills }</td>
		</tr>
		<tr>
			<td>Student Address</td>
			<td>Country: ${student1.studentAddress.country }</td>
			<tr><td/><td>City: ${student1.studentAddress.city }</td></tr>
			<tr><td/><td>Street: ${student1.studentAddress.street }</td></tr>
			<tr><td/><td>Pin code: ${student1.studentAddress.pincode }</td></tr>	
		</tr>
	</table>

</body>
</html>