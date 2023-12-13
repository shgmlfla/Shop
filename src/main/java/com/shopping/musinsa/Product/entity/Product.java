package com.shopping.musinsa.Product.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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

    @OneToMany(mappedBy = "product")
    @JsonIgnoreProperties("product")
    private List<Register> registerList = new ArrayList<>();

    @OneToMany(mappedBy = "product")
    @JsonIgnoreProperties("product")
    private List<Product_info> productInfoList;
}
