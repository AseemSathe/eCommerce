package com.ecommerce.model;

import java.util.List;

public class Cart {

	private List<Item> items;
	
	public List<Item> getItems() {
		return this.items;
	}
	
	public boolean addItem(Item item) {
		return items.add(item);
	}
	
	public Item removeItem(Item item) {
		return items.remove(items.indexOf(item));
	}
	
	public boolean updateQuantity(Item item, int quantity) {
		
		Item itemToUpdate = items.stream().filter(it -> it.getProductId().equals(item.getProductId())).findAny().orElse(null);
		if(itemToUpdate !=null) {
			itemToUpdate.updateQuantity(quantity);
			return true;
		}
		return false;
	}
}
