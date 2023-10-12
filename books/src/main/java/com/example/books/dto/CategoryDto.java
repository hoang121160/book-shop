package com.example.books.dto;

import jakarta.validation.constraints.Size;

public class CategoryDto {
    private Long id;
    @Size(max = 225)
    private String name;
    @Size(max = 225)
    private String description;
    private Long categoryParent;
}
