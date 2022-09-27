package com.example.Customer.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Customer.Entity.Customer;
import com.example.Customer.Service.CustomerService;


@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	
	@PostMapping("/Customer")
	public Customer addCustomer(@RequestBody Customer customer)
	{
		return service.saveCustomer(customer);
	}
	@PostMapping("/ListCustomer")
	public List<Customer> addCustomers(@RequestBody List<Customer> customers)
	{
		return service.saveCustomers(customers);
	}
	
	@GetMapping("/getCustomer")
	public List<Customer> getCustomer()
	{
		return service.findCustomer();
	}
	
	@GetMapping("/getCustomerrById/{id}")
	public Customer getCustomerById(@PathVariable int id)
	{
		return service.findCustomerById(id);
	}
	
	@GetMapping("/getCustomerByName/{id}")
	public Customer getCustomerByName(@PathVariable String name)
	{
		return service.findCustomerByName(name);
	}
	
	@PutMapping("/updateCustomer")
	public String updateEmployee(@RequestBody Customer customer)
	{
		return service.updateCustomer(customer);
	}
	
	@DeleteMapping("/deleteCustomer/{id}")
	public String deleteCustomer(@PathVariable int id)
	{
		return service.deleteCustomer(id);
	}


}
