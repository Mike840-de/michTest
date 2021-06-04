package com.michelin.demo.dto.request;

import com.michelin.demo.dto.AbstractDto;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class OrderRequestDto extends AbstractDto {
    private String name;
    private String description;
    private int type;
}
