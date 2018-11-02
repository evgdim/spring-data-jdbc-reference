package com.github.evgdim.data.model;

import java.sql.Timestamp;

public class Event {
	private Long id;
	private Long grbId;
	private Integer type;
	private String subAccountNumber;
	private Timestamp timestamp;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getGrbId() {
		return grbId;
	}
	public void setGrbId(Long grbId) {
		this.grbId = grbId;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getSubAccountNumber() {
		return subAccountNumber;
	}
	public void setSubAccountNumber(String subAccountNumber) {
		this.subAccountNumber = subAccountNumber;
	}
	public Timestamp getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	@Override
	public String toString() {
		return "Event [id=" + id + ", grbId=" + grbId + ", type=" + type + ", subAccountNumber=" + subAccountNumber
				+ ", timestamp=" + timestamp + "]";
	}
	
	
}
