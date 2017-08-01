package com.niit.service;

import com.niit.model.Cart;
import com.niit.model.CustomerOrder;

public interface CustomerOrderService {

	public CustomerOrder createOrder(Cart cart);
	
}
