package edu.ust.erdbms.utility;

import edu.ust.erdbms.model.ProductBean;
import java.sql.Date;

public class ProductBeanFactory {
	public static ProductBean getInstance(int product_code, Date delivery_date, Date date_received, int dR_SI
			,int quantity, double delivery_charge, String supplier, String product_description, double unit_price,
			double discount_add, double total_amount, String mode_of_payment, int check_no) {
		ProductBean pb = new ProductBean();
		pb.setProduct_code(product_code);
		pb.setDelivery_date(delivery_date);
		pb.setDate_recieved(date_received);
		pb.setDR_SI(dR_SI);
		pb.setQuantity(quantity);
		pb.setDelivery_charge(delivery_charge);
		pb.setSupplier(supplier);
		pb.setProduct_description(product_description);
		pb.setUnit_price(unit_price);
		pb.setDiscount_add(discount_add);
		pb.setTotal_amount(total_amount);
		pb.setMode_of_payment(mode_of_payment);
		pb.setCheck_no(check_no);
		
		return pb;
	}


}
