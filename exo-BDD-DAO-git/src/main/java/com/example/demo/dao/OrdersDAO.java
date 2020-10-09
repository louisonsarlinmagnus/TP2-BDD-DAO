package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Orders;

@Repository
public interface OrdersDAO  extends CrudRepository<Orders, Long> {
	
	@Query("SELECT o FROM Orders o")
    public List<Orders> findAllOrders();

	//Trouver des orders par agent code
	public List<Orders> findByagentCodeLike(String codeAgent);
	
	//Trouver des orders par ordAmount plus grand que le paramètre
	public List<Orders> findByordAmountGreaterThan(Float amount);
	
	@Query("SELECT c, o, a FROM Orders o INNER JOIN Customer c ON o.custCode = c.custCode INNER JOIN Agent a ON o.agentCode = a.agentCode")
	public List<Object> afficheTout();
	
}
