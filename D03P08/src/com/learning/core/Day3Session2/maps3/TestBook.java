package com.learning.core.Day3Session2.maps3;

import java.util.TreeSet;

public class TestBook {
	public static void main(String args[]) {
		TreeSet<Book> ts = new TreeSet<>();	
		
		ts.add(new Book(234, "Python", 3500f, "Martic C Brown", "2020/02/02"));
		ts.add(new Book(34, "Java", 1500f, "James Gosling", "05/11/1985"));
		ts.add(new Book(765, "C++", 1000f, "Henry", "19/11/1984"));
		ts.add(new Book(237, "Mainframe", 3500f, "Sharad", "19/05/1997"));
		ts.add(new Book(78, ".net", 2300f, "Mark J", "06/03/1984"));
		
		System.out.println("List of sets: ");
		for(Book book : ts) {
			System.out.println(book);
		}
	}

}
