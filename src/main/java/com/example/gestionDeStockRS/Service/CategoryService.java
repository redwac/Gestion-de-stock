package com.example.gestionDeStockRS.Service;

import com.example.gestionDeStockRS.Model.Category;
import com.example.gestionDeStockRS.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    public final CategoryRepository categoryRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }

    public List<Category> getCategory(){
        return List.of(
                new Category(2L,"type2"),
                new Category(3,"Type3 desc"));
    }
}
