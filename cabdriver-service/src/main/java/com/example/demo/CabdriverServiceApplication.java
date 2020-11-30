package com.example.demo;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.example.demo.daos.CabDriverDaoImpl;
import com.example.demo.entity.CabDriver;
import com.example.demo.ifaces.DataAccess;

import lombok.Data;

@SpringBootApplication
public class CabdriverServiceApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=
				  SpringApplication.run(
						  CabdriverServiceApplication.class, args);
	
	      CabDriver driver = context.getBean("cabDriver",CabDriver.class);
	      
	       driver.setId(44647);
	       driver.setDriverName("manish");
	       driver.setRating(3.5);
	   
	      DataAccess<CabDriver> dao = context.getBean(CabDriverDaoImpl.class);
	      
//	         int rowAdded = dao.add(driver);
//	      
//	      System.out.println("Row Added ="+rowAdded);
//	      
	      List<CabDriver> list = dao.findAll();
	      
	      list.forEach(System.out::println);
	      
	      context.close();

	      
//         CabDriver driverRamesh = context.getBean("driverRamesh",CabDriver.class);
//	      
//	      System.out.println(driverRamesh);
//	      
	      
//	         CabDriver driverRamesh2 = context.getBean("driverRamesh",CabDriver.class);
//
//	         System.out.println(driverRamesh2);
//	      System.out.println("is Singleton:=" +context.isSingleton("driverRamesh"));
//	      System.out.println("is prototype:="+context.isPrototype("driverRamesh"));
		      
	     
//        CabDriver driver3 = context.getBean("sujju",CabDriver.class);
//	      
//	      System.out.println(driver3);
//	     
	}

	@Bean(name="sujju")
	public CabDriver driverSuresh() {
		
		CabDriver sujju= new CabDriver();
		
		sujju.setId(2929);
		sujju.setDriverName("Suresh");
		sujju.setRating(4.2);
		
		return sujju;
	}
	
	
	
	
	
}

