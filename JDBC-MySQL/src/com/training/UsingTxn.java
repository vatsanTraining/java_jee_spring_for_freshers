package com.training;

import com.training.model.Invoice;
import com.training.services.CustomerService;
import com.training.utils.ConnectionUtils;
import java.sql.*;
public class UsingTxn {

	public static void main(String[] args) {
	
		Invoice inv2 = new Invoice(333,"Suhsil",2700);
				
				Connection connection = ConnectionUtils.getConnectionFromPool();
				
				System.out.println(connection.getClass().getName());
		CustomerService custService = new CustomerService(connection);
				
				custService.add(inv2);
	}

}
