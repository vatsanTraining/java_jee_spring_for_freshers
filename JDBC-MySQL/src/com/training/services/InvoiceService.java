package com.training.services;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import com.training.ifaces.DataAccess;
import com.training.model.Invoice;

public class InvoiceService implements DataAccess<Invoice> {

	private Connection connection;
	
	
	
	public InvoiceService(Connection connection) {
		super();
		this.connection = connection;
	}

	@Override
	public boolean add(Invoice t) {

		String sql = "insert into invoice values(?,?,?)";
		
		int rowAdded =0;
		
		try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
			
			pstmt.setInt(1, t.getInvoiceNumber());
			pstmt.setString(2, t.getCustomerName());
			pstmt.setDouble(3, t.getAmount());
			
			rowAdded = pstmt.executeUpdate();

			
		} catch (SQLException e) {
				e.printStackTrace();
		}
						
		return rowAdded==1?true:false;
	}

	@Override
	public List<Invoice> findAll() {
		String sql = "select * from  invoice ";

		List<Invoice> invoiceList = new ArrayList<>();
          try {
        		  
        		  PreparedStatement pstmt = connection.prepareStatement(sql);
        		  
			
			
			ResultSet result = pstmt.executeQuery();
			
			while(result.next()) {
			
				int invoiceNumber =result.getInt("invoiceNumber");
				String customerName = result.getString("customerName");
				double amount = result.getDouble("amount");
				
				Invoice invoice = new Invoice(invoiceNumber, customerName, amount);
				
				invoiceList.add(invoice);
			}
			
		} catch (SQLException e) {
				e.printStackTrace();
		}
		
		return invoiceList;
	}

	@Override
	public boolean remove(Invoice t) {

		
		String sql = "delete from invoice where invoiceNumber=?";

       int rowDeleted =0;
		
		try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
			
			pstmt.setInt(1, t.getInvoiceNumber());
			
			rowDeleted = pstmt.executeUpdate();
			
		} catch (SQLException e) {
				e.printStackTrace();
		}
						
		return rowDeleted==1?true:false;
		
	}

	@Override
	public List<Invoice> getSortedListBy(String field) {
		// TODO Auto-generated method stub
		return null;
	}

	public void closeConnection() {
		
		
		try {
			this.connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public int update(int key, Invoice t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Invoice findById(int key) {

	
		String sql = "select * from invoice where invoiceNumber=?";

	       Invoice foundInvoice =null;
			
			try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
				
				pstmt.setInt(1, key);
				
				ResultSet result = pstmt.executeQuery();
				
				 if(result.next()) {
					 
					 int invoiceNumber =result.getInt("invoiceNumber");
						String customerName = result.getString("customerName");
						double amount = result.getDouble("amount");
						
						foundInvoice = new Invoice(invoiceNumber, customerName, amount);
						
				 }
			} catch (SQLException e) {
					e.printStackTrace();
			}
							
			return foundInvoice;

	}
	
	
	public int[] addBatch(Invoice ...invoices) {

		String sql = "insert into invoice values(?,?,?)";
		

		int[] rows =null;
		

		try (
				PreparedStatement pstmt = connection.prepareStatement(sql);
				
				) {
			
			connection.setAutoCommit(false);

			for(Invoice eachInvoice: invoices)
			{
			pstmt.setInt(1, eachInvoice.getInvoiceNumber());
			pstmt.setString(2, eachInvoice.getCustomerName());
			pstmt.setDouble(3, eachInvoice.getAmount());
			
               pstmt.addBatch();
			}
			
			  
		     rows = pstmt.executeBatch();
		     connection.commit();
		     connection.setAutoCommit(true);

		} catch (SQLException e) {
				e.printStackTrace();
		}
						
		return rows;
	}

}
