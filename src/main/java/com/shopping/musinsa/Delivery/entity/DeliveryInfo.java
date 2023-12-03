package com.shopping.musinsa.Delivery.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class DeliveryInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String domestic_delivery; //국내 배송

    @Column
    private String shop_delivery; //입점사 배송

    @Column
    private String delivery_company; // 롯데 택배


}
