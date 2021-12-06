package com.checkpoint.CTDCommerce.controller;

import com.checkpoint.CTDCommerce.exceptions.BadRequestException;
import com.checkpoint.CTDCommerce.model.Category;
import com.checkpoint.CTDCommerce.model.Product;
import com.checkpoint.CTDCommerce.service.CategoryService;
import com.checkpoint.CTDCommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public ResponseEntity<Product> postarProduto(@RequestBody Product product) throws BadRequestException {
        return ResponseEntity.status(HttpStatus.CREATED).body(productService.save(product));
    }

    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts() {
        return ResponseEntity.ok(productService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable Integer id) {
        return productService.buscarPeloId(id).map(resp -> ResponseEntity.ok(resp))
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/page/{page}/limit/{limit}")
    private ResponseEntity<Page<Product>> findAllLimited(@PathVariable Integer page, @PathVariable Integer limit){
        return ResponseEntity.ok(productService.findAllLimited(page, limit));
    }

    @ExceptionHandler
    public ResponseEntity handlerBadRequestException(BadRequestException exception){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(exception.getMessage());
    }

}
