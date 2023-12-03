package com.shopping.musinsa.Category.repository;

import com.shopping.musinsa.Category.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface CategoryRepository extends JpaRepository<Category, Long> {
}
