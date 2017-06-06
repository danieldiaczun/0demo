package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Customer;
import com.example.service.CustomerService;

@RestController
public class CustomerRestController {

	
	@Autowired
	private CustomerService customerService;

	
	@GetMapping("/customers")
	public List<Customer> getCustomers() {
		return customerService.list();
	}

	@GetMapping("/customers/{id}")
	public ResponseEntity<Object> getCustomer(@PathVariable("id") Long id) {

		Customer customer = customerService.get(id);
		if (customer == null) {
			return new ResponseEntity<Object>("No Customer found for ID " + id, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<Object>(customer, HttpStatus.OK);
	}

	@PostMapping(value = "/customers")
	public ResponseEntity<Object> createCustomer(@RequestBody Customer customer) {

		customerService.create(customer);

		return new ResponseEntity<Object>(customer, HttpStatus.OK);
	}

	@DeleteMapping("/customers/{id}")
	public ResponseEntity<Object> deleteCustomer(@PathVariable Long id) {

		if (null == customerService.delete(id)) {
			return new ResponseEntity<Object>("No Customer found for ID " + id, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<Object>(id, HttpStatus.OK);

	}

	@PutMapping("/customers/{id}")
	public ResponseEntity<Object> updateCustomer(@PathVariable Long id, @RequestBody Customer customer) {

		customer = customerService.update(id, customer);

		if (null == customer) {
			return new ResponseEntity<Object>("No Customer found for ID " + id, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<Object>(customer, HttpStatus.OK);
	}

}