package org.ys.commons;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Payment {
	@Id @GeneratedValue
	private long id;
	
	private Date paidDate;
	private double total;
	private String details;
	private Order order;

	public Payment() {

	}	
	
	public Payment(long id, Date paidDate, double total, String details, Order order) {
		super();
		this.id = id;
		this.paidDate = paidDate;
		this.total = total;
		this.details = details;
		this.order = order;
		
		order.setPayment(this);
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public Date getPaidDate() {
		return paidDate;
	}
	
	public void setPaidDate(Date paidDate) {
		this.paidDate = paidDate;
	}
	
	public double getTotal() {
		return total;
	}
	
	public void setTotal(double total) {
		this.total = total;
	}
	
	public String getDetails() {
		return details;
	}
	
	public void setDetails(String details) {
		this.details = details;
	}	
}
