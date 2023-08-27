package com.infy.fos.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.infy.fos.entity.Order;


public class OrderDTO {
	
	private Integer orderId;
	
	private LocalDate dateOfOrder;
   private String orderStatus;
   private LocalTime deliveryTime;
	private String name;
	private String quantity;
	private double total_price;
	private double totalPrice;
	private String customerEmailId;
	
	
	private List<OrderedProductDTO> orderedProducts;
	
	
	
	
	public List<OrderedProductDTO> getOrderedProducts() {
		return orderedProducts;
	}

	public void setOrderedProducts(List<OrderedProductDTO> orderedProducts) {
		this.orderedProducts = orderedProducts;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
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

	public Integer getOrderId() {
		return orderId;
	}

	
	

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}



	

	public double getTotal_price() {
		return total_price;
	}

	public void setTotal_price(double total_price) {
		this.total_price = total_price;
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
		return "OrderDTO [orderId=" + orderId + ", dateOfOrder=" + dateOfOrder + ", orderStatus=" + orderStatus
				+ ", deliveryTime=" + deliveryTime + ", name=" + name + ", quantity=" + quantity + ", total_price="
				+ total_price + ", totalPrice=" + totalPrice + ", customerEmailId=" + customerEmailId
				+ ", orderedProducts=" + orderedProducts + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(customerEmailId, dateOfOrder, deliveryTime, name, orderId, orderStatus, orderedProducts,
				quantity, totalPrice, total_price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderDTO other = (OrderDTO) obj;
		return Objects.equals(customerEmailId, other.customerEmailId) && Objects.equals(dateOfOrder, other.dateOfOrder)
				&& Objects.equals(deliveryTime, other.deliveryTime) && Objects.equals(name, other.name)
				&& Objects.equals(orderId, other.orderId) && Objects.equals(orderStatus, other.orderStatus)
				&& Objects.equals(orderedProducts, other.orderedProducts) && Objects.equals(quantity, other.quantity)
				&& Double.doubleToLongBits(totalPrice) == Double.doubleToLongBits(other.totalPrice)
				&& Double.doubleToLongBits(total_price) == Double.doubleToLongBits(other.total_price);
	}

	
	
	


	
}
