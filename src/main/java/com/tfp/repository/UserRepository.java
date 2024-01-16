package com.tfp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tfp.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findByEmail(String email);

}
