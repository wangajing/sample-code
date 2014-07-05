package com.jy;

import java.util.List;

public class Order {
	private List<String> items;
	private String shippingMethod;
	public Order(List<String> items, String shippingMethod) {
		super();
		this.items = items;
		this.shippingMethod = shippingMethod;
	}
	public List<String> getItems() {
		return items;
	}
	public void setItems(List<String> items) {
		this.items = items;
	}
	public String getShippingMethod() {
		return shippingMethod;
	}
	public void setShippingMethod(String shippingMethod) {
		this.shippingMethod = shippingMethod;
	}
	
	
}
