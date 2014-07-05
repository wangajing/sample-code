package com.jy;

import org.springframework.stereotype.Component;

@Component
public class DigitalOrderService extends OrderService {
	@Override
	public void placeOrder(Order order) {
		// TODO Auto-generated method stub
		super.placeOrder(order);
		doSomethingdifferent();
	}

	private void doSomethingdifferent() {
		// TODO Auto-generated method stub
		
	}
}
