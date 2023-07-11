
<%@page import="com.cdac.dto.Book_mng"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table align="center" >
		
		<tr>
		
		<td><h1 style="background: red"> DETAIL LIST</h1></td>
		</tr>
		<% 
		List<Book_mng> elist = (List<Book_mng>)request.getAttribute("bookList");
		for(Book_mng book : elist){
		%>
		
		<tr>
		
		
		    <td>
			<h3>STUDENT ID:</h3>	<%=book.getStudentId()%>
			</td>
			<td>
				<h3>BOOK NAME :</h3>  <%=book.getBookName()%>
			</td>
			
			<td>
			<h3>STUDENT NAME :</h3> <%=book.getStudentName()%>
			</td>
			
			<td>
			<h3>CATEGORY :</h3> <%=book.getBookCategory()%>
			</td>
			<td>
			<h3>ISSUEDATE</h3> <%=book.getIssuedDate()%>
			</td>
			<td>
			<h3>RETURNDATE</h3> <%=book.getReturnDate()%>
			</td>
			
			<td>
			<h3>UPDATE</h3>	<a href="detail_update_form.htm?studentId=<%=book.getStudentId()%>">Update</a>
			</td>
			
			
		</tr>
		<% } %>
		
		<tr>
			<td >
				<a href="home.jsp" ><h3 style="background: yellow">Back</h3></a>
			</td>
			
		</tr>
	</table>

</body>
</html>