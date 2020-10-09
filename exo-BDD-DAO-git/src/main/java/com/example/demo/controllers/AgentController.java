package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.AgentDAO;
import com.example.demo.entities.Agent;

@RestController
public class AgentController {
	
	@Autowired
	AgentDAO agentDAO;
	
	@RequestMapping(value = "/agent", method = RequestMethod.GET) //OK
	Agent agent(@RequestParam(name = "method", required = true, defaultValue = "id") String method,
				@RequestParam(name = "value", required = false, defaultValue = "1") String value) {
		
		Agent agent;
		
		switch (method) {
		case "agent":
			agent=agentDAO.findById(value).get();
			break;
		default:
			throw new RuntimeException("C'est CASSE");
		}
		
		return agent;
		
	}
	
	@RequestMapping(value = "/agents", method = RequestMethod.GET)
	List<Agent> agents(@RequestParam(name = "method", required = true, defaultValue = "id") String method,
						@RequestParam(name = "value", required = false) String value) {
		
		List<Agent> listAgents;
		
		switch (method) {
		case "agents": //OK
			listAgents = agentDAO.findAllAgents();
			break;
		case "nomlike": //OK
			listAgents = agentDAO.findByagentNameLike(value);
			break;
		case "complusque": //OK
			listAgents = agentDAO.findBycommissionGreaterThan(Float.valueOf(value));
			break;
		default:
			throw new RuntimeException("C'est CASSé");
		}
		return listAgents;
		
	}
		
	
}
