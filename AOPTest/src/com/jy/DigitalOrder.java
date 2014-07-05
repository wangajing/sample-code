package com.jy;

import java.util.List;

public class DigitalOrder extends Order {

	public DigitalOrder(List<String> items, String shippingMethod) {
		super(items, shippingMethod);
		shippingMethod = "email";
	}

	@Override
	public void deliver() {
		System.out.println("delivered by " + getShippingMethod());		
	}

}
