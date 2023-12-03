package com.shopping.musinsa.Category.entity;


import com.shopping.musinsa.Product.entity.ProductCategory;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@Entity
@Getter
@NoArgsConstructor
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Long id;

    @Column
    private String upper; //상위 카테고리

    @Column
    private String lower; //하위 카테고리

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ProductCategory> productCategories = new ArrayList<>();
}
