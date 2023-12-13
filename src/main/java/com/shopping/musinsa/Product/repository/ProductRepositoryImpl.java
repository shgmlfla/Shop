package com.shopping.musinsa.Product.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.shopping.musinsa.Product.entity.Product;
import com.shopping.musinsa.Product.entity.QProduct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ProductRepositoryImpl implements ProductRepositoryCustom{

    private final JPAQueryFactory jpaQueryFactory;

    @Override
    public List<Product> getProduct(Product product) {
        QProduct qProduct = QProduct.product;
        return jpaQueryFactory
                .selectFrom(qProduct)
                .fetch();
    }
}
