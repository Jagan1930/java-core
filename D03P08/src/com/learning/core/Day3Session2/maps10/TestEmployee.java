package com.learning.core.Day3Session2.maps10;

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

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id: ");
		int id = sc.nextInt();
		Employee findEmployee = ht.get(id);
		if (findEmployee != null) {
			System.out.println(findEmployee);
		} else {
			System.out.println("Employee not found");
		}
	}

}
