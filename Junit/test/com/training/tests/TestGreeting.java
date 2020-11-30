package com.training.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.training.Greeting;

@DisplayName(value="My First Junit Test Case")
class TestGreeting {

	private Greeting grtObj = new Greeting();
	
	@Test
	@Disabled("Not Used Provided by Defualt")
	void test() {
		fail("Not yet implemented");
	}

	@Test
	@DisplayName(value = "Test Message is not returning Not Null")
	void testGetMessageReturnsNotNull() {
	
		String actual = grtObj.getMessage();
		
		assertNotNull(actual);
		
		
	}
	
	@Test
	@DisplayName(value = "Test for getMessage to return Hello World")
	void testGetMessageReturnString() {
	
		String actual = grtObj.getMessage();
		
       assertEquals("Hello", actual);		
		
	}
	
	@Test
	@DisplayName(value = "Test for getMessage using assertAll")
	void testMoreThanOneCase() {
		
		assertAll(
				
				() -> assertNotNull(grtObj.getMessage()),
				() -> assertEquals(5,grtObj.getMessage().length()),
				() -> assertEquals("Hello", grtObj.getMessage())
				
				);
	}
	
	
}
