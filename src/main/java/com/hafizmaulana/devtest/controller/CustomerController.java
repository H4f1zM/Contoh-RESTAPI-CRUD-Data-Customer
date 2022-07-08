package com.hafizmaulana.devtest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hafizmaulana.devtest.entities.CustomerEntity;
import com.hafizmaulana.devtest.repositories.CustomerRepository;

@RestController
@RequestMapping(value="/customer")
public class CustomerController {

	@Autowired
	CustomerRepository customerRepository ;
	
	@GetMapping(value="testAPI")
	public String testAPI() {
		return "Get CustomerController.testAPI()";
		
	}
	

	@PostMapping(value="addNewCustomer")
	public String addNewCustomer(@RequestBody CustomerEntity param) {
		customerRepository.save(param);
		return "succes Add New Customer";
		
	}
	
	@GetMapping(value="getAllCustomer")
	public List<CustomerEntity> getAllCustomer() {
		return customerRepository.findAll() ;
	}
	
	@GetMapping(value="getById")
	public CustomerEntity getById(@RequestParam Long Id) {
		return customerRepository.findById(Id).get() ;
	}
	
	
	@PutMapping(value="updateCustomer/{id}")
	public String updateCustomer(@PathVariable(value = "id") Long Id , @RequestBody CustomerEntity param) {
		
		param.setId(Id);
		customerRepository.save(param);
		//return "success Update New Customer";
		
		return "success update Id = " + param.getId() ;
	}
	
	
	@GetMapping(value="deleteCustomer")
	public String deleteCustomer(@RequestParam Long Id) {
		customerRepository.deleteById(Id);
		return "success Delete Customer id=" + Id ;
	}	
	
	
	
}
