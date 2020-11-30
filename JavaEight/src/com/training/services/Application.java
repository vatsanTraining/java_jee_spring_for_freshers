package com.training.services;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import com.training.ifaces.Converter;

public class Application {

	public static void main(String[] args) {
	
		
		Converter<String, String> trimmer = new Converter<String, String>() {

			@Override
			public String convert(String t) {
				return t.substring(0, 3);
			}
			
			
		};
		
		System.out.println(trimmer.convert("HelloWorld"));
		
		FuncationalJava func = new FuncationalJava();
		
		Converter<Double, Double> conv1 = (val) -> val * 75; 
		
		double resp =func.useConverter(conv1, 100.00);
		
		System.out.println(resp);
		
		double resp2 =func.useConverter((far)-> (far-32)  *5/9 , 45);
		
		System.out.println(resp2);
		
		
		Converter<String, String> trimmer2 = (s)-> s.substring(0,3);
		
		System.out.println(trimmer2.convert("Geek"));
		
		
		List<String> list =Arrays.asList("Ramesh","Siva","Sundar","Suresh","Magesh");
	
//		list.forEach( e ->System.out.println(e) );
//		
//		                             // test method arg   //body   of test method overiden below
//		Predicate<String> testForSH= (arg) -> arg.contains("sh") ;
//		
//		System.out.println("=============");
//		for(String eachString :list) {
//			
//			 if(testForSH.test(eachString)){
//				 
//				 System.out.println(eachString);
//			 }
//		}
		
		list.forEach(System.out::println);
		
		list.forEach(FuncationalJava::show);
	}
	
	

}
