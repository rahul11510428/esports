package com.niit.dao;

import com.niit.model.Cart;
import com.niit.model.CustomerOrder;

public interface CustomerOrderDao {

	
	public CustomerOrder createOrder(Cart cart);
}
