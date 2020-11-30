package com.example.entity;

public class Store {

	private String storeName;
	private String location;
	private int phoneNumber;
	
	
	public Store() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Store(String storeName, String location, int phoneNumber) {
		super();
		this.storeName = storeName;
		this.location = location;
		this.phoneNumber = phoneNumber;
	}
	public String getStoreName() {
		
		System.out.println("Calling Get Store Name");
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getLocation() {
		System.out.println("Calling Get Location");

		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getPhoneNumber() {
		System.out.println("Calling Get Phone Number");

		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Store [storeName=" + storeName + ", location=" + location + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
}
