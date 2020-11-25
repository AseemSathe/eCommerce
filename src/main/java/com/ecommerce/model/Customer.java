package com.ecommerce.model;

public class Customer {

	private Account account;
	private Cart cart;
	private Order order;
			
	public Account getAccount() {
		return account;
	}

	public boolean addItemToCart(Item item) {
		return this.cart.addItem(item);
	}
	
	public boolean removeItemFromCart(Item item) {
		Item itemRemoved = this.cart.removeItem(item);
		if (itemRemoved !=null)
			 return true;
		return false;
	}
	
	public boolean placeOrder() {
		
		if(this.order.makePayment()) {
			return this.order.sendForShipment();
		}
		return false;
	}
}

