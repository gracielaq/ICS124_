package edu.ust.erdbms.utility.sql;

import edu.ust.erdbms.model.ProductBean;

public class BeanFactory {
	/*FOR Products:*/
	/*
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
	 `supplier` varchar(200) NOT NULL,
	 PRIMARY KEY (`product_code`)  COMMENT '');
	 */
	
	public static ProductBean getInstance(int product_code,int quantity,
	double unit_price, double discount, 
    java.sql.Date delivery_date, java.sql.Date date_recieved,
	String delivery_charge, String DR_SI,String product_description,
	String mode_of_payment, String supplier){
		
		ProductBean bean = new ProductBean(); 
		bean.setDelivery_date(delivery_date);
		bean.setDate_recieved(date_recieved);
		bean.setDiscount(discount);
		bean.setMode_of_payment(mode_of_payment);
		bean.setDR_SI(DR_SI);
		bean.setProduct_description(product_description);
		bean.setProduct_code(product_code);
		bean.setQuantity(quantity);
		bean.setUnit_price(unit_price);
		bean.setSupplier(supplier);
		bean.compute();
		return bean;
	}
}
