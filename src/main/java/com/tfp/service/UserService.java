package com.tfp.service;

import com.tfp.exception.UserException;
import com.tfp.model.User;

public interface UserService {
	
	public User findUserById(Long userId) throws UserException;
	
	public User findUserProfileByJwt(String jwt) throws UserException;

}
