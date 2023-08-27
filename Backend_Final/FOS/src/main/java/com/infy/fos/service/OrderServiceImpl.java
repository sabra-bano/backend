package com.infy.fos.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.infy.fos.dto.OrderDTO;
import com.infy.fos.dto.OrderedProductDTO;
import com.infy.fos.dto.ProductDTO;
import com.infy.fos.dto.UserDTO;
import com.infy.fos.dto.VendorDTO;
import com.infy.fos.entity.Order;
import com.infy.fos.entity.OrderedProduct;
import com.infy.fos.entity.Product;
import com.infy.fos.entity.User;
import com.infy.fos.entity.Vendor;
import com.infy.fos.repository.OrderRepository;
import com.infy.fos.repository.ProductRepository;

import ch.qos.logback.core.subst.Token;
import jakarta.persistence.OneToOne;

@Service
public class OrderServiceImpl implements OrderService {

	private static final String ORDER_PLACED = "PLACED";

	@Autowired
	public OrderRepository orderRepository;

	@Autowired
	public ProductRepository productRepository;
	
	
	
 


	
	public Integer placeOrder(OrderDTO orderDTO) {
		
	
		
	
   // String tokenNumber = "T"+String.valueOf(new Random().nextInt(10000));
	   
	    

	
	    Order order = new Order();
    	order.setDateOfOrder(LocalDate.now());
       order.setTotalPrice(orderDTO.getTotalPrice());
	   order.setOrderStatus(ORDER_PLACED);
	   order.setDeliveryTime(LocalTime.now().plusMinutes(10));
       order.setCustomerEmailId(orderDTO.getCustomerEmailId());
	    
	    
		
		List<OrderedProduct> orderedProducts = new ArrayList<OrderedProduct>();

		for (OrderedProductDTO orderedProductDTO : orderDTO.getOrderedProducts()) {
			

			OrderedProduct orderedProduct = new OrderedProduct();
			orderedProduct.setOrderedProductId(orderedProductDTO.getOrderedProductId());
			orderedProduct.setProductId(orderedProductDTO.getProductId());
			orderedProduct.setProductName(orderedProductDTO.getProductName());
			orderedProduct.setQuantity(orderedProductDTO.getQuantity());
			orderedProducts.add(orderedProduct);


		}

		order.setOrderedProducts(orderedProducts);

		
	  
		orderRepository.save(order);
		
		return order.getOrderId();
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public List<OrderDTO> getAllOrders(){
		
		Iterable<Order> orders = orderRepository.findAll();
		List<OrderDTO> orderDTOs = new ArrayList<>();
		
		orders.forEach(order -> {
			
			OrderDTO orderDTO = new OrderDTO();
			
			orderDTO.setOrderId(order.getOrderId());
	  	    orderDTO.setCustomerEmailId(order.getCustomerEmailId());
			orderDTO.setDateOfOrder(order.getDateOfOrder());
		    orderDTO.setDeliveryTime(order.getDeliveryTime());
			orderDTO.setTotalPrice(order.getTotalPrice());
			orderDTO.setOrderStatus(order.getOrderStatus());
		
			
			
			List<OrderedProductDTO> orderedProductDtos = new ArrayList<>();
			
			for (OrderedProduct oP: order.getOrderedProducts()) {
				
				OrderedProductDTO o = new OrderedProductDTO();
				
		        o.setOrderedProductId(oP.getOrderedProductId());
				 o.setProductId(oP.getProductId());
				 o.setProductName(oP.getProductName());
				  o.setQuantity(oP.getQuantity());
				
				 orderedProductDtos.add(o);
			}
			
			orderDTO.setOrderedProducts(orderedProductDtos);		
			orderDTOs.add(orderDTO);
			
		});
		
		
		return orderDTOs;	
	
	
	
	
	}
	
}
