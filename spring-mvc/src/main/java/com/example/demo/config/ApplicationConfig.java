package com.example.demo.config;



import javax.sql.DataSource;

//import javax.sql.DataSource;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Address;
import com.example.demo.entity.CabDriver;


@Configuration
public class ApplicationConfig {

	
	
	@Bean
	public DataSource  dataSource() {
			DriverManagerDataSource dataSource = 
				     new DriverManagerDataSource();
		    
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/test");
		dataSource.setUsername("root");
		dataSource.setPassword("srivatsan");
			return dataSource;
		}
		@Bean
	public JdbcTemplate template() {
		
					return new JdbcTemplate(dataSource());

	}
	
	@Bean
	public ModelAndView mdlview() {
		
		return new ModelAndView();
	}
}
