package com.shopping.musinsa.Product.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class Options {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String type;

    @Column
    private int price;
}
