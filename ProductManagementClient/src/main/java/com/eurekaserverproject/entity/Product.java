package com.eurekaserverproject.entity;

import java.sql.Date;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name="Product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productId;
	private String productname;
	private int qty;
	private long price;
	private Date createddate;
	private LocalDateTime updateddateandtime;

	public Product() {

	}

	public Product(int productId, String productName, int qty, long price, Date createddate,
			LocalDateTime updatedDateAndTime) {
		this.productId = productId;
		this.productname = productName;
		this.qty = qty;
		this.price = price;
		this.createddate = createddate;
		this.updateddateandtime = updatedDateAndTime;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productname;
	}

	public void setProductName(String productName) {
		this.productname = productName;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public Date getCreateddate() {
		return createddate;
	}

	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}

	public LocalDateTime getUpdatedDateAndTime() {
		return updateddateandtime;
	}

	public void setUpdatedDateAndTime(LocalDateTime updatedDateAndTime) {
		this.updateddateandtime = updatedDateAndTime;
	}
    
}
