package com.ecommerce.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.Product;
import com.ecommerce.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductService productService;
	
	@PostMapping
	public Product add(@RequestBody Product product) {
		
		
		return productService.addProduct(product);
	}
	
	@GetMapping("/{id}")
	public Product view(@PathVariable("id") String productId) {
		
		return productService.getProduct(productId);
	}
	
	@GetMapping("/filterProducts")
	public List<Product> filterProducts(@RequestParam Map<String, String> params) {
		
		//productService.getFilteredProducts(params);
		return null;
	}
	
	@PostMapping
	public Product edit(@RequestBody Product product) {
		
		Product updatedProduct = new Product(); //productService.getProduct(product.getProductId())
		
		updatedProduct.setAvailableQuantity(product.getAvailableQuantity());
		updatedProduct.setPrice(product.getPrice());
		//we can add provide more options to edit
		
		return productService.addProduct(updatedProduct);
	}
		
}
