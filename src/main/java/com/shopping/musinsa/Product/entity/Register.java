package com.shopping.musinsa.Product.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class Register {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String company_name;

    @Column
    private String representive;

    @Column
    private String brand;

    @Column
    private String business_phone;

    @Column
    private String complain_address;

    @Column
    private String phone;

    @Column
    private String email;

    @Column
    private String register_address;

    @Column
    private String return_address;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

}
