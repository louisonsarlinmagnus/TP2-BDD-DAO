package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Customer;

@Repository
public interface CustomerDAO  extends CrudRepository<Customer, String> {
	
	@Query("SELECT c FROM Customer c")
	public List<Customer> findAllCustomers();
	
	//Trouver des customers par nom
	public List<Customer> findBycustNameLike(String name);
	
	//Trouver des customers par ville
	public List<Customer> findBycustCityLike(String city);
	
	//Trouver des customers par openingAtm plus grand que le paramètre
	public List<Customer> findByopeningAMTGreaterThan(Float openAMT);
	
}
