package com.shopping.musinsa.Product.entity;

import com.shopping.musinsa.Category.entity.Category;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class ProductCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name ="category_id")
    private Category category;

    public ProductCategory(Product product, Category category){
        this.product = product;
        this.category = category;
    }


}
