package com.example.demo;

public class CabDriver {

	private int id;
	private String driverName;
	private double rating;
	
	public CabDriver() {
		super();
		
		System.out.println("Cab Driver Initlizaed");
		}
	public CabDriver(int id, String driverName, double rating) {
		super();
		this.id = id;
		this.driverName = driverName;
		this.rating = rating;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		System.out.println("Inside set id method");
		this.id = id;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		System.out.println("inside driver name");
		this.driverName = driverName;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		System.out.println("RATING Method called");
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "CabDriver [id=" + id + ", driverName=" + driverName + ", rating=" + rating + "]";
	}
	
	
}
