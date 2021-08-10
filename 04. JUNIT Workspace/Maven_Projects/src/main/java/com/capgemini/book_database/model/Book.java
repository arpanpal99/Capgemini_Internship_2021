package com.capgemini.book_database.model;

import com.capgemini.book_database.user_exceptions.BookIDCannotBeNegative;
import com.capgemini.book_database.user_exceptions.BookNameCannotBeNull;
import com.capgemini.book_database.user_exceptions.PriceIsNotValidException;

public class Book {


	private int bId;
	private String bName;
	private int price;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bId;
		result = prime * result + ((bName == null) ? 0 : bName.hashCode());
		result = prime * result + price;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (bId != other.bId)
			return false;
		if (bName == null) {
			if (other.bName != null)
				return false;
		} else if (!bName.equals(other.bName))
			return false;
		if (price != other.price)
			return false;
		return true;
	}
	public Book(int bId, String bName, int price) throws BookIDCannotBeNegative, BookNameCannotBeNull, PriceIsNotValidException {
		super();
		this.bId = bId;
		this.bName = bName;
		this.price = price;
		if(this.bId < 0) 			throw new BookIDCannotBeNegative("\nBook ID can't be negative");
		if(this.bName.isEmpty())	throw new BookNameCannotBeNull("\nBook name can't be null or empty");
		if(this.price <= 0) 		throw new PriceIsNotValidException("\nPrice must be a positive value");
		
	}
	
	public int getbId() {
		return bId;
	}
	public void setbId(int bId) {
		this.bId = bId;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	

	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	
}
