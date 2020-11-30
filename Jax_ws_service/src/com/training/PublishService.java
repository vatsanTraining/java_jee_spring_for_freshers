package com.training;

import javax.xml.ws.Endpoint;

import com.training.ifaces.TravelService;
import com.training.services.TravelServiceImpl;

public class PublishService {

	public static void main(String[] args) {

		
		Endpoint.publish("http://localhost:4046/travel", 
				   new TravelServiceImpl());
		
		
		System.out.println("Service Publishied");
	}

}
