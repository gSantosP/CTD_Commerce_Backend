package com.checkpoint.CTDCommerce.controller;

import com.checkpoint.CTDCommerce.model.Category;
import com.checkpoint.CTDCommerce.model.Product;
import com.checkpoint.CTDCommerce.service.CategoryService;
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
    private CategoryService categoryService;

    @Autowired
    public ProductController(ProductService productService, CategoryService categoryService) {
        this.productService = productService;
        this.categoryService = categoryService;
    }

    @PostMapping
    public ResponseEntity<Product> postarProduto(@RequestBody Product product) {
        return ResponseEntity.status(HttpStatus.CREATED).body(productService.save(product));
    }


    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts() {
        return ResponseEntity.ok(productService.buscarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable Integer id) {
        return productService.buscarPeloId(id).map(resp -> ResponseEntity.ok(resp))
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/categorias")
    public ResponseEntity<List<Category>> getAllCategories() {
        return ResponseEntity.ok(categoryService.buscarTodas());
    }

   @GetMapping("/categorias/{name}")
  public ResponseEntity<List<Product>> getProductsByCategory(@PathVariable String name) {

        return ResponseEntity.ok(productService.buscarProdutosPorCategoria(name));
  }

}
