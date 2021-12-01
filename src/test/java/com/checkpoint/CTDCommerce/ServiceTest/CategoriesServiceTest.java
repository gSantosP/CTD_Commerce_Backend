package com.checkpoint.CTDCommerce.ServiceTest;

import com.checkpoint.CTDCommerce.model.Categories;
import com.checkpoint.CTDCommerce.model.NameCategories;
import com.checkpoint.CTDCommerce.model.Product;
import com.checkpoint.CTDCommerce.repository.CategoriesRepository;
import com.checkpoint.CTDCommerce.service.CategoriesService;
import com.checkpoint.CTDCommerce.service.ProductService;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@SpringBootTest
//@RunWith(SpringRunner.class)
public class CategoriesServiceTest {

    @Autowired
    private ProductService productService;

    @Autowired
    private CategoriesService categoriesService;

//    @BeforeEach
//    public void teste() {
//
//        Categories categories = new Categories();
//        categories.setName(NameCategories.ELETRONICS);
//        categoriesService.save(categories);
//
//        Categories categories1 = new Categories();
//        categories1.setName(NameCategories.JEWELERY);
//        categoriesService.save(categories1);
//
//        Categories categories2 = new Categories();
//        categories2.setName(NameCategories.MENS_CLOTHING);
//        categoriesService.save(categories2);
//
//        Categories categories3 = new Categories();
//        categories3.setName(NameCategories.WOMENS_CLOTHING);
//        categoriesService.save(categories3);
//
//
//
//        Product product = new Product();
//        product.setCategories(categories);
//        product.setTitle("Torradeira");
//        product.setPrice(17.0f);
//        product.setDescription("Description");
//        product.setImage("Image");
//        productService.save(product);
//
//        Product product1 = new Product();
//        product1.setCategories(categories1);
//        product1.setTitle("Diamante");
//        product1.setPrice(10000.0f);
//        product1.setDescription("Description");
//        product1.setImage("Image");
//        productService.save(product1);
//
//        Product product2 = new Product();
//        product2.setCategories(categories2);
//        product2.setTitle("Vestido");
//        product2.setPrice(30.0f);
//        product2.setDescription("Description");
//        product2.setImage("Image");
//        productService.save(product2);
//
//        Product product3 = new Product();
//        product3.setCategories(categories3);
//        product3.setTitle("Camiseta");
//        product3.setPrice(20.0f);
//        product3.setDescription("Description");
//        product3.setImage("Image");
//        productService.save(product3);
//
//    }
    @Test
    public void buscarProduto(){
        assertThat(productService).isNotNull();
        assertThat(categoriesService).isNotNull();
    }
}
