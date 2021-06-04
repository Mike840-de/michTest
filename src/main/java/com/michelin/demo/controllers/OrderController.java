package com.michelin.demo.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class OrderController {
    @PostMapping("/order")
    public void createOrder(@RequestBody OrderDto orderDto){

    }

    @GetMapping("/order")
    public void getAllOrders(){

    }
}
