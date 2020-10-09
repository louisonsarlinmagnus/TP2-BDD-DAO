package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.CustomerDAO;
import com.example.demo.entities.Customer;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerDAO customerDAO;
	
	@RequestMapping(value = "/customer", method = RequestMethod.GET)
	Customer customer(@RequestParam(name = "method", required = true, defaultValue = "id") String method, @RequestParam(name = "value", required = false, defaultValue = "1") String value) {
		
		Customer customer;
		
		switch (method) {
		case "customer"://OK
			customer = customerDAO.findById(String.valueOf(value)).get();
			break;
		default:
			throw new RuntimeException("C'est CASSE");
		}
		
		return customer;
		
	}
	
	@RequestMapping(value = "/customers", method = RequestMethod.GET)
	List<Customer> customers(@RequestParam(name = "method", required = true, defaultValue = "id") String method, @RequestParam(name = "value", required = false) String value) {
		List<Customer> listCustomers;
		
		switch (method) {
		case "customers": //OK
			listCustomers = customerDAO.findAllCustomers();
			break;
		case "nomlike": //OK
			listCustomers = customerDAO.findBycustNameLike(value);
			break;
		case "custcitylike"://OK
			listCustomers = customerDAO.findBycustCityLike(value);
			break;
		case "opengreaterthan": //OK
			listCustomers = customerDAO.findByopeningAMTGreaterThan(Float.valueOf(value));
			break;
		default:
			throw new RuntimeException("C'est CASSé");
		}
		return listCustomers;
		
	}
	
	
	
}
