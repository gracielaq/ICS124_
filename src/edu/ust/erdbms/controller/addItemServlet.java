package edu.ust.erdbms.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.ust.erdbms.model.ProductBean;
import edu.ust.erdbms.utility.ProductBeanFactory;
import edu.ust.erdbms.utility.sql.BeanFactory;
import edu.ust.erdbms.utility.sql.SQLOperations;

@WebServlet("/addItems.html")
public class addItemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection connection;

	public void init(/* ServletConfig config */) throws ServletException {
		connection = SQLOperations.getConnection();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		try {
			
			int product_code = Integer.parseInt(request
					.getParameter("product_code"));
			Date delivery_date=request.getParameter("delivery_date");
			Date date_received=request.getParameter("date_received");
			int dR_SI=Integer.parseInt(request.getParameter("dr_si"));
			int quantity=Integer.parseInt(request.getParameter("quantity"));
			double delivery_charge=Double.parseDouble(request.getParameter("delivery_charge"));
			String supplier=request.getParameter("supplier");
			String product_description=request.getParameter("product_description");
			Double unit_price=Double.parseDouble(request.getParameter("unit_price"));
			Double discount_add=Double.parseDouble(request.getParameter("discount_add"));
			Double total_amount= Double.parseDouble(request.getParameter("total_amount"));
			String mode_of_payment=request.getParameter("mode_of_payment");
			int check_no=Integer.parseInt(request.getParameter("check_no"));
			
			
			ProductBean productbean = ProductBeanFactory.getInstance(product_code, delivery_date, date_received, dR_SI
					,quantity, delivery_charge, supplier, product_description, unit_price, discount_add, 
					total_amount, mode_of_payment, check_no);

			if (connection != null) {
				if (SQLOperations.addProduct(productbean, connection)) {
					System.out.println("item successfully inserted");
					request.setAttribute("productbean", productbean);
					//TODO
					getServletContext().getRequestDispatcher(
							"/addProductStatus.jsp?status=true").forward(request,
							response);
				} else {
					//TODO
					getServletContext().getRequestDispatcher(
							"/addProductStatus.jsp?status=false").forward(request,
							response);
				}
			} else {
				System.out.print("invalid connection");
			}

		} catch (NumberFormatException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
