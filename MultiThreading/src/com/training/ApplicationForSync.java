package com.training;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.training.services.UsePrintService;

public class ApplicationForSync {

	public static void main(String[] args) {

		
//		new UsePrintService("Idly", "Sambar");
//		new UsePrintService("Pizza", "Coke");
//		new UsePrintService("Parantha", "Dahi");
//		new UsePrintService("Poori", "Sagoo");
//		
		
		  ExecutorService service = Executors.newSingleThreadExecutor();
		  
		  service.execute(new UsePrintService("Idly", "Sambar"));
		  service.execute(new UsePrintService("Parantha", "Dahi"));
		  service.execute(new UsePrintService("Pizza", "Coke"));
		 service.execute(new UsePrintService("Poori", "Sagoo"));
		  
		  
		  service.shutdown();
		  
	}

}
