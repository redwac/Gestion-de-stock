package com.example.gestionDeStockRS.Controller;

import com.example.gestionDeStockRS.Model.Category;
import com.example.gestionDeStockRS.Repository.CategoryRepository;
import com.example.gestionDeStockRS.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/category")
public class CategoryClontroller {

    public final CategoryService categoryService;

    @Autowired
    public CategoryClontroller(CategoryService categoryService){
        this.categoryService = categoryService;
    }

    @GetMapping("/all")
    public List<Category> getCategory(){
        return categoryService.getCategory();
    }
}
