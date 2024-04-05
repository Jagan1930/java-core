package com.learning.core.day3session1.collection2;

import java.util.HashSet;

public class TestProduct {
	public static void main(String[] args) {
		HashSet<Product> products = new HashSet<>();

		products.add(new Product(01, " Benz"));
		products.add(new Product(02, " Mahindra "));
		products.add(new Product(03, " Tata"));
		products.add(new Product(04, " Hyundai"));

		System.out.println("List of Products:");
		for (Product product : products) {
			System.out.println(product);
		}
	}

}
