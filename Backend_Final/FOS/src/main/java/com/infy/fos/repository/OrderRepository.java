package com.infy.fos.repository;

import org.springframework.data.repository.CrudRepository;
import com.infy.fos.entity.Order;

public interface OrderRepository extends CrudRepository<Order, Integer>{

}
