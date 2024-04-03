package com.learning.core.day1session1;

public class ImplementBooks {
	public static void main(String args[]) {
		Book book = new Book("Java Programming", 350);
		System.out.println("Book Title: "+book.getBook_title()+" and Price: "+book.getBook_price());
	}

}
