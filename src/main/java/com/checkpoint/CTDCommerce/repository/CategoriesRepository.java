package com.checkpoint.CTDCommerce.repository;

import com.checkpoint.CTDCommerce.model.Categories;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriesRepository extends JpaRepository<Categories, Integer> {
}
