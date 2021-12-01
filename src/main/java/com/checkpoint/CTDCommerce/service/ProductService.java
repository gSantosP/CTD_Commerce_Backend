package com.checkpoint.CTDCommerce.service;

import com.checkpoint.CTDCommerce.model.Product;
import com.checkpoint.CTDCommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // Rever o corpo dos metodos e seus nomes;

    //off
    public Product save(Product product) {
        return productRepository.save(product);
    }

    // End-point "a" retorna todos os produtos cadastrados
    public List<Product> buscarTodos(){
        return productRepository.findAll();
    }

    // End-point "b" retorna um produto pelo id
    public Product buscarPeloId(Integer id){
        return productRepository.findById(id).get();
    }

    //End-point "d" retorna todos os produtos de uma categoria
//    public List<Product> buscarProdutosPorCategoria(String name) {
//        return productRepository.findAllProductByCategories(name);
//    }

}
