<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Product</title>
</head>
<body>
<form action="addItems.html" method="post">
<<<<<<< HEAD
	
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
	<p>Check Number:<input type="text" name="check"/></p>
=======
<!-- 
CREATE TABLE `ProductsDB`.`Product` (
  `product_code` INT NOT NULL COMMENT '',
  `delivery_date` DATETIME NOT NULL COMMENT '',
  `date_received` DATETIME NOT NULL COMMENT '',
  `delivery_charge` VARCHAR(45) NOT NULL COMMENT '',
  `DR_SI` VARCHAR(100) NOT NULL COMMENT '',
  `quantity` INT NOT NULL COMMENT '',
  `product_description` VARCHAR(999) NULL COMMENT '',
  `unit_price` DOUBLE NOT NULL COMMENT '',
  `discount` DOUBLE NULL COMMENT '',
  `total_amount` DOUBLE NULL COMMENT '',
  `mode_of_payment` VARCHAR(45) NOT NULL COMMENT '',
  PRIMARY KEY (`product_code`)  COMMENT '');
 -->
<p>product code<input type="text" name="item" required="required"/></p>
<p>delivery date<input type="number" name="product_price" required="required"/>
<p>date_recieved<input type="number" name="quantity" required="required"/></p>
<p>delivery charge<input type="number" name="product_code" required="required"/></p>
<p>DR_SI<input type="text" name="DR_SI" required="required"/></p>
<p>quantity<input type="number" step="1" name="quantity" required="required"/></p>
>>>>>>> origin/master
<p><input type="submit" value="add"/>
</form>
<script>
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