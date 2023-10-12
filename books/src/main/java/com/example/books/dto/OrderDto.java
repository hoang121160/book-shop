package com.example.books.dto;

import jakarta.validation.constraints.Size;

public class OrderDto {
    private Long id;
    private Long total;
    @Size(max = 255)
    private String address;
    private Long status;
    private Long users;
}
