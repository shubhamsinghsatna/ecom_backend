package com.tfp.service;

import java.util.List;

import com.tfp.exception.ProductException;
import com.tfp.model.Rating;
import com.tfp.model.User;
import com.tfp.request.RatingRequest;

public interface RatingServices {
	
	public Rating createRating(RatingRequest req,User user) throws ProductException;
	
	public List<Rating> getProductsRating(Long productId);

}