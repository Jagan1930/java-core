package com.learning.core.day3session1.collection4;

public class Product {
	private int productId;
	private String productName;

	public Product(int productId, String productName) {
		this.productId = productId;
		this.productName = productName;
	}

	public int getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	@Override
	public String toString() {
		return productId + productName;
	}

}
