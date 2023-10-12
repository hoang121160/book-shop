package com.example.books.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;

    @Column
    private String name;

    @Column(name = "description")
    private String description;

    @Column
    private String image;

    @Column(nullable = false)
    private String author;

    @Column(nullable = false)
    private Long price;

    @Column(nullable = false)
    private Long quantity;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

}
