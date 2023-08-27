package com.infy.fos.entity;
import java.time.LocalDate;
import java.time.LocalDateTime;

import com.infy.fos.entity.*;
import java.time.LocalTime;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "EK_ORDER")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer orderId;
	private LocalDate dateOfOrder;
	 private LocalTime deliveryTime;
	private String orderStatus;
	private double totalPrice;
	private String customerEmailId;
	
//	private String name;
//	private String quantity;
	

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "orderId")
	private List<OrderedProduct> orderedProducts;
    
	
    public Order() {
		
	}
	
	
	public List<OrderedProduct> getOrderedProducts() {
		return orderedProducts;
	}

	public void setOrderedProducts(List<OrderedProduct> orderedProducts) {
		this.orderedProducts = orderedProducts;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	
     
	

	
	public double getTotalPrice() {
		return totalPrice;
	}


	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}


	public String getCustomerEmailId() {
		return customerEmailId;
	}


	public void setCustomerEmailId(String customerEmailId) {
		this.customerEmailId = customerEmailId;
	}


	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

    
	
	
	

	public LocalDate getDateOfOrder() {
		return dateOfOrder;
	}

	public void setDateOfOrder(LocalDate dateOfOrder) {
		this.dateOfOrder = dateOfOrder;
	}

	public LocalTime getDeliveryTime() {
		return deliveryTime;
	}

	public void setDeliveryTime(LocalTime deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", dateOfOrder=" + dateOfOrder + ", deliveryTime=" + deliveryTime
				+ ", orderStatus=" + orderStatus + ", totalPrice=" + totalPrice + ", customerEmailId=" + customerEmailId
				+ ", orderedProducts=" + orderedProducts + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(customerEmailId, dateOfOrder, deliveryTime, orderId, orderStatus, orderedProducts,
				totalPrice);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return Objects.equals(customerEmailId, other.customerEmailId) && Objects.equals(dateOfOrder, other.dateOfOrder)
				&& Objects.equals(deliveryTime, other.deliveryTime) && Objects.equals(orderId, other.orderId)
				&& Objects.equals(orderStatus, other.orderStatus)
				&& Objects.equals(orderedProducts, other.orderedProducts)
				&& Double.doubleToLongBits(totalPrice) == Double.doubleToLongBits(other.totalPrice);
	}

	
}
	










	



