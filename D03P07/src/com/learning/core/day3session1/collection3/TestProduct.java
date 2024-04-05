package com.learning.core.day3session1.collection3;

import java.util.HashSet;
import java.util.Scanner;

import com.learning.core.day3session1.collection2.Product;

public class TestProduct {
	public static void main(String[] args) {
		HashSet<Product> products = new HashSet<>();

		products.add(new Product(01, " Benz"));
		products.add(new Product(02, " Mahindra "));
		products.add(new Product(03, " Tata"));
		products.add(new Product(04, " Hyundai"));
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Particular Prodcut : ");
		int searchProductId = sc.nextInt();
		for (Product product : products) {
			if (product.getProductId() == searchProductId) {
				System.out.println("Product found: " + product.getProductName());
				break;
			}
		}
	}
}
