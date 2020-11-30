package com.training.client;

import com.training.ifaces.TravelService;
import com.training.ifaces.TravelServiceProxy;

public class Application {

	public static void print(String[] values) {
		
		for(String eachValue: values) {
			System.out.println(eachValue);
		}
	}
	public static void main(String[] args) {

		try {
			
			TravelService service = new TravelServiceProxy();
			
			String[] weekEnd = service.weekEndTrips("cng");
			
			print(weekEnd);
			
			String[] monthEnd = service.monthEndTrips("bng");
			
			print(monthEnd);
		} catch (Exception e) {
                  e.printStackTrace();
		}
	}

}
