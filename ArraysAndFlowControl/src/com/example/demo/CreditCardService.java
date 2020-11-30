package com.example.demo;

public class CreditCardService {

	
	// declaring
	private CreditCard[] cardList;
	private static int idxPos = 0;

	public CreditCardService() {
		super();
		//initialization
       this.cardList =new CreditCard[5];
	}
	public CreditCard[] getCardList() {
		return cardList;
	}
	public void setCardList(CreditCard[] cardList) {
		this.cardList = cardList;
	}
	public boolean addCard(CreditCard card) {
		
		boolean result = true;
		
		if(idxPos<5) {
		   this.cardList[idxPos]= card;
		   
		   idxPos++;
		} else {
			result =false;
		}
		return result;   
	}
	

}
