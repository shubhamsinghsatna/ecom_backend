package com.tfp.service;

import com.tfp.exception.CartItemException;
import com.tfp.exception.UserException;
import com.tfp.model.Cart;
import com.tfp.model.CartItem;
import com.tfp.model.Product;

public interface CartItemService {
	
public CartItem createCartItem(CartItem cartItem);
	
	public CartItem updateCartItem(Long userId, Long id,CartItem cartItem) throws CartItemException, UserException;
	
	public CartItem isCartItemExist(Cart cart,Product product,String size, Long userId);
	
	public void removeCartItem(Long userId,Long cartItemId) throws CartItemException, UserException;
	
	public CartItem findCartItemById(Long cartItemId) throws CartItemException;

}
