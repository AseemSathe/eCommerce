package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.Order;
import com.ecommerce.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	@GetMapping("/{id}")
	public Order view(@PathVariable("id") String orderNumber) {
		
		return orderService.getOrder(orderNumber);
	}
	
	@PostMapping(value = "/{id}")
    public Order edit(@PathVariable("id") String orderNumber, @RequestBody Order order){

        Order updatedOrder = orderService.getOrder(orderNumber);

        if(updatedOrder== null){ //custom implementation of edit order
            return null;
        }


        return orderService.saveOrder(order);
    }
	
	@GetMapping("/{id}")
	public Order cancelOrder(@PathVariable("id") String orderNumber) {
		
		return orderService.cancelOrder(orderNumber);
	}
}
