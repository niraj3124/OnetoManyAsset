package com.ams.bean;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="request")
public class Request {

	@Id
	@GeneratedValue
	private int requestId;
	@Column(name="assetName")
	private String assetName;
	@Column(name="quantity")
	private int quantity;
	@Column(name="status")
	private String status;
	@Temporal(TemporalType.DATE)
	@Column(name="openDate")
	private Date openDate;
	@Temporal(TemporalType.DATE)
	@Column(name="closeDate")
	private Date closeDate;
	public int getRequestId() {
		return requestId;
	}
	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}
	public String getAssetName() {
		return assetName;
	}
	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getOpenDate() {
		return openDate;
	}
	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}
	public Date getCloseDate() {
		return closeDate;
	}
	public void setCloseDate(Date closeDate) {
		this.closeDate = closeDate;
	}
	public Request(int requestId, String assetName, int quantity,
			String status, Date openDate, Date closeDate) {
		super();
		this.requestId = requestId;
		this.assetName = assetName;
		this.quantity = quantity;
		this.status = status;
		this.openDate = openDate;
		this.closeDate = closeDate;
		
	}
	
	
	public Request(String assetName, int quantity, String status,
			Date openDate, Date closeDate) {
		super();
		this.assetName = assetName;
		this.quantity = quantity;
		this.status = status;
		this.openDate = openDate;
		this.closeDate = closeDate;
	}
	
	public Request() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Request [requestId=" + requestId + ", assetName=" + assetName
				+ ", quantity=" + quantity + ", status=" + status
				+ ", openDate=" + openDate + ", closeDate=" + closeDate + "]";
	}
	
	
	
}
