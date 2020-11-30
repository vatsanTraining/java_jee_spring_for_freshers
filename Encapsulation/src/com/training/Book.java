package com.training;

public class Book {

	/**
	 *  Camel Casing should be followed
	 *  First Character should be lowercase
	 *  Second Character Should not be uppercase
	 *  Expand the names fully as much as possible
	 */
	private int bookNumber;
	private String bookName;
	private String author;
	private double ratePerUnit;
	
	public Book() {
		// super();  you can't have both this and super it should one of the two
		this(0,"dummy","guest",0.0); // line 18 is delegating to line 21
	}

	public Book(int bookNumber, String bookName, String author, double ratePerUnit) {
		super();
		this.bookNumber = bookNumber;
		this.bookName = bookName;
		this.author = author;
		this.ratePerUnit = ratePerUnit;
	}

	public int getBookNumber() {
		return bookNumber;
	}

	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getRatePerUnit() {
		return ratePerUnit;
	}

	public void setRatePerUnit(double ratePerUnit) {
		this.ratePerUnit = ratePerUnit;
	}
	
	public String toString() {
		
		return this.bookNumber + ","+ this.bookName + ","+ this.author + ","+ this.ratePerUnit;
	}
	
	
}
