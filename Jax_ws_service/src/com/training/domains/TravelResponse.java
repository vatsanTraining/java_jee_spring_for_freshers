package com.training.domains;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TravelResponse {

	private List<String> places;

	public TravelResponse() {
		super();
	}

	public TravelResponse(List<String> places) {
		super();
		this.places = places;
	}

	public List<String> getPlaces() {
		return places;
	}

	public void setPlaces(List<String> places) {
		this.places = places;
	}
	
	
}
