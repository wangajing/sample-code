package com.jy;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		OrderDao orderDao = new OrderDao();
		orderDao.saveOrder(new FinanicalOrder(Arrays.asList(""), "BYTE"));
		ApplicationContext springContext = new ClassPathXmlApplicationContext(
				"/com/jy/spring.xml", Main.class);
		OrderService orderService = (OrderService) springContext
				.getBean("digitalOrderService");
		orderService.placeOrder(new DigitalOrder(Arrays.asList("Heloo", "hello"),
				"COD"));
		
	}
}
