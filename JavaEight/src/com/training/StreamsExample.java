package com.training;
import java.util.*;
import java.util.stream.*;

import com.training.model.Student;
public class StreamsExample {

	
	public static List<Student> getStudents(){
		
		Student ankit = new Student(101, "Rahul", 78, 9884884);
		Student arjun = new Student(102, "Arjun", 89, 8886884);
		Student gourav = new Student(120, "Ganesh", 68, 88784980);
		Student rishi = new Student(98, "Rishi", 98, 68824884);
		Student rahul = new Student(202, "Ankit", 48, 747472);
		
	return Arrays.asList(ankit,arjun,gourav,rishi,rahul);
	
	}
	public static void main(String[] args) {

		
		System.out.println("Student Who Score More than 70");
		
		
		List<Student> moreThanSeventy = 
					getStudents().stream().
				filter(eachStudent -> eachStudent.getMarkScored()>70).
				  collect(Collectors.toList());
		
		moreThanSeventy.forEach(System.out::println);
		
		
		System.out.println("Student List With Name and Phone Number");

		  Map<String,Long> nameWithPhone = 
				  
				     getStudents().stream().
				          filter(eachStudent -> eachStudent.getMarkScored()>60).
				          collect(Collectors.toMap(Student::getName, Student::getMobileNumber));
		  
		  nameWithPhone.forEach( (key,value)->{
			          System.out.println(key);
			           System.out.println(value);
			           }
		  );
	
		  System.out.println("Using Terminal Operator");
		
					getStudents().stream().
				filter(eachStudent -> eachStudent.getMarkScored()>70)
				                    .forEach(System.out::println);
		
		
			System.out.println("Printing in Sorted Way");		
		
			getStudents().stream().
			         sorted(Comparator.comparing(Student::getName)).
			                  forEach(System.out::println);
			
			Comparator<Student> maxComp = Comparator.comparing(Student::getMarkScored);
			
			Optional<?> highestMark = getStudents().stream().max(maxComp);
			
			if(highestMark.isPresent()) {
				
				Student stud = (Student)highestMark.get();
				
				System.out.println("Student with Highest Score \t"+ stud.getName() + stud.getMarkScored());
				
			}
			
	}

}
