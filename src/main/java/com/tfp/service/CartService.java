package com.tfp.service;

import com.tfp.exception.ProductException;
import com.tfp.model.Cart;
import com.tfp.model.User;
import com.tfp.request.AddItemRequest;

public interface CartService {
	
	public Cart createCart(User user);
	
	public String addCartItem(Long userId,AddItemRequest req) throws ProductException;
	
	public Cart findUserCart(Long userId);

}

//2:03