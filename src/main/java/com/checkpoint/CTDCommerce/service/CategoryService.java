package com.checkpoint.CTDCommerce.service;

import com.checkpoint.CTDCommerce.model.Category;
import com.checkpoint.CTDCommerce.model.CategoryName;
import com.checkpoint.CTDCommerce.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CategoryService {

    private CategoryRepository repository;

    @Autowired
    public CategoryService(CategoryRepository repository) {
        this.repository = repository;
    }

    public List<Map<String, Object>> findAll(){
        List<Map<String, Object>> result = new ArrayList<>();
         List<Category> categories = repository.findAll();
        for (Category c : categories){
            Map<String, Object> categoryMap = new HashMap<>();
            categoryMap.put("id", c.getId());
            categoryMap.put("name", c.getName());
            result.add(categoryMap);
        }

         return result;
    }

    public Category save(Category category) {
        return repository.save(category);
    }

    public Category findById (Integer id){
        return repository.findById(id).get();
    }
}
