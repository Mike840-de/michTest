package com.michelin.demo.dto.utils;

import com.michelin.demo.dto.request.OrderRequestDto;
import com.michelin.demo.entities.Order;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class OrderDtoConverter {

    private ModelMapper modelMapper;

    public OrderDtoConverter(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public Order fromDtoToOrder(OrderRequestDto dto){
        return modelMapper.map(dto, Order.class);
    }
}
