package com.github.evgdim.data.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

public class StatusReason {
	@Column("SRN_ID")
	@Id
	private Long id;
	@Column("SRN_CREATOR")
	private String creator;
	@Column("SRN_REASON")
	private String reason;
	@Column("SRN_STATUS")
	private String status;
	@Column("SRN_TIMESTAMP")
	private Date timestamp;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	
	@Override
	public String toString() {
		return "StatusReason [id=" + id + ", creator=" + creator + ", reason=" + reason + ", status=" + status
				+ ", timestamp=" + timestamp + "]";
	}
}
