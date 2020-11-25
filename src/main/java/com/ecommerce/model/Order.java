package com.ecommerce.model;

public class Order {

	private String orderNumber;
	private String orderStatus;
	private String orderDate;
	
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	
	public boolean sendForShipment() {
		
		//order processing and shipment
		return true;
	}
	
	public boolean makePayment() {
		
		//proceed to payment gateway
		return true;
	}
}
