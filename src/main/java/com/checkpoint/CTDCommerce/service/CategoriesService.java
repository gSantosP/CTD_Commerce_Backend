package com.checkpoint.CTDCommerce.service;

import com.checkpoint.CTDCommerce.model.Categories;
import com.checkpoint.CTDCommerce.repository.CategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriesService {

    private CategoriesRepository repository;

    @Autowired
    public CategoriesService(CategoriesRepository repository) {
        this.repository = repository;
    }
    //Continuar
    //public Categories savar(Categories)

    // End-point "c" retorna uma lista de categorias cadastradas
    public List<Categories> buscarTodas(){
        return repository.findAll();
    }

    //metodo para salvar um categoria
    public Categories save(Categories categories) {
        return repository.save(categories);
    }

    //metodo para buscar uma categoria por Id
    public Categories buscarPorId (Integer id){
        return repository.findById(id).get();
    }
}
