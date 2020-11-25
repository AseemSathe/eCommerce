package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.Cart;
import com.ecommerce.model.Item;
import com.ecommerce.model.Order;
import com.ecommerce.model.Product;
import com.ecommerce.service.CartService;

@RestController
@RequestMapping("/cart")
public class CartController {

	@Autowired
	CartService cartService;
	
	@PostMapping("/")
    public Cart create(){
        return cartService.createNewCart();
    }
	
	@PostMapping("/{id}")
    public Product addProduct(@PathVariable("id") String cartId, @RequestBody Item item){
        return cartService.addProduct(cartId, item);
    }
	
	@GetMapping("/{id}")
    public List<Item> getCartItems(@PathVariable("id") String cartId){
        return cartService.getItems(cartId);
    }
	
	@DeleteMapping("{id}/{product_id}")
    public String removeItem(@PathVariable("id") String cartId, @PathVariable("product_id") String productId){
        return cartService.removeProduct(cartId,productId);
    }

    @PostMapping("{id}/quantity")
    public String setProductQuantity(@PathVariable("id") String cartId,@RequestBody Item item){
        return cartService.setProductQuantity(cartId, item.getProductId(), item.getQuantity());
    }
    
    @PostMapping("{id}/order")
    public Order createOrder(@PathVariable("id") String cartId, @RequestBody Order order){
        if(order != null){
            return cartService.createOrder(cartId, order);
        }
            return null;
    }
}
