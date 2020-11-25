package com.ecommerce.model;

public class Item {

	private String productId;
	private int quantity;
	private double price;
	
	public String getProductId() {
		return productId;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getPrice() {
		return price;
	}

	public void updateQuantity(int quantity) {
		this.quantity = quantity;
	}
}
