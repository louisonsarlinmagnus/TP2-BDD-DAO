package com.example.demo.entities;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "ORDERS")
public class Orders {
	
	@Id
	@Column(name = "ORD_NUM",length = 6, precision = 2, nullable = false)
	private Long ordNum;
	
	@Column(name = "ORD_AMOUNT",length = 12, precision = 2, nullable = false)
	private Float ordAmount;
	
	@Column(name = "ADVANCE_AMOUNT",length = 12, precision = 2, nullable = false)
	private Float advanceAmount;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "ORD_DATE", nullable = false)
	private Date ordDate;
	
	@Column(name = "CUST_CODE", nullable = false)
	private String custCode;
	
	@Column(name = "AGENT_CODE", nullable = false)
	private String agentCode;
	
	@Column(name = "ORD_DESCRIPTION", nullable = false)
	private String ordDescription;

	public Long getOrdNum() {
		return ordNum;
	}

	public void setOrdNum(Long ordNum) {
		this.ordNum = ordNum;
	}

	public Float getOrdAmount() {
		return ordAmount;
	}

	public void setOrdAmount(Float ordAmount) {
		this.ordAmount = ordAmount;
	}

	public Float getAdvanceAmount() {
		return advanceAmount;
	}

	public void setAdvanceAmount(Float advanceAmount) {
		this.advanceAmount = advanceAmount;
	}

	public Date getOrdDate() {
		return ordDate;
	}

	public void setOrdDate(Date ordDate) {
		this.ordDate = ordDate;
	}

	public String getCustCode() {
		return custCode;
	}

	public void setCustCode(String custCode) {
		this.custCode = custCode;
	}

	public String getAgentCode() {
		return agentCode;
	}

	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}

	public String getOrdDescription() {
		return ordDescription;
	}

	public void setOrdDescription(String ordDescription) {
		this.ordDescription = ordDescription;
	}
	

	
}
