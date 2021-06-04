package com.michelin.demo.controllers;

import com.michelin.demo.dto.request.OrderRequestDto;
import com.michelin.demo.dto.utils.OrderDtoConverter;
import com.michelin.demo.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class OrderController {

    private OrderService orderService;
    private OrderDtoConverter orderDtoConverter;

    @Autowired
    public OrderController(OrderService orderService, OrderDtoConverter orderDtoConverter) {
        this.orderService = orderService;
        this.orderDtoConverter =  orderDtoConverter;
    }

    @PostMapping("/order")
    public void createOrder(@RequestBody OrderRequestDto requestDto){
        orderService.createOreder(orderDtoConverter.fromDtoToOrder(requestDto));
    }

    @GetMapping("/order")
    public void getAllOrders(){

    }
}
