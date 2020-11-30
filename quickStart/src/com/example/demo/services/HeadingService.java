package com.example.demo.services;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;

import com.example.entity.Store;
public class HeadingService {

	private Connection connection;
	
	
	public HeadingService(Connection connection) {
		super();
		this.connection = connection;
	}

	Map<String,Store>  headings;
	
	public HeadingService() {
	
		this.headings = new HashMap<>();
		
		
		this.headings.put("CHN", new Store("Kirana Store","Chennai",484848));
		this.headings.put("PNQ", new Store("Dmart","Kothrud",202303));
		this.headings.put("DEL", new Store("vipul mart","saketh",494949));
		this.headings.put("BOM", new Store("Reliance Mart","Andheri",484848));
	}
	
	public Store getHeading(String key) {
		
		return this.headings.get(key);
	}
	
	public int add(Store store) {
		
		
      String sql = "insert into store values(?,?,?)";
		
		int rowAdded =0;
		
		try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
			
			pstmt.setString(3, store.getStoreName());
			pstmt.setString(2, store.getLocation());
			pstmt.setInt(1, store.getPhoneNumber());
			
			rowAdded = pstmt.executeUpdate();

			
		} catch (SQLException e) {
				e.printStackTrace();
		}
						
		return rowAdded;

		
	}
}
