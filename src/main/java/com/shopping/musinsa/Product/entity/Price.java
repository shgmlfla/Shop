package com.shopping.musinsa.Product.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class Price {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private int shop_price;

    @Column
    private int member_price;

    @Column
    private int reward_price;

    @Column
    private int delivery_price;


}
