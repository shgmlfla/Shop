package com.shopping.musinsa.Product.controller;

import com.shopping.musinsa.Product.entity.Product;
import com.shopping.musinsa.Product.entity.ProductCategory;
import com.shopping.musinsa.Product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/productTest")
    public String Test(){
        return "product 테스트 성공";
    }

    @PostMapping("/PostTest")
    public String TestPost(){
        return "post test 성공!";
    }

    @GetMapping("/selectAll")
    public List<Product> selectAll(){
        return productService.getProduct(new Product());
    }

    @PostMapping("/save")
    public Product saveProduct(@RequestBody Product product){
        return productService.saveProduct(product);
    }
}
