package com.michelin.demo.controllers;

import com.michelin.demo.dto.request.OrderRequestDto;
import com.michelin.demo.dto.utils.OrderDtoConverter;
import com.michelin.demo.entities.Order;
import com.michelin.demo.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
@RequestMapping("/api")
public class OrderController {

    private OrderService orderService;
    private UserS
    private OrderDtoConverter orderDtoConverter;

    @Autowired
    public OrderController(OrderService orderService, OrderDtoConverter orderDtoConverter) {
        this.orderService = orderService;
        this.orderDtoConverter =  orderDtoConverter;
    }

    @PostMapping("/order")
    public void createOrder(@RequestBody OrderRequestDto requestDto, Principal principal){
        Order order = orderDtoConverter.fromDtoToOrder(requestDto);
        order.setUser();
        //orderService.createOreder();
    }

    @GetMapping("/order")
    public void getAllOrders(){

    }
}
