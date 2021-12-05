package com.checkpoint.CTDCommerce.repository;

import com.checkpoint.CTDCommerce.model.Category;
import com.checkpoint.CTDCommerce.model.CategoryName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

    @Query("select c from Category c where c.name = :name")
    Category findByName(@Param("name") CategoryName name);
}
