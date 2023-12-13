package com.shopping.musinsa.Product.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class Product_info {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String meterial; // 제품소재

    @Column
    private String color;

    @Column
    private String size;

    @Column
    private String manufacturer;

    @Column
    private String made_in;

    @Column
    private String warn;

    @Column
    private String manufacturing_date;

    @Column
    private String as_standard;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;

}
