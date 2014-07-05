package com.jy;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext springContext = new ClassPathXmlApplicationContext(
				"/com/jy/spring.xml", Main.class);
		OrderService orderService = (OrderService) springContext
				.getBean("orderService");
		orderService.placeOrder(new Order(Arrays.asList("Heloo", "hello"),
				"COD"));
		
	}
}
