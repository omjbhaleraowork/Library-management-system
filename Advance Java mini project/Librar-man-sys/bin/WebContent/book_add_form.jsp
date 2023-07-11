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

 <spr:form action="book_add.htm" method="post" commandName="books" >
	<table align="center" >
		
		<tr>
		
		<td><h1 style="background: red">ADD BOOKS HERE</h1></td>
		</tr>
		<tr>
			<td>
				Category :
			</td>
			<td>
			<spr:input path="category"/>
			</td>
		</tr>
		<tr>
			<td>
				Book Name:
			</td>
			<td>
				<spr:input path="bookName"/>
			</td>
		</tr>
		<tr>
			<td>
				Quantity:
			</td>
			<td>
				<spr:input path="quantity"/>
			</td>
		</tr>
		<tr>
			<td>
				Price:
			</td>
			<td>
				<spr:input path="price"/>
			</td>
		</tr>
		<tr>
			<td>
				Rack No:
			</td>
			<td>
				<spr:input path="rackNo"/>
			</td>
		</tr>
		<tr>
			<td>
				UniqId:
			</td>
			<td>
			<spr:input path="uniqId"/>
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