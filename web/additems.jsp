<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="addItems.html" method="post">
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
<p><input type="submit" value="add"/>
</form>
<a href="index.html">back to index</a>
</body>
</html>