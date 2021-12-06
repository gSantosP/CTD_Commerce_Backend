package com.checkpoint.CTDCommerce.controller;

import com.checkpoint.CTDCommerce.model.Category;
import com.checkpoint.CTDCommerce.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/category")
public class CategoryController {

    CategoryService service;

    @Autowired
    public CategoryController(CategoryService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Category> saveCategory(@RequestBody Category category){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(category));
    }

    @GetMapping
    public ResponseEntity<List<Map<String, Object>>> findAll(){
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public  ResponseEntity<Category> findById(@PathVariable Integer id){
        return ResponseEntity.ok(service.findById(id));
    }
}
