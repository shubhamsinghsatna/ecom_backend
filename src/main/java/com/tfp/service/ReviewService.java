package com.tfp.service;

import java.util.List;

import com.tfp.exception.ProductException;
import com.tfp.model.Review;
import com.tfp.model.User;
import com.tfp.request.ReviewRequest;

public interface ReviewService {

	public Review createReview(ReviewRequest req,User user) throws ProductException;
	
	public List<Review> getAllReview(Long productId);
	
	
}
