package com.training.services;

import java.util.Arrays;
import java.util.List;

import javax.jws.WebService;

import com.training.domains.TravelResponse;
import com.training.ifaces.TravelService;

@WebService(endpointInterface="com.training.ifaces.TravelService")
public class TravelServiceImpl implements TravelService {

	@Override
	public String[] weekEndTrips(String city) {
		
		
		System.out.println("Calling Weekend trips");
		if(city.equals("cdg")) {
			
			return new String[]{"sukna lake","elante mall","rock garden",
					       "rosegarden"};
		} else {
			return new String[]{"Cinema","Hotel","Mall"};
		}
		
	}

	@Override
	public TravelResponse monthEndTrips(String city) {

		System.out.println("Calling Month End trips");

		TravelResponse resp =new TravelResponse();
		
        if(city.equals("cdg")) {
			
			List<String> places =Arrays.asList("Kurukshetra","Amirtsar","Dalhousie",
					       "rosegarden");
			
			resp.setPlaces(places);
		} else {
			List<String> places = Arrays.asList("Gwalior","Chennai","Hyderabad");
			resp.setPlaces(places);
		}
		return resp;
	}

}
