package com.michelin.demo.services;

import com.michelin.demo.entities.Order;
import com.michelin.demo.repositories.OrderRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void createOreder(Order order){
        orderRepository.save(order);
    }
}
