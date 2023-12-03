package com.shopping.musinsa.Review.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class Comments{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nickName;

    @Column
    private String grade;

    @Column
    private String reviewProfilePhoto; // 리뷰자 포토 이미지

    @Column
    private String commentAt;
}
