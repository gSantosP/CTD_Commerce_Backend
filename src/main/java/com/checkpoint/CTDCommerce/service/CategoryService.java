package com.checkpoint.CTDCommerce.service;

import com.checkpoint.CTDCommerce.model.Category;
import com.checkpoint.CTDCommerce.model.CategoryName;
import com.checkpoint.CTDCommerce.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private CategoryRepository repository;

    @Autowired
    public CategoryService(CategoryRepository repository) {
        this.repository = repository;
    }

    public List<Category> buscarTodas(){
        return repository.findAll();
    }

    public Category save(Category category) {
        return repository.save(category);
    }

    public Category findById (Integer id){
        return repository.findById(id).get();
    }

}
