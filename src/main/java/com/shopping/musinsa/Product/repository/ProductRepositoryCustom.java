package com.shopping.musinsa.Product.repository;

import com.shopping.musinsa.Product.entity.Product;

import java.util.List;

public interface ProductRepositoryCustom {

    List<Product> getProduct(Product product);
}
