package com.cg.model;

import java.time.LocalDate;
import com.cg.secure.model.User;
import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name="Customer_Orders")
public class Order {
	@Id
	@GeneratedValue
private int orderId;
	@JsonFormat(pattern = "yyyy-MM-dd")
private LocalDate orderDate;
	@ManyToOne
	@JoinColumn(name="pid")
private Product p;
	@ManyToOne
	@JoinColumn(name="userid")
private User user;
public int getOrderId() {
	return orderId;
}
public void setOrderId(int orderId) {
	this.orderId = orderId;
}
public LocalDate getOrderDate() {
	return orderDate;
}
public void setOrderDate(LocalDate orderDate) {
	this.orderDate = orderDate;
}
public Product getP() {
	return p;
}
public void setP(Product p) {
	this.p = p;
}
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}


}
