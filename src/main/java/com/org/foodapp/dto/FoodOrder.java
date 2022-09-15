package com.org.foodapp.dto;

import java.time.LocalTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class FoodOrder {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String status;
	private double totalPrice;
	
	private LocalTime orderCreatedTime;
	private LocalTime orderDeliveryTime;
	private String customerName;
	private long contactNumber;
	
	@OneToMany(cascade = CascadeType.ALL , mappedBy = "foodOrder")
	private List<Item> items;
	
	@ManyToOne
	@JoinColumn
	User user;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getCustomerName() {
		return customerName;
	}
	public LocalTime getOrderCreatedTime() {
		return orderCreatedTime;
	}
	public void setOrderCreatedTime(LocalTime orderCreatedTime) {
		this.orderCreatedTime = orderCreatedTime;
	}
	public LocalTime getOrderDeliveryTime() {
		return orderDeliveryTime;
	}
	public void setOrderDeliveryTime(LocalTime orderDeliveryTime) {
		this.orderDeliveryTime = orderDeliveryTime;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
}
