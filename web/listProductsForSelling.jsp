<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page session = "false" %>
     <% if (request.getSession(false) == null) {
	response.sendRedirect("loginPage.jsp");
	return;} %>
<jsp:useBean id="productrecords" type="java.sql.ResultSet" scope="request"/>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Products</title>
</head>
<body>
<%@include file="searchAndSortBy.jsp"  %>

	<h1>PRODUCTS</h1>
	<form action="customerDetails.html" method="post">
	<div style="height:200px;overflow:auto;">
	<table border="1" width="100%" cellpadding="3" cellspacing="3">
		<tr>
			<th align="center"></th><!--for checkbox-->
			<th align="center">Product Code</th>
			<th align="center">Product Description</th>
			<th align="center">Supplier</th>
			<th align="center">Quantity</th>
			<th align="center">Unit Price</th>
			<th align="center">Date Received</th><!-- di ko maisipan ng tamang description -->
		</tr>
	
			<% 
				while(productrecords.next()) {	
			%>
			
				<tr>
					<td><input type="checkbox" name=<%=productrecords.getInt("product_code")%>></td><!-- checkbox MATT -->
					<td><%=productrecords.getInt("product_code")%></td>
					<td><%=productrecords.getString("product_description")%></td>
					<td><%=productrecords.getString("supplier")%></td>
					<td><%=productrecords.getString("quantity")%></td>
					<td><%=productrecords.getString("unit_price")%></td>
					<td><%=productrecords.getDate("date_received") %></td>
					
				</tr>		
	<% } %>
		
	</table></div>
	</form>
	<a href="index.jsp">back to index</a>
</body>
</html>
