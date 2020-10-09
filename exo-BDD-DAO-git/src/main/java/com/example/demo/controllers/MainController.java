package com.example.demo.controllers;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.PersonDAO;
import com.example.demo.entities.Person;




@RestController
public class MainController {
	
	@Autowired
	PersonDAO personDAO;
	
	@RequestMapping(value = "/person", method = RequestMethod.GET)
	Person person(@RequestParam(name = "method", required = true, defaultValue = "id") String method, @RequestParam(name = "value", required = false, defaultValue = "1") String value) {
		
		Person person;
		
		switch (method) {
		case "person":
			person=personDAO.findById(Long.valueOf(value)).get();
			break;
		default:
			throw new RuntimeException("C'est CASSE");
		}
		
		return person;
		
	}
	
	@RequestMapping(value = "/persons", method = RequestMethod.GET)
	List<Person> persons(@RequestParam(name = "method", required = true, defaultValue = "id") String method, @RequestParam(name = "value", required = false) String value) {
		List<Person> listPersons;
		
		switch (method) {
		case "persons":
			listPersons = personDAO.findAllPersons();
			break;
		case "nomlike":
			listPersons = personDAO.findByFullNameLike(value);
			break;
		case "s":
			listPersons = personDAO.findNameStartingByS();
			break;
		default:
			throw new RuntimeException("C'est CASSé");
		}
		return listPersons;
		
	}
	
	@RequestMapping(value = "/lejcestles", method = RequestMethod.GET)
	List<Person> lejcestles(){
		
		return personDAO.findNameStartingByS();
		
	}
	
	
	
}
