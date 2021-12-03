package com.checkpoint.CTDCommerce.service;

import com.checkpoint.CTDCommerce.model.Category;
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
    //Continuar
    //public Categories savar(Categories)

    // End-point "c" retorna uma lista de categorias cadastradas
    public List<Category> buscarTodas(){
        return repository.findAll();
    }

    //metodo para salvar um categoria
    public Category save(Category category) {
        return repository.save(category);
    }

    //metodo para buscar uma categoria por Id
    public Category buscarPorId (Integer id){
        return repository.findById(id).get();
    }
}
