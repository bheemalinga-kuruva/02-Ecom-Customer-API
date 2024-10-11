package com.bhim.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bhim.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	public Customer findByEmailAndPassword(String email, String pwd);

	public Customer findByEmail(String email);
}
