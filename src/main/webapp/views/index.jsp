<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h4>Save Contact</h4>
		${sucess} ${fail}

	<form:form action="/save?contactId=${contact.contactId}" method="POST" modelAttribute="contact">
		<table>
			<tr>
				<td>Contact Name</td>
				<td><form:input path="contactName"/></td>
			</tr>
			<tr>
				<td>Contact Number</td>
				<td><form:input path="contactnumber"/></td>
			</tr>
			<tr>
				<td>Contact Email</td>
				<td><form:input path="contactEmail"/></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Save Contact"/></td>
			</tr>
		</table>

			<a href="/view">View All Contacts</a>
	</form:form>

</body>
</html>