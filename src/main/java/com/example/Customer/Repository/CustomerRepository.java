package com.example.Customer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Customer.Entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer>{

	Customer findByName(String name);

}
