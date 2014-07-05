package com.jy;

import org.springframework.stereotype.Component;

@Component
public class DigitalOrderService extends OrderService {
	
	@Override
	public void doSomethingOther() {
		System.out.println("ello,world");
	}
}
