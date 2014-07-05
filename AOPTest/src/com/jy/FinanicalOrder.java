package com.jy;

import java.util.List;

public class FinanicalOrder extends Order {

	public FinanicalOrder(List<String> items, String shippingMethod) {
		super(items, shippingMethod);
		setShippingMethod("WIRE");
	}

	@Override
	public void deliver() {
		System.out.println("delivered by " + getShippingMethod());
	}

}
