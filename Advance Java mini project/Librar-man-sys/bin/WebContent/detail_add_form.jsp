<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <spr:form action="detail_add.htm" method="post" commandName="mng" >
	<table align="center" >
		<tr>
		
		<td><h1 style="background: red"> ADD DETAILS</h1></td>
		</tr>
		
		<tr>
			<td>
				student Name:
			</td>
			<td>
				<spr:input path="studentName"/>
			</td>
		</tr>
		<tr>
			<td>
				Book name:
			</td>
			<td>
				<spr:input path="bookName"/>
			</td>
		</tr>
		<tr>
			<td>
				category:
			</td>
			<td>
				<spr:input path="bookCategory"/>
			</td>
		</tr>
		<tr>
			<td>
				Issued date:
			</td>
			<td>
				<spr:input path="issuedDate"/>
			</td>
		</tr>
		<tr>
			<td>
				Return date:
			</td>
			<td>
			<spr:input path="returnDate"/>
			</td>
		</tr>
		<tr>
			<td>
				<a href="home.jsp" >Back</a>
			</td>
			<td>
				<input type="submit"  value="Add" >
			</td>
		</tr>
	</table>
	</spr:form>
</body>


</html>