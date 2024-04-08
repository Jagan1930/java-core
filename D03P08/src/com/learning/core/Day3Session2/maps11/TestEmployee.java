package com.learning.core.Day3Session2.maps11;

import java.util.Hashtable;
import java.util.Scanner;

public class TestEmployee {
	public static void main(String args[]) {
		Hashtable<Integer, Employee> ht = new Hashtable<Integer, Employee>();
		Employee e1 = new Employee(12, "John", "Manager", "Developer");
		Employee e2 = new Employee(76, "James", "Product Manager", "Development");
		Employee e3 = new Employee(45, "Henry", "Tester", "Testing");
		Employee e4 = new Employee(90, "Harry", "Analyst", "L&D");

		ht.put(1, e1);
		ht.put(2, e2);
		ht.put(3, e3);
		ht.put(4, e4);

		Employee newemp = new Employee(34, "Santner", "Support", "Support Engineer");
		if (!ht.containsKey(newemp.hashCode())) {
			ht.put(newemp.hashCode(), newemp);
		}

		for (Employee emp : ht.values()) {
			System.out.println(emp);
		}

	}

}
