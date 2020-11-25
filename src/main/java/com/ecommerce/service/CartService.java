package com.ecommerce.service;

import java.util.List;

import com.ecommerce.model.Cart;
import com.ecommerce.model.Item;
import com.ecommerce.model.Order;
import com.ecommerce.model.Product;

public interface CartService {

	public Cart createNewCart();
	public Product addProduct(String cartId, Item item);
	public List<Item> getItems(String cartId);
	public String removeProduct(String cartId, String productId);
	public String setProductQuantity(String cartId, String productId, int quantity);
	public Order createOrder(String cartId, Order order);
	
}
