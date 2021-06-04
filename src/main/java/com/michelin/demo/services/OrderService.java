package com.michelin.demo.services;

import com.michelin.demo.entities.Order;
import com.michelin.demo.repositories.OrderRepository;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderService {

    private OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Transactional
    public void createOreder(Order order){
        orderRepository.save(order);
    }
}
