package com.training;


import com.training.ifaces.Display;
import com.training.services.UseNumberService;

public class Application {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName());
		
		// Creating an instance of Runnable
		
		
		try {
			new UseNumberService(10,"countToTen");

			Thread.sleep(2000);
			
			new UseNumberService(100,"countToHundred");
			
			new UseNumberService(1000,"countToThousand");

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	

		Display obj = new Display() {

			@Override
			public String showMessage() {
				return "Hello  Delhi";
			}
			
		};
		      
		Display obj2 = new Display() {

			@Override
			public String showMessage() {
				return "Hello Chennai";
			}
			
		};

		System.out.println(obj2.showMessage());
		
		DisplayImpl impl = new DisplayImpl();
		
		System.out.println(impl.showMessage());
	}

}
