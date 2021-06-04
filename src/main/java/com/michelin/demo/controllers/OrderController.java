package com.michelin.demo.controllers;

import com.michelin.demo.dto.request.OrderRequestDto;
import com.michelin.demo.dto.utils.OrderDtoConverter;
import com.michelin.demo.entities.Order;
import com.michelin.demo.services.OrderService;
import com.michelin.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
@RequestMapping("/api")
public class OrderController {

    private OrderService orderService;
    private UserService userService;
    private OrderDtoConverter orderDtoConverter;

    @Autowired
    public OrderController(OrderService orderService, OrderDtoConverter orderDtoConverter, UserService userService) {
        this.orderService = orderService;
        this.orderDtoConverter =  orderDtoConverter;
        this.userService =  userService;
    }

    @PostMapping("/order")
    public void createOrder(@RequestBody OrderRequestDto requestDto, Principal principal){
        Order order = orderDtoConverter.fromDtoToOrder(requestDto);
        order.setUser(userService.getUserByUsername(principal.getName()));
        orderService.createOreder(order);
    }

    @GetMapping("/order")
    public void getAllOrders(){

    }
}
