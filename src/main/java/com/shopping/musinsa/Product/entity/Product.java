package com.shopping.musinsa.Product.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String brand;

    @Column
    private String code;

    @Column
    private String season;

    @Column
    private String gender;

    @Column
    private int views;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ProductCategory> productCategories = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product")
    private List<Register> registers = new ArrayList<>();

    @OneToMany
    private List<Product_info> product_infos = new ArrayList<>();
}
