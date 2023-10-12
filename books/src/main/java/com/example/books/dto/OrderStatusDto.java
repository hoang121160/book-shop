package com.example.books.dto;

import jakarta.validation.constraints.Size;

public class OrderStatusDto {
    private Long id;
    @Size(max = 255)
    private String name;
    @Size(max = 255)
    private String description;

}
