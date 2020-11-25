package com.ecommerce.service;

import com.ecommerce.model.Order;

public interface OrderService {

	Order getOrder(String orderNumber);
	Order saveOrder(Order order);
	Order cancelOrder(String orderNumber);

}
