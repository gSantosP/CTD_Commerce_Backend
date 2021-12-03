package com.checkpoint.CTDCommerce.repository;

import com.checkpoint.CTDCommerce.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
