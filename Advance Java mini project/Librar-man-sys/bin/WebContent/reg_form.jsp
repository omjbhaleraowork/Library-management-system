<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr" %>       
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <spr:form action="reg.htm" method="post" commandName="admin" >
	<table align="center" >
		
	<tr>
			<td ><h1 style="background-color: red" >Registration</h1> </td>
		</tr>
		<tr>
			<td>
				First Name:
			</td>
			<td>
				<spr:input path="adminFName"/>
			</td>
		</tr>
			<tr>
			<td>
				Last Name:
			</td>
			<td>
				<spr:input path="adminLName"/>
			</td>
		</tr>
		
		<tr>
			<td>
				User Name:
			</td>
			<td>
				<spr:input path="userName"/>
				<font color="red" ><spr:errors path="userName" ></spr:errors></font>
			</td>
		</tr>
		<tr>
			<td>
				User password:
			</td>
			<td>
				<spr:password path="userPass"/>
				<font color="red" ><spr:errors path="userPass" ></spr:errors></font>
			</td>
		</tr>
			
		<tr>
			<td>
				Email:
			</td>
			<td>
				<spr:input path="email"/>
			</td>
		</tr>
		
		
		<tr>
			<td>
				Contact:
			</td>
			<td>
				<spr:input path="contactNo"/>
			</td>
		</tr>
		
		
		
		<tr>
			<td>
				<a href="admin.jsp" >Back</a>
			</td>
			<td>
				<input type="submit"  value="Register" >
			</td>
		</tr>
	</table>
	</spr:form>
</body>
</html>