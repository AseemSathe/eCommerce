package com.ecommerce.service;

import java.util.List;
import java.util.Map;

import com.ecommerce.model.Product;

public interface ProductService {

	public Product addProduct(Product product);
	public Product getProduct(String productId);
	public List<Product> getFilteredProducts(Map<String, String> params);	
}
