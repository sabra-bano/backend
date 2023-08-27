package com.infy.fos.api;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.fos.dto.OrderDTO;
import com.infy.fos.service.OrderService;

import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "/order-api")
@CrossOrigin
@Validated
public class OrderAPI {

	@Autowired
	private OrderService orderService;

	@PostMapping(value = "/placeOrder")
	public ResponseEntity<String>  placeOrder(@Valid @RequestBody OrderDTO orderDTO) {
		
		
	 Integer orderId =orderService.placeOrder(orderDTO);
	 
	 return new ResponseEntity<String>(orderId +"", HttpStatus.CREATED)  ;	  
	}
	

	@GetMapping(value="/orders")				
	public ResponseEntity<List<OrderDTO>> getOrders() 
	{
		List<OrderDTO> list = orderService.getAllOrders();
		return new ResponseEntity<>(list,HttpStatus.OK);
	}
	
}

