<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html; charset=utf-8" language="java" %>
<html>
<body>
	<a href="/MVC2/admissionForm.html?siteLanguage=en">English</a>|
	<a href="/MVC2/admissionForm.html?siteLanguage=hi">Hindi</a>

	<link rel="stylesheet" href="<spring:theme code='stylesheet'/>" type="text/css"/>
	<p>
			<a href="/MVC2/admissionForm.html?siteTheme=green">Green</a>|
			<a href="/MVC2/admissionForm.html?siteTheme=red">Red</a>
	</p>
	

	
	
	<!--  <h1>${headerMessage}</h1> -->
	<H1><spring:message code="label.headerMessage"/>
	<H3><spring:message code="label.admissionForm"/>
	
	<form:errors  path="student1.*"/>
	
	<form action="/MVC2/submitAdmissionForm.html" method="post">
	<table>
		<tr><td><spring:message code="label.studentName"/></td> <td><input type="text" name="studentName" /> </td><td><spring:message code="nameCondition"/></td></tr>
		<tr><td><spring:message code="label.studentHobby"/></td><td><input type="text" name="studentHobby" /></td></tr>
		<tr><td><spring:message code="label.studentMobile"/></td><td><input type="text" name="studentMobile" /></td></tr>
		<tr><td><spring:message code="label.studentDOB"/></td><td><input type="text" name="studentDOB" /></td><td><spring:message code="dateCondition"/></td></tr>
		<tr><td><spring:message code="label.studentSkills"/></td><td> <select name="studentSkills" multiple>
													<option value="Java Core">Java Core </option>
													<option value="Spring Core">Spring Core </option>
													<option value="Spring MVC">Spring MVC </option>
													</select></td></tr>
	</table>
	
	<table>
			<tr><td><spring:message code="label.StudentAddress"/> </td></tr>
		<tr>
			<td><spring:message code="label.country"/><input type="text" name="studentAddress.country"/></td>
			<td><spring:message code="label.city"/>: <input type="text" name="studentAddress.city"/></td>
			<td><spring:message code="label.street"/><input type="text" name="studentAddress.street"/></td>
			<td><spring:message code="label.pincode"/> <input type="text" name="studentAddress.pincode"/></td>
		</tr>
		
		<tr><td>
		<spring:message code="label.submit.admissionForm" var="labelSubmitAdmissionForm"></spring:message>
		<input type="submit" value="${ labelSubmitAdmissionForm}"/>
		
		</td></tr>
	</table>
	
	</form>
</body>
</html>