package com.example.Customer.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Customer.Entity.Customer;
import com.example.Customer.Repository.CustomerRepository;


@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository repository;
	
	public Customer saveCustomer(Customer customer)
	{
		return repository.save(customer);
	}
	
	public List<Customer> saveCustomers(List<Customer> customers)
	{
		return repository.saveAll(customers);
	}
	
	public List<Customer> findCustomer()
	{
		return repository.findAll();
	}
	
	public Customer findCustomerById(int id)
	{
		return repository.findById(id).orElse(null);
	}
	
	public Customer findCustomerByName(String name)
	{
		return repository.findByName(name);
	}
	
	public String deleteCustomer(int id)
	{
		repository.deleteById(id);
		return "Delete Successfully " +id;
	}
	
	public String updateCustomer(Customer customer)
	{
		Customer existingCustomer = repository.findById(customer.getId()).orElse(null);
		existingCustomer.setName(customer.getName());
		existingCustomer.setAge(customer.getAge());
		existingCustomer.setGender(customer.getGender());
		 repository.save(existingCustomer);
		 return "Update successfully ";

	}



}
