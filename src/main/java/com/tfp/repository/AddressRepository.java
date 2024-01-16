package com.tfp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tfp.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
