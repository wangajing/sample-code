package com.jy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class OrderService {
	@Autowired
	private OrderDao orderDao;
	
	public void placeOrder(Order order){
		orderDao.saveOrder(order);
		order.deliver();
	}
}
