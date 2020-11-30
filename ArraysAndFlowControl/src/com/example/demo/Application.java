package com.example.demo;

public class Application {

	public static void main(String[] args)  {

		
		CreditCardService service = new CreditCardService();
		
		try {
			
		CreditCard card1 = new CreditCard(101, "Ramesh", 100000.00);
		CreditCard card2 = new CreditCard(102, "Rajesh", 200000.00);
		CreditCard card3 = new CreditCard(103, "Rakesh", 500000.00);
		CreditCard card4 = new CreditCard(104, "Ravish", 700000.00);
		CreditCard card5 = new CreditCard(105, "Rahul",  1000000.00);
		
		
		service.addCard(card1);
		service.addCard(card2);
		service.addCard(card3);
		service.addCard(card4);
		service.addCard(card5);
		

		boolean result1= service.addCard(card5);
		boolean result2 =service.addCard(card5);

		System.out.println(result1 +"," +result2 );
		
		CreditCard[] cardList = service.getCardList();
		
		for(CreditCard eachCard:cardList) {
			if(eachCard !=null) {
			   System.out.println(eachCard.getCardHolderName());
			}
		}
		}catch(Exception e) {
			
			System.err.println(e.getMessage());
		}
		CreditCard card6 = new CreditCard();
		
		 card6.setCardHolderName("manish");
		 card6.setCardNumber(485858);
		 
		 
		 try {
			card6.setCreditLimit(500000);
		} catch (Exception e) {

			e.printStackTrace();
		}
		 
		 String name = "Ramesh";
		 
		System.out.println(UsingFinallyBlock.getMessage(name));
		
		String name2 = null;
		
		System.out.println(UsingFinallyBlock.getMessage(name2));
	}

}

/*
 *   Refactor the Business service in such a way that if the alloted size is 
 *   reached the Array size is also changed to double the current Size 
 *   and the elements are added to the array.
 * 
 */


