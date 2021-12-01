package com.checkpoint.CTDCommerce.controller;

import com.checkpoint.CTDCommerce.model.Categories;
import com.checkpoint.CTDCommerce.model.Product;
import com.checkpoint.CTDCommerce.service.CategoriesService;
import com.checkpoint.CTDCommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProductController {

    private ProductService productService;
    private CategoriesService categoriesService;

    @Autowired
    public ProductController(ProductService productService, CategoriesService categoriesService) {
        this.productService = productService;
        this.categoriesService = categoriesService;
    }

    @PostMapping
    public ResponseEntity<Product> postarProduto(@RequestBody Product product){
        return ResponseEntity.status(HttpStatus.CREATED).body(productService.save(product));
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.buscarTodos();
    }

    @GetMapping("/{id}")
    public Product getProduct(Integer id) {
        return productService.buscarPeloId(id);
    }

    @GetMapping("/categories")
    public List<Categories> getAllCategories() {
        return categoriesService.buscarTodas();
    }

    //buscar todos os produtos por categoria
//    @GetMapping("/categories/{name}")
//    public List<Product> getProductsByCategory(String name) {
//        return productService.buscarProdutosPorCategoria(name);
//    }
}
