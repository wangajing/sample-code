package com.jy;

import org.springframework.stereotype.Repository;

@Repository
public class OrderDao {

	public void saveOrder(Order order) {
		System.out.println("saved to order to database");
	}

}
