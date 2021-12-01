package com.checkpoint.CTDCommerce.repository;

import com.checkpoint.CTDCommerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
