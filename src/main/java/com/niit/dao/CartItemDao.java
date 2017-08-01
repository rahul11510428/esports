package com.niit.dao;

import com.niit.model.Cart;
import com.niit.model.CartItem;

public interface CartItemDao {

	
	public void addCartItem(CartItem cartItem);
	
	public  void removeCartItem(int cartItemId);
	
	public void removeAllCartItem(int cardId);
	
	public Cart getCartBycartId(int cartId);
	
}
