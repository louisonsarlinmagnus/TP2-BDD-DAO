package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.OrdersDAO;
import com.example.demo.entities.Orders;

@RestController
public class OrdersController {
	
	@Autowired
	OrdersDAO ordersDAO;
	
	@RequestMapping(value = "/order", method = RequestMethod.GET)
	Orders orders(@RequestParam(name = "method", required = true, defaultValue = "id") String method, @RequestParam(name = "value", required = false, defaultValue = "1") String value) {
		
		Orders order;
		
		switch (method) {
		case "order": //OK
			order=ordersDAO.findById(Long.valueOf(value)).get();
			break;
		default:
			throw new RuntimeException("C'est CASSE");
		}
		
		return order;
		
	}
	
	@RequestMapping(value = "/orders", method = RequestMethod.GET)
	List<Orders> customers(@RequestParam(name = "method", required = true, defaultValue = "id") String method, @RequestParam(name = "value", required = false) String value) {
		List<Orders> listOrders;
		
		switch (method) {
		case "orders": //OK
			listOrders = ordersDAO.findAllOrders();
			break;
		case "agentcodeestcomme": //OK
			listOrders = ordersDAO.findByagentCodeLike(value);
			break;
		case "ordamountplusque": //OK
			listOrders = ordersDAO.findByordAmountGreaterThan(Float.valueOf(value));
			break;
		default:
			throw new RuntimeException("C'est CASSé");
		}
		return listOrders;
		
	}
	

	
	@RequestMapping(value = "/tout", method = RequestMethod.GET)
	List<Object> lejcestles(){
		
		return ordersDAO.afficheTout();
		
	}
	
}
