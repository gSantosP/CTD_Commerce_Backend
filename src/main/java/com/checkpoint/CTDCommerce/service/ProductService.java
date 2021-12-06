package com.checkpoint.CTDCommerce.service;

import com.checkpoint.CTDCommerce.exceptions.BadRequestException;
import com.checkpoint.CTDCommerce.model.Category;
import com.checkpoint.CTDCommerce.model.Product;
import com.checkpoint.CTDCommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private ProductRepository productRepository;
    private CategoryService categoryService;

    @Autowired
    public ProductService(ProductRepository productRepository, CategoryService categoryService) {
        this.productRepository = productRepository;
        this.categoryService = categoryService;
    }

    public Product save(Product product) throws BadRequestException{
        System.out.println(product.getCategory());
        Category category = categoryService.findById(product.getCategory().getId());
        if(category ==null){
            throw new BadRequestException("Categoria não encontrada");
        }
        product.setCategory(category);
        return productRepository.save(product);
    }

    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public Optional<Product> buscarPeloId(Integer id){
        return productRepository.findById(id);
    }

    public Page<Product> findAllLimited(Integer page, Integer limit){
        Pageable pageable = PageRequest.of(page, limit);
        return productRepository.findAll(pageable);
    }

}
