package com.shopping.musinsa.Review.entity;

import jakarta.persistence.*;
import lombok.Getter;
@Entity
@Getter
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String star;

    @Column
    private String likes;

    @Column
    private String stylishImages; // 리뷰어가 찍은 이미지

}
