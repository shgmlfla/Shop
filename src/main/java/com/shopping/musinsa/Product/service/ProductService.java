package com.shopping.musinsa.Product.service;

import com.shopping.musinsa.Product.entity.Product;
import com.shopping.musinsa.Product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public List<Product> getProduct(Product product){
        return productRepository.getProduct(product);
    }

    public Product saveProduct(Product product){
        return productRepository.save(product);
    }

}
