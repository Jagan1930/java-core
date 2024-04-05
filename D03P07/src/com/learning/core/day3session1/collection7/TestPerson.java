package com.learning.core.day3session1.collection7;

import java.util.TreeSet;

public class TestPerson {
	public static void main(String[] args) {
        TreeSet<Person> personSet = new TreeSet<>();
        
        personSet.add(new Person(1, "Alice", 28, 50000));
        personSet.add(new Person(2, "Bob", 30, 60000));
        personSet.add(new Person(3, "Charlie", 25, 45000));
        personSet.add(new Person(4, "David", 35, 70000));
        personSet.add(new Person(5, "Eve", 22, 40000));
        personSet.add(new Person(6, "Frank", 26, 52000));

        System.out.println("Print Person whose Name in Uppercase:");
        for (Person person : personSet) {
            System.out.println("Name: " + person.getName().toUpperCase());
        }
    }

}
