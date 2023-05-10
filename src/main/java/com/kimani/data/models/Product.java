package com.kimani.data.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Product {
    private String name;
    private Integer quantity;
    private Double price;
    private Long productNumber;
}
