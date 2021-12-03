package com.checkpoint.CTDCommerce.repository;

import com.checkpoint.CTDCommerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    public List<Product> findAllProductByCategoryName(String name);


}
