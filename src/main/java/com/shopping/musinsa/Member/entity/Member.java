package com.shopping.musinsa.Member.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String password;

    @Column
    private String nickname;

    @Column
    private String email;

    @Column
    private String address;

    @Column
    private String phone;

    @Column
    private String grade;

    @Column
    private String joinedDate;
}
