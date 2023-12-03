package com.shopping.musinsa.Images.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class Images {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String type; //thumnail, information(제품상세정보)

    @Column
    private String url;

}
