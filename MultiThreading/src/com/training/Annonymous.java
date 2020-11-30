package com.training;

import java.io.IOException;

public class Annonymous extends Thread {

	@Override
	public void run() {
		 System.out.println("Reading");
		 
		 try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		 
			System.out.println("Finsihed Reading"); 

	 }
	}

	

