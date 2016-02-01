package edu.ust.erdbms.model;

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
  `supplier` varchar(100) NOT NULL,
  PRIMARY KEY (`product_code`)  COMMENT '');
*/

public class ProductBean {
	private int product_code, 
	quantity;
	private double unit_price,
	discount,
	total_amount;
	private java.sql.Date delivery_date,
	date_recieved;
	private String delivery_charge,
	DR_SI, 
	product_description,
	mode_of_payment,
	supplier;
	
	public void compute(){
		//(QTY * Unit Price) ­ (QTY* Unit Price*Discount)
		setTotal_amount((getQuantity()*getUnit_price())-(getQuantity()*getUnit_price()*getDiscount()));
	}
	public int getProduct_code() {
		return product_code;
	}
	public void setProduct_code(int product_code) {
		this.product_code = product_code;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getUnit_price() {
		return unit_price;
	}
	public void setUnit_price(double unit_price) {
		this.unit_price = unit_price;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getTotal_amount() {
		return total_amount;
	}
	public void setTotal_amount(double total_amount) {
		this.total_amount = total_amount;
	}
	public java.sql.Date getDelivery_date() {
		return delivery_date;
	}
	public void setDelivery_date(java.sql.Date delivery_date) {
		this.delivery_date = delivery_date;
	}
	public java.sql.Date getDate_recieved() {
		return date_recieved;
	}
	public void setDate_recieved(java.sql.Date date_recieved) {
		this.date_recieved = date_recieved;
	}
	public String getDelivery_charge() {
		return delivery_charge;
	}
	public void setDelivery_charge(String delivery_charge) {
		this.delivery_charge = delivery_charge;
	}
	public String getDR_SI() {
		return DR_SI;
	}
	public void setDR_SI(String dR_SI) {
		DR_SI = dR_SI;
	}
	public String getProduct_description() {
		return product_description;
	}
	public void setProduct_description(String product_description) {
		this.product_description = product_description;
	}
	public String getMode_of_payment() {
		return mode_of_payment;
	}
	public void setMode_of_payment(String mode_of_payment) {
		this.mode_of_payment = mode_of_payment;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	
	
	
	
}
