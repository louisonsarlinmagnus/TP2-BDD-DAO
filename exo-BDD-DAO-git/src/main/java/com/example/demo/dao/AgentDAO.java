package com.example.demo.dao;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Agent;

@Repository
public interface AgentDAO extends CrudRepository<Agent, String> {
	
	@Query("SELECT a FROM Agent a")
    public List<Agent> findAllAgents();

	//Trouver des agents du même nom
	public List<Agent> findByagentNameLike(String name);
	
	//Trouver des agents à la commission plus grande que la valeur en paramètre
	public List<Agent> findBycommissionGreaterThan(Float com);
	
	//Trouver des agents par Working Area
	public List<Agent> findByworkingAreaLike(String wa);
	
}
