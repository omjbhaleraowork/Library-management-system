
<%@page import="com.cdac.dto.Books"%>
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
			<td><h1 style="background: red" >BOOKS LIST </h1> </td>
		</tr>
		<% 
		List<Books> elist = (List<Books>)request.getAttribute("bookList");
		for(Books book : elist){
		%>
		
		
		<tr>
		
		    
		    <td>
			Book Id :<%=book.getBookId()%>
			</td>
	  
			<td>
			category :<%=book.getCategory()%>
			</td>
			
			<td>
			Book name :	<%=book.getBookName()%>
			</td>
			
			<td>
			Rack No :<%=book.getRackNo()%>
			</td>
			<td>
			Quantity :<%=book.getQuantity()%>
			</td>
			<td>
		   UniqId : <%=book.getUniqId()%>
			</td>
			
			<td>
			
			delete:	<a href="books_delete.htm?bookId=<%=book.getBookId()%>">Delete</a>
			</td>
			<td>
			update:	<a href="book_update_form.htm?bookId=<%=book.getBookId()%>">Update</a>
			</td>
			
		</tr>
		<% } %>
		<tr>
			<td>
				<a href="home.jsp" ><h3 style="background: yellow">Back</h3></a>
			</td>
			
		</tr>
	</table>

</body>
</html>