package com.training.utils;

import java.sql.*;
import java.util.Properties;

import javax.sql.DataSource;

//import com.zaxxer.hikari.HikariConfig;
//import com.zaxxer.hikari.HikariDataSource;

import java.io.*;
public class ConnectionUtils {

	
	public static Connection getMySqlConnection() {
		
		Connection connection = null;
		
		 
		 try  {
			
			   String[] values =getPropsAsArray();
			 connection = DriverManager.getConnection(values[0],values[1],values[2]);
			 
		} catch (IOException  | SQLException  | ClassNotFoundException e ) {
					e.printStackTrace();
		} 
		 		 
		 return connection;
	}
	
		private static String[] getPropsAsArray() throws IOException, ClassNotFoundException {
		
		 String fileName = "resources/DbConnection.properties";
			
		 InputStream stream = ConnectionUtils.class.getClassLoader().
		                                      getResourceAsStream(fileName);
		
	  Properties props = new Properties();
		
		 props.load(stream);
		
		 Class.forName(props.getProperty("database.driverClass"));
		 
		 
		 String url =props.getProperty("database.url");
		 String passWord =props.getProperty("database.passWord");
		 String userName =props.getProperty("database.userName");
	
		 return new String[] {url,userName,passWord};
	}
		
		
//		public static Connection getConnectionFromPool() {
//			
//			Connection connection =null;
//			
//			try {
//				
//				HikariConfig config = new HikariConfig();
//				
//				 String[] values = getPropsAsArray();
//				config.setJdbcUrl(values[0]);
//				config.setUsername(values[1]);
//				config.setPassword(values[2]);
//				config.addDataSourceProperty("maximumPoolSize", "25");
//				
//				DataSource dataSource = new HikariDataSource(config);
//				
//				connection =dataSource.getConnection();
//				
//			} catch (SQLException | IOException e) {
//                  e.printStackTrace();
//			}
//			return connection;
//			
//		}
	}
