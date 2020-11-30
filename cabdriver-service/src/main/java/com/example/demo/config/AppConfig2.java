package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.entity.Address;

@Configuration
public class AppConfig2 {

	@Bean()
	public Address address2() {
		
				return new Address("Patel Street","Sarvarkar Nagar","chennai",384838);
	}
}
