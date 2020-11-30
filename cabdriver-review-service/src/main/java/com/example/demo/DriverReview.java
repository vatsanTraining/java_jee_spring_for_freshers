package com.example.demo;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class DriverReview {

	private int reviewId;
	private int driverId;
	private double punctuality;
	private double cleanliness;
	private String reviewedBy;
	
	
	
}
