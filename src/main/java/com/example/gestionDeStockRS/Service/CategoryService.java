package com.example.gestionDeStockRS.Service;

import com.example.gestionDeStockRS.Model.Category;
import com.example.gestionDeStockRS.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    public final CategoryRepository categoryRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }

    public List<Category> getCategory(){
        return categoryRepository.findAll();
    }

    public Optional<Category> getCategorieParId(Long id){

        return categoryRepository.findCategoryById(id);
    }

    public void supprimerCategory(Long id)  {

        categoryRepository.deleteById(id);

        System.out.println("la categorry avec l id =" + id + " a été suprimé av");
    }
}
