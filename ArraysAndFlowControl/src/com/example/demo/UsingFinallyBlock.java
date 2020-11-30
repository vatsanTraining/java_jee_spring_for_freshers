package com.example.demo;

public class UsingFinallyBlock {

	
	public static String getMessage(String name) {
		
		int length =0;
		try {
			  length = name.length();

		} catch (NullPointerException e) {
		   System.err.println("ERR -902 Argument 'name' may be null ");
		   return "Returning from catch";
		}
		finally {
			System.out.println("Inside Finally");
		}
		System.out.println("After Try Catch");

		return "String Length is: "+ length;
	}
}
