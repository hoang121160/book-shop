package com.example.books.dto;

import jakarta.validation.constraints.Size;

public class OrderItemDto {
    private Long id;
    private Integer quantity;
    @Size(max = 255)
    private String name;
    private Long price;
    private Long orderId;
}
