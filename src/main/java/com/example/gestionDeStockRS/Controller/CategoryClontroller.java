package com.example.gestionDeStockRS.Controller;

import com.example.gestionDeStockRS.Model.Category;
import com.example.gestionDeStockRS.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/find/{id}")
    public Optional<Category> getCategoryById(@PathVariable("id") Long id){
       return categoryService.getCategorieParId(id);
    }

    @PostMapping("/create")
    public void addCategory(@RequestBody Category category){
        categoryService.addCategoryP(category);
    }

    @DeleteMapping("/delete/{catid}")
    public void deleteCategoryParId(@PathVariable("catid") Long id){
        categoryService.supprimerCategory(id);

    }
}
