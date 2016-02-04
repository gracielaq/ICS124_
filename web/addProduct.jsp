<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page session = "false" %>
     <% if (request.getSession(false) == null) {
	response.sendRedirect("loginPage.jsp");
	return;} %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Product</title>
</head>
<body>
<form action="addItems.html" method="post">
	<p>Product Code<input type="number" name="product_code" required="required"/></p>
	<p>Delivery Date<input type="date" name="delivery_date" required="required"/></p>
	<p>Date Received<input type="date" name="date_received" required="required"/></p>
	<p>DR/SI #<input type="number" name="dr_si" required="required"/>
	<p>Quantity<input type="number" name="quantity" value="0" onblur="recalculateSum();" id="qty" required="required"/></p>
	<p>Delivery Charge<input type="number" name="delivery_charge"/></p>
	<p>Supplier:<input type="text" name="supplier"/></p>
	<p>Product Description<textarea name="description" rows= "5" cols="10">Enter product description here.</textarea>
	<p>Unit Price<input type="number" name="unit_price" value="0" onblur="recalculateSum();" id="prc" required="required"/>
	<p>Discounts<input type="number" name="discount"/></p>
	<p>Total Amount <input id="Total" value="0"/> </p>
	<p>Mode of Payment</p>
	 <input type="radio"  onclick="javascript:yesnoCheck();" name="mode_of_payment" value="cash" id="noCheck">Cash <br>
	 <input type="radio" onclick="javascript:yesnoCheck();" name="mode_of_payment" value="check" id="yesCheck" >Check<br>
	 <div id="ifYes" style="visibility:hidden">
   	 	<p>Check Number:<input type="text" name="check"/></p>
	 </div>
	<p><input type="submit" value="add"/>
</form>
<script type="text/javascript">


function yesnoCheck() {
    if (document.getElementById('yesCheck').checked) {
        document.getElementById('ifYes').style.visibility = 'visible';
    } else {
        document.getElementById('ifYes').style.visibility = 'hidden';
    }}
  function recalculateSum()
    {
        var num1 = parseInt(document.getElementById("qty").value);
        var num2 = parseInt(document.getElementById("prc").value);
        document.getElementById("Total").value = num1 * num2;

    }
</script>

<a href="index.html">back to index</a>
</body>
</html>