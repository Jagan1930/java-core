package com.learning.core.day3session1.collection4;

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
		System.out.print("Remove Particular Prodcut : ");
		int productIdToRemove  = sc.nextInt();
		Product productToRemove = null;
		for (Product product : products) {
			if (product.getProductId() == productIdToRemove) {
				productToRemove = product;
				break;
			}
		}
		if (productToRemove != null) {
			products.remove(productToRemove);
            //System.out.println(productIdToRemove);
        } else {
            System.out.println("Not Found");
        }
		for (Product product : products) {
            System.out.println(product);
        }
	}
}
