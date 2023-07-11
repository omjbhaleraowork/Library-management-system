
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
		
		<td><h1 style="background: red"> BOOKS LIST</h1></td>
		</tr>
		<% 
		List<Books> elist = (List<Books>)request.getAttribute("bookList");
		for(Books book : elist){
		%>
		
		<tr>
		
		    <td>
			BOOK ID :	<%=book.getBookId()%>
			</td>
			<td>
				CATEGORY :<%=book.getCategory()%>
			</td>
			
			<td>
			BOOK NAME :	<%=book.getBookName()%>
			</td>
			
			<td>
				RACK NO :<%=book.getRackNo()%>
			</td>
			<td>
			QUANTITY :<%=book.getQuantity()%>
			</td>
			<td>
			UNIQ ID:	<%=book.getUniqId()%>
			</td>
			
			
			
		</tr>
		<% } %>
		<tr>
			<td>
				<a href="user_home.jsp" ><h1 style="background: pink">back</h1></a>
			</td>
			
		</tr>
	</table>

</body>
</html>