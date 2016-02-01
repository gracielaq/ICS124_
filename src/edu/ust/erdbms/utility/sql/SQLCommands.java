package edu.ust.erdbms.utility.sql;

public interface SQLCommands {

	String ADD_ITEM = "insert into Product(date_delivered, item, manufacturer, product_code, quantity, product_price, total_price) values(?,?,?,?,?,?,?)";
	String SEARCH_ITEM = "select * from product where product_code=?";
	String DELETE_ITEM = "delete from product where product_code=?";
	String GET_ALL_ITEMS = "select * from product";
	String UPDATE_ITEM = "update product set date_delivered=?, item=?, manufacturer=?,"
			+ " quantity=?, product_price=?, total_price=? where product_code=?";
	String SEARCH_STRING = "select * from Product where item like ? "
			+ "OR manufacturer like ? " + "OR quantity like ?  "
			+ " OR date_delivered like ?" + " OR product_code like ?  ";
	String ADD_SOLD = "insert into sold(item, product_code, quantity,product_price, total_price, manufacturer, date_sold) values(?,?,?,?,?,?,?)";
	String GET_ALL_SOLD = "select * from sold";

	/* LOGIN COMMANDS */
	String LOGIN_CHECK = "select username, password, email from accounts where username=? and password=?";
	String SEARCH_ADMIN = "select * from accounts where username=?";
	/* FOR Products: */
	/*
	 * CREATE TABLE `product` ( `product_code` int(11) NOT NULL, `delivery_date`
	 * datetime NOT NULL, `date_received` datetime NOT NULL, `delivery_charge`
	 * varchar(45) NOT NULL, `DR_SI` varchar(100) NOT NULL, `quantity` int(11)
	 * NOT NULL, `product_description` varchar(999) DEFAULT NULL, `unit_price`
	 * double NOT NULL, `discount` double DEFAULT NULL, `total_amount` double
	 * DEFAULT NULL, `mode_of_payment` varchar(45) NOT NULL, `supplier`
	 * varchar(200) NOT NULL, PRIMARY KEY (`product_code`) ) ENGINE=InnoDB
	 * DEFAULT CHARSET=utf8;
	 */
	String GET_ALL_PRODUCTS = "select * from product";
	String SEARCH_PRODUCT = "select * from product where product_code=?";
	String UPDATE_PRODUCT = "update product set delivery_date=?,"
			+ "date_received=?," + "delivery_charge=?," + "DR_SI=?,"
			+ "quantity=?," + "product_description=?," + "unit_price=?,"
			+ "discount=?," + "total_amount=?," + "mode_of_payment=?,"
			+ "supplier=?" + "where product_code=?";
	String ADD_PRODUCT = "insert into Product(" + "delivery_date,"
			+ "date_recieved, " + "delivery_charge," + "DR_SI, " + "quantity,"
			+ "product_description," + "unit_price," + "discount,"
			+ "total_amount," + "mode_of_payment," + "supplier,"
			+ "product_code" + ") values(?,?,?,?,?,?,?,?,?,?,?,?)";
	String SEARCH_FOR_PRODUCTS = "select * from product where delivery_date like ? OR "
			+ "date_received like ? OR "
			+ "delivery_charge like ? OR "
			+ "DR_SI like ? OR "
			+ "quantity like ? OR "
			+ "product_description like ? OR "
			+ "unit_price like ? OR "
			+ "discount like ? OR "
			+ "total_amount like ? OR "
			+ "mode_of_payment like ? OR "
			+ "supplier like ? OR"
			+ " product_code like ?";
}
