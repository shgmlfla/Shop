package com.shopping.musinsa.Delivery.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String release_info; // 출고 정보(결제 3일 이내 출고)

}
