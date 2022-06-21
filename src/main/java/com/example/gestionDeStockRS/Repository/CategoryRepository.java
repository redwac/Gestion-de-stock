package com.example.gestionDeStockRS.Repository;

import com.example.gestionDeStockRS.Model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {

      Optional<Category> findCategoryById(Long id);


      void deleteById(Long id);

}
