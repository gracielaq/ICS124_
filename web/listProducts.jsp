<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page session = "false" %>
     <% if (request.getSession(false) == null) {
	response.sendRedirect("loginPage.jsp");
	return;} %>
<jsp:useBean id="productrecords" type="java.sql.ResultSet" scope="request"/>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Products</title>
</head>
<body>
<%@include file="searchAndSortBy.jsp"  %>

	<h1>PRODUCTS</h1>
	<div style="height:200px;overflow:auto;">
	<table border="1" width="100%" cellpadding="3" cellspacing="3">
		<tr>
			<th align="center"></th><!--for checkbox-->
			<th align="center">Product Code</th>
			<th align="center">Product Description</th>
			<th align="center">Supplier</th>
			<th align="center">Quantity</th>
			<th align="center">Unit Price</th>
			<th align="center">Discount/s</th><!-- for customer discount -->
			<th align="center">Action-Edit</th>
			<th align="center">Action-Delete</th>
		</tr>
		
			<% 
				while(productrecords.next()) {	
			%>
			
				<tr>
					<td><%=productrecords.getInt("product_code")%></td>
					<td><%=productrecords.getString("item")%></td>
					<td><%=productrecords.getString("quantity")%></td>
					<td><%=productrecords.getString("date_delivered")%></td>
					<td><%=productrecords.getString("manufacturer")%></td>
					<td><%=productrecords.getString("product_price")%></td>
					<td><%=productrecords.getString("total_price")%></td>
					<td align="center">
					  <a href="productmaintenance.html?product_code=<%=productrecords.getInt("product_code")%>&action=edit">
					  	edit
					  </a>
					</td>
					<td align="center">
					  <a href="productmaintenance.html?product_code=<%=productrecords.getInt("product_code")%>&action=delete">
					  	delete
					  </a>
					</td>
				</tr>		
	<% } %>
		
	</table></div>
	<h3>TOTAL QUANTITY:${totalQuantity }</h3>
	
	<a href="index.jsp">back to index</a>
</body>
</html>
</body>
</html>