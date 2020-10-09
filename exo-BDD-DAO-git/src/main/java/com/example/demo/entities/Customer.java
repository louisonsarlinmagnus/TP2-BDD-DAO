package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMER")
public class Customer {
	
	@Id
	@Column(name = "CUST_CODE", length=6, nullable = false)
	private String custCode;
	
	@Column(name = "CUST_NAME", length=40, nullable = false)
	private String custName;
	
	@Column(name = "CUST_CITY", length=35)
	private String custCity;
	
	@Column(name = "WORKING_AREA", length=35, nullable = false)
	private String workingArea;
	
	@Column(name = "CUST_COUNTRY", length=20, nullable = false)
	private String custCountry;
	
	@Column(name = "GRADE")
	private Long grade;
	
	@Column(name = "OPENING_AMT", length=12, precision = 2, nullable = false)
	private Float openingAMT;
	
	@Column(name = "RECEIVE_AMT", length=12, precision = 2,  nullable = false)
	private Float receiveAMT;
	
	@Column(name = "PAYMENT_AMT", length=12, precision = 2,  nullable = false)
	private Float paymentAMT;
	
	@Column(name = "OUTSTANDING_AMT", length=12, precision = 2,  nullable = false)
	private Float outstandingAMT;
	
	@Column(name = "PHONE_NO", length=17, nullable = false)
	private String phoneNo;
	
	@Column(name = "AGENT_CODE", length=6, nullable = false)
	private String agentCode;

	public String getCustCode() {
		return custCode;
	}

	public void setCustCode(String custCode) {
		this.custCode = custCode;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustCity() {
		return custCity;
	}

	public void setCustCity(String custCity) {
		this.custCity = custCity;
	}

	public String getWorkingArea() {
		return workingArea;
	}

	public void setWorkingArea(String workingArea) {
		this.workingArea = workingArea;
	}

	public String getCustCountry() {
		return custCountry;
	}

	public void setCustCountry(String custCountry) {
		this.custCountry = custCountry;
	}

	public Long getGrade() {
		return grade;
	}

	public void setGrade(Long grade) {
		this.grade = grade;
	}

	public Float getOpeningAMT() {
		return openingAMT;
	}

	public void setOpeningAMT(Float openingAMT) {
		this.openingAMT = openingAMT;
	}

	public Float getReceiveAMT() {
		return receiveAMT;
	}

	public void setReceiveAMT(Float receiveAMT) {
		this.receiveAMT = receiveAMT;
	}

	public Float getPaymentAMT() {
		return paymentAMT;
	}

	public void setPaymentAMT(Float paymentAMT) {
		this.paymentAMT = paymentAMT;
	}

	public Float getOutstandingAMT() {
		return outstandingAMT;
	}

	public void setOutstandingAMT(Float outstandingAMT) {
		this.outstandingAMT = outstandingAMT;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getAgentCode() {
		return agentCode;
	}

	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}
	
	

}
