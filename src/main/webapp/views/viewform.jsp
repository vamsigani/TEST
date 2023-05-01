<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function confirmdelete() {
	return confirm("are u sure want to delete");
}
</script>
</head>


<body>



	<a href="/loadForm">+Add New Contact</a>
	<table border="1">
		<thead>
			<tr>
			     <th>CONTACT ID</th>
				<th>CONTACT Name</th>
				<th>Contact Number</th>
				<th>Email</th>
				<th>Action</th>
			</tr>
		</thead>


<tbody>
<c:forEach items="${con}" var="c">
<tr>
 <td>${c.contactId}</td>
 <td>${c.contactName}</td>
 <td>${c.contactnumber}</td>
 <td>${c.contactEmail}</td>
 <td>
 <a href="edit?cid=${c.contactId }">EDIT</a> &nbsp; &nbsp;
 <a href="delete?cid=${c.contactId}" onclick="return confirmdelete()">Delete</a>

 </td>

</tr>
 
</c:forEach>

</tbody>
</table>
</body>
</html>