package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AGENTS")
public class Agent {
	
	@Id
	@Column(name = "AGENT_CODE", length=6, nullable = false)
	private String agentCode;
	
	@Column(name = "AGENT_NAME", length=40)
	private String agentName;
	
	@Column(name = "WORKING_AREA", length=35)
	private String workingArea;
	
	@Column(name = "COMMISSION", length=10, precision = 2)
	private Float commission;
	
	@Column(name = "PHONE_NO", length=15)
	private String phoneNo;
	
	@Column(name = "COUNTRY", length=25)
	private String country;

	public String getAgentCode() {
		return agentCode;
	}

	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public String getWorkingArea() {
		return workingArea;
	}

	public void setWorkingArea(String workingArea) {
		this.workingArea = workingArea;
	}

	public Float getCommission() {
		return commission;
	}

	public void setCommission(Float commission) {
		this.commission = commission;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	
    
}