package edu.ust.erdbms.model;

public class SoldBean{
	
	 /*FOR SELL:
	  CREATE TABLE `Sell` (
	  `product_code` int(11) NOT NULL,
	  `unit_price` double NOT NULL,
	  `quantity` int(11) NOT NULL,
	  `product_description` varchar(999) DEFAULT NULL,
	  `discount_sell` double DEFAULT NULL,
	  `total_amount` double DEFAULT NULL,
	  `note_quantity` int(11) DEFAULT NULL,
	  `note_description` varchar(999) DEFAULT NULL,
	  `customer_name` varchar(200) NOT NULL,
	  `tin` varchar(200) NOT NULL,
	  `address` varchar(200) NOT NULL,
	  `date` datetime NOT NULL,
	  `mode_of_payment` varchar(45) NOT NULL,
	  PRIMARY KEY (`product_code`)
	) ENGINE=InnoDB DEFAULT CHARSET=latin1;*/
	
	private int product_code;
	private double unit_price;
	private int quantity;
	private String product_description;
	private double discount_sell;
	private double total_amount;
	private int note_quantity;
	private String note_description;
	private String customer_name;
	private String tin;
	private String address;
	private java.sql.Date date;
	private String mode_of_payment;
	
	public void compute()
	{
		
			// (QTY * Unit Price) � (QTY* Unit Price*Discount)
			setTotal_amount((getQuantity() * getUnit_price())
					- (getQuantity() * getUnit_price() * getDiscount_sell()));
		
	}
	public int getProduct_code() {
		return product_code;
	}
	public void setProduct_code(int product_code) {
		this.product_code = product_code;
	}
	public double getUnit_price() {
		return unit_price;
	}
	public void setUnit_price(double unit_price) {
		this.unit_price = unit_price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getProduct_description() {
		return product_description;
	}
	public void setProduct_description(String product_description) {
		this.product_description = product_description;
	}
	public double getDiscount_sell() {
		return discount_sell;
	}
	public void setDiscount_sell(double discount_sell) {
		this.discount_sell = discount_sell;
	}
	public double getTotal_amount() {
		return total_amount;
	}
	public void setTotal_amount(double total_amount) {
		this.total_amount = total_amount;
	}
	public int getNote_quantity() {
		return note_quantity;
	}
	public void setNote_quantity(int note_quantity) {
		this.note_quantity = note_quantity;
	}
	public String getNote_description() {
		return note_description;
	}
	public void setNote_description(String note_description) {
		this.note_description = note_description;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getTin() {
		return tin;
	}
	public void setTin(String tin) {
		this.tin = tin;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public java.sql.Date getDate() {
		return date;
	}
	public void setDate(java.sql.Date date) {
		this.date = date;
	}
	public String getMode_of_payment() {
		return mode_of_payment;
	}
	public void setMode_of_payment(String mode_of_payment) {
		this.mode_of_payment = mode_of_payment;
	}
	
	

}
