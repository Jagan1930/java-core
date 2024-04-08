package com.learning.core.Day3Session2.maps3;

import java.util.Objects;

public class Book implements Comparable<Book> {
	private int bookId;
	private String title;
	private float price;
	private String author;
	private String dateofPublication;

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDateofPublication() {
		return dateofPublication;
	}

	public void setDateofPublication(String dateofPublication) {
		this.dateofPublication = dateofPublication;
	}

	public Book(int bookId, String title, float price, String author, String string) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.price = price;
		this.author = author;
		this.dateofPublication = string;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", price=" + price + ", author=" + author
				+ ", dateofPublication=" + dateofPublication + "]";
	}

	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		return Integer.compare(this.bookId, o.bookId);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(bookId,title,price,author,dateofPublication);
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Book book = (Book) obj;
		return bookId == book.bookId && 
				Double.compare(price, book.price) == 0 &&
				Objects.equals(title, book.title) &&
				Objects.equals(author, book.author) &&
				Objects.equals(dateofPublication, book.dateofPublication);
	}

}
