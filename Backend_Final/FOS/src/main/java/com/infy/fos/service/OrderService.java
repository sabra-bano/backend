package com.infy.fos.service;

import java.util.List;

import com.infy.fos.dto.OrderDTO;

public interface OrderService {
	
	Integer placeOrder(OrderDTO orderDTO);
	List<OrderDTO> getAllOrders();

}
