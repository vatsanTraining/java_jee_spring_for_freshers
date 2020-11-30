package com.training;

public class Application {

	public static void main(String[] args) {

		Book headFirst = new Book();
		
		
		Book spring = new Book(101,"Spring in Action","vicky",780.00);
		
		System.out.println(spring.getBookNumber());
		
		System.out.println(spring.getRatePerUnit());
		
		
		System.out.println(headFirst.getBookNumber());
		System.out.println(headFirst.getRatePerUnit());
		
		
		Book jee = new Book();
		
		jee.setBookNumber(201);
		jee.setBookName("Java Enterprise Edition");
		jee.setAuthor("Ramesh");
		jee.setRatePerUnit(290.00);
		
		
		System.out.println(jee.getRatePerUnit());
		
		System.out.println(jee.toString());
	}

}
